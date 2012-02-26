import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.charset.Charset;

import javax.media.opengl.GL2ES2;

import android.opengl.GLES20;

public class MyOpenGLDelegate extends GLES20 {

	public GL2ES2 gl;
	@Override
	public void glAttachShader(int programGlId, int vertexGlId) {
		gl.glAttachShader(programGlId, vertexGlId);
	}
	@Override
	public void glCompileShader(int glShaderId) {
		gl.glCompileShader(glShaderId);
	}
	@Override
	public int glCreateProgram() {
		return gl.glCreateProgram();
	}
	@Override
	public int glCreateShader(int shaderType) {
		return gl.glCreateShader(shaderType);
	}
	@Override
	public void glDeleteProgram(int programGlid) {
		gl.glDeleteProgram(programGlid);
	}
	@Override
	public void glDeleteShader(int glShaderId) {
		gl.glDeleteShader(glShaderId);
	}
	@Override
	public void glDisableVertexAttribArray(int glLocation) {
		gl.glDisableVertexAttribArray(glLocation);
	}
	@Override
	public void glEnableVertexAttribArray(int glLocation) {
		gl.glEnableVertexAttribArray(glLocation);
	}
	@Override
	public int glGetAttribLocation(int glProgramId, String attribName) {
		return gl.glGetAttribLocation(glProgramId, attribName);
	}
	
	@Override
	public void glGetProgramiv(int programGlid, int type, int[] result,
			int offset) {
		gl.glGetProgramiv(programGlid, type, result, offset);
	}
	@Override
	public void glGetProgramiv(int programGlid, int type, IntBuffer result) {
		gl.glGetProgramiv(programGlid, type, result);
	}
	
	@Override
	public void glGetShaderiv(int glShaderId, int statusType, int[] compiled,
			int compiledOffset) {
		gl.glGetShaderiv(glShaderId, statusType, compiled, compiledOffset);
	}
	@Override
	public void glGetShaderiv(int glShaderId, int statusType, IntBuffer buffer) {
		gl.glGetShaderiv(glShaderId, statusType, buffer);
	}
	@Override
	public int glGetUniformLocation(int glProgramId, String uniformName) {
		return gl.glGetUniformLocation(glProgramId, uniformName);
	}
	@Override
	public void glLinkProgram(int programGlId) {
		gl.glLinkProgram(programGlId);
	}
//	@Override
//	public void glShaderSource(int glShaderId, int sourceCount,
//			String[] sources, int[] sourcesLengths, int offset) {
//		gl.glShaderSource(glShaderId, sourceCount, sources, sourcesLengths, offset);
//	}
	@Override
	public void glUniform1i(int glLocation, int valuei) {
		gl.glUniform1i(glLocation, valuei);
	}
	@Override
	public void glUniform1f(int glLocation, float valuef) {
		gl.glUniform1f(glLocation, valuef);
	}
	@Override
	public void glUniform2fv(int glLocation, int uniformCount, float[] valuefv,
			int uniformOffset) {
		gl.glUniform2fv(glLocation, uniformCount, valuefv, uniformOffset);
	}
	@Override
	public void glUniform3fv(int glLocation, int uniformCount, float[] valuefv,
			int uniformOffset) {
		gl.glUniform3fv(glLocation, uniformCount, valuefv, uniformOffset);
	}
	@Override
	public void glUniform4fv(int glLocation, int uniformCount, float[] valuefv,
			int uniformOffset) {
		gl.glUniform4fv(glLocation, uniformCount, valuefv, uniformOffset);
	}
	@Override
	public void glUniformMatrix4fv(int glLocation, int uniformCount, boolean transpose,
			float[] valuefv, int uniformOffset) {
		gl.glUniformMatrix4fv(glLocation, uniformCount, transpose, valuefv, uniformOffset);
	}
	@Override
	public void glValidateProgram(int programGlid) {
		gl.glValidateProgram(programGlid);
	}
	@Override
	public void glVertexAttribPointer(int glLocation, int unitLength, int type,
			boolean normalized, int stride, int offsetBytes) {
		gl.glVertexAttribPointer(glLocation, unitLength, type, normalized, stride, offsetBytes);
	}
	@Override
	public void glVertexAttribPointer(int glLocation, int unitLength, int type,
			boolean normalized, int stride, Buffer buffer) {
		gl.glVertexAttribPointer(glLocation, unitLength, type, normalized, stride, buffer);
	}
	
