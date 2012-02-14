package com.fairyteller.gles20boilerplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fairyteller.gles20boilerplate.material.Material;
import com.fairyteller.gles20boilerplate.object.Face;
import com.fairyteller.gles20boilerplate.object.ObjectDefinition;
import com.fairyteller.gles20boilerplate.utils.Vector2f;
import com.fairyteller.gles20boilerplate.utils.Vector3f;

public class ObjectDefinitionFactory {

	private static final Vector3f UPPERLEFT_VERTEX = new Vector3f(new float[3], 0);
	private static final Vector3f LOWERLEFT_VERTEX = new Vector3f(new float[3], 0);
	private static final Vector3f UPPERRIGHT_VERTEX = new Vector3f(new float[3], 0);
	private static final Vector3f LOWERRIGHT_VERTEX = new Vector3f(new float[3], 0);
	
	private static final Vector2f UPPERLEFT_UV = new Vector2f(new float[2], 0);
	private static final Vector2f LOWERLEFT_UV = new Vector2f(new float[2], 0);
	private static final Vector2f UPPERRIGHT_UV = new Vector2f(new float[2], 0);
	private static final Vector2f LOWERRIGHT_UV = new Vector2f(new float[2], 0);
	
	private static final Vector3f NORMAL_2D = new Vector3f(new float[3], 0);
	
	static{
		
		UPPERLEFT_VERTEX.setX(-1.0f);
		UPPERLEFT_VERTEX.setY(1.0f);
		UPPERLEFT_VERTEX.setZ(0.0f);
		
		UPPERRIGHT_VERTEX.setX(1.0f);
		UPPERRIGHT_VERTEX.setY(1.0f);
		UPPERRIGHT_VERTEX.setZ(0.0f);
		
		LOWERLEFT_VERTEX.setX(-1.0f);
		LOWERLEFT_VERTEX.setY(-1.0f);
		LOWERLEFT_VERTEX.setZ(0.0f);
		
		LOWERRIGHT_VERTEX.setX(1.0f);
		LOWERRIGHT_VERTEX.setY(-1.0f);
		LOWERRIGHT_VERTEX.setZ(0.0f);
		
		UPPERLEFT_UV.setU(0.0f);
		UPPERLEFT_UV.setV(0.0f);
		
		UPPERRIGHT_UV.setU(1.0f);
		UPPERRIGHT_UV.setV(0.0f);
		
		LOWERLEFT_UV.setU(0.0f);
		LOWERLEFT_UV.setV(1.0f);
		
		LOWERRIGHT_UV.setU(1.0f);
		LOWERRIGHT_UV.setV(1.0f);
		
		NORMAL_2D.setX(0.0f);
		NORMAL_2D.setY(0.0f);
		NORMAL_2D.setZ(1.0f);
	}
	
	
	public ObjectDefinition newRect(Material material){
		ObjectDefinition obj = new ObjectDefinition();
		
		Vector3f ul = new Vector3f(new float[3], 0);
		Vector3f ur = new Vector3f(new float[3], 0);
		Vector3f ll = new Vector3f(new float[3], 0);
		Vector3f lr = new Vector3f(new float[3], 0);
		UPPERLEFT_VERTEX.pasteValues(ul);
		UPPERRIGHT_VERTEX.pasteValues(ur);
		LOWERLEFT_VERTEX.pasteValues(ll);
		LOWERRIGHT_VERTEX.pasteValues(lr);
		List<Vector3f> vertices = Arrays.asList(new Vector3f[]{ul, ll, lr, ur});
		
		Vector2f ult = new Vector2f(new float[2], 0);
		Vector2f urt = new Vector2f(new float[2], 0);
		Vector2f llt = new Vector2f(new float[2], 0);
		Vector2f lrt = new Vector2f(new float[2], 0);
		
		UPPERLEFT_UV.pasteValues(ult);
		UPPERRIGHT_UV.pasteValues(urt);
		LOWERLEFT_UV.pasteValues(llt);
		LOWERRIGHT_UV.pasteValues(lrt);
		List<Vector2f> uvs =  Arrays.asList(new Vector2f[]{ult, llt, lrt, urt});
		
		
		Vector3f n = new Vector3f(new float[3], 0);
		NORMAL_2D.pasteValues(n);
		List<Vector3f> normals = Arrays.asList(new Vector3f[]{n});
		
		List<Material> materials = new ArrayList<Material>();
		materials.add(material);
		
		Face lowerleftFace = new Face();
		lowerleftFace.setMaterial(materials.indexOf(material));
		lowerleftFace.setV1((short)0);
		lowerleftFace.setV2((short)1);
		lowerleftFace.setV3((short)2);
		lowerleftFace.setVt1((short)0);
		lowerleftFace.setVt2((short)1);
		lowerleftFace.setVt3((short)2);
		lowerleftFace.setVn1((short)0);
		lowerleftFace.setVn2((short)0);
		lowerleftFace.setVn3((short)0);
		
		Face upperrightFace = new Face();
		upperrightFace.setMaterial(materials.indexOf(material));
		upperrightFace.setV1((short)0);
		upperrightFace.setV2((short)2);
		upperrightFace.setV3((short)3);
		upperrightFace.setVt1((short)0);
		upperrightFace.setVt2((short)2);
		upperrightFace.setVt3((short)3);
		upperrightFace.setVn1((short)0);
		upperrightFace.setVn2((short)0);
		upperrightFace.setVn3((short)0);
		
		List<Face> faces = Arrays.asList(new Face[]{lowerleftFace, upperrightFace});
		
		obj.setFaces(faces);
		obj.setUvs(uvs);
		obj.setNormals(normals);
		obj.setVertices(vertices);
		
		obj.setMaterials(materials);
		return obj;
	}
}
