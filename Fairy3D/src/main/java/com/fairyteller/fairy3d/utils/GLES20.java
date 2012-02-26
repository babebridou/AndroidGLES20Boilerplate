package com.fairyteller.fairy3d.utils;


public abstract class GLES20{
	
    /** C function void glActiveTexture ( GLenum texture )
*/
    public abstract void glActiveTexture(
        int texture
    );

    /** C function void glAttachShader ( GLuint program, GLuint shader )
*/
    public abstract void glAttachShader(
        int program,
        int shader
    );

    /** C function void glBindAttribLocation ( GLuint program, GLuint index, const char *name )
*/
    public abstract void glBindAttribLocation(
        int program,
        int index,
        String name
    );

    /** C function void glBindBuffer ( GLenum target, GLuint buffer )
*/
    public abstract void glBindBuffer(
        int target,
        int buffer
    );

    /** C function void glBindFramebuffer ( GLenum target, GLuint framebuffer )
*/
    public abstract void glBindFramebuffer(
        int target,
        int framebuffer
    );

    /** C function void glBindRenderbuffer ( GLenum target, GLuint renderbuffer )
*/
    public abstract void glBindRenderbuffer(
        int target,
        int renderbuffer
    );

    /** C function void glBindTexture ( GLenum target, GLuint texture )
*/
    public abstract void glBindTexture(
        int target,
        int texture
    );

    /** C function void glBlendColor ( GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )
*/
    public abstract void glBlendColor(
        float red,
        float green,
        float blue,
        float alpha
    );

    /** C function void glBlendEquation ( GLenum mode )
*/
    public abstract void glBlendEquation(
        int mode
    );

    /** C function void glBlendEquationSeparate ( GLenum modeRGB, GLenum modeAlpha )
*/
    public abstract void glBlendEquationSeparate(
        int modeRGB,
        int modeAlpha
    );

    /** C function void glBlendFunc ( GLenum sfactor, GLenum dfactor )
*/
    public abstract void glBlendFunc(
        int sfactor,
        int dfactor
    );

    /** C function void glBlendFuncSeparate ( GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha )
*/
    public abstract void glBlendFuncSeparate(
        int srcRGB,
        int dstRGB,
        int srcAlpha,
        int dstAlpha
    );

    /** C function void glBufferData ( GLenum target, GLsizeiptr size, const GLvoid *data, GLenum usage )
*/
    public abstract void glBufferData(
        int target,
        int size,
        java.nio.Buffer data,
        int usage
    );

    /** C function void glBufferSubData ( GLenum target, GLintptr offset, GLsizeiptr size, const GLvoid *data )
*/
    public abstract void glBufferSubData(
        int target,
        int offset,
        int size,
        java.nio.Buffer data
    );

    /** C function GLenum glCheckFramebufferStatus ( GLenum target )
*/
    public abstract int glCheckFramebufferStatus(
        int target
    );

    /** C function void glClear ( GLbitfield mask )
*/
    public abstract void glClear(
        int mask
    );

    /** C function void glClearColor ( GLclampf red, GLclampf green, GLclampf blue, GLclampf alpha )
*/
    public abstract void glClearColor(
        float red,
        float green,
        float blue,
        float alpha
    );

    /** C function void glClearDepthf ( GLclampf depth )
*/
    public abstract void glClearDepthf(
        float depth
    );

    /** C function void glClearStencil ( GLint s )
*/
    public abstract void glClearStencil(
        int s
    );

    /** C function void glColorMask ( GLboolean red, GLboolean green, GLboolean blue, GLboolean alpha )
*/
    public abstract void glColorMask(
        boolean red,
        boolean green,
        boolean blue,
        boolean alpha
    );

    /** C function void glCompileShader ( GLuint shader )
*/
    public abstract void glCompileShader(
        int shader
    );

    /** C function void glCompressedTexImage2D ( GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, const GLvoid *data )*/

    public abstract void glCompressedTexImage2D(
        int target,
        int level,
        int internalformat,
        int width,
        int height,
        int border,
        int imageSize,
        java.nio.Buffer data
    );

    /** C function void glCompressedTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, const GLvoid *data )*/

    public abstract void glCompressedTexSubImage2D(
        int target,
        int level,
        int xoffset,
        int yoffset,
        int width,
        int height,
        int format,
        int imageSize,
        java.nio.Buffer data
    );

    /** C function void glCopyTexImage2D ( GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLsizei height, GLint border )*/

    public abstract void glCopyTexImage2D(
        int target,
        int level,
        int internalformat,
        int x,
        int y,
        int width,
        int height,
        int border
    );

    /** C function void glCopyTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height )*/

    public abstract void glCopyTexSubImage2D(
        int target,
        int level,
        int xoffset,
        int yoffset,
        int x,
        int y,
        int width,
        int height
    );

    /** C function GLuint glCreateProgram ( void )
*/
    public abstract int glCreateProgram(
    );

    /** C function GLuint glCreateShader ( GLenum type )
*/
    public abstract int glCreateShader(
        int type
    );

    /** C function void glCullFace ( GLenum mode )
*/
    public abstract void glCullFace(
        int mode
    );

    /** C function void glDeleteBuffers ( GLsizei n, const GLuint *buffers )
*/
    public abstract void glDeleteBuffers(
        int n,
        int[] buffers,
        int offset
    );

    /** C function void glDeleteBuffers ( GLsizei n, const GLuint *buffers )
*/
    public abstract void glDeleteBuffers(
        int n,
        java.nio.IntBuffer buffers
    );

    /** C function void glDeleteFramebuffers ( GLsizei n, const GLuint *framebuffers )
*/
    public abstract void glDeleteFramebuffers(
        int n,
        int[] framebuffers,
        int offset
    );

    /** C function void glDeleteFramebuffers ( GLsizei n, const GLuint *framebuffers )
*/
    public abstract void glDeleteFramebuffers(
        int n,
        java.nio.IntBuffer framebuffers
    );

    /** C function void glDeleteProgram ( GLuint program )
*/
    public abstract void glDeleteProgram(
        int program
    );

    /** C function void glDeleteRenderbuffers ( GLsizei n, const GLuint *renderbuffers )
*/
    public abstract void glDeleteRenderbuffers(
        int n,
        int[] renderbuffers,
        int offset
    );

    /** C function void glDeleteRenderbuffers ( GLsizei n, const GLuint *renderbuffers )
*/
    public abstract void glDeleteRenderbuffers(
        int n,
        java.nio.IntBuffer renderbuffers
    );

    /** C function void glDeleteShader ( GLuint shader )
*/
    public abstract void glDeleteShader(
        int shader
    );

    /** C function void glDeleteTextures ( GLsizei n, const GLuint *textures )
*/
    public abstract void glDeleteTextures(
        int n,
        int[] textures,
        int offset
    );

    /** C function void glDeleteTextures ( GLsizei n, const GLuint *textures )
*/
    public abstract void glDeleteTextures(
        int n,
        java.nio.IntBuffer textures
    );

    /** C function void glDepthFunc ( GLenum func )
*/
    public abstract void glDepthFunc(
        int func
    );

    /** C function void glDepthMask ( GLboolean flag )
*/
    public abstract void glDepthMask(
        boolean flag
    );

    /** C function void glDepthRangef ( GLclampf zNear, GLclampf zFar )
*/
    public abstract void glDepthRangef(
        float zNear,
        float zFar
    );

    /** C function void glDetachShader ( GLuint program, GLuint shader )
*/
    public abstract void glDetachShader(
        int program,
        int shader
    );

    /** C function void glDisable ( GLenum cap )
*/
    public abstract void glDisable(
        int cap
    );

    /** C function void glDisableVertexAttribArray ( GLuint index )
*/
    public abstract void glDisableVertexAttribArray(
        int index
    );

    /** C function void glDrawArrays ( GLenum mode, GLint first, GLsizei count )
*/
    public abstract void glDrawArrays(
        int mode,
        int first,
        int count
    );

    /** C function void glDrawElements ( GLenum mode, GLsizei count, GLenum type, GLint offset )
*/
    public abstract void glDrawElements(
        int mode,
        int count,
        int type,
        int offset
    );

    /** C function void glDrawElements ( GLenum mode, GLsizei count, GLenum type, const GLvoid *indices )
*/
    public abstract void glDrawElements(
        int mode,
        int count,
        int type,
        java.nio.Buffer indices
    );

    /** C function void glEnable ( GLenum cap )
*/
    public abstract void glEnable(
        int cap
    );

    /** C function void glEnableVertexAttribArray ( GLuint index )
*/
    public abstract void glEnableVertexAttribArray(
        int index
    );

    /** C function void glFinish ( void )
*/
    public abstract void glFinish(
    );

    /** C function void glFlush ( void )
*/
    public abstract void glFlush(
    );

    /** C function void glFramebufferRenderbuffer ( GLenum target, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer )
*/
    public abstract void glFramebufferRenderbuffer(
        int target,
        int attachment,
        int renderbuffertarget,
        int renderbuffer
    );

    /** C function void glFramebufferTexture2D ( GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level )
*/
    public abstract void glFramebufferTexture2D(
        int target,
        int attachment,
        int textarget,
        int texture,
        int level
    );

    /** C function void glFrontFace ( GLenum mode )
*/
    public abstract void glFrontFace(
        int mode
    );

    /** C function void glGenBuffers ( GLsizei n, GLuint *buffers )
*/
    public abstract void glGenBuffers(
        int n,
        int[] buffers,
        int offset
    );

    /** C function void glGenBuffers ( GLsizei n, GLuint *buffers )
*/
    public abstract void glGenBuffers(
        int n,
        java.nio.IntBuffer buffers
    );

    /** C function void glGenerateMipmap ( GLenum target )
*/
    public abstract void glGenerateMipmap(
        int target
    );

    /** C function void glGenFramebuffers ( GLsizei n, GLuint *framebuffers )
*/
    public abstract void glGenFramebuffers(
        int n,
        int[] framebuffers,
        int offset
    );

    /** C function void glGenFramebuffers ( GLsizei n, GLuint *framebuffers )
*/
    public abstract void glGenFramebuffers(
        int n,
        java.nio.IntBuffer framebuffers
    );

    /** C function void glGenRenderbuffers ( GLsizei n, GLuint *renderbuffers )
*/
    public abstract void glGenRenderbuffers(
        int n,
        int[] renderbuffers,
        int offset
    );

    /** C function void glGenRenderbuffers ( GLsizei n, GLuint *renderbuffers )
*/
    public abstract void glGenRenderbuffers(
        int n,
        java.nio.IntBuffer renderbuffers
    );

    /** C function void glGenTextures ( GLsizei n, GLuint *textures )
*/
    public abstract void glGenTextures(
        int n,
        int[] textures,
        int offset
    );

    /** C function void glGenTextures ( GLsizei n, GLuint *textures )
*/
    public abstract void glGenTextures(
        int n,
        java.nio.IntBuffer textures
    );

    /** C function void glGetActiveAttrib ( GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )*/

    public abstract void glGetActiveAttrib(
        int program,
        int index,
        int bufsize,
        int[] length,
        int lengthOffset,
        int[] size,
        int sizeOffset,
        int[] type,
        int typeOffset,
        byte[] name,
        int nameOffset
    );

    /** C function void glGetActiveAttrib ( GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )*/

    public abstract void glGetActiveAttrib(
        int program,
        int index,
        int bufsize,
        java.nio.IntBuffer length,
        java.nio.IntBuffer size,
        java.nio.IntBuffer type,
        byte name
    );

    /** C function void glGetActiveUniform ( GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )*/

    public abstract void glGetActiveUniform(
        int program,
        int index,
        int bufsize,
        int[] length,
        int lengthOffset,
        int[] size,
        int sizeOffset,
        int[] type,
        int typeOffset,
        byte[] name,
        int nameOffset
    );

    /** C function void glGetActiveUniform ( GLuint program, GLuint index, GLsizei bufsize, GLsizei *length, GLint *size, GLenum *type, char *name )*/

    public abstract void glGetActiveUniform(
        int program,
        int index,
        int bufsize,
        java.nio.IntBuffer length,
        java.nio.IntBuffer size,
        java.nio.IntBuffer type,
        byte name
    );

