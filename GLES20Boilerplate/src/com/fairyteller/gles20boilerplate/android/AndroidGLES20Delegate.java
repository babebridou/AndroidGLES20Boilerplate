package com.fairyteller.gles20boilerplate.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;

import com.fairyteller.gles20boilerplate.Camera;
import com.fairyteller.gles20boilerplate.DataHolder;
import com.fairyteller.gles20boilerplate.Light;
import com.fairyteller.gles20boilerplate.ObjectInstance;
import com.fairyteller.gles20boilerplate.OpenGLDelegate;
import com.fairyteller.gles20boilerplate.Perspective;
import com.fairyteller.gles20boilerplate.material.Material;
import com.fairyteller.gles20boilerplate.material.Texture;
import com.fairyteller.gles20boilerplate.shaders.HandlerDefinitions;
import com.fairyteller.gles20boilerplate.shaders.Programs;
import com.fairyteller.gles20boilerplate.shaders.Shader;
import com.fairyteller.gles20boilerplate.utils.Matrix;

public class AndroidGLES20Delegate implements OpenGLDelegate{

private static final String TAG = "OpenGLDelegate";
	
	public void computeProjectionMatrix(DataHolder data, int viewPortWidth, int viewPortHeight, Perspective perspective){
		GLES20.glViewport(0, 0, viewPortWidth, viewPortHeight);
		perspective.computeFrustum(viewPortWidth, viewPortHeight);
		Matrix.frustumM(data.getProjectionMatrix(), 0,
				perspective.getFrustumPlaneLeft(),
				perspective.getFrustumPlaneRight(),
				perspective.getFrustumPlaneBottom(),
				perspective.getFrustumPlaneTop(),
				perspective.getFrustumPlaneNear(),
				perspective.getFrustumPlaneFar());
	}
	
	public void computeViewMatrix(DataHolder data, Camera camera){
		Matrix.setLookAtM(data.getViewMatrix(), 0, camera.getEye().getX(),
				camera.getEye().getY(), camera.getEye().getZ(), camera.getLookAt().getX(),
				camera.getLookAt().getY(), camera.getLookAt().getZ(),
				camera.getUpDirection().getX(), camera.getUpDirection().getY(),
				camera.getUpDirection().getZ());
	}
	
	
	public void computeModelViewProjectionMatrix(DataHolder data, ObjectInstance object){
		Matrix.setIdentityM(data.translateMatrix, 0);
		Matrix.translateM(data.translateMatrix, 0, object.getPositionX(), object.getPositionY(), object.getPositionZ());
		
		Matrix.setIdentityM(data.scaleMatrix, 0);
		Matrix.scaleM(data.scaleMatrix, 0, object.getScaleX(), object.getScaleY(),object.getScaleZ());
		
		Matrix.setIdentityM(data.rotationMatrix, 0);
		Matrix.myRotateM(data.rotationMatrix, 0, object.getRotationX(), 1, 0, 0, data.tempRotationMatrix);
		Matrix.myRotateM(data.rotationMatrix, 0, object.getRotationY(), 0, 1, 0, data.tempRotationMatrix);
		Matrix.myRotateM(data.rotationMatrix, 0, object.getRotationZ(), 0, 0, 1, data.tempRotationMatrix);
		
		Matrix.multiplyMM(data.rotationScaleMatrix, 0, data.rotationMatrix, 0,
				data.scaleMatrix, 0);
		Matrix.multiplyMM(data.translateRotationScaleMatrix, 0, data.translateMatrix, 0, data.rotationScaleMatrix, 0);
		Matrix.multiplyMM(data.getModelViewMatrix(), 0, data.getViewMatrix(), 0, data.translateRotationScaleMatrix, 0);
		Matrix.multiplyMM(data.getModelViewProjectionMatrix(), 0, data.getProjectionMatrix(), 0, data.getModelViewMatrix(), 0);
		Matrix.myInvertM(data.invertMvpMatrix, 0, data.getModelViewProjectionMatrix(), 0, data.invertSrcMatrix,
				data.invertTmpMatrix, data.invertDstMatrix);
		Matrix.transposeM(data.getNormalMatrix(), 0, data.invertMvpMatrix, 0);
	}
	
