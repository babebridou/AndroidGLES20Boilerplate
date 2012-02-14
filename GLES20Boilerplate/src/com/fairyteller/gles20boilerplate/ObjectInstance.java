package com.fairyteller.gles20boilerplate;

import com.fairyteller.gles20boilerplate.object.ObjectDefinition;

public class ObjectInstance {
	
	ObjectDefinition pic;
	
	float positionX;
	float positionY;
	float positionZ;
	
	float scaleX;
	float scaleY;
	float scaleZ;
	
	float rotationX;
	float rotationY;
	float rotationZ;
	
	public ObjectInstance(ObjectDefinition object) {
		this.pic = object;
	}
	
	public void scaleUniform(float scaleFactor){
		scaleX = scaleFactor;
		scaleY = scaleFactor;
		scaleZ = scaleFactor;
	}

	public ObjectDefinition getPic() {
		return pic;
	}

	public void setPic(ObjectDefinition pic) {
		this.pic = pic;
	}

	public float getPositionX() {
		return positionX;
	}

	public void setPositionX(float positionX) {
		this.positionX = positionX;
	}

	public float getPositionY() {
		return positionY;
	}

	public void setPositionY(float positionY) {
		this.positionY = positionY;
	}

	public float getPositionZ() {
		return positionZ;
	}

	public void setPositionZ(float positionZ) {
		this.positionZ = positionZ;
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

	public float getRotationX() {
		return rotationX;
	}

	public void setRotationX(float rotationX) {
		this.rotationX = rotationX;
	}

	public float getRotationY() {
		return rotationY;
	}

	public void setRotationY(float rotationY) {
		this.rotationY = rotationY;
	}

	public float getRotationZ() {
		return rotationZ;
	}

	public void setRotationZ(float rotationZ) {
		this.rotationZ = rotationZ;
	}
	
	
}