    /** C function void glGetAttachedShaders ( GLuint program, GLsizei maxcount, GLsizei *count, GLuint *shaders )
*/
    public abstract void glGetAttachedShaders(
        int program,
        int maxcount,
        int[] count,
        int countOffset,
        int[] shaders,
        int shadersOffset
    );

    /** C function void glGetAttachedShaders ( GLuint program, GLsizei maxcount, GLsizei *count, GLuint *shaders )
*/
    public abstract void glGetAttachedShaders(
        int program,
        int maxcount,
        java.nio.IntBuffer count,
        java.nio.IntBuffer shaders
    );

    /** C function int glGetAttribLocation ( GLuint program, const char *name )
*/
    public abstract int glGetAttribLocation(
        int program,
        String name
    );

    /** C function void glGetBooleanv ( GLenum pname, GLboolean *params )
*/
    public abstract void glGetBooleanv(
        int pname,
        boolean[] params,
        int offset
    );

    /** C function void glGetBooleanv ( GLenum pname, GLboolean *params )
*/
    public abstract void glGetBooleanv(
        int pname,
        java.nio.IntBuffer params
    );

    /** C function void glGetBufferParameteriv ( GLenum target, GLenum pname, GLint *params )
*/
    public abstract void glGetBufferParameteriv(
        int target,
        int pname,
        int[] params,
        int offset
    );

    /** C function void glGetBufferParameteriv ( GLenum target, GLenum pname, GLint *params )
*/
    public abstract void glGetBufferParameteriv(
        int target,
        int pname,
        java.nio.IntBuffer params
    );

    /** C function GLenum glGetError ( void )
*/
    public abstract int glGetError(
    );

    /** C function void glGetFloatv ( GLenum pname, GLfloat *params )
*/
    public abstract void glGetFloatv(
        int pname,
        float[] params,
        int offset
    );

    /** C function void glGetFloatv ( GLenum pname, GLfloat *params )
*/
    public abstract void glGetFloatv(
        int pname,
        java.nio.FloatBuffer params
    );

    /** C function void glGetFramebufferAttachmentParameteriv ( GLenum target, GLenum attachment, GLenum pname, GLint *params )
*/
    public abstract void glGetFramebufferAttachmentParameteriv(
        int target,
        int attachment,
        int pname,
        int[] params,
        int offset
    );

    /** C function void glGetFramebufferAttachmentParameteriv ( GLenum target, GLenum attachment, GLenum pname, GLint *params )
*/
    public abstract void glGetFramebufferAttachmentParameteriv(
        int target,
        int attachment,
        int pname,
        java.nio.IntBuffer params
    );

    /** C function void glGetIntegerv ( GLenum pname, GLint *params )
*/
    public abstract void glGetIntegerv(
        int pname,
        int[] params,
        int offset
    );

    /** C function void glGetIntegerv ( GLenum pname, GLint *params )
*/
    public abstract void glGetIntegerv(
        int pname,
        java.nio.IntBuffer params
    );

    /** C function void glGetProgramiv ( GLuint program, GLenum pname, GLint *params )
*/
    public abstract void glGetProgramiv(
        int program,
        int pname,
        int[] params,
        int offset
    );

    /** C function void glGetProgramiv ( GLuint program, GLenum pname, GLint *params )
*/
    public abstract void glGetProgramiv(
        int program,
        int pname,
        java.nio.IntBuffer params
    );

/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

    /** C function void glGetProgramInfoLog( GLuint program, GLsizei maxLength, GLsizei * length,
  //     GLchar * infoLog);*/

    public abstract String glGetProgramInfoLog(
        int program
    );
    /** C function void glGetRenderbufferParameteriv ( GLenum target, GLenum pname, GLint *params )
*/
    public abstract void glGetRenderbufferParameteriv(
        int target,
        int pname,
        int[] params,
        int offset
    );

    /** C function void glGetRenderbufferParameteriv ( GLenum target, GLenum pname, GLint *params )
*/
    public abstract void glGetRenderbufferParameteriv(
        int target,
        int pname,
        java.nio.IntBuffer params
    );

    /** C function void glGetShaderiv ( GLuint shader, GLenum pname, GLint *params )
*/
    public abstract void glGetShaderiv(
        int shader,
        int pname,
        int[] params,
        int offset
    );

    /** C function void glGetShaderiv ( GLuint shader, GLenum pname, GLint *params )
*/
    public abstract void glGetShaderiv(
        int shader,
        int pname,
        java.nio.IntBuffer params
    );

/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

    /** C function void glGetShaderInfoLog( GLuint shader, GLsizei maxLength, GLsizei * length,
  //     GLchar * infoLog);*/

    public abstract String glGetShaderInfoLog(
        int shader
    );
    /** C function void glGetShaderPrecisionFormat ( GLenum shadertype, GLenum precisiontype, GLint *range, GLint *precision )
*/
    public abstract void glGetShaderPrecisionFormat(
        int shadertype,
        int precisiontype,
        int[] range,
        int rangeOffset,
        int[] precision,
        int precisionOffset
    );

    /** C function void glGetShaderPrecisionFormat ( GLenum shadertype, GLenum precisiontype, GLint *range, GLint *precision )
*/
    public abstract void glGetShaderPrecisionFormat(
        int shadertype,
        int precisiontype,
        java.nio.IntBuffer range,
        java.nio.IntBuffer precision
    );

    /** C function void glGetShaderSource ( GLuint shader, GLsizei bufsize, GLsizei *length, char *source )
*/
    public abstract void glGetShaderSource(
        int shader,
        int bufsize,
        int[] length,
        int lengthOffset,
        byte[] source,
        int sourceOffset
    );

    /** C function void glGetShaderSource ( GLuint shader, GLsizei bufsize, GLsizei *length, char *source )
*/
    public abstract void glGetShaderSource(
        int shader,
        int bufsize,
        java.nio.IntBuffer length,
        byte source
    );

/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

    /** C function const GLubyte * glGetString ( GLenum name )
*/
    public abstract String glGetString(
        int name
    );
    /** C function void glGetTexParameterfv ( GLenum target, GLenum pname, GLfloat *params )
*/
    public abstract void glGetTexParameterfv(
        int target,
        int pname,
        float[] params,
        int offset
    );

    /** C function void glGetTexParameterfv ( GLenum target, GLenum pname, GLfloat *params )
*/
    public abstract void glGetTexParameterfv(
        int target,
        int pname,
        java.nio.FloatBuffer params
    );

    /** C function void glGetTexParameteriv ( GLenum target, GLenum pname, GLint *params )
*/
    public abstract void glGetTexParameteriv(
        int target,
        int pname,
        int[] params,
        int offset
    );

    /** C function void glGetTexParameteriv ( GLenum target, GLenum pname, GLint *params )
*/
    public abstract void glGetTexParameteriv(
        int target,
        int pname,
        java.nio.IntBuffer params
    );

    /** C function void glGetUniformfv ( GLuint program, GLint location, GLfloat *params )
*/
    public abstract void glGetUniformfv(
        int program,
        int location,
        float[] params,
        int offset
    );

    /** C function void glGetUniformfv ( GLuint program, GLint location, GLfloat *params )
*/
    public abstract void glGetUniformfv(
        int program,
        int location,
        java.nio.FloatBuffer params
    );

    /** C function void glGetUniformiv ( GLuint program, GLint location, GLint *params )
*/
    public abstract void glGetUniformiv(
        int program,
        int location,
        int[] params,
        int offset
    );

    /** C function void glGetUniformiv ( GLuint program, GLint location, GLint *params )
*/
    public abstract void glGetUniformiv(
        int program,
        int location,
        java.nio.IntBuffer params
    );

    /** C function int glGetUniformLocation ( GLuint program, const char *name )
*/
    public abstract int glGetUniformLocation(
        int program,
        String name
    );

    /** C function void glGetVertexAttribfv ( GLuint index, GLenum pname, GLfloat *params )
*/
    public abstract void glGetVertexAttribfv(
        int index,
        int pname,
        float[] params,
        int offset
    );

    /** C function void glGetVertexAttribfv ( GLuint index, GLenum pname, GLfloat *params )
*/
    public abstract void glGetVertexAttribfv(
        int index,
        int pname,
        java.nio.FloatBuffer params
    );

    /** C function void glGetVertexAttribiv ( GLuint index, GLenum pname, GLint *params )
*/
    public abstract void glGetVertexAttribiv(
        int index,
        int pname,
        int[] params,
        int offset
    );

    /** C function void glGetVertexAttribiv ( GLuint index, GLenum pname, GLint *params )
*/
    public abstract void glGetVertexAttribiv(
        int index,
        int pname,
        java.nio.IntBuffer params
    );

    /** C function void glHint ( GLenum target, GLenum mode )
*/
    public abstract void glHint(
        int target,
        int mode
    );

    /** C function GLboolean glIsBuffer ( GLuint buffer )
*/
    public abstract boolean glIsBuffer(
        int buffer
    );

    /** C function GLboolean glIsEnabled ( GLenum cap )
*/
    public abstract boolean glIsEnabled(
        int cap
    );

    /** C function GLboolean glIsFramebuffer ( GLuint framebuffer )
*/
    public abstract boolean glIsFramebuffer(
        int framebuffer
    );

    /** C function GLboolean glIsProgram ( GLuint program )
*/
    public abstract boolean glIsProgram(
        int program
    );

    /** C function GLboolean glIsRenderbuffer ( GLuint renderbuffer )
*/
    public abstract boolean glIsRenderbuffer(
        int renderbuffer
    );

    /** C function GLboolean glIsShader ( GLuint shader )
*/
    public abstract boolean glIsShader(
        int shader
    );

    /** C function GLboolean glIsTexture ( GLuint texture )
*/
    public abstract boolean glIsTexture(
        int texture
    );

    /** C function void glLineWidth ( GLfloat width )
*/
    public abstract void glLineWidth(
        float width
    );

    /** C function void glLinkProgram ( GLuint program )
*/
    public abstract void glLinkProgram(
        int program
    );

    /** C function void glPixelStorei ( GLenum pname, GLint param )
*/
    public abstract void glPixelStorei(
        int pname,
        int param
    );

    /** C function void glPolygonOffset ( GLfloat factor, GLfloat units )
*/
    public abstract void glPolygonOffset(
        float factor,
        float units
    );

    /** C function void glReadPixels ( GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLvoid *pixels )
*/
    public abstract void glReadPixels(
        int x,
        int y,
        int width,
        int height,
        int format,
        int type,
        java.nio.Buffer pixels
    );

    /** C function void glReleaseShaderCompiler ( void )
*/
    public abstract void glReleaseShaderCompiler(
    );

    /** C function void glRenderbufferStorage ( GLenum target, GLenum internalformat, GLsizei width, GLsizei height )
*/
    public abstract void glRenderbufferStorage(
        int target,
        int internalformat,
        int width,
        int height
    );

    /** C function void glSampleCoverage ( GLclampf value, GLboolean invert )
*/
    public abstract void glSampleCoverage(
        float value,
        boolean invert
    );

    /** C function void glScissor ( GLint x, GLint y, GLsizei width, GLsizei height )
*/
    public abstract void glScissor(
        int x,
        int y,
        int width,
        int height
    );

    /** C function void glShaderBinary ( GLsizei n, const GLuint *shaders, GLenum binaryformat, const GLvoid *binary, GLsizei length )
*/
    public abstract void glShaderBinary(
        int n,
        int[] shaders,
        int offset,
        int binaryformat,
        java.nio.Buffer binary,
        int length
    );

    /** C function void glShaderBinary ( GLsizei n, const GLuint *shaders, GLenum binaryformat, const GLvoid *binary, GLsizei length )
*/
    public abstract void glShaderBinary(
        int n,
        java.nio.IntBuffer shaders,
        int binaryformat,
        java.nio.Buffer binary,
        int length
    );

/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

