package com.fairyteller.gles20boilerplate;

import java.util.ArrayList;

import com.fairyteller.gles20boilerplate.material.Illumination;
import com.fairyteller.gles20boilerplate.material.Material;
import com.fairyteller.gles20boilerplate.utils.Vector4f;

public class MaterialFactory {

	public Material newFlatGreen(){
		Material material = new Material();
		material.setName("flat_green");
		material.setAmbientReflectivity(new Vector4f(new float[4], 0));
		material.getAmbientReflectivity().setG(1.0f);
		material.setDiffuseReflectivity(new Vector4f(new float[4], 0));
		material.getDiffuseReflectivity().setG(1.0f);
		material.setIlluminationModel(Illumination.getIlluminationModel(1));
		material.setVertexShaderRawIds(new ArrayList<Integer>());
		material.setFragmentShaderRawIds(new ArrayList<Integer>());
		material.setProgramIds(new ArrayList<Integer>());
		material.getVertexShaderRawIds().add(R.raw.texturedgouraud_vs);
		material.getFragmentShaderRawIds().add(R.raw.texturedgouraud_ps);
		return material;
	}
}