	public void registerShaderHandlers(int glProgramId, int[] materialHandlers, int[] programHandlers) {
		for (int i = 0; i < materialHandlers.length; i++) {
			int handlerIndex = materialHandlers[i];
			if (programHandlers[handlerIndex] == 0) {
				switch (handlerIndex) {
				case HandlerDefinitions.attribPositionV4Handler:
					programHandlers[handlerIndex] = GLES20.glGetAttribLocation(glProgramId,
							HandlerDefinitions.attribPositionV4String);
					break;
				case HandlerDefinitions.attribTextureV2Handler:
					programHandlers[handlerIndex] = GLES20.glGetAttribLocation(glProgramId,
							HandlerDefinitions.attribTextureV2String);
					break;
				case HandlerDefinitions.uniformMVPMatrixHandler:
					programHandlers[handlerIndex] = GLES20.glGetUniformLocation(glProgramId,
							HandlerDefinitions.uniformMVPMatrixString);
					break;
				case HandlerDefinitions.attribNormalV4Handler:
					programHandlers[handlerIndex] = GLES20.glGetAttribLocation(glProgramId,
							HandlerDefinitions.attribNormalV4String);
					break;
				case HandlerDefinitions.uniformEyePosV3Handler:
					programHandlers[handlerIndex] = GLES20.glGetUniformLocation(glProgramId,
							HandlerDefinitions.uniformEyePosV3String);
					break;
				case HandlerDefinitions.uniformLightColorV4Handler:
					programHandlers[handlerIndex] = GLES20.glGetUniformLocation(glProgramId,
							HandlerDefinitions.uniformLightColorV4String);
					break;
				case HandlerDefinitions.uniformLightPosV4Handler:
					programHandlers[handlerIndex] = GLES20.glGetUniformLocation(glProgramId,
							HandlerDefinitions.uniformLightPosV4String);
					break;
				case HandlerDefinitions.uniformMatAmbientV4Handler:
					programHandlers[handlerIndex] = GLES20.glGetUniformLocation(glProgramId,
							HandlerDefinitions.uniformMatAmbientV4String);
					break;
				case HandlerDefinitions.uniformMatDiffuseV4Handler:
					programHandlers[handlerIndex] = GLES20.glGetUniformLocation(glProgramId,
							HandlerDefinitions.uniformMatDiffuseV4String);
					break;
				case HandlerDefinitions.uniformMatShininessFloatHandler:
					programHandlers[handlerIndex] = GLES20.glGetUniformLocation(glProgramId,
							HandlerDefinitions.uniformMatShininessFloatString);
					break;
				case HandlerDefinitions.uniformMatSpecularV4Handler:
					programHandlers[handlerIndex] = GLES20.glGetUniformLocation(glProgramId,
							HandlerDefinitions.uniformMatSpecularV4String);
					break;
				case HandlerDefinitions.uniformNormalMatrixHandler:
					programHandlers[handlerIndex] = GLES20.glGetUniformLocation(glProgramId,
							HandlerDefinitions.uniformNormalMatrixString);
					break;
				}
			}
		}
	}
	
	public int loadShader(int shaderType, String source) {
		checkGlError("loadShader startup " + source);
        int shader = GLES20.glCreateShader(shaderType);
        if (shader != 0) {
            GLES20.glShaderSource(shader, source);
            checkGlError("glShaderSource "+shader);
            GLES20.glCompileShader(shader);
            checkGlError("glCompileShader "+shader);
            int[] compiled = new int[1];
            GLES20.glGetShaderiv(shader, GLES20.GL_COMPILE_STATUS, compiled, 0);
            checkGlError("glGetShaderiv "+shader);
            if (compiled[0] == 0) {
                Log.e("Shader", "Could not compile shader " + shaderType + ":");
                Log.e("Shader", GLES20.glGetShaderInfoLog(shader));
                GLES20.glDeleteShader(shader);
                checkGlError("glDeleteShader "+shader);
                shader = 0;
            }
        }
        return shader;
    }
	
	public int createProgram(Shader vertexS, Shader fragmentS){
        int vertexGlId = loadShader(GLES20.GL_VERTEX_SHADER, vertexS.getShaderString());
        checkGlError("glAttachShader GL_VERTEX_SHADER " + vertexGlId);
        if (vertexGlId == 0) {
            return 0;
        }
        vertexS.setShaderGlId(vertexGlId);
        // pixel shader
        int fragmentGlId = loadShader(GLES20.GL_FRAGMENT_SHADER, fragmentS.getShaderString());
        checkGlError("glAttachShader GL_FRAGMENT_SHADER " + fragmentGlId);
        if (fragmentGlId == 0) {
            return 0;
        }
        fragmentS.setShaderGlId(fragmentGlId);
        // Create the program
        int programId = GLES20.glCreateProgram();
        if (programId != 0) {
            GLES20.glAttachShader(programId, vertexGlId);
            checkGlError("glAttachShader VS ");
            GLES20.glAttachShader(programId, fragmentGlId);
            checkGlError("glAttachShader PS");
            GLES20.glLinkProgram(programId);
            int[] linkStatus = new int[1];
            GLES20.glGetProgramiv(programId, GLES20.GL_LINK_STATUS, linkStatus, 0);
            if (linkStatus[0] != GLES20.GL_TRUE) {
                Log.e("Shader", "Could not link _program: ");
                Log.e("Shader", GLES20.glGetProgramInfoLog(programId));
                GLES20.glDeleteProgram(programId);
                programId = 0;
                return 0;
            }
        }
        else{
        	Log.d("CreateProgram", "Could not create program");
        	checkGlError("let's see");
        }
        return programId;
	}
	
	
	public void checkGlError(String op) {
		int error;
		while ((error = GLES20.glGetError()) != GLES20.GL_NO_ERROR) {
			Log.e(TAG, op + ": glError " + error);
			throw new RuntimeException(op + ": glError " + error);
		}
	}
	