	@Override
	public void glUseProgram(int glProgramId) {
		gl.glUseProgram(glProgramId);
	}
	@Override
	public void glBindTexture(int type, int glTextureId) {
		gl.glBindTexture(type, glTextureId);
	}
	@Override
	public void glGenTextures(int count, int[] glTextureIds, int glTextureOffset) {
		gl.glGenTextures(count, glTextureIds, glTextureOffset);
	}
	@Override
	public void glTexParameterf(int type, int parameter, float value) {
		gl.glTexParameterf(type, parameter, value);
	}
	@Override
	public void glTexParameteri(int type, int parameter, int value) {
		gl.glTexParameteri(type, parameter, value);
	}
	
	@Override
	public void glDrawArrays(int type, int offset, int count) {
		gl.glDrawArrays(type, offset, count);
	}
	
	@Override
	public void glGenFramebuffers(int count, int[] buffer, int offset) {
		gl.glGenFramebuffers(count, buffer, offset);
	}
	@Override
	public void glGenRenderbuffers(int count, int[] buffer, int offset) {
		gl.glGenRenderbuffers(count, buffer, offset);
	}
//	@Override
//	public void glTexImage2D(int target, int level, int internalformat,
//			int width, int height, int border, int format, int type,
//			IntBuffer pixels) {
//		gl.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
//	}
	
