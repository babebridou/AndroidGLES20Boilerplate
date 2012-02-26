package com.fairyteller.fairy3d.utils;

import com.fairyteller.fairy3d.scene.Texture2D;

public abstract class GLUtilsDelegate {
	    
	    /**
	     * return the internal format as defined by OpenGL ES of the supplied bitmap.
	     * @param bitmap
	     * @return the internal format of the bitmap.
	     */
	    public abstract int getInternalFormat(Texture2D texture);

	    /**
	     * Return the type as defined by OpenGL ES of the supplied bitmap, if there
	     * is one. If the bitmap is stored in a compressed format, it may not have
	     * a valid OpenGL ES type.
	     * @throws IllegalArgumentException if the bitmap does not have a type.
	     * @param bitmap
	     * @return the OpenGL ES type of the bitmap.
	     */
	    public abstract int getType(Texture2D texture);

	    /**
	     * Calls glTexImage2D() on the current OpenGL context. If no context is
	     * current the behavior is the same as calling glTexImage2D() with  no
	     * current context, that is, eglGetError() will return the appropriate
	     * error.
	     * Unlike glTexImage2D() bitmap cannot be null and will raise an exception
	     * in that case.
	     * All other parameters are identical to those used for glTexImage2D().
	     *
	     * NOTE: this method doesn't change GL_UNPACK_ALIGNMENT, you must make
	     * sure to set it properly according to the supplied bitmap.
	     *
	     * Whether or not bitmap can have non power of two dimensions depends on
	     * the current OpenGL context. Always check glGetError() some time
	     * after calling this method, just like when using OpenGL directly.
	     *
	     * @param target
	     * @param level
	     * @param internalformat
	     * @param bitmap
	     * @param border
	     */
	    public abstract void texImage2D(int target, int level, int internalformat,
	            Texture2D texture, int border);

	    /**
	     * A version of texImage2D() that takes an explicit type parameter
	     * as defined by the OpenGL ES specification. The actual type and
	     * internalformat of the bitmap must be compatible with the specified
	     * type and internalformat parameters.
	     *
	     * @param target
	     * @param level
	     * @param internalformat
	     * @param bitmap
	     * @param type
	     * @param border
	     */
	    public abstract void texImage2D(int target, int level, int internalformat,
	            Texture2D texture, int type, int border);

	    /**
	     * A version of texImage2D that determines the internalFormat and type
	     * automatically.
	     *
	     * @param target
	     * @param level
	     * @param bitmap
	     * @param border
	     */
	    public abstract void texImage2D(int target, int level, Texture2D texture,
	            int border);

	    /**
	     * Calls glTexSubImage2D() on the current OpenGL context. If no context is
	     * current the behavior is the same as calling glTexSubImage2D() with  no
	     * current context, that is, eglGetError() will return the appropriate
	     * error.
	     * Unlike glTexSubImage2D() bitmap cannot be null and will raise an exception
	     * in that case.
	     * All other parameters are identical to those used for glTexSubImage2D().
	     *
	     * NOTE: this method doesn't change GL_UNPACK_ALIGNMENT, you must make
	     * sure to set it properly according to the supplied bitmap.
	     *
	     * Whether or not bitmap can have non power of two dimensions depends on
	     * the current OpenGL context. Always check glGetError() some time
	     * after calling this method, just like when using OpenGL directly.
	     *
	     * @param target
	     * @param level
	     * @param xoffset
	     * @param yoffset
	     * @param bitmap
	     */
	    public abstract void texSubImage2D(int target, int level, int xoffset, int yoffset,
	    		Texture2D texture);

	    /**
	     * A version of texSubImage2D() that takes an explicit type parameter
	     * as defined by the OpenGL ES specification.
	     *
	     * @param target
	     * @param level
	     * @param xoffset
	     * @param yoffset
	     * @param texture
	     * @param type
	     */
	    public abstract void texSubImage2D(int target, int level, int xoffset, int yoffset,
	            Texture2D texture, int format, int type);

	    /**
	     * Return a string for the EGL error code, or the hex representation
	     * if the error is unknown.
	     * 
	     * @param error The EGL error to convert into a String.
	     * 
	     * @return An error string corresponding to the EGL error code.
	     */
	    public abstract String getEGLErrorString(int error);
}
