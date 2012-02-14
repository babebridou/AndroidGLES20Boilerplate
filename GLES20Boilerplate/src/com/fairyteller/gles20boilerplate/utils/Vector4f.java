package com.fairyteller.gles20boilerplate.utils;

import java.nio.FloatBuffer;

public class Vector4f {
	public static final int LENGTH = 4;
	public static final int LENGTH_BYTES = LENGTH * Useful.FLOAT_SIZE_BYTES;

	float[] buffer;
	int offset;
	
	public Vector4f(float[] buffer, int offset) {
		this.buffer = buffer;
		this.offset = offset;
	}
	
	public float getR(){
		return buffer[0+offset];
	}
	
	public float getG(){
		return buffer[1+offset];
	}
	
	public float getB(){
		return buffer[2+offset];
	}
	
	public float getA(){
		return buffer[3+offset];
	}
	
	public void setR(float r){
		buffer[0+offset] = r;
	}
	
	public void setG(float g){
		buffer[1+offset] = g;
	}
	
	public void setB(float b){
		buffer[2+offset] = b;
	}
	
	public void setA(float a){
		buffer[3+offset] = a;
	}
	
	public float[] getBuffer() {
		return buffer;
	}
	
	public int getOffset() {
		return offset;
	}
	
	public static int getLength() {
		return LENGTH;
	}
	
	public void appendToFloatBuffer(FloatBuffer floatBuffer){
		floatBuffer.put(this.buffer, offset, LENGTH);
	}
	
}