    /** C function void glShaderSource ( GLuint shader, GLsizei count, const GLchar ** string, const GLint* length )
*/
    public abstract void glShaderSource(
        int shader,
        String string
    );
    /** C function void glStencilFunc ( GLenum func, GLint ref, GLuint mask )
*/
    public abstract void glStencilFunc(
        int func,
        int ref,
        int mask
    );

    /** C function void glStencilFuncSeparate ( GLenum face, GLenum func, GLint ref, GLuint mask )
*/
    public abstract void glStencilFuncSeparate(
        int face,
        int func,
        int ref,
        int mask
    );

    /** C function void glStencilMask ( GLuint mask )
*/
    public abstract void glStencilMask(
        int mask
    );

    /** C function void glStencilMaskSeparate ( GLenum face, GLuint mask )
*/
    public abstract void glStencilMaskSeparate(
        int face,
        int mask
    );

    /** C function void glStencilOp ( GLenum fail, GLenum zfail, GLenum zpass )
*/
    public abstract void glStencilOp(
        int fail,
        int zfail,
        int zpass
    );

    /** C function void glStencilOpSeparate ( GLenum face, GLenum fail, GLenum zfail, GLenum zpass )
*/
    public abstract void glStencilOpSeparate(
        int face,
        int fail,
        int zfail,
        int zpass
    );

    /** C function void glTexImage2D ( GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, const GLvoid *pixels )*/

    public abstract void glTexImage2D(
        int target,
        int level,
        int internalformat,
        int width,
        int height,
        int border,
        int format,
        int type,
        java.nio.Buffer pixels
    );

    /** C function void glTexParameterf ( GLenum target, GLenum pname, GLfloat param )
*/
    public abstract void glTexParameterf(
        int target,
        int pname,
        float param
    );

    /** C function void glTexParameterfv ( GLenum target, GLenum pname, const GLfloat *params )
*/
    public abstract void glTexParameterfv(
        int target,
        int pname,
        float[] params,
        int offset
    );

    /** C function void glTexParameterfv ( GLenum target, GLenum pname, const GLfloat *params )
*/
    public abstract void glTexParameterfv(
        int target,
        int pname,
        java.nio.FloatBuffer params
    );

    /** C function void glTexParameteri ( GLenum target, GLenum pname, GLint param )
*/
    public abstract void glTexParameteri(
        int target,
        int pname,
        int param
    );

    /** C function void glTexParameteriv ( GLenum target, GLenum pname, const GLint *params )
*/
    public abstract void glTexParameteriv(
        int target,
        int pname,
        int[] params,
        int offset
    );

    /** C function void glTexParameteriv ( GLenum target, GLenum pname, const GLint *params )
*/
    public abstract void glTexParameteriv(
        int target,
        int pname,
        java.nio.IntBuffer params
    );

    /** C function void glTexSubImage2D ( GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, const GLvoid *pixels )*/

    public abstract void glTexSubImage2D(
        int target,
        int level,
        int xoffset,
        int yoffset,
        int width,
        int height,
        int format,
        int type,
        java.nio.Buffer pixels
    );

    /** C function void glUniform1f ( GLint location, GLfloat x )
*/
    public abstract void glUniform1f(
        int location,
        float x
    );

    /** C function void glUniform1fv ( GLint location, GLsizei count, const GLfloat *v )
*/
    public abstract void glUniform1fv(
        int location,
        int count,
        float[] v,
        int offset
    );

    /** C function void glUniform1fv ( GLint location, GLsizei count, const GLfloat *v )
*/
    public abstract void glUniform1fv(
        int location,
        int count,
        java.nio.FloatBuffer v
    );

    /** C function void glUniform1i ( GLint location, GLint x )
*/
    public abstract void glUniform1i(
        int location,
        int x
    );

    /** C function void glUniform1iv ( GLint location, GLsizei count, const GLint *v )
*/
    public abstract void glUniform1iv(
        int location,
        int count,
        int[] v,
        int offset
    );

    /** C function void glUniform1iv ( GLint location, GLsizei count, const GLint *v )
*/
    public abstract void glUniform1iv(
        int location,
        int count,
        java.nio.IntBuffer v
    );

    /** C function void glUniform2f ( GLint location, GLfloat x, GLfloat y )
*/
    public abstract void glUniform2f(
        int location,
        float x,
        float y
    );

    /** C function void glUniform2fv ( GLint location, GLsizei count, const GLfloat *v )
*/
    public abstract void glUniform2fv(
        int location,
        int count,
        float[] v,
        int offset
    );

    /** C function void glUniform2fv ( GLint location, GLsizei count, const GLfloat *v )
*/
    public abstract void glUniform2fv(
        int location,
        int count,
        java.nio.FloatBuffer v
    );

    /** C function void glUniform2i ( GLint location, GLint x, GLint y )
*/
    public abstract void glUniform2i(
        int location,
        int x,
        int y
    );

    /** C function void glUniform2iv ( GLint location, GLsizei count, const GLint *v )
*/
    public abstract void glUniform2iv(
        int location,
        int count,
        int[] v,
        int offset
    );

    /** C function void glUniform2iv ( GLint location, GLsizei count, const GLint *v )
*/
    public abstract void glUniform2iv(
        int location,
        int count,
        java.nio.IntBuffer v
    );

    /** C function void glUniform3f ( GLint location, GLfloat x, GLfloat y, GLfloat z )
*/
    public abstract void glUniform3f(
        int location,
        float x,
        float y,
        float z
    );

    /** C function void glUniform3fv ( GLint location, GLsizei count, const GLfloat *v )
*/
    public abstract void glUniform3fv(
        int location,
        int count,
        float[] v,
        int offset
    );

    /** C function void glUniform3fv ( GLint location, GLsizei count, const GLfloat *v )
*/
    public abstract void glUniform3fv(
        int location,
        int count,
        java.nio.FloatBuffer v
    );

    /** C function void glUniform3i ( GLint location, GLint x, GLint y, GLint z )
*/
    public abstract void glUniform3i(
        int location,
        int x,
        int y,
        int z
    );

    /** C function void glUniform3iv ( GLint location, GLsizei count, const GLint *v )
*/
    public abstract void glUniform3iv(
        int location,
        int count,
        int[] v,
        int offset
    );

    /** C function void glUniform3iv ( GLint location, GLsizei count, const GLint *v )
*/
    public abstract void glUniform3iv(
        int location,
        int count,
        java.nio.IntBuffer v
    );

    /** C function void glUniform4f ( GLint location, GLfloat x, GLfloat y, GLfloat z, GLfloat w )
*/
    public abstract void glUniform4f(
        int location,
        float x,
        float y,
        float z,
        float w
    );

    /** C function void glUniform4fv ( GLint location, GLsizei count, const GLfloat *v )
*/
    public abstract void glUniform4fv(
        int location,
        int count,
        float[] v,
        int offset
    );

    /** C function void glUniform4fv ( GLint location, GLsizei count, const GLfloat *v )
*/
    public abstract void glUniform4fv(
        int location,
        int count,
        java.nio.FloatBuffer v
    );

    /** C function void glUniform4i ( GLint location, GLint x, GLint y, GLint z, GLint w )
*/
    public abstract void glUniform4i(
        int location,
        int x,
        int y,
        int z,
        int w
    );

    /** C function void glUniform4iv ( GLint location, GLsizei count, const GLint *v )
*/
    public abstract void glUniform4iv(
        int location,
        int count,
        int[] v,
        int offset
    );

    /** C function void glUniform4iv ( GLint location, GLsizei count, const GLint *v )
*/
    public abstract void glUniform4iv(
        int location,
        int count,
        java.nio.IntBuffer v
    );

    /** C function void glUniformMatrix2fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )
*/
    public abstract void glUniformMatrix2fv(
        int location,
        int count,
        boolean transpose,
        float[] value,
        int offset
    );

    /** C function void glUniformMatrix2fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )
*/
    public abstract void glUniformMatrix2fv(
        int location,
        int count,
        boolean transpose,
        java.nio.FloatBuffer value
    );

    /** C function void glUniformMatrix3fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )
*/
    public abstract void glUniformMatrix3fv(
        int location,
        int count,
        boolean transpose,
        float[] value,
        int offset
    );

    /** C function void glUniformMatrix3fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )
*/
    public abstract void glUniformMatrix3fv(
        int location,
        int count,
        boolean transpose,
        java.nio.FloatBuffer value
    );

    /** C function void glUniformMatrix4fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )
*/
    public abstract void glUniformMatrix4fv(
        int location,
        int count,
        boolean transpose,
        float[] value,
        int offset
    );

    /** C function void glUniformMatrix4fv ( GLint location, GLsizei count, GLboolean transpose, const GLfloat *value )
*/
    public abstract void glUniformMatrix4fv(
        int location,
        int count,
        boolean transpose,
        java.nio.FloatBuffer value
    );

    /** C function void glUseProgram ( GLuint program )
*/
    public abstract void glUseProgram(
        int program
    );

    /** C function void glValidateProgram ( GLuint program )
*/
    public abstract void glValidateProgram(
        int program
    );

    /** C function void glVertexAttrib1f ( GLuint indx, GLfloat x )
*/
    public abstract void glVertexAttrib1f(
        int indx,
        float x
    );

    /** C function void glVertexAttrib1fv ( GLuint indx, const GLfloat *values )
*/
    public abstract void glVertexAttrib1fv(
        int indx,
        float[] values,
        int offset
    );

    /** C function void glVertexAttrib1fv ( GLuint indx, const GLfloat *values )
*/
    public abstract void glVertexAttrib1fv(
        int indx,
        java.nio.FloatBuffer values
    );

    /** C function void glVertexAttrib2f ( GLuint indx, GLfloat x, GLfloat y )
*/
    public abstract void glVertexAttrib2f(
        int indx,
        float x,
        float y
    );

    /** C function void glVertexAttrib2fv ( GLuint indx, const GLfloat *values )
*/
    public abstract void glVertexAttrib2fv(
        int indx,
        float[] values,
        int offset
    );

    /** C function void glVertexAttrib2fv ( GLuint indx, const GLfloat *values )
*/
    public abstract void glVertexAttrib2fv(
        int indx,
        java.nio.FloatBuffer values
    );

    /** C function void glVertexAttrib3f ( GLuint indx, GLfloat x, GLfloat y, GLfloat z )
*/
    public abstract void glVertexAttrib3f(
        int indx,
        float x,
        float y,
        float z
    );

    /** C function void glVertexAttrib3fv ( GLuint indx, const GLfloat *values )
*/
    public abstract void glVertexAttrib3fv(
        int indx,
        float[] values,
        int offset
    );

    /** C function void glVertexAttrib3fv ( GLuint indx, const GLfloat *values )
*/
    public abstract void glVertexAttrib3fv(
        int indx,
        java.nio.FloatBuffer values
    );

    /** C function void glVertexAttrib4f ( GLuint indx, GLfloat x, GLfloat y, GLfloat z, GLfloat w )
*/
    public abstract void glVertexAttrib4f(
        int indx,
        float x,
        float y,
        float z,
        float w
    );

    /** C function void glVertexAttrib4fv ( GLuint indx, const GLfloat *values )
*/
    public abstract void glVertexAttrib4fv(
        int indx,
        float[] values,
        int offset
    );

    /** C function void glVertexAttrib4fv ( GLuint indx, const GLfloat *values )
*/
    public abstract void glVertexAttrib4fv(
        int indx,
        java.nio.FloatBuffer values
    );

    /** C function void glVertexAttribPointer ( GLuint indx, GLint size, GLenum type, GLboolean normalized, GLsizei stride, GLint offset )
*/
    public abstract void glVertexAttribPointer(
        int indx,
        int size,
        int type,
        boolean normalized,
        int stride,
        int offset
    );

    /** C function void glVertexAttribPointer ( GLuint indx, GLint size, GLenum type, GLboolean normalized, GLsizei stride, const GLvoid *ptr )
*/
//    public abstract void glVertexAttribPointerBounds(
//        int indx,
//        int size,
//        int type,
//        boolean normalized,
//        int stride,
//        java.nio.Buffer ptr,
//        int remaining
//    );

