package com.fairyteller.fairy3d.utils;

public class GLU {

	static final int GL_NO_ERROR = 0;
	static final int GL_INVALID_ENUM = 1280;
	static final int GL_INVALID_VALUE = 1281;
	static final int GL_INVALID_OPERATION = 1282;
	static final int GL_OUT_OF_MEMORY = 1285;

	    /**
	     * Return an error string from a GL or GLU error code.
	     *
	     * @param error - a GL or GLU error code.
	     * @return the error string for the input error code, or NULL if the input
	     *         was not a valid GL or GLU error code.
	     */
	    public static String gluErrorString(int error) {
	        switch (error) {
	        case GL_NO_ERROR:
	            return "no error";
	        case GL_INVALID_ENUM:
	            return "invalid enum";
	        case GL_INVALID_VALUE:
	            return "invalid value";
	        case GL_INVALID_OPERATION:
	            return "invalid operation";
	        case GL_OUT_OF_MEMORY:
	            return "out of memory";
	        default:
	            return null;
	        }
	    }

	    /**
	     * Define a viewing transformation in terms of an eye point, a center of
	     * view, and an up vector.
	     *<pre>NOT IMPLEMENTED</pre>
	     * use Matrix.setLookAtM(...)
	     * @param gl a GL10 interface
	     * @param eyeX eye point X
	     * @param eyeY eye point Y
	     * @param eyeZ eye point Z
	     * @param centerX center of view X
	     * @param centerY center of view Y
	     * @param centerZ center of view Z
	     * @param upX up vector X
	     * @param upY up vector Y
	     * @param upZ up vector Z
	     */
	    public static void gluLookAt(GLES20 gl, float eyeX, float eyeY, float eyeZ,
	            float centerX, float centerY, float centerZ, float upX, float upY,
	            float upZ) {

	    }

	    /**
	     * Set up a 2D orthographic projection matrix
	     * <pre>NOT IMPLEMENTED</pre>
	     * use Matrix.frustumM(...)
	     * @param gl
	     * @param left
	     * @param right
	     * @param bottom
	     * @param top
	     */
	    @Deprecated
	    public static void gluOrtho2D(GLES20 gl, float left, float right,
	            float bottom, float top) {
	        
	    }

	    /**
	     * Set up a perspective projection matrix
	     *<pre>NOT IMPLEMENTED</pre>
	     * use Matrix.frustumM(...)
	     * @param gl a GL10 interface
	     * @param fovy specifies the field of view angle, in degrees, in the Y
	     *        direction.
	     * @param aspect specifies the aspect ration that determins the field of
	     *        view in the x direction. The aspect ratio is the ratio of x
	     *        (width) to y (height).
	     * @param zNear specifies the distance from the viewer to the near clipping
	     *        plane (always positive).
	     * @param zFar specifies the distance from the viewer to the far clipping
	     *        plane (always positive).
	     */
	    public static void gluPerspective(GLES20 gl, float fovy, float aspect,
	            float zNear, float zFar) {
	    }

