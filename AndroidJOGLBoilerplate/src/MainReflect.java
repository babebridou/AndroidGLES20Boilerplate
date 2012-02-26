import com.fairyteller.fairy3d.utils.GLES20;


public class MainReflect {

	public static final void main(String[] args){
		System.out.println("static final int GL_NO_ERROR = "+GLES20.GL_NO_ERROR+";");
		System.out.println("static final int GL_INVALID_ENUM = "+GLES20.GL_INVALID_ENUM+";");
		System.out.println("static final int GL_INVALID_VALUE = "+GLES20.GL_INVALID_VALUE+";");
		System.out.println("static final int GL_INVALID_OPERATION = "+GLES20.GL_INVALID_OPERATION+";");
		System.out.println("static final int GL_OUT_OF_MEMORY = "+GLES20.GL_OUT_OF_MEMORY+";");
	}
}
