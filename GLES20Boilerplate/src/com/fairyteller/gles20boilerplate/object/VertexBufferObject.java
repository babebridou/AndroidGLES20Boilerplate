package com.fairyteller.gles20boilerplate.object;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.List;

import android.util.SparseArray;

import com.fairyteller.gles20boilerplate.material.Material;
import com.fairyteller.gles20boilerplate.utils.Useful;
import com.fairyteller.gles20boilerplate.utils.Vector2f;
import com.fairyteller.gles20boilerplate.utils.Vector3f;


public class VertexBufferObject {

	ObjectDefinition definition;
	
	// will be built after sending to gl
	int gl_vboId = -1;
	int gl_iboId = -1;
	
	SparseArray<MaterialIndices> materialOffsets;
	
	FloatBuffer vertexBuffer;
	ShortBuffer indiceBuffer;
	
	public void recomputeVBO(){
		materialOffsets = new SparseArray<MaterialIndices>();
		int floatBufferSize = 8*3*definition.faces.size();
		int intBufferSize = 3*3*definition.faces.size();
		vertexBuffer = ByteBuffer
				.allocateDirect(floatBufferSize * Useful.FLOAT_SIZE_BYTES)
				.order(ByteOrder.nativeOrder()).asFloatBuffer();
		indiceBuffer = ByteBuffer
				.allocateDirect(intBufferSize * Useful.SHORT_SIZE_BYTES)
				.order(ByteOrder.nativeOrder()).asShortBuffer();
		
		build(vertexBuffer, indiceBuffer);
		this.gl_iboId = -1;
		this.gl_iboId = -1;
	}
	
	private void build(FloatBuffer vertexBuffer, ShortBuffer indexBuffer){
		List<Face> faces = definition.faces;
		List<Vector3f> verts = definition.vertices;
		List<Vector2f> uvs = definition.uvs;
		List<Vector3f> normals = definition.normals;
		List<Material> materials = definition.materials;
		
		int facecount = faces.size();
		MaterialIndices currentMaterialIndices = null;
		
		for(int i = 0; i<facecount;i++){
			short currentIndex = (short)indexBuffer.position();
			Face face = faces.get(i);
			Material faceMaterial = materials.get(face.material);
			if (currentMaterialIndices == null
					|| currentMaterialIndices.materialId != faceMaterial
							.getMaterialId()) {
				if (currentMaterialIndices != null) {
					currentMaterialIndices.setMaterialLength(currentIndex
							- currentMaterialIndices.getMaterialOffset());
				}
				currentMaterialIndices = new MaterialIndices();
				currentMaterialIndices.setMaterialId(faceMaterial
						.getMaterialId());
				currentMaterialIndices.setMaterialOffset(currentIndex);
				materialOffsets.put(currentMaterialIndices.getMaterialId(),
						currentMaterialIndices);
				
			}
			//pump it up
			Vector3f v1 = verts.get(face.v1);
			v1.appendToFloatBuffer(vertexBuffer);
			indexBuffer.put(currentIndex++);
			
			Vector2f vt1 = uvs.get(face.vt1);
			vt1.appendToFloatBuffer(vertexBuffer);
			indexBuffer.put(currentIndex++);
			
			Vector3f vn1 = normals.get(face.vn1);
			vn1.appendToFloatBuffer(vertexBuffer);
			indexBuffer.put(currentIndex++);
			
			Vector3f v2 = verts.get(face.v2);
			v2.appendToFloatBuffer(vertexBuffer);
			indexBuffer.put(currentIndex++);
			
			Vector2f vt2 = uvs.get(face.vt2);
			vt2.appendToFloatBuffer(vertexBuffer);
			indexBuffer.put(currentIndex++);
			
			Vector3f vn2 = normals.get(face.vn2);
			vn2.appendToFloatBuffer(vertexBuffer);
			indexBuffer.put(currentIndex++);
			
			Vector3f v3 = verts.get(face.v3);
			v3.appendToFloatBuffer(vertexBuffer);
			indexBuffer.put(currentIndex++);
			
			Vector2f vt3 = uvs.get(face.vt3);
			vt3.appendToFloatBuffer(vertexBuffer);
			indexBuffer.put(currentIndex++);
			
			Vector3f vn3 = normals.get(face.vn3);
			vn3.appendToFloatBuffer(vertexBuffer);
			indexBuffer.put(currentIndex++);
		}
		currentMaterialIndices.setMaterialLength(indexBuffer.position()
				- currentMaterialIndices.getMaterialOffset());
	}
	
	public ObjectDefinition getDefinition() {
		return definition;
	}
	public void setDefinition(ObjectDefinition definition) {
		this.definition = definition;
	}

	public int getGl_vboId() {
		return gl_vboId;
	}

	public void setGl_vboId(int gl_vboId) {
		this.gl_vboId = gl_vboId;
	}

	public int getGl_iboId() {
		return gl_iboId;
	}

	public void setGl_iboId(int gl_iboId) {
		this.gl_iboId = gl_iboId;
	}

	public SparseArray<MaterialIndices> getMaterialOffsets() {
		return materialOffsets;
	}

	public void setMaterialOffsets(SparseArray<MaterialIndices> materialOffsets) {
		this.materialOffsets = materialOffsets;
	}

	public FloatBuffer getVertexBuffer() {
		return vertexBuffer;
	}

	public void setVertexBuffer(FloatBuffer vertexBuffer) {
		this.vertexBuffer = vertexBuffer;
	}

	public ShortBuffer getIndiceBuffer() {
		return indiceBuffer;
	}

	public void setIndiceBuffer(ShortBuffer indiceBuffer) {
		this.indiceBuffer = indiceBuffer;
	}
	
}
