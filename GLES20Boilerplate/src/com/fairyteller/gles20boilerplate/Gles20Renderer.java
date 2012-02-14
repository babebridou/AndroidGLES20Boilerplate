package com.fairyteller.gles20boilerplate;

import java.util.ArrayList;
import java.util.List;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView;

import com.fairyteller.gles20boilerplate.android.AndroidGLES20Delegate;
import com.fairyteller.gles20boilerplate.material.Material;
import com.fairyteller.gles20boilerplate.material.Texture;
import com.fairyteller.gles20boilerplate.object.ObjectDefinition;
import com.fairyteller.gles20boilerplate.object.VertexBufferObject;
import com.fairyteller.gles20boilerplate.shaders.Programs;

public class Gles20Renderer implements GLSurfaceView.Renderer {

	Context context;
	MaterialFactory materialFactory;
	ObjectDefinitionFactory objectDefinitionFactory;
	Programs programs;
	
	DataHolder data;

	Camera camera;
	
	Perspective perspective;
	
	List<Material> materials;
	List<Texture> textures;
	ObjectDefinition object;
	VertexBufferObject vbo;
	
	Light light;
	
	ObjectInstance instance;
	
	OpenGLDelegate glDelegate;
	
	public Gles20Renderer(Context context) {
		this.context = context;
		data = new DataHolder();
		camera = new Camera(data);
		perspective = new Perspective(data);
		glDelegate = new AndroidGLES20Delegate();
		programs = new Programs(context);
		light = new Light();
		initMaterials();
		initObjects();
		initInstances();
	}
	
	private void initMaterials(){
		materialFactory = new MaterialFactory();
		Material flatGreen = materialFactory.newFlatGreen();
		materials = new ArrayList<Material>();
		flatGreen.setMaterialId(materials.size());
		materials.add(flatGreen);
	}
	
	private void initObjects(){
		objectDefinitionFactory = new ObjectDefinitionFactory();
		object = objectDefinitionFactory.newRect(materials.get(0));
		vbo = new VertexBufferObject();
		vbo.setDefinition(object);
		vbo.recomputeVBO();
	}
	
	private void initInstances(){
		instance = new ObjectInstance(object);
		instance.scaleUniform(1.0f);
		instance.setPositionX(0.0f);
		instance.setPositionY(0.0f);
		instance.setPositionZ(0.0f);
	}
	
	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		
	}
	
	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		//compute projection matrix
		glDelegate.computeProjectionMatrix(data, width, height, perspective);
	}
	
	@Override
	public void onDrawFrame(GL10 gl) {
		//position camera
		//compute view matrix
		//
		//sort materials to render
		//for each material, sort instances
			//for each instance*material
				//compute modelview matrix
				//prepare all the shaders
				//buffer all the textures
					//for each program
						//bind attribs and uniforms
						//buffer all the vbos
						//drawelements
						//cleanup attribs
		
		camera.getEye().setX(0.0f);
		camera.getEye().setY(0.0f);
		camera.getEye().setZ(0.0f);
		camera.getLookAt().setX(0.0f);
		camera.getLookAt().setY(0.0f);
		camera.getLookAt().setZ(-1.0f);
		camera.getUpDirection().setX(0.0f);
		camera.getUpDirection().setY(1.0f);
		camera.getUpDirection().setZ(0.0f);
		
		glDelegate.computeViewMatrix(data, camera);
		
		//select a material
		Material material = materials.get(0);
		//prepare material
		boolean ready = glDelegate.prepareMaterialPrograms(material, programs, data);
		ready = ready && glDelegate.prepareMaterialTextures(material, context);
		if(ready){
			//select an instance
			glDelegate.computeModelViewProjectionMatrix(data, instance);
			int programCount = material.getProgramIds().size(); 
			int[] appHandlers = data.programHandlers;
			
			for(int i = 0;i<programCount;i++){
				//bind uniforms
				glDelegate.enableVertexAttribArrays(data);
				glDelegate.bindUniforms(material, camera, light, data);
				
				//build vbo if it doesn't exist
				//bind attribs
				//draw elements
				//cleanup
			}
			//cleanup material
		}
	}
}