	    /**
	     * Map object coordinates into window coordinates. gluProject transforms the
	     * specified object coordinates into window coordinates using model, proj,
	     * and view. The result is stored in win.
	     * <p>
	     * Note that you can use the OES_matrix_get extension, if present, to get
	     * the current modelView and projection matrices.
	     *
	     * @param objX object coordinates X
	     * @param objY object coordinates Y
	     * @param objZ object coordinates Z
	     * @param model the current modelview matrix
	     * @param modelOffset the offset into the model array where the modelview
	     *        maxtrix data starts.
	     * @param project the current projection matrix
	     * @param projectOffset the offset into the project array where the project
	     *        matrix data starts.
	     * @param view the current view, {x, y, width, height}
	     * @param viewOffset the offset into the view array where the view vector
	     *        data starts.
	     * @param win the output vector {winX, winY, winZ}, that returns the
	     *        computed window coordinates.
	     * @param winOffset the offset into the win array where the win vector data
	     *        starts.
	     * @return A return value of GL_TRUE indicates success, a return value of
	     *         GL_FALSE indicates failure.
	     */
	    public static int gluProject(float objX, float objY, float objZ,
	            float[] model, int modelOffset, float[] project, int projectOffset,
	            int[] view, int viewOffset, float[] win, int winOffset) {
	        float[] scratch = sScratch;
	        synchronized(scratch) {
	            final int M_OFFSET = 0; // 0..15
	            final int V_OFFSET = 16; // 16..19
	            final int V2_OFFSET = 20; // 20..23
	            Matrix.multiplyMM(scratch, M_OFFSET, project, projectOffset,
	                    model, modelOffset);

	            scratch[V_OFFSET + 0] = objX;
	            scratch[V_OFFSET + 1] = objY;
	            scratch[V_OFFSET + 2] = objZ;
	            scratch[V_OFFSET + 3] = 1.0f;

	            Matrix.multiplyMV(scratch, V2_OFFSET,
	                    scratch, M_OFFSET, scratch, V_OFFSET);

	            float w = scratch[V2_OFFSET + 3];
	            if (w == 0.0f) {
	                return GLES20.GL_FALSE;
	            }

	            float rw = 1.0f / w;

	            win[winOffset] =
	                    view[viewOffset] + view[viewOffset + 2]
	                            * (scratch[V2_OFFSET + 0] * rw + 1.0f)
	                            * 0.5f;
	            win[winOffset + 1] =
	                    view[viewOffset + 1] + view[viewOffset + 3]
	                            * (scratch[V2_OFFSET + 1] * rw + 1.0f) * 0.5f;
	            win[winOffset + 2] = (scratch[V2_OFFSET + 2] * rw + 1.0f) * 0.5f;
	        }

	        return GLES20.GL_TRUE;
	    }

	    /**
	     * Map window coordinates to object coordinates. gluUnProject maps the
	     * specified window coordinates into object coordinates using model, proj,
	     * and view. The result is stored in obj.
	     * <p>
	     * Note that you can use the OES_matrix_get extension, if present, to get
	     * the current modelView and projection matrices.
	     *
	     * @param winX window coordinates X
	     * @param winY window coordinates Y
	     * @param winZ window coordinates Z
	     * @param model the current modelview matrix
	     * @param modelOffset the offset into the model array where the modelview
	     *        maxtrix data starts.
	     * @param project the current projection matrix
	     * @param projectOffset the offset into the project array where the project
	     *        matrix data starts.
	     * @param view the current view, {x, y, width, height}
	     * @param viewOffset the offset into the view array where the view vector
	     *        data starts.
	     * @param obj the output vector {objX, objY, objZ}, that returns the
	     *        computed object coordinates.
	     * @param objOffset the offset into the obj array where the obj vector data
	     *        starts.
	     * @return A return value of GL10.GL_TRUE indicates success, a return value
	     *         of GL10.GL_FALSE indicates failure.
	     */
	    public static int gluUnProject(float winX, float winY, float winZ,
	            float[] model, int modelOffset, float[] project, int projectOffset,
	            int[] view, int viewOffset, float[] obj, int objOffset) {
	        float[] scratch = sScratch;
	        synchronized(scratch) {
	            final int PM_OFFSET = 0; // 0..15
	            final int INVPM_OFFSET = 16; // 16..31
	               final int V_OFFSET = 0; // 0..3 Reuses PM_OFFSET space
	            Matrix.multiplyMM(scratch, PM_OFFSET, project, projectOffset,
	                    model, modelOffset);

	            if (!Matrix.invertM(scratch, INVPM_OFFSET, scratch, PM_OFFSET)) {
	                return GLES20.GL_FALSE;
	            }

	            scratch[V_OFFSET + 0] =
	                    2.0f * (winX - view[viewOffset + 0]) / view[viewOffset + 2]
	                            - 1.0f;
	            scratch[V_OFFSET + 1] =
	                    2.0f * (winY - view[viewOffset + 1]) / view[viewOffset + 3]
	                            - 1.0f;
	            scratch[V_OFFSET + 2] = 2.0f * winZ - 1.0f;
	            scratch[V_OFFSET + 3] = 1.0f;

	            Matrix.multiplyMV(obj, objOffset, scratch, INVPM_OFFSET,
	                    scratch, V_OFFSET);
	        }

	        return GLES20.GL_TRUE;
	    }

	    private static final float[] sScratch = new float[32];
	
}