	@Override
	public void glActiveTexture(int texture) {
		gl.glActiveTexture(texture);
	}
	@Override
	public void glBindAttribLocation(int program, int index, String name) {
		gl.glBindAttribLocation(program, index, name);
	}
	@Override
	public void glBindBuffer(int target, int buffer) {
		gl.glBindBuffer(target, buffer);
	}
	@Override
	public void glBindFramebuffer(int target, int framebuffer) {
		gl.glBindFramebuffer(target, framebuffer);
	}
	@Override
	public void glBindRenderbuffer(int target, int renderbuffer) {
		gl.glBindRenderbuffer(target, renderbuffer);
	}
	@Override
	public void glBlendColor(float red, float green, float blue, float alpha) {
		gl.glBlendColor(red, green, blue, alpha);
	}
	@Override
	public void glBlendEquation(int mode) {
		gl.glBlendEquation(mode);
	}
	@Override
	public void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
		gl.glBlendEquationSeparate(modeRGB, modeAlpha);
	}
	@Override
	public void glBlendFunc(int sfactor, int dfactor) {
		gl.glBlendFunc(sfactor, dfactor);
	}
	@Override
	public void glBlendFuncSeparate(int srcRGB, int dstRGB, int srcAlpha,
			int dstAlpha) {
		gl.glBlendFuncSeparate(srcRGB, dstRGB, srcAlpha, dstAlpha);
	}
	@Override
	public void glBufferData(int target, int size, Buffer data, int usage) {
		gl.glBufferData(target, size, data, usage);
	}
	@Override
	public void glBufferSubData(int target, int offset, int size, Buffer data) {
		gl.glBufferSubData(target, offset, size, data);
	}
	@Override
	public int glCheckFramebufferStatus(int target) {
		return gl.glCheckFramebufferStatus(target);
	}
	@Override
	public void glClear(int mask) {
		gl.glClear(mask);
	}
	@Override
	public void glClearColor(float red, float green, float blue, float alpha) {
		gl.glClearColor(red, green, blue, alpha);
	}
	@Override
	public void glClearDepthf(float depth) {
		gl.glClearDepthf(depth);
	}
	@Override
	public void glClearStencil(int s) {
		gl.glClearStencil(s);
	}
	@Override
	public void glColorMask(boolean red, boolean green, boolean blue,
			boolean alpha) {
		gl.glColorMask(red, green, blue, alpha);
	}
	
	@Override
	public void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, Buffer data) {
		gl.glCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
	};
	
	@Override
	public void glCompressedTexSubImage2D(int target, int level, int xoffset,
			int yoffset, int width, int height, int format, int imageSize,
			Buffer data) {
		gl.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
	}
	@Override
	public void glCopyTexImage2D(int target, int level, int internalformat,
			int x, int y, int width, int height, int border) {
		gl.glCopyTexImage2D(target, level, internalformat, x, y, width, height, border);
	}
	@Override
	public void glCopyTexSubImage2D(int target, int level, int xoffset,
			int yoffset, int x, int y, int width, int height) {
		gl.glCopyTexSubImage2D(target, level, xoffset, yoffset, x, y, width, height);
	}
	@Override
	public void glCullFace(int mode) {
		gl.glCullFace(mode);
	}
	@Override
	public void glDeleteBuffers(int n, int[] buffers, int offset) {
		gl.glDeleteBuffers(n, buffers, offset);
	}
	@Override
	public void glDeleteBuffers(int n, IntBuffer buffers) {
		gl.glDeleteBuffers(n, buffers);
	}
	@Override
	public void glDeleteFramebuffers(int n, int[] framebuffers, int offset) {
		gl.glDeleteFramebuffers(n, framebuffers, offset);
	}
	@Override
	public void glDeleteFramebuffers(int n, IntBuffer framebuffers) {
		gl.glDeleteFramebuffers(n, framebuffers);
	}
	@Override
	public void glDeleteRenderbuffers(int n, int[] renderbuffers, int offset) {
		gl.glDeleteRenderbuffers(n, renderbuffers, offset);
	}
	@Override
	public void glDeleteRenderbuffers(int n, IntBuffer renderbuffers) {
		gl.glDeleteRenderbuffers(n, renderbuffers);
	}
	@Override
	public void glDeleteTextures(int n, int[] textures, int offset) {
		gl.glDeleteTextures(n, textures, offset);
	}
	@Override
	public void glDeleteTextures(int n, IntBuffer textures) {
		gl.glDeleteTextures(n, textures);
	}
	@Override
	public void glDepthFunc(int func) {
		gl.glDepthFunc(func);
	}
	@Override
	public void glDepthMask(boolean flag) {
		gl.glDepthMask(flag);
	}
	@Override
	public void glDepthRangef(float zNear, float zFar) {
		gl.glDepthRangef(zNear, zFar);
	}
	@Override
	public void glDetachShader(int program, int shader) {
		gl.glDetachShader(program, shader);
	}
	@Override
	public void glDisable(int cap) {
		gl.glDisable(cap);
	}
	@Override
	public void glDrawElements(int mode, int count, int type, Buffer indices) {
		gl.glDrawElements(mode, count, type, indices);
	}
	@Override
	public void glDrawElements(int mode, int count, int type, int offset) {
		gl.glDrawElements(mode, count, type, offset);
	}
	@Override
	public void glEnable(int cap) {
		gl.glEnable(cap);
	}
	@Override
	public void glFinish() {
		gl.glFinish();
	}
	@Override
	public void glFlush() {
		gl.glFlush();
	}
	@Override
	public void glFramebufferRenderbuffer(int target, int attachment,
			int renderbuffertarget, int renderbuffer) {
		gl.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
	}
	@Override
	public void glFramebufferTexture2D(int target, int attachment,
			int textarget, int texture, int level) {
		gl.glFramebufferTexture2D(target, attachment, textarget, texture, level);
	}
	@Override
	public void glFrontFace(int mode) {
		gl.glFrontFace(mode);
	}
	@Override
	public void glGenBuffers(int n, int[] buffers, int offset) {
		gl.glGenBuffers(n, buffers, offset);
	}
	@Override
	public void glGenBuffers(int n, IntBuffer buffers) {
		gl.glGenBuffers(n, buffers);
	}
	@Override
	public void glGenerateMipmap(int target) {
		gl.glGenerateMipmap(target);
	}
	@Override
	public void glGenFramebuffers(int n, IntBuffer framebuffers) {
		gl.glGenFramebuffers(n, framebuffers);
	}
	@Override
	public void glGenRenderbuffers(int n, IntBuffer renderbuffers) {
		gl.glGenRenderbuffers(n, renderbuffers);
	}
	@Override
	public void glGenTextures(int n, IntBuffer textures) {
		gl.glGenTextures(n, textures);
	}
	
	@Override
	public void glGetActiveAttrib(int program, int index, int bufsize,
			int[] length, int lengthOffset, int[] size, int sizeOffset,
			int[] type, int typeOffset, byte[] name, int nameOffset) {
		gl.glGetActiveAttrib(program, index, bufsize, length, lengthOffset, size, sizeOffset, type, typeOffset, name, nameOffset);
	}
	@Override
	public void glGetActiveAttrib(int program, int index, int bufsize,
			IntBuffer length, IntBuffer size, IntBuffer type, byte name) {
		ByteBuffer buffer = ByteBuffer.allocateDirect(1);
		buffer.put(name);
		buffer.position(0);
		gl.glGetActiveAttrib(program, index, bufsize, length, size, type, buffer);
	}
	@Override
	public void glGetActiveUniform(int program, int index, int bufsize,
			int[] length, int lengthOffset, int[] size, int sizeOffset,
			int[] type, int typeOffset, byte[] name, int nameOffset) {
		gl.glGetActiveUniform(program, index, bufsize, length, lengthOffset, size, sizeOffset, type, typeOffset, name, nameOffset);
	}
	@Override
	public void glGetActiveUniform(int program, int index, int bufsize,
			IntBuffer length, IntBuffer size, IntBuffer type, byte name) {
		ByteBuffer buffer = ByteBuffer.allocateDirect(1);
		buffer.put(name);
		buffer.position(0);
		gl.glGetActiveUniform(program, index, bufsize, length, size, type, buffer);
	}
	@Override
	public void glGetAttachedShaders(int program, int maxcount, int[] count,
			int countOffset, int[] shaders, int shadersOffset) {
		gl.glGetAttachedShaders(program, maxcount, count, countOffset, shaders, shadersOffset);
	}
	@Override
	public void glGetAttachedShaders(int program, int maxcount,
			IntBuffer count, IntBuffer shaders) {
		gl.glGetAttachedShaders(program, maxcount, count, shaders);
	}
	@Override
	public void glGetBooleanv(int pname, boolean[] params, int offset) {
		byte[] bytes = new byte[1];
		gl.glGetBooleanv(pname, bytes, 0);
		params[offset] = (bytes[0]==1);
	}
	@Override
	public void glGetBooleanv(int pname, IntBuffer params) {
		byte[] bytes = new byte[1];
		gl.glGetBooleanv(pname, bytes, 0);
		params.put(bytes[0]);
	}
	@Override
	public void glGetBufferParameteriv(int target, int pname, int[] params,
			int offset) {
		gl.glGetBufferParameteriv(target, pname, params, offset);
	}
	@Override
	public void glGetBufferParameteriv(int target, int pname, IntBuffer params) {
		gl.glGetBufferParameteriv(target, pname, params);
	}
	@Override
	public int glGetError() {
		return gl.glGetError();
	}
	@Override
	public void glGetFloatv(int pname, float[] params, int offset) {
		gl.glGetFloatv(pname, params, offset);
	}
	@Override
	public void glGetFloatv(int pname, FloatBuffer params) {
		gl.glGetFloatv(pname, params);
	}
	@Override
	public void glGetFramebufferAttachmentParameteriv(int target,
			int attachment, int pname, int[] params, int offset) {
		gl.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params, offset);
	}
	@Override
	public void glGetFramebufferAttachmentParameteriv(int target,
			int attachment, int pname, IntBuffer params) {
		gl.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
	}
	@Override
	public void glGetIntegerv(int pname, int[] params, int offset) {
		gl.glGetIntegerv(pname, params, offset);
	}
	@Override
	public void glGetIntegerv(int pname, IntBuffer params) {
		gl.glGetIntegerv(pname, params);
	}
	@Override
	public String glGetProgramInfoLog(int program) {
		IntBuffer infoLogLength = IntBuffer.allocate(1);
	    gl.glGetProgramiv(program, GLES20.GL_INFO_LOG_LENGTH, infoLogLength);
	    ByteBuffer infoLog = ByteBuffer.allocate(infoLogLength.get(0));
	    gl.glGetProgramInfoLog(program, infoLogLength.get(0), null, infoLog);
	    String infoLogString =
	            Charset.forName("US-ASCII").decode(infoLog).toString();
		return infoLogString;
	}
	
	@Override
	public String glGetShaderInfoLog(int shader) {
		IntBuffer infoLogLength = IntBuffer.allocate(1);
	    gl.glGetShaderiv(shader, GLES20.GL_INFO_LOG_LENGTH, infoLogLength);
	    ByteBuffer infoLog = ByteBuffer.allocate(infoLogLength.get(0));
	    gl.glGetShaderInfoLog(shader, infoLogLength.get(0), null, infoLog);
	    String infoLogString =
	            Charset.forName("US-ASCII").decode(infoLog).toString();
	   	return infoLogString;
	}
	
	@Override
	public void glGetRenderbufferParameteriv(int target, int pname,
			int[] params, int offset) {
		gl.glGetRenderbufferParameteriv(target, pname, params, offset);
	}
	@Override
	public void glGetRenderbufferParameteriv(int target, int pname,
			IntBuffer params) {
		gl.glGetRenderbufferParameteriv(target, pname, params);
	}
	@Override
	public void glGetShaderPrecisionFormat(int shadertype, int precisiontype,
			int[] range, int rangeOffset, int[] precision, int precisionOffset) {
		gl.glGetShaderPrecisionFormat(shadertype, precisiontype, range, rangeOffset, precision, precisionOffset);
	}
	@Override
	public void glGetShaderPrecisionFormat(int shadertype, int precisiontype,
			IntBuffer range, IntBuffer precision) {
		gl.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
	}
	@Override
	public void glGetShaderSource(int shader, int bufsize, int[] length,
			int lengthOffset, byte[] source, int sourceOffset) {
		gl.glGetShaderSource(shader, bufsize, length, lengthOffset, source, sourceOffset);
	}
	@Override
	public void glGetShaderSource(int shader, int bufsize, IntBuffer length,
			byte source) {
		ByteBuffer buffer = ByteBuffer.allocateDirect(1);
		buffer.put(source);
		buffer.position(0);
		gl.glGetShaderSource(shader, bufsize, length, buffer);
	}
	@Override
	public String glGetString(int name) {
		return gl.glGetString(name);
	}
	@Override
	public void glGetTexParameterfv(int target, int pname, float[] params,
			int offset) {
		gl.glGetTexParameterfv(target, pname, params, offset);
	}
	@Override
	public void glGetTexParameterfv(int target, int pname, FloatBuffer params) {
		gl.glGetTexParameterfv(target, pname, params);
	}
	@Override
	public void glGetTexParameteriv(int target, int pname, int[] params,
			int offset) {
		gl.glGetTexParameteriv(target, pname, params, offset);
	}
	@Override
	public void glGetTexParameteriv(int target, int pname, IntBuffer params) {
		gl.glGetTexParameteriv(target, pname, params);
	}
	@Override
	public void glGetUniformfv(int program, int location, float[] params,
			int offset) {
		gl.glGetUniformfv(program, location, params, offset);
	}
	@Override
	public void glGetUniformfv(int program, int location, FloatBuffer params) {
		gl.glGetUniformfv(program, location, params);
	}
	@Override
	public void glGetUniformiv(int program, int location, int[] params,
			int offset) {
		gl.glGetUniformiv(program, location, params, offset);
	}
	@Override
	public void glGetUniformiv(int program, int location, IntBuffer params) {
		gl.glGetUniformiv(program, location, params);
	}
	@Override
	public void glGetVertexAttribfv(int index, int pname, float[] params,
			int offset) {
		gl.glGetVertexAttribfv(index, pname, params, offset);
	}
	@Override
	public void glGetVertexAttribfv(int index, int pname, FloatBuffer params) {
		gl.glGetVertexAttribfv(index, pname, params);
	}
	@Override
	public void glGetVertexAttribiv(int index, int pname, int[] params,
			int offset) {
		gl.glGetVertexAttribiv(index, pname, params, offset);
	}
	@Override
	public void glGetVertexAttribiv(int index, int pname, IntBuffer params) {
		gl.glGetVertexAttribiv(index, pname, params);
	}
	@Override
	public void glHint(int target, int mode) {
		gl.glHint(target, mode);
	}
	@Override
	public boolean glIsBuffer(int buffer) {
		return gl.glIsBuffer(buffer);
	}
	@Override
	public boolean glIsEnabled(int cap) {
		return gl.glIsEnabled(cap);
	}
	@Override
	public boolean glIsFramebuffer(int framebuffer) {
		return gl.glIsFramebuffer(framebuffer);
	}
	@Override
	public boolean glIsProgram(int program) {
		return gl.glIsProgram(program);
	}
	@Override
	public boolean glIsRenderbuffer(int renderbuffer) {
		return gl.glIsRenderbuffer(renderbuffer);
	}
	@Override
	public boolean glIsShader(int shader) {
		return gl.glIsShader(shader);
	}
	@Override
	public boolean glIsTexture(int texture) {
		return gl.glIsTexture(texture);
	}
	@Override
	public void glLineWidth(float width) {
		gl.glLineWidth(width);
	}
	@Override
	public void glPixelStorei(int pname, int param) {
		gl.glPixelStorei(pname, param);
	}
	@Override
	public void glPolygonOffset(float factor, float units) {
		gl.glPolygonOffset(factor, units);
	}
	@Override
	public void glReadPixels(int x, int y, int width, int height, int format,
			int type, Buffer pixels) {
		gl.glReadPixels(x, y, width, height, format, type, pixels);
	}
	@Override
	public void glReleaseShaderCompiler() {
		gl.glReleaseShaderCompiler();
	}
	@Override
	public void glRenderbufferStorage(int target, int internalformat,
			int width, int height) {
		gl.glRenderbufferStorage(target, internalformat, width, height);
	}
	@Override
	public void glSampleCoverage(float value, boolean invert) {
		gl.glSampleCoverage(value, invert);
	}
	@Override
	public void glScissor(int x, int y, int width, int height) {
		gl.glScissor(x, y, width, height);
	}
	@Override
	public void glShaderBinary(int n, int[] shaders, int offset,
			int binaryformat, Buffer binary, int length) {
		gl.glShaderBinary(n, shaders, offset, binaryformat, binary, length);
	}
	@Override
	public void glShaderBinary(int n, IntBuffer shaders, int binaryformat,
			Buffer binary, int length) {
		gl.glShaderBinary(n, shaders, binaryformat, binary, length);
	}
	@Override
	public void glShaderSource(int shader, String string) {
		String[] strings = string.split("\n");
		int count = strings.length;
		int[] lengths = new int[count];
		int length_offset = 0;
		for(int i = 0; i<count;i++){
			lengths[i] = strings[i].length();
		}
		gl.glShaderSource(shader, count, strings, lengths, length_offset);
	}
	@Override
	public void glStencilFunc(int func, int ref, int mask) {
		gl.glStencilFunc(func, ref, mask);
	}
	@Override
	public void glStencilFuncSeparate(int face, int func, int ref, int mask) {
		gl.glStencilFuncSeparate(face, func, ref, mask);
	}
	@Override
	public void glStencilMask(int mask) {
		gl.glStencilMask(mask);
	}
	@Override
	public void glStencilMaskSeparate(int face, int mask) {
		gl.glStencilMaskSeparate(face, mask);
	}
	@Override
	public void glStencilOp(int fail, int zfail, int zpass) {
		gl.glStencilOp(fail, zfail, zpass);
	}
	@Override
	public void glStencilOpSeparate(int face, int fail, int zfail, int zpass) {
		gl.glStencilOpSeparate(face, fail, zfail, zpass);
	}
	@Override
	public void glTexImage2D(int target, int level, int internalformat,
			int width, int height, int border, int format, int type,
			Buffer pixels) {
		gl.glTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
	}
	@Override
	public void glTexParameterfv(int target, int pname, float[] params,
			int offset) {
		gl.glTexParameterfv(target, pname, params, offset);
	}
	@Override
	public void glTexParameterfv(int target, int pname, FloatBuffer params) {
		gl.glTexParameterfv(target, pname, params);
	}
	@Override
	public void glTexParameteriv(int target, int pname, int[] params, int offset) {
		gl.glTexParameteriv(target, pname, params, offset);
	}
	@Override
	public void glTexParameteriv(int target, int pname, IntBuffer params) {
		gl.glTexParameteriv(target, pname, params);
	}
	@Override
	public void glTexSubImage2D(int target, int level, int xoffset,
			int yoffset, int width, int height, int format, int type,
			Buffer pixels) {
		gl.glTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
	}
	@Override
	public void glUniform1fv(int location, int count, float[] v, int offset) {
		gl.glUniform1fv(location, count, v, offset);
	}
	@Override
	public void glUniform1fv(int location, int count, FloatBuffer v) {
		gl.glUniform1fv(location, count, v);
	}
	@Override
	public void glUniform1iv(int location, int count, int[] v, int offset) {
		gl.glUniform1iv(location, count, v, offset);
	}
	@Override
	public void glUniform1iv(int location, int count, IntBuffer v) {
		gl.glUniform1iv(location, count, v);
	}
	@Override
	public void glUniform2f(int location, float x, float y) {
		gl.glUniform2f(location, x, y);
	}
	@Override
	public void glUniform2fv(int location, int count, FloatBuffer v) {
		gl.glUniform2fv(location, count, v);
	}
	@Override
	public void glUniform2i(int location, int x, int y) {
		gl.glUniform2i(location, x, y);
	}
	@Override
	public void glUniform2iv(int location, int count, int[] v, int offset) {
		gl.glUniform2iv(location, count, v, offset);
	}
	@Override
	public void glUniform2iv(int location, int count, IntBuffer v) {
		gl.glUniform2iv(location, count, v);
	}
	@Override
	public void glUniform3f(int location, float x, float y, float z) {
		gl.glUniform3f(location, x, y, z);
	}
	@Override
	public void glUniform3fv(int location, int count, FloatBuffer v) {
		gl.glUniform3fv(location, count, v);
	}
	@Override
	public void glUniform3i(int location, int x, int y, int z) {
		gl.glUniform3i(location, x, y, z);
	}
	@Override
	public void glUniform3iv(int location, int count, int[] v, int offset) {
		gl.glUniform3iv(location, count, v, offset);
	}
	@Override
	public void glUniform3iv(int location, int count, IntBuffer v) {
		gl.glUniform3iv(location, count, v);
	}
	@Override
	public void glUniform4f(int location, float x, float y, float z, float w) {
		gl.glUniform4f(location, x, y, z, w);
	}
	@Override
	public void glUniform4fv(int location, int count, FloatBuffer v) {
		gl.glUniform4fv(location, count, v);
	}
	@Override
	public void glUniform4i(int location, int x, int y, int z, int w) {
		gl.glUniform4i(location, x, y, z, w);
	}
	@Override
	public void glUniform4iv(int location, int count, int[] v, int offset) {
		gl.glUniform4iv(location, count, v, offset);
	}
	@Override
	public void glUniform4iv(int location, int count, IntBuffer v) {
		gl.glUniform4iv(location, count, v);
	}
	@Override
	public void glUniformMatrix2fv(int location, int count, boolean transpose,
			float[] value, int offset) {
		gl.glUniformMatrix2fv(location, count, transpose, value, offset);
	}
	@Override
	public void glUniformMatrix2fv(int location, int count, boolean transpose,
			FloatBuffer value) {
		gl.glUniformMatrix2fv(location, count, transpose, value);
	}
	@Override
	public void glUniformMatrix3fv(int location, int count, boolean transpose,
			float[] value, int offset) {
		gl.glUniformMatrix3fv(location, count, transpose, value, offset);
	}
	@Override
	public void glUniformMatrix3fv(int location, int count, boolean transpose,
			FloatBuffer value) {
		gl.glUniformMatrix3fv(location, count, transpose, value);
	}
	@Override
	public void glUniformMatrix4fv(int location, int count, boolean transpose,
			FloatBuffer value) {
		gl.glUniformMatrix4fv(location, count, transpose, value);
	}
	@Override
	public void glVertexAttrib1f(int indx, float x) {
		gl.glVertexAttrib1f(indx, x);
	}
	@Override
	public void glVertexAttrib1fv(int indx, float[] values, int offset) {
		gl.glVertexAttrib1fv(indx, values, offset);
	}
	@Override
	public void glVertexAttrib1fv(int indx, FloatBuffer values) {
		gl.glVertexAttrib1fv(indx, values);
	}
	@Override
	public void glVertexAttrib2f(int indx, float x, float y) {
		gl.glVertexAttrib2f(indx, x, y);
	}
	@Override
	public void glVertexAttrib2fv(int indx, float[] values, int offset) {
		gl.glVertexAttrib2fv(indx, values, offset);
	}
	@Override
	public void glVertexAttrib2fv(int indx, FloatBuffer values) {
		gl.glVertexAttrib2fv(indx, values);
	}
	@Override
	public void glVertexAttrib3f(int indx, float x, float y, float z) {
		gl.glVertexAttrib3f(indx, x, y, z);
	}
	@Override
	public void glVertexAttrib3fv(int indx, float[] values, int offset) {
		gl.glVertexAttrib3fv(indx, values, offset);
	}
	@Override
	public void glVertexAttrib3fv(int indx, FloatBuffer values) {
		gl.glVertexAttrib3fv(indx, values);
	}
	@Override
	public void glVertexAttrib4f(int indx, float x, float y, float z, float w) {
		gl.glVertexAttrib4f(indx, x, y, z, w);
	}
	@Override
	public void glVertexAttrib4fv(int indx, float[] values, int offset) {
		gl.glVertexAttrib4fv(indx, values, offset);
	}
	@Override
	public void glVertexAttrib4fv(int indx, FloatBuffer values) {
		gl.glVertexAttrib4fv(indx, values);
	}
	@Override
	public void glViewport(int x, int y, int width, int height) {
		gl.glViewport(x, y, width, height);
	}
}
