package com.fairyteller.fairy3d.scene;

public class Instance3D {

	private Object3D obj;
	
	private Transform3D origin;
	
	private Transform3D transform;

	public Object3D getObj() {
		return obj;
	}

	public void setObj(Object3D obj) {
		this.obj = obj;
	}

	public Transform3D getOrigin() {
		return origin;
	}

	public void setOrigin(Transform3D origin) {
		this.origin = origin;
	}

	public Transform3D getTransform() {
		return transform;
	}

	public void setTransform(Transform3D transform) {
		this.transform = transform;
	}
	
	
}
