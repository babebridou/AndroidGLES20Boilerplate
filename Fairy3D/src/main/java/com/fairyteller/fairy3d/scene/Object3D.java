package com.fairyteller.fairy3d.scene;

public abstract class Object3D {

	public static enum ObjectClass {
		CAMERA, RENDER, PARTICLES
	}
	
	public abstract ObjectClass getObjectClass();
}
