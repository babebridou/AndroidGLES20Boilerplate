package com.fairyteller.fairy3d.scene;

import com.fairyteller.fairy3d.utils.Matrix;

public class Perspective3D {

	private float width;
	private float height;
	private float ratio;
	private float frustumPlaneLeft;
	private float frustumPlaneRight;
	private float frustumPlaneBottom;
	private float frustumPlaneTop;
	private float frustumPlaneNear;
	private float frustumPlaneFar;
	private int[] display = new int[4];
	
	

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getRatio() {
		return ratio;
	}

	public void setRatio(float ratio) {
		this.ratio = ratio;
	}

	public float getFrustumPlaneLeft() {
		return frustumPlaneLeft;
	}

	public void setFrustumPlaneLeft(float frustumPlaneLeft) {
		this.frustumPlaneLeft = frustumPlaneLeft;
	}

	public float getFrustumPlaneRight() {
		return frustumPlaneRight;
	}

	public void setFrustumPlaneRight(float frustumPlaneRight) {
		this.frustumPlaneRight = frustumPlaneRight;
	}

	public float getFrustumPlaneBottom() {
		return frustumPlaneBottom;
	}

	public void setFrustumPlaneBottom(float frustumPlaneBottom) {
		this.frustumPlaneBottom = frustumPlaneBottom;
	}

	public float getFrustumPlaneTop() {
		return frustumPlaneTop;
	}

	public void setFrustumPlaneTop(float frustumPlaneTop) {
		this.frustumPlaneTop = frustumPlaneTop;
	}

	public float getFrustumPlaneNear() {
		return frustumPlaneNear;
	}

	public void setFrustumPlaneNear(float frustumPlaneNear) {
		this.frustumPlaneNear = frustumPlaneNear;
	}

	public float getFrustumPlaneFar() {
		return frustumPlaneFar;
	}

	public void setFrustumPlaneFar(float frustumPlaneFar) {
		this.frustumPlaneFar = frustumPlaneFar;
	}
	public int[] getDisplay() {
		return display;
	}
	public void setDisplay(int[] display) {
		this.display = display;
	}
	
	public void computeFrustum(int x, int y, int width, int height, float[] projectionMatrix){
		computeFrustum(x, y, width, height, 10.0f, 0.1f, 0.1f, 100f, projectionMatrix);
	}
	
	public void computeFrustum(int width, int height, float[] projectionMatrix){
		computeFrustum(0, 0, width, height, 10.0f, 0.1f, 0.1f, 100f, projectionMatrix);
	}
	
	public void computeFrustum(int x, int y, int width, int height, float leftRightRatio, float topBottomRatio, float near, float far, float[] projectionMatrix){
		this.width = (float)width;
		this.height = (float)height;
		this.ratio = this.width / this.height;
		this.frustumPlaneLeft = - this.ratio / leftRightRatio;
		this.frustumPlaneRight = this.ratio / leftRightRatio;
		this.frustumPlaneTop = topBottomRatio;
		this.frustumPlaneBottom = - topBottomRatio;
		this.frustumPlaneNear = near;
		this.frustumPlaneFar = far;
		this.display[0]=x;
		this.display[1]=y;
		this.display[2]=width;
		this.display[3]=height;
		
		Matrix.frustumM(projectionMatrix, 0,
				this.getFrustumPlaneLeft(),
				this.getFrustumPlaneRight(),
				this.getFrustumPlaneBottom(),
				this.getFrustumPlaneTop(),
				this.getFrustumPlaneNear(),
				this.getFrustumPlaneFar());
	}
}
