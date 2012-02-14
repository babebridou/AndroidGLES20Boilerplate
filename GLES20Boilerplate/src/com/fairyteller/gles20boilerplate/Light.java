package com.fairyteller.gles20boilerplate;

public class Light {

	public static final float[] defaultLightPosition = new float[]{0,0,0,0};
	public static final float[] defaultLightColor = new float[]{1,1,1,1};
	
	public float[] getLightColor() {
		return defaultLightColor;
	}
	public float[] getLightPosition() {
		return defaultLightPosition;
	}
}
