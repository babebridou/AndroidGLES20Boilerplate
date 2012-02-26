package com.fairyteller.fairy3d.scene;

import java.util.List;

public class RenderSet {

	private List<Material3D> materials;
	private Mesh3D mesh;
	public List<Material3D> getMaterials() {
		return materials;
	}
	public void setMaterials(List<Material3D> materials) {
		this.materials = materials;
	}
	public Mesh3D getMesh() {
		return mesh;
	}
	public void setMesh(Mesh3D mesh) {
		this.mesh = mesh;
	}
}
