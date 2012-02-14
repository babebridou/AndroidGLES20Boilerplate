package com.fairyteller.gles20boilerplate.utils;

import java.nio.FloatBuffer;

public class Vector3f {
	public static final int LENGTH = 3;
	public static final int LENGTH_BYTES = LENGTH * Useful.FLOAT_SIZE_BYTES;

	float[] buffer;
	int offset;
	
	public Vector3f(float[] buffer, int offset) {
		this.buffer = buffer;
		this.offset = offset;
	}
	
	public float getX(){
		return buffer[0+offset];
	}
	
	public float getY(){
		return buffer[1+offset];
	}
	
	public float getZ(){
		return buffer[2+offset];
	}
	
	public void setX(float x){
		buffer[0+offset] = x;
	}
	
	public void setY(float y){
		buffer[1+offset] = y;
	}
	
	public void setZ(float z){
		buffer[2+offset] = z;
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
	
	public void pasteValues(Vector3f dest){
		dest.setX(getX());
		dest.setY(getY());
		dest.setZ(getZ());
	}
	
	public void appendToFloatBuffer(FloatBuffer floatBuffer){
		floatBuffer.put(this.buffer, offset, LENGTH);
	}
	
}
