package com.fairyteller.fairy3d.scene;

public class M {

	public static float[] viewMatrix = new float[16];
	public static float[] projectionMatrix = new float[16];
	public static float[] modelViewMatrix = new float[16];
	public static float[] modelViewProjectionMatrix = new float[16];
	public static float[] normalMatrix = new float[16];

	// characteristics
	public static float[] translateMatrix = new float[16];
	public static float[] rotationMatrix = new float[16];
	public static float[] scaleMatrix = new float[16];

	// intermediate calculation results
	public static float[] rotationScaleMatrix = new float[16];
	public static float[] translateRotationScaleMatrix = new float[16];
	public static float[] invertMvpMatrix = new float[16];

	// buffers for invert
	public static float[] invertSrcMatrix = new float[16];
	public static float[] invertTmpMatrix = new float[16];
	public static float[] invertDstMatrix = new float[16];

	// buffer for rotate
	public static float[] tempRotationMatrix = new float[32];
}
