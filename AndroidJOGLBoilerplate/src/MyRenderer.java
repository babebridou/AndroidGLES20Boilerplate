import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.media.opengl.GL;
import javax.media.opengl.GL2ES2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

import textureloading.DesktopTexture2D;
import textureloading.TextureReader;
import textureloading.TextureRepository;

import android.opengl.GLES20;

import com.fairyteller.fairy3d.programs.BasicTexturedMesh;
import com.fairyteller.fairy3d.scene.Instance3D;
import com.fairyteller.fairy3d.scene.M;
import com.fairyteller.fairy3d.scene.Material3D;
import com.fairyteller.fairy3d.scene.Mesh3D;
import com.fairyteller.fairy3d.scene.Perspective3D;
import com.fairyteller.fairy3d.scene.RenderObject3D;
import com.fairyteller.fairy3d.scene.RenderSet;
import com.fairyteller.fairy3d.scene.Texture2D;
import com.fairyteller.fairy3d.scene.Transform3D;
import com.fairyteller.fairy3d.utils.Matrix;


public class MyRenderer implements GLEventListener{
	
	Perspective3D perspective;
	
	Instance3D instance;
	
//	static GL2ES2 GLES20;
	static GLU glu;
	static GLES20 delegate;
	BasicTexturedMesh program;
	BasicTexturedMesh program2;
	TextureRepository repository;
	Texture2D texture;
	
	public MyRenderer() {
		this.perspective = new Perspective3D();
		instance = new Instance3D();
		RenderObject3D obj = new RenderObject3D();
		RenderSet set = new RenderSet();
		Mesh3D mesh = new Mesh3D();
		List<Material3D> materials = new ArrayList<Material3D>();
		set.setMaterials(materials);
		set.setMesh(mesh);
		obj.setRendersets(Arrays.asList(new RenderSet[]{set}));
		instance.setObj(obj);
		Transform3D transform = new Transform3D();
		transform.setTranslateX(0);
		transform.setTranslateY(0);
		transform.setTranslateZ(0);
		transform.setScaleX(1);
		transform.setScaleY(1);
		transform.setScaleZ(1);
		instance.setTransform(transform);
		repository = new TextureRepository();
	}
	
	public static void prepareGLES20(GLAutoDrawable drawable){
		GL2ES2 gl = (GL2ES2)drawable.getGL();
		glu = GLU.createGLU(gl);
		if(delegate == null)
			delegate = new MyOpenGLDelegate();
		((MyOpenGLDelegate)delegate).gl = gl;
		
	}
	public static void finishGLES20(){
		((MyOpenGLDelegate)delegate).gl = null;
	}
	
	@Override
	public void dispose(GLAutoDrawable drawable) {
		prepareGLES20(drawable);
		
		finishGLES20();
	}
	
	@Override
	public void init(GLAutoDrawable drawable) {
		prepareGLES20(drawable);
		onSurfaceCreated();
		finishGLES20();
	}
	
	@Override
	public void reshape(GLAutoDrawable drawable, int x, int y, int width,
			int height) {
		prepareGLES20(drawable);
		onSurfaceChanged(width, height);
		finishGLES20();
	}
	
	@Override
	public void display(GLAutoDrawable drawable) {
		prepareGLES20(drawable);
		onDrawFrame();
		finishGLES20();
	}
	
	public void onSurfaceCreated(){
		System.out.println("creating");
		
		texture = new DesktopTexture2D();
		texture.setName("assets/DesertRoseTile.png");
		loadTexture(texture, repository);
		
		program = new BasicTexturedMesh();
		program.initProgram(delegate);
		program2 = new BasicTexturedMesh();
		program2.initProgram(delegate);
	}
	private void checkGlError(String op) {
        int error;
        while ((error = delegate.glGetError()) != GLES20.GL_NO_ERROR) {
            System.err.println(error);
            throw new RuntimeException(op + ": glError " + error);
        }
    }
	
	public void onSurfaceChanged(int width,	int height){
		perspective.computeFrustum(width, height, M.projectionMatrix);
	}
	
	public void onDrawFrame(){
		delegate.glClearColor(0.0f, 0.0f, 1.0f, 1.0f);
		delegate.glClear( GLES20.GL_DEPTH_BUFFER_BIT | GLES20.GL_COLOR_BUFFER_BIT);
        initShapes();
        mTriangleVertices.position(TRIANGLE_VERTICES_DATA_POS_OFFSET);
        Matrix.setLookAtM(M.viewMatrix, 0, 0, 0, -1, 0f, 0f, 0f, 0f, 1.0f, 0.0f);
        instance.getTransform().setTranslateX(0f);
		computeModelViewProjectionMatrix(instance);
		program.drawValues(mTriangleVertices, M.modelViewProjectionMatrix, texture);
		checkGlError("cleanup");
	}
	
