package com.fairyteller.gles20boilerplate.utils;

import java.nio.FloatBuffer;

public class VectorNf {

	int length;
	float[] buffer;
	int offset;
	
	public VectorNf(float[] buffer, int offset, int length) {
		this.length = length;
		this.buffer = buffer;
		this.offset = offset;
	}
	
	public int lengthBytes(){
		return length*Useful.FLOAT_SIZE_BYTES;
	}
	
	public float get(int index){
		return buffer[offset+index];
	}
	
	public void set(int index, float newValue){
		this.buffer[offset+index] = newValue;
	}
	
	public void appendToFloatBuffer(FloatBuffer floatBuffer) {
		floatBuffer.put(this.buffer, offset, length);
	}
}