	public boolean prepareMaterialPrograms(Material material, Programs programs, DataHolder data) {
		if(material.getProgramIds()==null)
			return false;
		int programCount = material.getProgramIds().size();
		boolean allIsWell = true;
		if(programCount>0){
			for(int i = 0; i<programCount;i++){
				int programId = material.getProgramIds().get(i);
				if(programId<=0){
					programs.createPrograms(material, this);
					registerShaderHandlers(programId, material.getMaterialHandlers().get(i), data.programHandlers);
				}
				if(material.getProgramIds().get(i)<=0){
					allIsWell = false;
				}
			}
		}
		return allIsWell;
	}
	
	@Override
	public boolean prepareMaterialTextures(Material material, Context context) {
		Texture map_kd = material.getMapKDiffuseColor();
		boolean ready = loadTexture(map_kd, context);
		return ready;
	}
	
	public boolean loadTexture(Texture texture, Context context){
		if(texture==null)
			return true;
		if(texture.isReady())
			return true;
		Bitmap bitmap = texture.getBitmap(context);
		int[] textures = new int[1];
		GLES20.glGenTextures(1, textures, 0);
		texture.setGlId(textures[0]);
		GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, texture.getGlId());
		GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D,
				GLES20.GL_TEXTURE_MIN_FILTER, GLES20.GL_LINEAR);
		GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D,
				GLES20.GL_TEXTURE_MAG_FILTER, GLES20.GL_LINEAR);
		GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D,
				GLES20.GL_TEXTURE_WRAP_S, GLES20.GL_CLAMP_TO_EDGE);
		GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D,
				GLES20.GL_TEXTURE_WRAP_T, GLES20.GL_CLAMP_TO_EDGE);
		GLUtils.texImage2D(GLES20.GL_TEXTURE_2D, 0, bitmap, 0);
		bitmap.recycle();
		texture.setReady(true);
		textures = null;
		return false;
	}
	
	@Override
	public void enableVertexAttribArrays(DataHolder data) {
		int[] appHandlers = data.programHandlers;
		GLES20.glEnableVertexAttribArray(appHandlers[HandlerDefinitions.attribPositionV4Handler]);
		GLES20.glEnableVertexAttribArray(appHandlers[HandlerDefinitions.attribTextureV2Handler]);
		GLES20.glEnableVertexAttribArray(appHandlers[HandlerDefinitions.attribNormalV4Handler]);
	}

	@Override
	public void disableVertexAttribArrays(DataHolder data) {
		int[] appHandlers = data.programHandlers;
		GLES20.glDisableVertexAttribArray(appHandlers[HandlerDefinitions.attribPositionV4Handler]);
		GLES20.glDisableVertexAttribArray(appHandlers[HandlerDefinitions.attribTextureV2Handler]);
		GLES20.glDisableVertexAttribArray(appHandlers[HandlerDefinitions.attribNormalV4Handler]);
	}
	
	@Override
	public void bindUniforms(Material material, Camera camera, Light light, DataHolder data) {
		int[] appHandlers = data.programHandlers;
		GLES20.glUniformMatrix4fv(
				appHandlers[HandlerDefinitions.uniformMVPMatrixHandler], 1, false,
				data.getModelViewProjectionMatrix(), 0);
		checkGlError("binding uniforms before");
		GLES20.glUniformMatrix4fv(
				appHandlers[HandlerDefinitions.uniformNormalMatrixHandler], 1, false,
				data.getNormalMatrix(), 0);
		checkGlError("binding uniforms normal");
		GLES20.glUniform4fv(appHandlers[HandlerDefinitions.uniformLightColorV4Handler],
				1, light.getLightColor(), 0);
		checkGlError("binding uniforms lightcolor");
		GLES20.glUniform4fv(appHandlers[HandlerDefinitions.uniformLightPosV4Handler],
				1, light.getLightPosition(), 0);
		checkGlError("binding uniforms lightpos");
		GLES20.glUniform3fv(appHandlers[HandlerDefinitions.uniformEyePosV3Handler], 1,
				camera.getEye().getBuffer(), camera.getEye().getOffset());
		checkGlError("binding uniforms eyepos");
		GLES20.glUniform4fv(appHandlers[HandlerDefinitions.uniformMatAmbientV4Handler],
				1, material.getAmbientReflectivity().getBuffer(), material.getAmbientReflectivity().getOffset());
		checkGlError("binding uniforms matambient");
		GLES20.glUniform4fv(appHandlers[HandlerDefinitions.uniformMatDiffuseV4Handler],
				1, material.getDiffuseReflectivity().getBuffer(), material.getDiffuseReflectivity().getOffset());
		checkGlError("binding uniforms matdiffuse");
		GLES20.glUniform4fv(
				appHandlers[HandlerDefinitions.uniformMatSpecularV4Handler], 1,
				material.getSpecularReflectivity().getBuffer(), material.getSpecularReflectivity().getOffset());
		checkGlError("binding uniforms matspecular");
		GLES20.glUniform1f(
				appHandlers[HandlerDefinitions.uniformMatShininessFloatHandler],
				material.getSpecularExponent());
		checkGlError("binding uniforms matshininess");
		checkGlError("binding uniforms after");
	}
}
