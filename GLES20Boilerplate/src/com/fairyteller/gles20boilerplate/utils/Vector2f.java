package com.fairyteller.gles20boilerplate.utils;

import java.nio.FloatBuffer;

public class Vector2f {
	public static final int LENGTH = 2;
	public static final int LENGTH_BYTES = LENGTH * Useful.FLOAT_SIZE_BYTES;

	float[] buffer;
	int offset;

	public Vector2f(float[] buffer, int offset) {
		this.buffer = buffer;
		this.offset = offset;
	}
	
	public float getU() {
		return buffer[0+offset];
	}

	public float getV() {
		return buffer[1+offset];
	}

	public void setU(float u) {
		buffer[0+offset] = u;
	}

	public void setV(float v) {
		buffer[1+offset] = v;
	}

	public void appendToFloatBuffer(FloatBuffer floatBuffer) {
		floatBuffer.put(this.buffer, offset, LENGTH);
	}
	
	public void pasteValues(Vector2f dest){
		dest.setU(getU());
		dest.setV(getV());
		
	}

}
