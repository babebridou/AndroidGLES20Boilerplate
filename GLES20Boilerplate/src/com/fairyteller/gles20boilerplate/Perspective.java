package com.fairyteller.gles20boilerplate;

import com.fairyteller.gles20boilerplate.utils.Vector3f;
import com.fairyteller.gles20boilerplate.utils.VectorNf;

public class Perspective {
	
	static final int BUFFER_LENGTH = 9;
	
	VectorNf frustumPlanes;
	Vector3f widthHeightRatio; 
	
	public Perspective(DataHolder data) {
		this.frustumPlanes = new VectorNf(data.perspectiveBuffer, 0, 6);
		this.widthHeightRatio = new Vector3f(data.perspectiveBuffer, 6);
	}
	
	public final float getWidth() {
		return this.widthHeightRatio.getX();
	}
	public final float getHeight() {
		return this.widthHeightRatio.getY();
	}
	public final float getRatio() {
		return this.widthHeightRatio.getZ();
	}
	public final float getFrustumPlaneLeft() {
		return this.frustumPlanes.get(0);
	}
	public final float getFrustumPlaneRight() {
		return this.frustumPlanes.get(1);
	}
	public final float getFrustumPlaneBottom() {
		return this.frustumPlanes.get(2);
	}
	public final float getFrustumPlaneTop() {
		return this.frustumPlanes.get(3);
	}
	public final float getFrustumPlaneNear() {
		return this.frustumPlanes.get(4);
	}
	public final float getFrustumPlaneFar() {
		return this.frustumPlanes.get(5);
	}
	
	public void computeFrustum(int width, int height){
		computeFrustum(width, height, 10.0f, 0.1f, 0.1f, 100f);
	}
	
	public void computeFrustum(int width, int height, float leftRightRatio, float topBottomRatio, float near, float far){
		this.widthHeightRatio.setX((float)width);
		this.widthHeightRatio.setY((float)height);
		this.widthHeightRatio.setZ(getWidth() / getHeight());
		this.frustumPlanes.set(0, - getRatio() / leftRightRatio);
		this.frustumPlanes.set(1, getRatio() / leftRightRatio);
		this.frustumPlanes.set(2, topBottomRatio);
		this.frustumPlanes.set(3, -topBottomRatio);
		this.frustumPlanes.set(4, near);
		this.frustumPlanes.set(5, far);
	}
}
