package com.fairyteller.fairy3d.scene.handlers;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.IntBuffer;
import java.util.List;

import android.opengl.GLES20;

public class Program3D {
	int glProgramId;
	ShaderHandler vertexShader;
	ShaderHandler fragmentShader;
	List<ProgramHandler> programHandlers;
	protected GLES20 delegate;
	
	public static enum ShaderHandlerType{
		VERTEXSHADER, FRAGMENTSHADER
	}
	
	public static enum ProgramHandlerType{
		glUniformMatrix4fv,
		glUniformMatrix4fvTranspose,
		glUniform4fv,
		glUniform3fv,
		glUniform2fv,
		glUniform1f,
		glUniform1i,
		glVertexAttribPointer3fv,
		glVertexAttribPointer3fvVBO,
		glVertexAttribPointer2fv,
		glVertexAttribPointer2fvVBO,
		glTexture
	}
	
	public static final class ShaderHandler{
		int glLocation = -1;
		public ShaderHandlerType type;
		private String shaderSource;
		
		public void setShaderSource(String string){
			StringReader ir = new StringReader(string);
			setShaderStream(ir);
		}
		
		public void setShaderStream(Reader reader){
			StringBuffer vs = new StringBuffer();
			// read the files
			try {
				BufferedReader in = new BufferedReader(reader);
				String read = in.readLine();
				while (read != null) {
					vs.append(read + "\n");
					read = in.readLine();
				}
				in.close();
				vs.deleteCharAt(vs.length() - 1);
				String source = vs.toString();
				// Setup everything
				setup(source);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private void setup(String shaderSource) {
			this.shaderSource = shaderSource;
		}
		
		public int getGlLocation() {
			return glLocation;
		}
		
	}
	
	public void checkAndCreateTexture(ProgramHandler handler){
		if(handler.value1i<0){
			int[] textures = new int[1];
	        delegate.glGenTextures(1, textures, 0);

	        handler.value1i = textures[0];
	        delegate.glBindTexture(GLES20.GL_TEXTURE_2D, handler.value1i);

	        delegate.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER,
	        		GLES20.GL_NEAREST);
	        delegate.glTexParameterf(GLES20.GL_TEXTURE_2D,
	        		GLES20.GL_TEXTURE_MAG_FILTER,
	        		GLES20.GL_LINEAR);

	        delegate.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_S,
	        		GLES20.GL_REPEAT);
	        delegate.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_T,
	        		GLES20.GL_REPEAT);
		}
	}
	
	public void enableAttrib(ProgramHandler handler){
		switch(handler.type){
		case glVertexAttribPointer3fv:
		case glVertexAttribPointer3fvVBO:
		case glVertexAttribPointer2fv:
		case glVertexAttribPointer2fvVBO:
			delegate.glEnableVertexAttribArray(handler.glLocation);
			break;
		default:
			break;
		}
	}
	
	public void disableAttrib(ProgramHandler handler){
		switch(handler.type){
		case glVertexAttribPointer3fv:
		case glVertexAttribPointer2fv:
		case glVertexAttribPointer3fvVBO:
		case glVertexAttribPointer2fvVBO:
			delegate.glDisableVertexAttribArray(handler.glLocation);
			break;
		default:
			break;
		}
	}
	
	public void bindValue(ProgramHandler handler){
		switch(handler.type){
		case glUniform1i:
		case glTexture:
			delegate.glUniform1i(handler.glLocation, handler.value1i);
			break;
		case glUniform1f:
			delegate.glUniform1f(handler.glLocation, handler.value1f);
			break;
		case glUniform2fv:
			delegate.glUniform2fv(handler.glLocation, handler.uniformCount, handler.valuefv, handler.uniformOffset);
			break;
		case glUniform3fv:
			delegate.glUniform3fv(handler.glLocation, handler.uniformCount, handler.valuefv, handler.uniformOffset);
			break;
		case glUniform4fv:
			delegate.glUniform4fv(handler.glLocation, handler.uniformCount, handler.valuefv, handler.uniformOffset);
			break;
		case glUniformMatrix4fv:
			delegate.glUniformMatrix4fv(handler.glLocation, handler.uniformCount, false, handler.valuefv, handler.uniformOffset);
			break;
		case glUniformMatrix4fvTranspose:
			delegate.glUniformMatrix4fv(handler.glLocation, handler.uniformCount, true, handler.valuefv, handler.uniformOffset);
			break;
		case glVertexAttribPointer3fv:
			delegate.glVertexAttribPointer(handler.glLocation,
					3, GLES20.GL_FLOAT, false,
					handler.attribStride,
					handler.floatBuffer);
			break;
		case glVertexAttribPointer2fv:
			delegate.glVertexAttribPointer(handler.glLocation,
					2, GLES20.GL_FLOAT, false,
					handler.attribStride,
					handler.floatBuffer);
			break;
		case glVertexAttribPointer3fvVBO:
			delegate.glVertexAttribPointer(handler.glLocation,
					3, GLES20.GL_FLOAT, false,
					handler.attribStride,handler.glVBOindex);
			break;
		case glVertexAttribPointer2fvVBO:
			delegate.glVertexAttribPointer(handler.glLocation,
					2, GLES20.GL_FLOAT, false,
					handler.attribStride,handler.glVBOindex);
			break;
		default:
			break;
		}
	}
	
	public int registerProgramHandler(ProgramHandler handler){
		switch(handler.type){
			case glUniform1i:
			case glTexture:
			case glUniform1f:
			case glUniform2fv:
			case glUniform3fv:
			case glUniform4fv:
			case glUniformMatrix4fv:
			case glUniformMatrix4fvTranspose:
				if(glProgramId>0){
					handler.glLocation = delegate.glGetUniformLocation(glProgramId, handler.variableName);
				} else {
					handler.glLocation = -1;
				}
				break;
			case glVertexAttribPointer3fv:
			case glVertexAttribPointer2fv:
			case glVertexAttribPointer3fvVBO:
			case glVertexAttribPointer2fvVBO:
				if(glProgramId>0){
					handler.glLocation = delegate.glGetAttribLocation(glProgramId, handler.variableName);
				} else {
					handler.glLocation = -1;
				}
				break;
		}
		handler.program = this;
		return handler.glLocation;
	}
	
	private int registerShaderHandler(ShaderHandler handler){
		switch(handler.type){
			case VERTEXSHADER:
				if(handler.glLocation<=0){
					handler.glLocation = loadShader(GLES20.GL_VERTEX_SHADER, handler.shaderSource);
				}
				break;
			case FRAGMENTSHADER:
				if(handler.glLocation<=0){
					handler.glLocation = loadShader(GLES20.GL_FRAGMENT_SHADER, handler.shaderSource);
				}
				break;
		}
		return handler.glLocation;
	}
	
	private int loadShader(int shaderType, String source) {
        int shader = delegate.glCreateShader(shaderType);
        if (shader != 0) {
            delegate.glShaderSource(shader, source);
            delegate.glCompileShader(shader);
            int[] compiled = new int[1];
            delegate.glGetShaderiv(shader, GLES20.GL_COMPILE_STATUS, compiled, 0);
            if (compiled[0] == 0) {
                checkShaderCompileError(shader);
                delegate.glDeleteShader(shader);
                shader = 0;
            }
        }
        return shader;
    }
	
	private void checkShaderCompileError(int shaderId) {
	    IntBuffer status = IntBuffer.allocate(1);
	    delegate.glGetShaderiv(shaderId, GLES20.GL_COMPILE_STATUS, status);
	 
	    if (status.get() == GLES20.GL_FALSE) {
	        getShaderInfoLog(shaderId);
	    } 
	}
	 
	private void getShaderInfoLog(int shaderId) {
//	    IntBuffer infoLogLength = IntBuffer.allocate(1);
//	    delegate.glGetShaderiv(shaderId, OpenGLDelegate.GL_INFO_LOG_LENGTH, infoLogLength);
//	 
//	    ByteBuffer infoLog = ByteBuffer.allocate(infoLogLength.get(0));
//	    delegate.glGetShaderInfoLog(shaderId, infoLogLength.get(0), null, infoLog);
	 
//	    String infoLogString =
//	            Charset.forName("US-ASCII").decode(infoLog).toString();
		
		String infoLogString = delegate.glGetShaderInfoLog(shaderId);
	    throw new Error("Shader compile error\n" + infoLogString);
	}
	
	public int createProgram(GLES20 gl){
		this.delegate = gl;
		glProgramId = -1;
		// Vertex shader
		vertexShader.glLocation = -1;
		registerShaderHandler(vertexShader);
        int vertexGlId = vertexShader.glLocation;
        if (vertexGlId == 0) {
            return 0;
        }
        fragmentShader.glLocation = -1;
        registerShaderHandler(fragmentShader);
        // pixel shader
        int fragmentGlId = fragmentShader.glLocation;
        if (fragmentGlId == 0) {
            return 0;
        }
        // Create the program
        int programId = gl.glCreateProgram();
        if (programId != 0) {
            gl.glAttachShader(programId, vertexGlId);
            gl.glAttachShader(programId, fragmentGlId);
            gl.glLinkProgram(programId);
            int[] linkStatus = new int[1];
            gl.glGetProgramiv(programId, GLES20.GL_LINK_STATUS, linkStatus, 0);
            if (linkStatus[0] != GLES20.GL_TRUE) {
                checkProgramLinkAndValidationErrors(programId);
                gl.glDeleteProgram(programId);
                programId = 0;
                return 0;
            }
        }
        glProgramId = programId;
        return programId;
	}
	
	private void checkProgramLinkAndValidationErrors(int id) {
	    IntBuffer status = IntBuffer.allocate(1);
	    delegate.glGetProgramiv(id, GLES20.GL_LINK_STATUS, status);
	 
	    if (status.get() == GLES20.GL_FALSE) {
	        getProgramInfoLog(id);
	    } else {
	        status.rewind();
	        delegate.glValidateProgram(id);
	        delegate.glGetProgramiv(id, GLES20.GL_VALIDATE_STATUS, status);
	        if (status.get() == GLES20.GL_FALSE) {
	            getProgramInfoLog(id);
	        }
	    }
	}
	 
	private void getProgramInfoLog(int id) {
//	    IntBuffer infoLogLength = IntBuffer.allocate(1);
//	    delegate.glGetProgramiv(id, OpenGLDelegate.GL_INFO_LOG_LENGTH, infoLogLength);
//	 
//	    ByteBuffer infoLog = ByteBuffer.allocate(infoLogLength.get(0));
//	    delegate.glGetProgramInfoLog(id, infoLogLength.get(0), null, infoLog);
//	 
//	    String infoLogString =
//	            Charset.forName("US-ASCII").decode(infoLog).toString();
	    String infoLogString = delegate.glGetProgramInfoLog(id);
	    throw new Error("Program compile error\n" + infoLogString);
	}
	
	public void setVertexShader(ShaderHandler vertexShader) {
		this.vertexShader = vertexShader;
	}
	public void setFragmentShader(ShaderHandler fragmentShader) {
		this.fragmentShader = fragmentShader;
	}
	public void setProgramHandlers(List<ProgramHandler> programHandlers) {
		this.programHandlers = programHandlers;
	}
	public ShaderHandler getFragmentShader() {
		return fragmentShader;
	}
	public int getGlProgramId() {
		return glProgramId;
	}
	public List<ProgramHandler> getProgramHandlers() {
		return programHandlers;
	}
	public ShaderHandler getVertexShader() {
		return vertexShader;
	}
	
	public void engage(){
		delegate.glUseProgram(glProgramId);
	}
	public void disengage(){
		delegate.glUseProgram(0);
	}
	
	public void reset(){
		this.glProgramId = -1;
		this.fragmentShader.glLocation = -1;
		this.vertexShader.glLocation = -1;
	}
}
