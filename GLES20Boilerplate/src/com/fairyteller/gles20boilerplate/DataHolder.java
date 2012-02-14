package com.fairyteller.gles20boilerplate;

public class DataHolder {

	float[] viewMatrix = new float[16];
	float[] projectionMatrix = new float[16];
	float[] modelViewMatrix = new float[16];
	float[] modelViewProjectionMatrix = new float[16];
	float[] normalMatrix = new float[16];
	
	//characteristics
	public float[] translateMatrix = new float[16];
	public float[] rotationMatrix = new float[16];
	public float[] scaleMatrix = new float[16];
	
	//intermediate calculation results
	public float[] rotationScaleMatrix = new float[16];
	public float[] translateRotationScaleMatrix = new float[16];
	public float[] invertMvpMatrix = new float[16];
	
	// buffers for invert
	public float[] invertSrcMatrix = new float[16];
	public float[] invertTmpMatrix = new float[16];
	public float[] invertDstMatrix = new float[16];
	
	// buffer for rotate
	public float[] tempRotationMatrix = new float[32];
	
	
	float[] cameraBuffer = new float[Camera.BUFFER_LENGTH];
	float[] perspectiveBuffer = new float[Perspective.BUFFER_LENGTH];
	
	
	
	public int[] programHandlers = new int[]{
			
	};
	
	public float[] getProjectionMatrix() {
		return projectionMatrix;
	}
	public float[] getModelViewMatrix() {
		return modelViewMatrix;
	}
	public float[] getViewMatrix() {
		return viewMatrix;
	}
	
	public float[] getModelViewProjectionMatrix() {
		return modelViewProjectionMatrix;
	}
	
	public float[] getNormalMatrix() {
		return normalMatrix;
	}
	public float[] getCameraBuffer() {
		return cameraBuffer;
	}
	public float[] getPerspectiveBuffer() {
		return perspectiveBuffer;
	}
	
}

