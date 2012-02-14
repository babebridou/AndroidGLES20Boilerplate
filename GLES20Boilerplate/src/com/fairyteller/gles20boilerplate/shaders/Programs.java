package com.fairyteller.gles20boilerplate.shaders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.opengl.GLES20;

import com.fairyteller.gles20boilerplate.OpenGLDelegate;
import com.fairyteller.gles20boilerplate.material.Material;


public class Programs {
	protected Map<Integer, int[]> programs;
	protected List<Shader> shaders;
	private Context context;
	
	public Programs(Context context) {
		this.context = context;
	}
	
	public void markAllShaderCodeAsDirty(){
		if (shaders != null) {
			for (Shader shader : shaders) {
				GLES20.glDeleteShader(shader.getShaderGlId());
			}
		}
		if (programs != null) {
			for (Integer i : programs.keySet()) {
				GLES20.glDeleteProgram(i);
			}
		}
		programs = null;
		shaders = null;
	}
	
	private Shader getShader(int shaderId){
		if(shaders==null){
			shaders = new ArrayList<Shader>();
		}
		if(shaders.size()>shaderId){
			return shaders.get(shaderId);
		}
		return null;
	}
	
	public void createPrograms(Material material, OpenGLDelegate delegate){
		int materialProgramCount = material.getVertexShaderRawIds().size();
		for(int i = 0; i<materialProgramCount;i++){
			int vertexShaderRepositoryId = registerShader(material.getVertexShaderRawIds().get(i));
			int fragmentShaderRepositoryId = registerShader(material.getFragmentShaderRawIds().get(i));
			Shader vertexS = getShader(vertexShaderRepositoryId);
	        Shader fragmentS = getShader(fragmentShaderRepositoryId);
			int programId = delegate.createProgram(vertexS, fragmentS);
			material.getProgramIds().add(programId);
			if(programs==null){
				programs = new HashMap<Integer, int[]>();
			}
			programs.put(programId, new int[]{vertexShaderRepositoryId, fragmentShaderRepositoryId});
		}
	}
	
	
	private int registerShader(int shaderRawId){
		if(shaders==null){
			shaders = new ArrayList<Shader>();
		}
		Shader shader = new Shader(shaderRawId, context);
		int shaderCount = shaders.size();
		shaders.add(shader);
		return shaderCount;
	}
	
	public Shader getFragmentShader(int programId){
		int[] entries = programs.get(programId);
		return shaders.get(entries[0]);
	}
	
	public Shader getVertexShader(int programId){
		int[] entries = programs.get(programId);
		return shaders.get(entries[1]);
	}
}
