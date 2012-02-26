package com.fairyteller.fairy3d.programs;

import java.nio.FloatBuffer;

import android.opengl.GLES20;

import com.fairyteller.fairy3d.scene.Texture2D;
import com.fairyteller.fairy3d.scene.handlers.AttribComposition.Composition;
import com.fairyteller.fairy3d.scene.handlers.Program3D;
import com.fairyteller.fairy3d.scene.handlers.SimpleMatrixHandler;
import com.fairyteller.fairy3d.scene.handlers.SimpleTextureHandler;
import com.fairyteller.fairy3d.scene.handlers.SimpleUVHandler;
import com.fairyteller.fairy3d.scene.handlers.SimpleVerticesHandler;


public class BasicTexturedMesh extends Program3D{

	private SimpleTextureHandler textureHandler;
	private SimpleVerticesHandler aPositionHandler;
    private SimpleUVHandler aTextureCoordHandler;
    private SimpleMatrixHandler uMvpMatrix;
    
    private String mVertexShader =
            "uniform mat4 uMVPMatrix;\n" +
            "attribute vec4 aPosition;\n" +
            "attribute vec2 aTextureCoord;\n" +
            "varying vec2 vTextureCoord;\n" +
            "void main() {\n" +
            "  gl_Position = uMVPMatrix * aPosition;\n" +
//            "  gl_Position = aPosition;\n" +
            "  vTextureCoord = aTextureCoord;\n" +
            "}\n";
		    
    private String mFragmentShader =
            "precision mediump float;\n" +
            "varying vec2 vTextureCoord;\n" +
            "uniform sampler2D sTexture;\n" +
            "void main() {\n" +
            "  gl_FragColor = texture2D(sTexture, vTextureCoord);\n" +
            "}\n";
    
    public BasicTexturedMesh() {
		createProgram();
	}
    
    private void createProgram(){
		initProgramHandlers();
        ShaderHandler vs = new ShaderHandler();
        vs.type = ShaderHandlerType.VERTEXSHADER;
        ShaderHandler ps = new ShaderHandler();
        ps.type = ShaderHandlerType.FRAGMENTSHADER;
        setVertexShader(vs);
        setFragmentShader(ps);
	}
    
    public void initProgram(GLES20 delegate){
		getVertexShader().setShaderSource(mVertexShader);
		getFragmentShader().setShaderSource(mFragmentShader);
		createProgram(delegate);
		
		aPositionHandler.init(this);
        aTextureCoordHandler.init(this);
        uMvpMatrix.init(this);
        textureHandler.init(this);
	}
	
    private void engageProgram(){
		engage();
		aPositionHandler.engage();
		aTextureCoordHandler.engage();
	}
	
	private void disengageProgram(){
		aPositionHandler.disengage();
		aTextureCoordHandler.disengage();
		disengage();
	}
	
	public void cleanupProgram(){
		delegate.glDeleteProgram(getGlProgramId());
		delegate.glDeleteShader(getFragmentShader().getGlLocation());
		delegate.glDeleteShader(getVertexShader().getGlLocation());
		reset();
	}
    
    private void initProgramHandlers(){
		aPositionHandler = new SimpleVerticesHandler("aPosition", Composition.FLOATBUFFER_VERTS_UV);
		uMvpMatrix = new SimpleMatrixHandler("uMVPMatrix");
		aTextureCoordHandler = new SimpleUVHandler("aTextureCoord", Composition.FLOATBUFFER_VERTS_UV);
		textureHandler = new SimpleTextureHandler("sTexture");
	}
    
	public void drawValues(FloatBuffer triangleVertices, float[] mvpMatrix, Texture2D texture){
		engageProgram();
		aPositionHandler.updateBuffer(triangleVertices);
		aTextureCoordHandler.updateBuffer(triangleVertices);
		bindValue(aTextureCoordHandler);
		uMvpMatrix.updateMatrix(mvpMatrix);
		textureHandler.setTexture(texture);
		delegate.glDrawArrays(GLES20.GL_TRIANGLES, 0, 3);
		disengageProgram();
	}
}