    /** C function void glVertexAttribPointer ( GLuint indx, GLint size, GLenum type, GLboolean normalized, GLsizei stride, const GLvoid *ptr )
    */
    public abstract void glVertexAttribPointer(
        int indx,
        int size,
        int type,
        boolean normalized,
        int stride,
        java.nio.Buffer ptr
    ) ;

    /** C function void glViewport ( GLint x, GLint y, GLsizei width, GLsizei height )
*/
    public abstract void glViewport(
        int x,
        int y,
        int width,
        int height
    );

    
//    public static final int	GL_STACK_OVERFLOW	 =	GLK.	GL_STACK_OVERFLOW	;
//    public static final int	GL_STACK_UNDERFLOW	 =	GLK.	GL_STACK_UNDERFLOW	;
    public static final int	GL_DEPTH_BUFFER_BIT	 =	GLK.	GL_DEPTH_BUFFER_BIT	;
    public static final int	GL_STENCIL_BUFFER_BIT	 =	GLK.	GL_STENCIL_BUFFER_BIT	;
    public static final int	GL_COLOR_BUFFER_BIT	 =	GLK.	GL_COLOR_BUFFER_BIT	;
    public static final int	GL_FALSE	 =	GLK.	GL_FALSE	;
    public static final int	GL_TRUE	 =	GLK.	GL_TRUE	;
    public static final int	GL_POINTS	 =	GLK.	GL_POINTS	;
    public static final int	GL_LINES	 =	GLK.	GL_LINES	;
    public static final int	GL_LINE_LOOP	 =	GLK.	GL_LINE_LOOP	;
    public static final int	GL_LINE_STRIP	 =	GLK.	GL_LINE_STRIP	;
    public static final int	GL_TRIANGLES	 =	GLK.	GL_TRIANGLES	;
    public static final int	GL_TRIANGLE_STRIP	 =	GLK.	GL_TRIANGLE_STRIP	;
    public static final int	GL_TRIANGLE_FAN	 =	GLK.	GL_TRIANGLE_FAN	;
    public static final int	GL_ZERO	 =	GLK.	GL_ZERO	;
    public static final int	GL_ONE	 =	GLK.	GL_ONE	;
    public static final int	GL_SRC_COLOR	 =	GLK.	GL_SRC_COLOR	;
    public static final int	GL_ONE_MINUS_SRC_COLOR	 =	GLK.	GL_ONE_MINUS_SRC_COLOR	;
    public static final int	GL_SRC_ALPHA	 =	GLK.	GL_SRC_ALPHA	;
    public static final int	GL_ONE_MINUS_SRC_ALPHA	 =	GLK.	GL_ONE_MINUS_SRC_ALPHA	;
    public static final int	GL_DST_ALPHA	 =	GLK.	GL_DST_ALPHA	;
    public static final int	GL_ONE_MINUS_DST_ALPHA	 =	GLK.	GL_ONE_MINUS_DST_ALPHA	;
    public static final int	GL_DST_COLOR	 =	GLK.	GL_DST_COLOR	;
    public static final int	GL_ONE_MINUS_DST_COLOR	 =	GLK.	GL_ONE_MINUS_DST_COLOR	;
    public static final int	GL_SRC_ALPHA_SATURATE	 =	GLK.	GL_SRC_ALPHA_SATURATE	;
    public static final int	GL_FUNC_ADD	 =	GLK.	GL_FUNC_ADD	;
    public static final int	GL_BLEND_EQUATION	 =	GLK.	GL_BLEND_EQUATION	;
    public static final int	GL_BLEND_EQUATION_RGB	 =	GLK.	GL_BLEND_EQUATION_RGB	;
    public static final int	GL_BLEND_EQUATION_ALPHA	 =	GLK.	GL_BLEND_EQUATION_ALPHA	;
    public static final int	GL_FUNC_SUBTRACT	 =	GLK.	GL_FUNC_SUBTRACT	;
    public static final int	GL_FUNC_REVERSE_SUBTRACT	 =	GLK.	GL_FUNC_REVERSE_SUBTRACT	;
    public static final int	GL_BLEND_DST_RGB	 =	GLK.	GL_BLEND_DST_RGB	;
    public static final int	GL_BLEND_SRC_RGB	 =	GLK.	GL_BLEND_SRC_RGB	;
    public static final int	GL_BLEND_DST_ALPHA	 =	GLK.	GL_BLEND_DST_ALPHA	;
    public static final int	GL_BLEND_SRC_ALPHA	 =	GLK.	GL_BLEND_SRC_ALPHA	;
    public static final int	GL_ARRAY_BUFFER	 =	GLK.	GL_ARRAY_BUFFER	;
    public static final int	GL_ELEMENT_ARRAY_BUFFER	 =	GLK.	GL_ELEMENT_ARRAY_BUFFER	;
    public static final int	GL_ARRAY_BUFFER_BINDING	 =	GLK.	GL_ARRAY_BUFFER_BINDING	;
    public static final int	GL_ELEMENT_ARRAY_BUFFER_BINDING	 =	GLK.	GL_ELEMENT_ARRAY_BUFFER_BINDING	;
    public static final int	GL_STATIC_DRAW	 =	GLK.	GL_STATIC_DRAW	;
    public static final int	GL_DYNAMIC_DRAW	 =	GLK.	GL_DYNAMIC_DRAW	;
    public static final int	GL_BUFFER_SIZE	 =	GLK.	GL_BUFFER_SIZE	;
    public static final int	GL_BUFFER_USAGE	 =	GLK.	GL_BUFFER_USAGE	;
    public static final int	GL_FRONT	 =	GLK.	GL_FRONT	;
    public static final int	GL_BACK	 =	GLK.	GL_BACK	;
    public static final int	GL_FRONT_AND_BACK	 =	GLK.	GL_FRONT_AND_BACK	;
    public static final int	GL_TEXTURE_2D	 =	GLK.	GL_TEXTURE_2D	;
    public static final int	GL_CULL_FACE	 =	GLK.	GL_CULL_FACE	;
    public static final int	GL_BLEND	 =	GLK.	GL_BLEND	;
    public static final int	GL_DITHER	 =	GLK.	GL_DITHER	;
    public static final int	GL_STENCIL_TEST	 =	GLK.	GL_STENCIL_TEST	;
    public static final int	GL_DEPTH_TEST	 =	GLK.	GL_DEPTH_TEST	;
    public static final int	GL_SCISSOR_TEST	 =	GLK.	GL_SCISSOR_TEST	;
    public static final int	GL_POLYGON_OFFSET_FILL	 =	GLK.	GL_POLYGON_OFFSET_FILL	;
    public static final int	GL_SAMPLE_ALPHA_TO_COVERAGE	 =	GLK.	GL_SAMPLE_ALPHA_TO_COVERAGE	;
    public static final int	GL_SAMPLE_COVERAGE	 =	GLK.	GL_SAMPLE_COVERAGE	;
    public static final int	GL_NO_ERROR	 =	GLK.	GL_NO_ERROR	;
    public static final int	GL_INVALID_ENUM	 =	GLK.	GL_INVALID_ENUM	;
    public static final int	GL_INVALID_VALUE	 =	GLK.	GL_INVALID_VALUE	;
    public static final int	GL_INVALID_OPERATION	 =	GLK.	GL_INVALID_OPERATION	;
    public static final int	GL_OUT_OF_MEMORY	 =	GLK.	GL_OUT_OF_MEMORY	;
    public static final int	GL_CW	 =	GLK.	GL_CW	;
    public static final int	GL_CCW	 =	GLK.	GL_CCW	;
    public static final int	GL_LINE_WIDTH	 =	GLK.	GL_LINE_WIDTH	;
    public static final int	GL_ALIASED_POINT_SIZE_RANGE	 =	GLK.	GL_ALIASED_POINT_SIZE_RANGE	;
    public static final int	GL_ALIASED_LINE_WIDTH_RANGE	 =	GLK.	GL_ALIASED_LINE_WIDTH_RANGE	;
    public static final int	GL_CULL_FACE_MODE	 =	GLK.	GL_CULL_FACE_MODE	;
    public static final int	GL_FRONT_FACE	 =	GLK.	GL_FRONT_FACE	;
    public static final int	GL_DEPTH_RANGE	 =	GLK.	GL_DEPTH_RANGE	;
    public static final int	GL_DEPTH_WRITEMASK	 =	GLK.	GL_DEPTH_WRITEMASK	;
    public static final int	GL_DEPTH_CLEAR_VALUE	 =	GLK.	GL_DEPTH_CLEAR_VALUE	;
    public static final int	GL_DEPTH_FUNC	 =	GLK.	GL_DEPTH_FUNC	;
    public static final int	GL_STENCIL_CLEAR_VALUE	 =	GLK.	GL_STENCIL_CLEAR_VALUE	;
    public static final int	GL_STENCIL_FUNC	 =	GLK.	GL_STENCIL_FUNC	;
    public static final int	GL_STENCIL_FAIL	 =	GLK.	GL_STENCIL_FAIL	;
    public static final int	GL_STENCIL_PASS_DEPTH_FAIL	 =	GLK.	GL_STENCIL_PASS_DEPTH_FAIL	;
    public static final int	GL_STENCIL_PASS_DEPTH_PASS	 =	GLK.	GL_STENCIL_PASS_DEPTH_PASS	;
    public static final int	GL_STENCIL_REF	 =	GLK.	GL_STENCIL_REF	;
    public static final int	GL_STENCIL_VALUE_MASK	 =	GLK.	GL_STENCIL_VALUE_MASK	;
    public static final int	GL_STENCIL_WRITEMASK	 =	GLK.	GL_STENCIL_WRITEMASK	;
    public static final int	GL_VIEWPORT	 =	GLK.	GL_VIEWPORT	;
    public static final int	GL_SCISSOR_BOX	 =	GLK.	GL_SCISSOR_BOX	;
    public static final int	GL_COLOR_CLEAR_VALUE	 =	GLK.	GL_COLOR_CLEAR_VALUE	;
    public static final int	GL_COLOR_WRITEMASK	 =	GLK.	GL_COLOR_WRITEMASK	;
    public static final int	GL_UNPACK_ALIGNMENT	 =	GLK.	GL_UNPACK_ALIGNMENT	;
    public static final int	GL_PACK_ALIGNMENT	 =	GLK.	GL_PACK_ALIGNMENT	;
    public static final int	GL_MAX_TEXTURE_SIZE	 =	GLK.	GL_MAX_TEXTURE_SIZE	;
    public static final int	GL_MAX_VIEWPORT_DIMS	 =	GLK.	GL_MAX_VIEWPORT_DIMS	;
    public static final int	GL_SUBPIXEL_BITS	 =	GLK.	GL_SUBPIXEL_BITS	;
    public static final int	GL_RED_BITS	 =	GLK.	GL_RED_BITS	;
    public static final int	GL_GREEN_BITS	 =	GLK.	GL_GREEN_BITS	;
    public static final int	GL_BLUE_BITS	 =	GLK.	GL_BLUE_BITS	;
    public static final int	GL_ALPHA_BITS	 =	GLK.	GL_ALPHA_BITS	;
    public static final int	GL_DEPTH_BITS	 =	GLK.	GL_DEPTH_BITS	;
    public static final int	GL_STENCIL_BITS	 =	GLK.	GL_STENCIL_BITS	;
    public static final int	GL_POLYGON_OFFSET_UNITS	 =	GLK.	GL_POLYGON_OFFSET_UNITS	;
    public static final int	GL_POLYGON_OFFSET_FACTOR	 =	GLK.	GL_POLYGON_OFFSET_FACTOR	;
    public static final int	GL_TEXTURE_BINDING_2D	 =	GLK.	GL_TEXTURE_BINDING_2D	;
    public static final int	GL_SAMPLE_BUFFERS	 =	GLK.	GL_SAMPLE_BUFFERS	;
    public static final int	GL_SAMPLES	 =	GLK.	GL_SAMPLES	;
    public static final int	GL_SAMPLE_COVERAGE_VALUE	 =	GLK.	GL_SAMPLE_COVERAGE_VALUE	;
    public static final int	GL_SAMPLE_COVERAGE_INVERT	 =	GLK.	GL_SAMPLE_COVERAGE_INVERT	;
    public static final int	GL_NUM_COMPRESSED_TEXTURE_FORMATS	 =	GLK.	GL_NUM_COMPRESSED_TEXTURE_FORMATS	;
    public static final int	GL_COMPRESSED_TEXTURE_FORMATS	 =	GLK.	GL_COMPRESSED_TEXTURE_FORMATS	;
    public static final int	GL_DONT_CARE	 =	GLK.	GL_DONT_CARE	;
    public static final int	GL_FASTEST	 =	GLK.	GL_FASTEST	;
    public static final int	GL_NICEST	 =	GLK.	GL_NICEST	;
    public static final int	GL_GENERATE_MIPMAP_HINT	 =	GLK.	GL_GENERATE_MIPMAP_HINT	;
    public static final int	GL_BYTE	 =	GLK.	GL_BYTE	;
    public static final int	GL_UNSIGNED_BYTE	 =	GLK.	GL_UNSIGNED_BYTE	;
    public static final int	GL_SHORT	 =	GLK.	GL_SHORT	;
    public static final int	GL_UNSIGNED_SHORT	 =	GLK.	GL_UNSIGNED_SHORT	;
    public static final int	GL_UNSIGNED_INT	 =	GLK.	GL_UNSIGNED_INT	;
    public static final int	GL_FLOAT	 =	GLK.	GL_FLOAT	;
    public static final int	GL_FIXED	 =	GLK.	GL_FIXED	;
    public static final int	GL_ALPHA	 =	GLK.	GL_ALPHA	;
    public static final int	GL_RGB	 =	GLK.	GL_RGB	;
    public static final int	GL_RGBA	 =	GLK.	GL_RGBA	;
    public static final int	GL_LUMINANCE	 =	GLK.	GL_LUMINANCE	;
    public static final int	GL_LUMINANCE_ALPHA	 =	GLK.	GL_LUMINANCE_ALPHA	;
    public static final int	GL_UNSIGNED_SHORT_4_4_4_4	 =	GLK.	GL_UNSIGNED_SHORT_4_4_4_4	;
    public static final int	GL_UNSIGNED_SHORT_5_5_5_1	 =	GLK.	GL_UNSIGNED_SHORT_5_5_5_1	;
    public static final int	GL_UNSIGNED_SHORT_5_6_5	 =	GLK.	GL_UNSIGNED_SHORT_5_6_5	;
    public static final int	GL_NEVER	 =	GLK.	GL_NEVER	;
    public static final int	GL_LESS	 =	GLK.	GL_LESS	;
    public static final int	GL_EQUAL	 =	GLK.	GL_EQUAL	;
    public static final int	GL_LEQUAL	 =	GLK.	GL_LEQUAL	;
    public static final int	GL_GREATER	 =	GLK.	GL_GREATER	;
    public static final int	GL_NOTEQUAL	 =	GLK.	GL_NOTEQUAL	;
    public static final int	GL_GEQUAL	 =	GLK.	GL_GEQUAL	;
    public static final int	GL_ALWAYS	 =	GLK.	GL_ALWAYS	;
    public static final int	GL_KEEP	 =	GLK.	GL_KEEP	;
    public static final int	GL_REPLACE	 =	GLK.	GL_REPLACE	;
    public static final int	GL_INCR	 =	GLK.	GL_INCR	;
    public static final int	GL_DECR	 =	GLK.	GL_DECR	;
    public static final int	GL_INVERT	 =	GLK.	GL_INVERT	;
    public static final int	GL_INCR_WRAP	 =	GLK.	GL_INCR_WRAP	;
    public static final int	GL_DECR_WRAP	 =	GLK.	GL_DECR_WRAP	;
    public static final int	GL_VENDOR	 =	GLK.	GL_VENDOR	;
    public static final int	GL_RENDERER	 =	GLK.	GL_RENDERER	;
    public static final int	GL_VERSION	 =	GLK.	GL_VERSION	;
    public static final int	GL_EXTENSIONS	 =	GLK.	GL_EXTENSIONS	;
    public static final int	GL_NEAREST	 =	GLK.	GL_NEAREST	;
    public static final int	GL_LINEAR	 =	GLK.	GL_LINEAR	;
    public static final int	GL_NEAREST_MIPMAP_NEAREST	 =	GLK.	GL_NEAREST_MIPMAP_NEAREST	;
    public static final int	GL_LINEAR_MIPMAP_NEAREST	 =	GLK.	GL_LINEAR_MIPMAP_NEAREST	;
    public static final int	GL_NEAREST_MIPMAP_LINEAR	 =	GLK.	GL_NEAREST_MIPMAP_LINEAR	;
    public static final int	GL_LINEAR_MIPMAP_LINEAR	 =	GLK.	GL_LINEAR_MIPMAP_LINEAR	;
    public static final int	GL_TEXTURE_MAG_FILTER	 =	GLK.	GL_TEXTURE_MAG_FILTER	;
    public static final int	GL_TEXTURE_MIN_FILTER	 =	GLK.	GL_TEXTURE_MIN_FILTER	;
    public static final int	GL_TEXTURE_WRAP_S	 =	GLK.	GL_TEXTURE_WRAP_S	;
    public static final int	GL_TEXTURE_WRAP_T	 =	GLK.	GL_TEXTURE_WRAP_T	;
    public static final int	GL_TEXTURE	 =	GLK.	GL_TEXTURE	;
    public static final int	GL_TEXTURE_CUBE_MAP	 =	GLK.	GL_TEXTURE_CUBE_MAP	;
    public static final int	GL_TEXTURE_BINDING_CUBE_MAP	 =	GLK.	GL_TEXTURE_BINDING_CUBE_MAP	;
    public static final int	GL_TEXTURE_CUBE_MAP_POSITIVE_X	 =	GLK.	GL_TEXTURE_CUBE_MAP_POSITIVE_X	;
    public static final int	GL_TEXTURE_CUBE_MAP_NEGATIVE_X	 =	GLK.	GL_TEXTURE_CUBE_MAP_NEGATIVE_X	;
    public static final int	GL_TEXTURE_CUBE_MAP_POSITIVE_Y	 =	GLK.	GL_TEXTURE_CUBE_MAP_POSITIVE_Y	;
    public static final int	GL_TEXTURE_CUBE_MAP_NEGATIVE_Y	 =	GLK.	GL_TEXTURE_CUBE_MAP_NEGATIVE_Y	;
    public static final int	GL_TEXTURE_CUBE_MAP_POSITIVE_Z	 =	GLK.	GL_TEXTURE_CUBE_MAP_POSITIVE_Z	;
    public static final int	GL_TEXTURE_CUBE_MAP_NEGATIVE_Z	 =	GLK.	GL_TEXTURE_CUBE_MAP_NEGATIVE_Z	;
    public static final int	GL_MAX_CUBE_MAP_TEXTURE_SIZE	 =	GLK.	GL_MAX_CUBE_MAP_TEXTURE_SIZE	;
    public static final int	GL_TEXTURE0	 =	GLK.	GL_TEXTURE0	;
    public static final int	GL_TEXTURE1	 =	GLK.	GL_TEXTURE1	;
    public static final int	GL_TEXTURE2	 =	GLK.	GL_TEXTURE2	;
    public static final int	GL_TEXTURE3	 =	GLK.	GL_TEXTURE3	;
    public static final int	GL_TEXTURE4	 =	GLK.	GL_TEXTURE4	;
    public static final int	GL_TEXTURE5	 =	GLK.	GL_TEXTURE5	;
    public static final int	GL_TEXTURE6	 =	GLK.	GL_TEXTURE6	;
    public static final int	GL_TEXTURE7	 =	GLK.	GL_TEXTURE7	;
    public static final int	GL_TEXTURE8	 =	GLK.	GL_TEXTURE8	;
    public static final int	GL_TEXTURE9	 =	GLK.	GL_TEXTURE9	;
    public static final int	GL_TEXTURE10	 =	GLK.	GL_TEXTURE10	;
    public static final int	GL_TEXTURE11	 =	GLK.	GL_TEXTURE11	;
    public static final int	GL_TEXTURE12	 =	GLK.	GL_TEXTURE12	;
    public static final int	GL_TEXTURE13	 =	GLK.	GL_TEXTURE13	;
    public static final int	GL_TEXTURE14	 =	GLK.	GL_TEXTURE14	;
    public static final int	GL_TEXTURE15	 =	GLK.	GL_TEXTURE15	;
    public static final int	GL_TEXTURE16	 =	GLK.	GL_TEXTURE16	;
    public static final int	GL_TEXTURE17	 =	GLK.	GL_TEXTURE17	;
    public static final int	GL_TEXTURE18	 =	GLK.	GL_TEXTURE18	;
    public static final int	GL_TEXTURE19	 =	GLK.	GL_TEXTURE19	;
    public static final int	GL_TEXTURE20	 =	GLK.	GL_TEXTURE20	;
    public static final int	GL_TEXTURE21	 =	GLK.	GL_TEXTURE21	;
    public static final int	GL_TEXTURE22	 =	GLK.	GL_TEXTURE22	;
    public static final int	GL_TEXTURE23	 =	GLK.	GL_TEXTURE23	;
    public static final int	GL_TEXTURE24	 =	GLK.	GL_TEXTURE24	;
    public static final int	GL_TEXTURE25	 =	GLK.	GL_TEXTURE25	;
    public static final int	GL_TEXTURE26	 =	GLK.	GL_TEXTURE26	;
    public static final int	GL_TEXTURE27	 =	GLK.	GL_TEXTURE27	;
    public static final int	GL_TEXTURE28	 =	GLK.	GL_TEXTURE28	;
    public static final int	GL_TEXTURE29	 =	GLK.	GL_TEXTURE29	;
    public static final int	GL_TEXTURE30	 =	GLK.	GL_TEXTURE30	;
    public static final int	GL_TEXTURE31	 =	GLK.	GL_TEXTURE31	;
    public static final int	GL_ACTIVE_TEXTURE	 =	GLK.	GL_ACTIVE_TEXTURE	;
    public static final int	GL_REPEAT	 =	GLK.	GL_REPEAT	;
    public static final int	GL_CLAMP_TO_EDGE	 =	GLK.	GL_CLAMP_TO_EDGE	;
    public static final int	GL_MIRRORED_REPEAT	 =	GLK.	GL_MIRRORED_REPEAT	;
    public static final int	GL_IMPLEMENTATION_COLOR_READ_TYPE	 =	GLK.	GL_IMPLEMENTATION_COLOR_READ_TYPE	;
    public static final int	GL_IMPLEMENTATION_COLOR_READ_FORMAT	 =	GLK.	GL_IMPLEMENTATION_COLOR_READ_FORMAT	;
    public static final int	GL_FRAMEBUFFER	 =	GLK.	GL_FRAMEBUFFER	;
    public static final int	GL_RENDERBUFFER	 =	GLK.	GL_RENDERBUFFER	;
    public static final int	GL_RGBA4	 =	GLK.	GL_RGBA4	;
    public static final int	GL_RGB5_A1	 =	GLK.	GL_RGB5_A1	;
    public static final int	GL_RGB565	 =	GLK.	GL_RGB565	;
    public static final int	GL_DEPTH_COMPONENT16	 =	GLK.	GL_DEPTH_COMPONENT16	;
    public static final int	GL_STENCIL_INDEX8	 =	GLK.	GL_STENCIL_INDEX8	;
    public static final int	GL_RENDERBUFFER_WIDTH	 =	GLK.	GL_RENDERBUFFER_WIDTH	;
    public static final int	GL_RENDERBUFFER_HEIGHT	 =	GLK.	GL_RENDERBUFFER_HEIGHT	;
    public static final int	GL_RENDERBUFFER_INTERNAL_FORMAT	 =	GLK.	GL_RENDERBUFFER_INTERNAL_FORMAT	;
    public static final int	GL_RENDERBUFFER_RED_SIZE	 =	GLK.	GL_RENDERBUFFER_RED_SIZE	;
    public static final int	GL_RENDERBUFFER_GREEN_SIZE	 =	GLK.	GL_RENDERBUFFER_GREEN_SIZE	;
    public static final int	GL_RENDERBUFFER_BLUE_SIZE	 =	GLK.	GL_RENDERBUFFER_BLUE_SIZE	;
    public static final int	GL_RENDERBUFFER_ALPHA_SIZE	 =	GLK.	GL_RENDERBUFFER_ALPHA_SIZE	;
    public static final int	GL_RENDERBUFFER_DEPTH_SIZE	 =	GLK.	GL_RENDERBUFFER_DEPTH_SIZE	;
    public static final int	GL_RENDERBUFFER_STENCIL_SIZE	 =	GLK.	GL_RENDERBUFFER_STENCIL_SIZE	;
    public static final int	GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE	 =	GLK.	GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE	;
    public static final int	GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME	 =	GLK.	GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME	;
    public static final int	GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL	 =	GLK.	GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL	;
    public static final int	GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE	 =	GLK.	GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE	;
    public static final int	GL_COLOR_ATTACHMENT0	 =	GLK.	GL_COLOR_ATTACHMENT0	;
    public static final int	GL_DEPTH_ATTACHMENT	 =	GLK.	GL_DEPTH_ATTACHMENT	;
    public static final int	GL_STENCIL_ATTACHMENT	 =	GLK.	GL_STENCIL_ATTACHMENT	;
    public static final int	GL_NONE	 =	GLK.	GL_NONE	;
    public static final int	GL_FRAMEBUFFER_COMPLETE	 =	GLK.	GL_FRAMEBUFFER_COMPLETE	;
    public static final int	GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT	 =	GLK.	GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT	;
    public static final int	GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT	 =	GLK.	GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT	;
    public static final int	GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS	 =	GLK.	GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS	;
    public static final int	GL_FRAMEBUFFER_INCOMPLETE_FORMATS	 =	GLK.	GL_FRAMEBUFFER_INCOMPLETE_FORMATS	;
    public static final int	GL_FRAMEBUFFER_UNSUPPORTED	 =	GLK.	GL_FRAMEBUFFER_UNSUPPORTED	;
    public static final int	GL_FRAMEBUFFER_BINDING	 =	GLK.	GL_FRAMEBUFFER_BINDING	;
    public static final int	GL_RENDERBUFFER_BINDING	 =	GLK.	GL_RENDERBUFFER_BINDING	;
    public static final int	GL_MAX_RENDERBUFFER_SIZE	 =	GLK.	GL_MAX_RENDERBUFFER_SIZE	;
    public static final int	GL_INVALID_FRAMEBUFFER_OPERATION	 =	GLK.	GL_INVALID_FRAMEBUFFER_OPERATION	;
    public static final int	GL_DEPTH_COMPONENT24	 =	GLK.	GL_DEPTH_COMPONENT24	;
    public static final int	GL_DEPTH_COMPONENT32	 =	GLK.	GL_DEPTH_COMPONENT32	;
    public static final int	GL_WRITE_ONLY	 =	GLK.	GL_WRITE_ONLY	;
    public static final int	GL_BUFFER_ACCESS	 =	GLK.	GL_BUFFER_ACCESS	;
    public static final int	GL_BUFFER_MAPPED	 =	GLK.	GL_BUFFER_MAPPED	;
    public static final int	GL_BUFFER_MAP_POINTER	 =	GLK.	GL_BUFFER_MAP_POINTER	;
    public static final int	GL_DEPTH_STENCIL	 =	GLK.	GL_DEPTH_STENCIL	;
    public static final int	GL_UNSIGNED_INT_24_8	 =	GLK.	GL_UNSIGNED_INT_24_8	;
    public static final int	GL_DEPTH24_STENCIL8	 =	GLK.	GL_DEPTH24_STENCIL8	;
    public static final int	GL_RGB8	 =	GLK.	GL_RGB8	;
    public static final int	GL_RGBA8	 =	GLK.	GL_RGBA8	;
    public static final int	GL_STENCIL_INDEX1	 =	GLK.	GL_STENCIL_INDEX1	;
    public static final int	GL_STENCIL_INDEX4	 =	GLK.	GL_STENCIL_INDEX4	;
    public static final int	GL_HALF_FLOAT	 =	GLK.	GL_HALF_FLOAT	;
    public static final int	GL_UNSIGNED_SHORT_4_4_4_4_REV_EXT	 =	GLK.	GL_UNSIGNED_SHORT_4_4_4_4_REV_EXT	;
    public static final int	GL_UNSIGNED_SHORT_1_5_5_5_REV_EXT	 =	GLK.	GL_UNSIGNED_SHORT_1_5_5_5_REV_EXT	;
    public static final int	GL_TEXTURE_MAX_ANISOTROPY_EXT	 =	GLK.	GL_TEXTURE_MAX_ANISOTROPY_EXT	;
    public static final int	GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT	 =	GLK.	GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT	;
    public static final int	GL_UNSIGNED_INT_2_10_10_10_REV_EXT	 =	GLK.	GL_UNSIGNED_INT_2_10_10_10_REV_EXT	;
    public static final int	GL_COMPRESSED_RGB_S3TC_DXT1_EXT	 =	GLK.	GL_COMPRESSED_RGB_S3TC_DXT1_EXT	;
    public static final int	GL_COMPRESSED_RGBA_S3TC_DXT1_EXT	 =	GLK.	GL_COMPRESSED_RGBA_S3TC_DXT1_EXT	;
    public static final int	GL_R11F_G11F_B10F	 =	GLK.	GL_R11F_G11F_B10F	;
    public static final int	GL_UNSIGNED_INT_10F_11F_11F_REV	 =	GLK.	GL_UNSIGNED_INT_10F_11F_11F_REV	;
    public static final int	GL_RGBA_SIGNED_COMPONENTS	 =	GLK.	GL_RGBA_SIGNED_COMPONENTS	;
    public static final int	GL_TEXTURE_2D_ARRAY	 =	GLK.	GL_TEXTURE_2D_ARRAY	;
    public static final int	GL_SAMPLER_2D_ARRAY	 =	GLK.	GL_SAMPLER_2D_ARRAY	;
    public static final int	GL_TEXTURE_BINDING_2D_ARRAY	 =	GLK.	GL_TEXTURE_BINDING_2D_ARRAY	;
    public static final int	GL_MAX_ARRAY_TEXTURE_LAYERS	 =	GLK.	GL_MAX_ARRAY_TEXTURE_LAYERS	;
    public static final int	GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER	 =	GLK.	GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER	;
    public static final int	GL_COMPRESSED_RGBA_S3TC_DXT3_EXT	 =	GLK.	GL_COMPRESSED_RGBA_S3TC_DXT3_EXT	;
    public static final int	GL_COMPRESSED_RGBA_S3TC_DXT5_EXT	 =	GLK.	GL_COMPRESSED_RGBA_S3TC_DXT5_EXT	;
    public static final int	GL_AND	 =	GLK.	GL_AND	;
    public static final int	GL_AND_INVERTED	 =	GLK.	GL_AND_INVERTED	;
    public static final int	GL_AND_REVERSE	 =	GLK.	GL_AND_REVERSE	;
    public static final int	GL_BLEND_DST	 =	GLK.	GL_BLEND_DST	;
    public static final int	GL_BLEND_SRC	 =	GLK.	GL_BLEND_SRC	;
    public static final int	GL_CLEAR	 =	GLK.	GL_CLEAR	;
    public static final int	GL_COLOR_LOGIC_OP	 =	GLK.	GL_COLOR_LOGIC_OP	;
    public static final int	GL_COPY	 =	GLK.	GL_COPY	;
    public static final int	GL_COPY_INVERTED	 =	GLK.	GL_COPY_INVERTED	;
    public static final int	GL_EQUIV	 =	GLK.	GL_EQUIV	;
    public static final int	GL_LINE_SMOOTH	 =	GLK.	GL_LINE_SMOOTH	;
    public static final int	GL_LINE_SMOOTH_HINT	 =	GLK.	GL_LINE_SMOOTH_HINT	;
    public static final int	GL_LOGIC_OP_MODE	 =	GLK.	GL_LOGIC_OP_MODE	;
    public static final int	GL_MULTISAMPLE	 =	GLK.	GL_MULTISAMPLE	;
    public static final int	GL_NAND	 =	GLK.	GL_NAND	;
    public static final int	GL_NOOP	 =	GLK.	GL_NOOP	;
    public static final int	GL_NOR	 =	GLK.	GL_NOR	;
    public static final int	GL_OR	 =	GLK.	GL_OR	;
    public static final int	GL_OR_INVERTED	 =	GLK.	GL_OR_INVERTED	;
    public static final int	GL_OR_REVERSE	 =	GLK.	GL_OR_REVERSE	;
    public static final int	GL_POINT_FADE_THRESHOLD_SIZE	 =	GLK.	GL_POINT_FADE_THRESHOLD_SIZE	;
    public static final int	GL_POINT_SIZE	 =	GLK.	GL_POINT_SIZE	;
    public static final int	GL_SAMPLE_ALPHA_TO_ONE	 =	GLK.	GL_SAMPLE_ALPHA_TO_ONE	;
    public static final int	GL_SET	 =	GLK.	GL_SET	;
    public static final int	GL_SMOOTH_LINE_WIDTH_RANGE	 =	GLK.	GL_SMOOTH_LINE_WIDTH_RANGE	;
    public static final int	GL_SMOOTH_POINT_SIZE_RANGE	 =	GLK.	GL_SMOOTH_POINT_SIZE_RANGE	;
    public static final int	GL_XOR	 =	GLK.	GL_XOR	;
    public static final int	GL_CONSTANT_COLOR	 =	GLK.	GL_CONSTANT_COLOR	;
    public static final int	GL_ONE_MINUS_CONSTANT_COLOR	 =	GLK.	GL_ONE_MINUS_CONSTANT_COLOR	;
    public static final int	GL_CONSTANT_ALPHA	 =	GLK.	GL_CONSTANT_ALPHA	;
    public static final int	GL_ONE_MINUS_CONSTANT_ALPHA	 =	GLK.	GL_ONE_MINUS_CONSTANT_ALPHA	;
    public static final int	GL_BLEND_COLOR	 =	GLK.	GL_BLEND_COLOR	;
    public static final int	GL_STREAM_DRAW	 =	GLK.	GL_STREAM_DRAW	;
    public static final int	GL_CURRENT_VERTEX_ATTRIB	 =	GLK.	GL_CURRENT_VERTEX_ATTRIB	;
    public static final int	GL_STENCIL_BACK_FUNC	 =	GLK.	GL_STENCIL_BACK_FUNC	;
    public static final int	GL_STENCIL_BACK_FAIL	 =	GLK.	GL_STENCIL_BACK_FAIL	;
    public static final int	GL_STENCIL_BACK_PASS_DEPTH_FAIL	 =	GLK.	GL_STENCIL_BACK_PASS_DEPTH_FAIL	;
    public static final int	GL_STENCIL_BACK_PASS_DEPTH_PASS	 =	GLK.	GL_STENCIL_BACK_PASS_DEPTH_PASS	;
    public static final int	GL_STENCIL_BACK_REF	 =	GLK.	GL_STENCIL_BACK_REF	;
    public static final int	GL_STENCIL_BACK_VALUE_MASK	 =	GLK.	GL_STENCIL_BACK_VALUE_MASK	;
    public static final int	GL_STENCIL_BACK_WRITEMASK	 =	GLK.	GL_STENCIL_BACK_WRITEMASK	;
    public static final int	GL_INT	 =	GLK.	GL_INT	;
    public static final int	GL_DEPTH_COMPONENT	 =	GLK.	GL_DEPTH_COMPONENT	;
    public static final int	GL_FRAGMENT_SHADER	 =	GLK.	GL_FRAGMENT_SHADER	;
    public static final int	GL_VERTEX_SHADER	 =	GLK.	GL_VERTEX_SHADER	;
    public static final int	GL_MAX_VERTEX_ATTRIBS	 =	GLK.	GL_MAX_VERTEX_ATTRIBS	;
    public static final int	GL_MAX_VERTEX_UNIFORM_VECTORS	 =	GLK.	GL_MAX_VERTEX_UNIFORM_VECTORS	;
    public static final int	GL_MAX_VARYING_VECTORS	 =	GLK.	GL_MAX_VARYING_VECTORS	;
    public static final int	GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS	 =	GLK.	GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS	;
    public static final int	GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS	 =	GLK.	GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS	;
    public static final int	GL_MAX_TEXTURE_IMAGE_UNITS	 =	GLK.	GL_MAX_TEXTURE_IMAGE_UNITS	;
    public static final int	GL_MAX_FRAGMENT_UNIFORM_VECTORS	 =	GLK.	GL_MAX_FRAGMENT_UNIFORM_VECTORS	;
    public static final int	GL_SHADER_TYPE	 =	GLK.	GL_SHADER_TYPE	;
    public static final int	GL_DELETE_STATUS	 =	GLK.	GL_DELETE_STATUS	;
    public static final int	GL_LINK_STATUS	 =	GLK.	GL_LINK_STATUS	;
    public static final int	GL_VALIDATE_STATUS	 =	GLK.	GL_VALIDATE_STATUS	;
    public static final int	GL_ATTACHED_SHADERS	 =	GLK.	GL_ATTACHED_SHADERS	;
    public static final int	GL_ACTIVE_UNIFORMS	 =	GLK.	GL_ACTIVE_UNIFORMS	;
    public static final int	GL_ACTIVE_UNIFORM_MAX_LENGTH	 =	GLK.	GL_ACTIVE_UNIFORM_MAX_LENGTH	;
    public static final int	GL_ACTIVE_ATTRIBUTES	 =	GLK.	GL_ACTIVE_ATTRIBUTES	;
    public static final int	GL_ACTIVE_ATTRIBUTE_MAX_LENGTH	 =	GLK.	GL_ACTIVE_ATTRIBUTE_MAX_LENGTH	;
    public static final int	GL_SHADING_LANGUAGE_VERSION	 =	GLK.	GL_SHADING_LANGUAGE_VERSION	;
    public static final int	GL_CURRENT_PROGRAM	 =	GLK.	GL_CURRENT_PROGRAM	;
    public static final int	GL_FLOAT_VEC2	 =	GLK.	GL_FLOAT_VEC2	;
    public static final int	GL_FLOAT_VEC3	 =	GLK.	GL_FLOAT_VEC3	;
    public static final int	GL_FLOAT_VEC4	 =	GLK.	GL_FLOAT_VEC4	;
    public static final int	GL_INT_VEC2	 =	GLK.	GL_INT_VEC2	;
    public static final int	GL_INT_VEC3	 =	GLK.	GL_INT_VEC3	;
    public static final int	GL_INT_VEC4	 =	GLK.	GL_INT_VEC4	;
    public static final int	GL_BOOL	 =	GLK.	GL_BOOL	;
    public static final int	GL_BOOL_VEC2	 =	GLK.	GL_BOOL_VEC2	;
    public static final int	GL_BOOL_VEC3	 =	GLK.	GL_BOOL_VEC3	;
    public static final int	GL_BOOL_VEC4	 =	GLK.	GL_BOOL_VEC4	;
    public static final int	GL_FLOAT_MAT2	 =	GLK.	GL_FLOAT_MAT2	;
    public static final int	GL_FLOAT_MAT3	 =	GLK.	GL_FLOAT_MAT3	;
    public static final int	GL_FLOAT_MAT4	 =	GLK.	GL_FLOAT_MAT4	;
    public static final int	GL_SAMPLER_2D	 =	GLK.	GL_SAMPLER_2D	;
    public static final int	GL_SAMPLER_CUBE	 =	GLK.	GL_SAMPLER_CUBE	;
    public static final int	GL_VERTEX_ATTRIB_ARRAY_ENABLED	 =	GLK.	GL_VERTEX_ATTRIB_ARRAY_ENABLED	;
    public static final int	GL_VERTEX_ATTRIB_ARRAY_SIZE	 =	GLK.	GL_VERTEX_ATTRIB_ARRAY_SIZE	;
    public static final int	GL_VERTEX_ATTRIB_ARRAY_STRIDE	 =	GLK.	GL_VERTEX_ATTRIB_ARRAY_STRIDE	;
    public static final int	GL_VERTEX_ATTRIB_ARRAY_TYPE	 =	GLK.	GL_VERTEX_ATTRIB_ARRAY_TYPE	;
    public static final int	GL_VERTEX_ATTRIB_ARRAY_NORMALIZED	 =	GLK.	GL_VERTEX_ATTRIB_ARRAY_NORMALIZED	;
    public static final int	GL_VERTEX_ATTRIB_ARRAY_POINTER	 =	GLK.	GL_VERTEX_ATTRIB_ARRAY_POINTER	;
    public static final int	GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING	 =	GLK.	GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING	;
    public static final int	GL_COMPILE_STATUS	 =	GLK.	GL_COMPILE_STATUS	;
    public static final int	GL_INFO_LOG_LENGTH	 =	GLK.	GL_INFO_LOG_LENGTH	;
    public static final int	GL_SHADER_SOURCE_LENGTH	 =	GLK.	GL_SHADER_SOURCE_LENGTH	;
    public static final int	GL_SHADER_COMPILER	 =	GLK.	GL_SHADER_COMPILER	;
    public static final int	GL_SHADER_BINARY_FORMATS	 =	GLK.	GL_SHADER_BINARY_FORMATS	;
    public static final int	GL_NUM_SHADER_BINARY_FORMATS	 =	GLK.	GL_NUM_SHADER_BINARY_FORMATS	;
    public static final int	GL_LOW_FLOAT	 =	GLK.	GL_LOW_FLOAT	;
    public static final int	GL_MEDIUM_FLOAT	 =	GLK.	GL_MEDIUM_FLOAT	;
    public static final int	GL_HIGH_FLOAT	 =	GLK.	GL_HIGH_FLOAT	;
    public static final int	GL_LOW_INT	 =	GLK.	GL_LOW_INT	;
    public static final int	GL_MEDIUM_INT	 =	GLK.	GL_MEDIUM_INT	;
    public static final int	GL_HIGH_INT	 =	GLK.	GL_HIGH_INT	;
    public static final int	GL_STENCIL_INDEX	 =	GLK.	GL_STENCIL_INDEX	;
    public static final int	GL_PROGRAM_BINARY_LENGTH	 =	GLK.	GL_PROGRAM_BINARY_LENGTH	;
    public static final int	GL_NUM_PROGRAM_BINARY_FORMATS	 =	GLK.	GL_NUM_PROGRAM_BINARY_FORMATS	;
    public static final int	GL_PROGRAM_BINARY_FORMATS	 =	GLK.	GL_PROGRAM_BINARY_FORMATS	;
    public static final int	GL_FRAGMENT_SHADER_DERIVATIVE_HINT	 =	GLK.	GL_FRAGMENT_SHADER_DERIVATIVE_HINT	;
    public static final int	GL_TEXTURE_WRAP_R	 =	GLK.	GL_TEXTURE_WRAP_R	;
    public static final int	GL_TEXTURE_3D	 =	GLK.	GL_TEXTURE_3D	;
    public static final int	GL_TEXTURE_BINDING_3D	 =	GLK.	GL_TEXTURE_BINDING_3D	;
    public static final int	GL_MAX_3D_TEXTURE_SIZE	 =	GLK.	GL_MAX_3D_TEXTURE_SIZE	;
    public static final int	GL_SAMPLER_3D	 =	GLK.	GL_SAMPLER_3D	;
    public static final int	GL_UNSIGNED_INT_10_10_10_2	 =	GLK.	GL_UNSIGNED_INT_10_10_10_2	;
    public static final int	GL_INT_10_10_10_2	 =	GLK.	GL_INT_10_10_10_2	;
    public static final int	GL_ETC1_RGB8_OES	 =	GLK.	GL_ETC1_RGB8_OES	;
    public static final int	GL_PALETTE4_RGB8_OES	 =	GLK.	GL_PALETTE4_RGB8_OES	;
    public static final int	GL_PALETTE4_RGBA8_OES	 =	GLK.	GL_PALETTE4_RGBA8_OES	;
    public static final int	GL_PALETTE4_R5_G6_B5_OES	 =	GLK.	GL_PALETTE4_R5_G6_B5_OES	;
    public static final int	GL_PALETTE4_RGBA4_OES	 =	GLK.	GL_PALETTE4_RGBA4_OES	;
    public static final int	GL_PALETTE4_RGB5_A1_OES	 =	GLK.	GL_PALETTE4_RGB5_A1_OES	;
    public static final int	GL_PALETTE8_RGB8_OES	 =	GLK.	GL_PALETTE8_RGB8_OES	;
    public static final int	GL_PALETTE8_RGBA8_OES	 =	GLK.	GL_PALETTE8_RGBA8_OES	;
    public static final int	GL_PALETTE8_R5_G6_B5_OES	 =	GLK.	GL_PALETTE8_R5_G6_B5_OES	;
    public static final int	GL_PALETTE8_RGBA4_OES	 =	GLK.	GL_PALETTE8_RGBA4_OES	;
    public static final int	GL_PALETTE8_RGB5_A1_OES	 =	GLK.	GL_PALETTE8_RGB5_A1_OES	;
    public static final int	GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET	 =	GLK.	GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET	;
    public static final int	GL_VERTEX_ARRAY_BINDING_OES	 =	GLK.	GL_VERTEX_ARRAY_BINDING_OES	;
    public static final int	GL_3DC_X_AMD	 =	GLK.	GL_3DC_X_AMD	;
    public static final int	GL_3DC_XY_AMD	 =	GLK.	GL_3DC_XY_AMD	;
    public static final int	GL_ATC_RGB_AMD	 =	GLK.	GL_ATC_RGB_AMD	;
    public static final int	GL_ATC_RGBA_EXPLICIT_ALPHA_AMD	 =	GLK.	GL_ATC_RGBA_EXPLICIT_ALPHA_AMD	;
    public static final int	GL_ATC_RGBA_INTERPOLATED_ALPHA_AMD	 =	GLK.	GL_ATC_RGBA_INTERPOLATED_ALPHA_AMD	;
    public static final int	GL_COUNTER_TYPE_AMD	 =	GLK.	GL_COUNTER_TYPE_AMD	;
    public static final int	GL_COUNTER_RANGE_AMD	 =	GLK.	GL_COUNTER_RANGE_AMD	;
    public static final int	GL_UNSIGNED_INT64_AMD	 =	GLK.	GL_UNSIGNED_INT64_AMD	;
    public static final int	GL_PERCENTAGE_AMD	 =	GLK.	GL_PERCENTAGE_AMD	;
    public static final int	GL_PERFMON_RESULT_AVAILABLE_AMD	 =	GLK.	GL_PERFMON_RESULT_AVAILABLE_AMD	;
    public static final int	GL_PERFMON_RESULT_SIZE_AMD	 =	GLK.	GL_PERFMON_RESULT_SIZE_AMD	;
    public static final int	GL_PERFMON_RESULT_AMD	 =	GLK.	GL_PERFMON_RESULT_AMD	;
    public static final int	GL_Z400_BINARY_AMD	 =	GLK.	GL_Z400_BINARY_AMD	;
    public static final int	GL_READ_FRAMEBUFFER_ANGLE	 =	GLK.	GL_READ_FRAMEBUFFER_ANGLE	;
    public static final int	GL_DRAW_FRAMEBUFFER_ANGLE	 =	GLK.	GL_DRAW_FRAMEBUFFER_ANGLE	;
    public static final int	GL_DRAW_FRAMEBUFFER_BINDING_ANGLE	 =	GLK.	GL_DRAW_FRAMEBUFFER_BINDING_ANGLE	;
    public static final int	GL_READ_FRAMEBUFFER_BINDING_ANGLE	 =	GLK.	GL_READ_FRAMEBUFFER_BINDING_ANGLE	;
    public static final int	GL_RENDERBUFFER_SAMPLES_ANGLE	 =	GLK.	GL_RENDERBUFFER_SAMPLES_ANGLE	;
    public static final int	GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_ANGLE	 =	GLK.	GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_ANGLE	;
    public static final int	GL_MAX_SAMPLES_ANGLE	 =	GLK.	GL_MAX_SAMPLES_ANGLE	;
    public static final int	GL_RGB_422_APPLE	 =	GLK.	GL_RGB_422_APPLE	;
    public static final int	GL_UNSIGNED_SHORT_8_8_APPLE	 =	GLK.	GL_UNSIGNED_SHORT_8_8_APPLE	;
    public static final int	GL_UNSIGNED_SHORT_8_8_REV_APPLE	 =	GLK.	GL_UNSIGNED_SHORT_8_8_REV_APPLE	;
    public static final int	GL_RENDERBUFFER_SAMPLES_APPLE	 =	GLK.	GL_RENDERBUFFER_SAMPLES_APPLE	;
    public static final int	GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_APPLE	 =	GLK.	GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_APPLE	;
    public static final int	GL_MAX_SAMPLES_APPLE	 =	GLK.	GL_MAX_SAMPLES_APPLE	;
    public static final int	GL_READ_FRAMEBUFFER_APPLE	 =	GLK.	GL_READ_FRAMEBUFFER_APPLE	;
    public static final int	GL_DRAW_FRAMEBUFFER_APPLE	 =	GLK.	GL_DRAW_FRAMEBUFFER_APPLE	;
    public static final int	GL_DRAW_FRAMEBUFFER_BINDING_APPLE	 =	GLK.	GL_DRAW_FRAMEBUFFER_BINDING_APPLE	;
    public static final int	GL_READ_FRAMEBUFFER_BINDING_APPLE	 =	GLK.	GL_READ_FRAMEBUFFER_BINDING_APPLE	;
    public static final int	GL_TEXTURE_MAX_LEVEL_APPLE	 =	GLK.	GL_TEXTURE_MAX_LEVEL_APPLE	;
    public static final int	GL_MALI_SHADER_BINARY_ARM	 =	GLK.	GL_MALI_SHADER_BINARY_ARM	;
    public static final int	GL_COLOR_EXT	 =	GLK.	GL_COLOR_EXT	;
    public static final int	GL_DEPTH_EXT	 =	GLK.	GL_DEPTH_EXT	;
    public static final int	GL_STENCIL_EXT	 =	GLK.	GL_STENCIL_EXT	;
    public static final int	GL_SGX_PROGRAM_BINARY_IMG	 =	GLK.	GL_SGX_PROGRAM_BINARY_IMG	;
    public static final int	GL_BGRA_IMG	 =	GLK.	GL_BGRA_IMG	;
    public static final int	GL_UNSIGNED_SHORT_4_4_4_4_REV_IMG	 =	GLK.	GL_UNSIGNED_SHORT_4_4_4_4_REV_IMG	;
    public static final int	GL_SGX_BINARY_IMG	 =	GLK.	GL_SGX_BINARY_IMG	;
    public static final int	GL_COMPRESSED_RGB_PVRTC_4BPPV1_IMG	 =	GLK.	GL_COMPRESSED_RGB_PVRTC_4BPPV1_IMG	;
    public static final int	GL_COMPRESSED_RGB_PVRTC_2BPPV1_IMG	 =	GLK.	GL_COMPRESSED_RGB_PVRTC_2BPPV1_IMG	;
    public static final int	GL_COMPRESSED_RGBA_PVRTC_4BPPV1_IMG	 =	GLK.	GL_COMPRESSED_RGBA_PVRTC_4BPPV1_IMG	;
    public static final int	GL_COMPRESSED_RGBA_PVRTC_2BPPV1_IMG	 =	GLK.	GL_COMPRESSED_RGBA_PVRTC_2BPPV1_IMG	;
    public static final int	GL_RENDERBUFFER_SAMPLES_IMG	 =	GLK.	GL_RENDERBUFFER_SAMPLES_IMG	;
    public static final int	GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_IMG	 =	GLK.	GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_IMG	;
    public static final int	GL_MAX_SAMPLES_IMG	 =	GLK.	GL_MAX_SAMPLES_IMG	;
    public static final int	GL_TEXTURE_SAMPLES_IMG	 =	GLK.	GL_TEXTURE_SAMPLES_IMG	;
    public static final int	GL_ALL_COMPLETED_NV	 =	GLK.	GL_ALL_COMPLETED_NV	;
    public static final int	GL_FENCE_STATUS_NV	 =	GLK.	GL_FENCE_STATUS_NV	;
    public static final int	GL_FENCE_CONDITION_NV	 =	GLK.	GL_FENCE_CONDITION_NV	;
    public static final int	GL_COVERAGE_SAMPLES_NV	 =	GLK.	GL_COVERAGE_SAMPLES_NV	;
    public static final int	GL_DEPTH_COMPONENT16_NONLINEAR_NV	 =	GLK.	GL_DEPTH_COMPONENT16_NONLINEAR_NV	;
    public static final int	GL_TEXTURE_WIDTH_QCOM	 =	GLK.	GL_TEXTURE_WIDTH_QCOM	;
    public static final int	GL_TEXTURE_HEIGHT_QCOM	 =	GLK.	GL_TEXTURE_HEIGHT_QCOM	;
    public static final int	GL_TEXTURE_DEPTH_QCOM	 =	GLK.	GL_TEXTURE_DEPTH_QCOM	;
    public static final int	GL_TEXTURE_INTERNAL_FORMAT_QCOM	 =	GLK.	GL_TEXTURE_INTERNAL_FORMAT_QCOM	;
    public static final int	GL_TEXTURE_FORMAT_QCOM	 =	GLK.	GL_TEXTURE_FORMAT_QCOM	;
    public static final int	GL_TEXTURE_TYPE_QCOM	 =	GLK.	GL_TEXTURE_TYPE_QCOM	;
    public static final int	GL_TEXTURE_IMAGE_VALID_QCOM	 =	GLK.	GL_TEXTURE_IMAGE_VALID_QCOM	;
    public static final int	GL_TEXTURE_NUM_LEVELS_QCOM	 =	GLK.	GL_TEXTURE_NUM_LEVELS_QCOM	;
    public static final int	GL_TEXTURE_TARGET_QCOM	 =	GLK.	GL_TEXTURE_TARGET_QCOM	;
    public static final int	GL_TEXTURE_OBJECT_VALID_QCOM	 =	GLK.	GL_TEXTURE_OBJECT_VALID_QCOM	;
    public static final int	GL_STATE_RESTORE	 =	GLK.	GL_STATE_RESTORE	;
    public static final int	GL_PERFMON_GLOBAL_MODE_QCOM	 =	GLK.	GL_PERFMON_GLOBAL_MODE_QCOM	;
    public static final int	GL_WRITEONLY_RENDERING_QCOM	 =	GLK.	GL_WRITEONLY_RENDERING_QCOM	;
    public static final int	GL_COLOR_BUFFER_BIT0_QCOM	 =	GLK.	GL_COLOR_BUFFER_BIT0_QCOM	;
    public static final int	GL_COLOR_BUFFER_BIT1_QCOM	 =	GLK.	GL_COLOR_BUFFER_BIT1_QCOM	;
    public static final int	GL_COLOR_BUFFER_BIT2_QCOM	 =	GLK.	GL_COLOR_BUFFER_BIT2_QCOM	;
    public static final int	GL_COLOR_BUFFER_BIT3_QCOM	 =	GLK.	GL_COLOR_BUFFER_BIT3_QCOM	;
    public static final int	GL_COLOR_BUFFER_BIT4_QCOM	 =	GLK.	GL_COLOR_BUFFER_BIT4_QCOM	;
    public static final int	GL_COLOR_BUFFER_BIT5_QCOM	 =	GLK.	GL_COLOR_BUFFER_BIT5_QCOM	;
    public static final int	GL_COLOR_BUFFER_BIT6_QCOM	 =	GLK.	GL_COLOR_BUFFER_BIT6_QCOM	;
    public static final int	GL_COLOR_BUFFER_BIT7_QCOM	 =	GLK.	GL_COLOR_BUFFER_BIT7_QCOM	;
    public static final int	GL_DEPTH_BUFFER_BIT0_QCOM	 =	GLK.	GL_DEPTH_BUFFER_BIT0_QCOM	;
    public static final int	GL_DEPTH_BUFFER_BIT1_QCOM	 =	GLK.	GL_DEPTH_BUFFER_BIT1_QCOM	;
    public static final int	GL_DEPTH_BUFFER_BIT2_QCOM	 =	GLK.	GL_DEPTH_BUFFER_BIT2_QCOM	;
    public static final int	GL_DEPTH_BUFFER_BIT3_QCOM	 =	GLK.	GL_DEPTH_BUFFER_BIT3_QCOM	;
    public static final int	GL_DEPTH_BUFFER_BIT4_QCOM	 =	GLK.	GL_DEPTH_BUFFER_BIT4_QCOM	;
    public static final int	GL_DEPTH_BUFFER_BIT5_QCOM	 =	GLK.	GL_DEPTH_BUFFER_BIT5_QCOM	;
    public static final int	GL_DEPTH_BUFFER_BIT6_QCOM	 =	GLK.	GL_DEPTH_BUFFER_BIT6_QCOM	;
    public static final int	GL_DEPTH_BUFFER_BIT7_QCOM	 =	GLK.	GL_DEPTH_BUFFER_BIT7_QCOM	;
    public static final int	GL_STENCIL_BUFFER_BIT0_QCOM	 =	GLK.	GL_STENCIL_BUFFER_BIT0_QCOM	;
    public static final int	GL_STENCIL_BUFFER_BIT1_QCOM	 =	GLK.	GL_STENCIL_BUFFER_BIT1_QCOM	;
    public static final int	GL_STENCIL_BUFFER_BIT2_QCOM	 =	GLK.	GL_STENCIL_BUFFER_BIT2_QCOM	;
    public static final int	GL_STENCIL_BUFFER_BIT3_QCOM	 =	GLK.	GL_STENCIL_BUFFER_BIT3_QCOM	;
    public static final int	GL_STENCIL_BUFFER_BIT4_QCOM	 =	GLK.	GL_STENCIL_BUFFER_BIT4_QCOM	;
    public static final int	GL_STENCIL_BUFFER_BIT5_QCOM	 =	GLK.	GL_STENCIL_BUFFER_BIT5_QCOM	;
    public static final int	GL_STENCIL_BUFFER_BIT6_QCOM	 =	GLK.	GL_STENCIL_BUFFER_BIT6_QCOM	;
    public static final int	GL_STENCIL_BUFFER_BIT7_QCOM	 =	GLK.	GL_STENCIL_BUFFER_BIT7_QCOM	;
    public static final int	GL_MULTISAMPLE_BUFFER_BIT0_QCOM	 =	GLK.	GL_MULTISAMPLE_BUFFER_BIT0_QCOM	;
    public static final int	GL_MULTISAMPLE_BUFFER_BIT1_QCOM	 =	GLK.	GL_MULTISAMPLE_BUFFER_BIT1_QCOM	;
    public static final int	GL_MULTISAMPLE_BUFFER_BIT2_QCOM	 =	GLK.	GL_MULTISAMPLE_BUFFER_BIT2_QCOM	;
    public static final int	GL_MULTISAMPLE_BUFFER_BIT3_QCOM	 =	GLK.	GL_MULTISAMPLE_BUFFER_BIT3_QCOM	;
    public static final int	GL_MULTISAMPLE_BUFFER_BIT4_QCOM	 =	GLK.	GL_MULTISAMPLE_BUFFER_BIT4_QCOM	;
    public static final int	GL_MULTISAMPLE_BUFFER_BIT5_QCOM	 =	GLK.	GL_MULTISAMPLE_BUFFER_BIT5_QCOM	;
    public static final int	GL_MULTISAMPLE_BUFFER_BIT6_QCOM	 =	GLK.	GL_MULTISAMPLE_BUFFER_BIT6_QCOM	;
    public static final int	GL_SHADER_BINARY_VIV	 =	GLK.	GL_SHADER_BINARY_VIV	;
    public static final int	GL_NVIDIA_PLATFORM_BINARY_NV	 =	GLK.	GL_NVIDIA_PLATFORM_BINARY_NV	;
}
