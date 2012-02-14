package com.fairyteller.gles20boilerplate;

import android.content.Context;

import com.fairyteller.gles20boilerplate.material.Material;
import com.fairyteller.gles20boilerplate.shaders.Programs;
import com.fairyteller.gles20boilerplate.shaders.Shader;

public interface OpenGLDelegate {

	public void computeProjectionMatrix(DataHolder data, int viewPortWidth, int viewPortHeight, Perspective perspective);
	
	public void computeViewMatrix(DataHolder data, Camera camera);
	
	public void computeModelViewProjectionMatrix(DataHolder data, ObjectInstance object);
	
	public void registerShaderHandlers(int glProgramId, int[] materialHandlers, int[] programHandlers);
	
	public int loadShader(int shaderType, String source);
	
	public int createProgram(Shader vertexS, Shader fragmentS);
	
	public void checkGlError(String op);
	
	public boolean prepareMaterialPrograms(Material material, Programs programs, DataHolder data);
	
	public boolean prepareMaterialTextures(Material material, Context context);
	
	public void enableVertexAttribArrays(DataHolder data);
	public void disableVertexAttribArrays(DataHolder data);
	
	public void bindUniforms(Material material, Camera camera, Light light, DataHolder data);
}
