import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

import com.fairyteller.fairy3d.scene.Texture2D;
import com.fairyteller.fairy3d.utils.GLES20;


public class MyFrameBuffer {
	public static final int FLOAT_SIZE_BYTES = 4;
	int glFramebufferId;
	int glDepthRenderbufferId;
	Texture2D texture;
	IntBuffer texBuffer;
	
	public void setup(GLES20 delegate, int texW, int texH){
		int[] fb = new int[1];
		int[] depthRb = new int[1];
		int[] renderTex = new int[1];
		
		// create the ints for the framebuffer, depth render buffer and texture
		fb = new int[1];
		depthRb = new int[1];
		renderTex = new int[1];

		// generate
		delegate.glGenFramebuffers(1, fb, 0);
		delegate.glGenRenderbuffers(1, depthRb, 0); // the depth buffer
		delegate.glGenTextures(1, renderTex, 0);

		// generate texture
		delegate.glBindTexture(GLES20.GL_TEXTURE_2D, renderTex[0]);

		// parameters - we have to make sure we clamp the textures to the edges
		delegate.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_S,
				GLES20.GL_CLAMP_TO_EDGE);
		delegate.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_T,
				GLES20.GL_CLAMP_TO_EDGE);
		delegate.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MAG_FILTER,
				GLES20.GL_LINEAR);
		delegate.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER,
				GLES20.GL_LINEAR);

		// create it
		// create an empty intbuffer first
		int[] buf = new int[texW * texH];
		texBuffer = ByteBuffer.allocateDirect(buf.length
				* FLOAT_SIZE_BYTES).order(ByteOrder.nativeOrder()).asIntBuffer();

		// generate the textures
		delegate.glTexImage2D(GLES20.GL_TEXTURE_2D, 0, GLES20.GL_RGB, texW, texH, 0, GLES20.GL_RGB, GLES20.GL_UNSIGNED_SHORT_5_6_5, texBuffer);

		// create render buffer and bind 16-bit depth buffer
		delegate.glBindRenderbuffer(GLES20.GL_RENDERBUFFER, depthRb[0]);
		delegate.glRenderbufferStorage(GLES20.GL_RENDERBUFFER, GLES20.GL_DEPTH_COMPONENT16, texW, texH);
	}
	
}
