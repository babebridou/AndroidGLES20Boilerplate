package com.fairyteller.gles20boilerplate.object;

import java.util.List;

import com.fairyteller.gles20boilerplate.material.Material;
import com.fairyteller.gles20boilerplate.utils.Vector2f;
import com.fairyteller.gles20boilerplate.utils.Vector3f;

public class ObjectDefinition {

	List<Vector3f> vertices;
	List<Vector3f> normals;
	List<Vector2f> uvs;
	List<Face> faces;
	
	List<Material> materials;

	public List<Vector3f> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vector3f> vertices) {
		this.vertices = vertices;
	}

	public List<Vector3f> getNormals() {
		return normals;
	}

	public void setNormals(List<Vector3f> normals) {
		this.normals = normals;
	}

	public List<Vector2f> getUvs() {
		return uvs;
	}

	public void setUvs(List<Vector2f> uvs) {
		this.uvs = uvs;
	}

	public List<Face> getFaces() {
		return faces;
	}

	public void setFaces(List<Face> faces) {
		this.faces = faces;
	}

	public List<Material> getMaterials() {
		return materials;
	}

	public void setMaterials(List<Material> materials) {
		this.materials = materials;
	}
	
	
}
