package com.fairyteller.gles20boilerplate;

import com.fairyteller.gles20boilerplate.utils.Vector3f;

public class Camera {
	
	static final int BUFFER_LENGTH = 9;
	
	Vector3f eye;
	Vector3f lookAt;
	Vector3f upDirection;
	
	public Camera(DataHolder data) {
		this.eye = new Vector3f(data.cameraBuffer, 0);
		this.lookAt = new Vector3f(data.cameraBuffer, 3);
		this.upDirection = new Vector3f(data.cameraBuffer, 6);
	}
	
	public Vector3f getEye() {
		return eye;
	}
	
	public Vector3f getLookAt() {
		return lookAt;
	}
	
	public Vector3f getUpDirection() {
		return upDirection;
	}
	
	public void setEye(Vector3f eye) {
		this.eye = eye;
	}
	
	public void setLookAt(Vector3f lookAt) {
		this.lookAt = lookAt;
	}
	
	public void setUpDirection(Vector3f upDirection) {
		this.upDirection = upDirection;
	}
}
