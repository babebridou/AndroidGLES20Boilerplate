package com.fairyteller.fairy3d.scene;

public class Transform3D {

	float translateX = 0f;
	float translateY = 0f;
	float translateZ = 0f;
	
	float rotateX = 0f;
	float rotateY = 0f;
	float rotateZ = 0f;
	
	float scaleX = 1f;
	float scaleY = 1f;
	float scaleZ = 1f;
	
	float lookAtX = 0f;
	float lookAtY = 0f;
	float lookAtZ = -1f;
	
	public float getTranslateX() {
		return translateX;
	}
	public void setTranslateX(float translateX) {
		this.translateX = translateX;
	}
	public float getTranslateY() {
		return translateY;
	}
	public void setTranslateY(float translateY) {
		this.translateY = translateY;
	}
	public float getTranslateZ() {
		return translateZ;
	}
	public void setTranslateZ(float translateZ) {
		this.translateZ = translateZ;
	}
	public float getRotateX() {
		return rotateX;
	}
	public void setRotateX(float rotateX) {
		this.rotateX = rotateX;
	}
	public float getRotateY() {
		return rotateY;
	}
	public void setRotateY(float rotateY) {
		this.rotateY = rotateY;
	}
	public float getRotateZ() {
		return rotateZ;
	}
	public void setRotateZ(float rotateZ) {
		this.rotateZ = rotateZ;
	}
	public float getScaleX() {
		return scaleX;
	}
	public void setScaleX(float scaleX) {
		this.scaleX = scaleX;
	}
	public float getScaleY() {
		return scaleY;
	}
	public void setScaleY(float scaleY) {
		this.scaleY = scaleY;
	}
	public float getScaleZ() {
		return scaleZ;
	}
	public void setScaleZ(float scaleZ) {
		this.scaleZ = scaleZ;
	}
	
	
}
