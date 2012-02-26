package com.fairyteller.fairy3d.scene;

public abstract class Texture2D {

	boolean ready;
	int glTextureId;
	String name;
	public void setReady(boolean ready) {
		this.ready = ready;
	}
	
	public void setGlTextureId(int glTextureId) {
		this.glTextureId = glTextureId;
	}
	
	public boolean isReady() {
		return ready;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getGlTextureId() {
		return glTextureId;
	}
}