	public void computeModelViewProjectionMatrix(Instance3D instance){
		Transform3D transform = instance.getTransform();
		Matrix.setIdentityM(M.translateMatrix, 0);
		Matrix.translateM(M.translateMatrix, 0, transform.getTranslateX(), transform.getTranslateY(), transform.getTranslateZ());
		
		Matrix.setIdentityM(M.scaleMatrix, 0);
		Matrix.scaleM(M.scaleMatrix, 0, transform.getScaleX(), transform.getScaleY(),transform.getScaleZ());
		
		Matrix.setIdentityM(M.rotationMatrix, 0);
		Matrix.myRotateM(M.rotationMatrix, 0, transform.getRotateX(), 1, 0, 0, M.tempRotationMatrix);
		Matrix.myRotateM(M.rotationMatrix, 0, transform.getRotateY(), 0, 1, 0, M.tempRotationMatrix);
		Matrix.myRotateM(M.rotationMatrix, 0, transform.getRotateZ(), 0, 0, 1, M.tempRotationMatrix);
		
		Matrix.multiplyMM(M.rotationScaleMatrix, 0, M.rotationMatrix, 0,
				M.scaleMatrix, 0);
		Matrix.multiplyMM(M.translateRotationScaleMatrix, 0, M.translateMatrix, 0, M.rotationScaleMatrix, 0);
		Matrix.multiplyMM(M.modelViewMatrix, 0, M.viewMatrix, 0, M.translateRotationScaleMatrix, 0);
		Matrix.multiplyMM(M.modelViewProjectionMatrix, 0, M.projectionMatrix, 0, M.modelViewMatrix, 0);
		Matrix.myInvertM(M.invertMvpMatrix, 0, M.modelViewProjectionMatrix, 0, M.invertSrcMatrix,
				M.invertTmpMatrix, M.invertDstMatrix);
		Matrix.transposeM(M.normalMatrix, 0, M.invertMvpMatrix, 0);
	}
	
	private void initShapes(){
		mTriangleVertices = ByteBuffer.allocateDirect(mTriangleVerticesData.length
                * FLOAT_SIZE_BYTES).order(ByteOrder.nativeOrder()).asFloatBuffer();
        mTriangleVertices.put(mTriangleVerticesData).position(0);
    
    }
	 private float[] mTriangleVerticesData = {
	            // X, Y, Z, U, V
	            -1.0f, -0.5f, 0, -0.5f, 0.0f,
	            1.0f, -0.5f, 0, 1.5f, -0.0f,
	            0.0f,  1.11803399f, 0, 0.5f,  1.61803399f };
	private FloatBuffer mTriangleVertices;
	private static final int FLOAT_SIZE_BYTES = 4;
	private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 5 * FLOAT_SIZE_BYTES;
	private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 3;
	
	
	
	public void loadTexture(Texture2D texture, TextureRepository repository) {
		if (!texture.isReady()) {
			int[] textures = new int[1];
			delegate.glGenTextures(1, textures, 0);
			texture.setGlTextureId(textures[0]);
			delegate.glBindTexture(GLES20.GL_TEXTURE_2D, texture.getGlTextureId());

			TextureReader.TextureBuffer text = repository.loadTextureBitmap(texture);
			if (texture != null) {
				// gl.glGenerateMipmap(material.glTextureId);
				glu.gluBuild2DMipmaps(GL.GL_TEXTURE_2D, GLES20.GL_RGB8,
						text.getWidth(), text.getHeight(), GLES20.GL_RGB,
						GLES20.GL_UNSIGNED_BYTE, text.getPixels());
				checkGlError("generate mipmaps with material "
						+ texture.getName());
			}
			delegate.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER,
					GLES20.GL_LINEAR);
			checkGlError("texmin " + texture.getName());
			delegate.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MAG_FILTER,
					GLES20.GL_LINEAR);
			checkGlError("texmag " + texture.getName());
			delegate.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_S,
					GLES20.GL_REPEAT);
			checkGlError("wraps " + texture.getName());
			delegate.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_T,
					GLES20.GL_REPEAT);
			checkGlError("wrapt " + texture.getName());

			repository.markTextureAsLoadedInGl(texture);
			textures = null;
		}
	}
}
