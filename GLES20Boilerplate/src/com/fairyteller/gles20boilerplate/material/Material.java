package com.fairyteller.gles20boilerplate.material;

import java.util.List;

import android.util.SparseArray;

import com.fairyteller.gles20boilerplate.material.Illumination.IlluminationModel;
import com.fairyteller.gles20boilerplate.utils.Vector4f;

public class Material {
	int materialId;
	
	List<Integer> programIds;
	List<Integer> vertexShaderRawIds;
	List<Integer> fragmentShaderRawIds;
	SparseArray<int[]> materialHandlers;
	
	String name;

	/**
		Ka r g b
 	 */
	Vector4f ambientReflectivity;
	/**
	 * Kd r g b
	 */
	Vector4f diffuseReflectivity;
	/**
	 * Ks r g b
	 */
	Vector4f specularReflectivity;
	/**
	 * Tf r g b
	 */
	Vector4f transmissionFilter;
	/**
	 * illum
	 */
	IlluminationModel illuminationModel;
	/**
	 * d -halo factor
	 */
	float dissolveFactor;
	/**
	 * Ns exponent
	 */
	float specularExponent;
	/**
	 * sharpness
	 */
	float sharpness;
	/**
	 * Ni
	 */
	float opticalDensity;
	
	/**
	 * map_Ka -options args filename
	 */
	Texture mapKAmbientColor;
	TextureMapOptions mapKAmbientColorOptions;
	/**
	 * map_Kd -options args filename
	 */
	Texture mapKDiffuseColor;
	TextureMapOptions mapKDiffuseColorOptions;
	/**
	 * map_Ks -options args filename
	 */
	Texture mapKSpecularColor;
	TextureMapOptions mapKSpecularColorOptions;
	/**
	 * map_Ns -options args filename
	 */
	Texture mapNSpecularExponentScalar;
	TextureMapOptions mapNSpecularExponentScalarOptions;
	/**
	 *  map_d -options args filename
	 */
	Texture mapDissolveScalar;
	TextureMapOptions mapDissolveScalarOptions;
	/**
	 * map_aat on
	 */
	boolean mapAntiAliasing;
	/**
	 * decal -options args filename
	 */
	Texture mapDecalScalar;
	TextureMapOptions mapDecalScalarOptions;
	/**
	 * disp -options args filename
	 */
	Texture mapDisplaceScalar;
	TextureMapOptions mapDisplaceScalarOptions;
	/**
	 * bump -options args filename
	 */
	Texture mapBumpScalar;
	TextureMapOptions mapBumpScalarOptions;
	
	Texture reflectionSphere;
	TextureMapOptions reflectionSphereOptions;
	
	Texture reflectionCubeSides;
	TextureMapOptions reflectionCubeSidesOptions;
	
	Texture reflectionCubeTop;
	TextureMapOptions reflectionCubeTopOptions;
	
	Texture reflectionCubeBottom;
	TextureMapOptions reflectionCubeBottomOptions;
	
	Texture reflectionCubeFront;
	TextureMapOptions reflectionCubeFrontOptions;
	
	Texture reflectionCubeBack;
	TextureMapOptions reflectionCubeBackOptions;
	
	Texture reflectionCubeLeft;
	TextureMapOptions reflectionCubeLeftOptions;
	
	Texture reflectionCubeRight;
	TextureMapOptions reflectionCubeRightOptions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vector4f getAmbientReflectivity() {
		return ambientReflectivity;
	}
	public void setAmbientReflectivity(Vector4f ambientReflectivity) {
		this.ambientReflectivity = ambientReflectivity;
	}
	public Vector4f getDiffuseReflectivity() {
		return diffuseReflectivity;
	}
	public void setDiffuseReflectivity(Vector4f diffuseReflectivity) {
		this.diffuseReflectivity = diffuseReflectivity;
	}
	public Vector4f getSpecularReflectivity() {
		return specularReflectivity;
	}
	public void setSpecularReflectivity(Vector4f specularReflectivity) {
		this.specularReflectivity = specularReflectivity;
	}
	public Vector4f getTransmissionFilter() {
		return transmissionFilter;
	}
	public void setTransmissionFilter(Vector4f transmissionFilter) {
		this.transmissionFilter = transmissionFilter;
	}
	public IlluminationModel getIlluminationModel() {
		return illuminationModel;
	}
	public void setIlluminationModel(IlluminationModel illuminationModel) {
		this.illuminationModel = illuminationModel;
	}
	public float getDissolveFactor() {
		return dissolveFactor;
	}
	public void setDissolveFactor(float dissolveFactor) {
		this.dissolveFactor = dissolveFactor;
	}
	public float getSpecularExponent() {
		return specularExponent;
	}
	public void setSpecularExponent(float specularExponent) {
		this.specularExponent = specularExponent;
	}
	public float getSharpness() {
		return sharpness;
	}
	public void setSharpness(float sharpness) {
		this.sharpness = sharpness;
	}
	public float getOpticalDensity() {
		return opticalDensity;
	}
	public void setOpticalDensity(float opticalDensity) {
		this.opticalDensity = opticalDensity;
	}
	public Texture getMapKAmbientColor() {
		return mapKAmbientColor;
	}
	public void setMapKAmbientColor(Texture mapKAmbientColor) {
		this.mapKAmbientColor = mapKAmbientColor;
	}
	public TextureMapOptions getMapKAmbientColorOptions() {
		return mapKAmbientColorOptions;
	}
	public void setMapKAmbientColorOptions(TextureMapOptions mapKAmbientColorOptions) {
		this.mapKAmbientColorOptions = mapKAmbientColorOptions;
	}
	public Texture getMapKDiffuseColor() {
		return mapKDiffuseColor;
	}
	public void setMapKDiffuseColor(Texture mapKDiffuseColor) {
		this.mapKDiffuseColor = mapKDiffuseColor;
	}
	public TextureMapOptions getMapKDiffuseColorOptions() {
		return mapKDiffuseColorOptions;
	}
	public void setMapKDiffuseColorOptions(TextureMapOptions mapKDiffuseColorOptions) {
		this.mapKDiffuseColorOptions = mapKDiffuseColorOptions;
	}
	public Texture getMapKSpecularColor() {
		return mapKSpecularColor;
	}
	public void setMapKSpecularColor(Texture mapKSpecularColor) {
		this.mapKSpecularColor = mapKSpecularColor;
	}
	public TextureMapOptions getMapKSpecularColorOptions() {
		return mapKSpecularColorOptions;
	}
	public void setMapKSpecularColorOptions(
			TextureMapOptions mapKSpecularColorOptions) {
		this.mapKSpecularColorOptions = mapKSpecularColorOptions;
	}
	public Texture getMapNSpecularExponentScalar() {
		return mapNSpecularExponentScalar;
	}
	public void setMapNSpecularExponentScalar(Texture mapNSpecularExponentScalar) {
		this.mapNSpecularExponentScalar = mapNSpecularExponentScalar;
	}
	public TextureMapOptions getMapNSpecularExponentScalarOptions() {
		return mapNSpecularExponentScalarOptions;
	}
	public void setMapNSpecularExponentScalarOptions(
			TextureMapOptions mapNSpecularExponentScalarOptions) {
		this.mapNSpecularExponentScalarOptions = mapNSpecularExponentScalarOptions;
	}
	public Texture getMapDissolveScalar() {
		return mapDissolveScalar;
	}
	public void setMapDissolveScalar(Texture mapDissolveScalar) {
		this.mapDissolveScalar = mapDissolveScalar;
	}
	public TextureMapOptions getMapDissolveScalarOptions() {
		return mapDissolveScalarOptions;
	}
	public void setMapDissolveScalarOptions(
			TextureMapOptions mapDissolveScalarOptions) {
		this.mapDissolveScalarOptions = mapDissolveScalarOptions;
	}
	public boolean isMapAntiAliasing() {
		return mapAntiAliasing;
	}
	public void setMapAntiAliasing(boolean mapAntiAliasing) {
		this.mapAntiAliasing = mapAntiAliasing;
	}
	public Texture getMapDecalScalar() {
		return mapDecalScalar;
	}
	public void setMapDecalScalar(Texture mapDecalScalar) {
		this.mapDecalScalar = mapDecalScalar;
	}
	public TextureMapOptions getMapDecalScalarOptions() {
		return mapDecalScalarOptions;
	}
	public void setMapDecalScalarOptions(TextureMapOptions mapDecalScalarOptions) {
		this.mapDecalScalarOptions = mapDecalScalarOptions;
	}
	public Texture getMapDisplaceScalar() {
		return mapDisplaceScalar;
	}
	public void setMapDisplaceScalar(Texture mapDisplaceScalar) {
		this.mapDisplaceScalar = mapDisplaceScalar;
	}
	public TextureMapOptions getMapDisplaceScalarOptions() {
		return mapDisplaceScalarOptions;
	}
	public void setMapDisplaceScalarOptions(
			TextureMapOptions mapDisplaceScalarOptions) {
		this.mapDisplaceScalarOptions = mapDisplaceScalarOptions;
	}
	public Texture getMapBumpScalar() {
		return mapBumpScalar;
	}
	public void setMapBumpScalar(Texture mapBumpScalar) {
		this.mapBumpScalar = mapBumpScalar;
	}
	public TextureMapOptions getMapBumpScalarOptions() {
		return mapBumpScalarOptions;
	}
	public void setMapBumpScalarOptions(TextureMapOptions mapBumpScalarOptions) {
		this.mapBumpScalarOptions = mapBumpScalarOptions;
	}
	public Texture getReflectionSphere() {
		return reflectionSphere;
	}
	public void setReflectionSphere(Texture reflectionSphere) {
		this.reflectionSphere = reflectionSphere;
	}
	public TextureMapOptions getReflectionSphereOptions() {
		return reflectionSphereOptions;
	}
	public void setReflectionSphereOptions(TextureMapOptions reflectionSphereOptions) {
		this.reflectionSphereOptions = reflectionSphereOptions;
	}
	public Texture getReflectionCubeSides() {
		return reflectionCubeSides;
	}
	public void setReflectionCubeSides(Texture reflectionCubeSides) {
		this.reflectionCubeSides = reflectionCubeSides;
	}
	public TextureMapOptions getReflectionCubeSidesOptions() {
		return reflectionCubeSidesOptions;
	}
	public void setReflectionCubeSidesOptions(
			TextureMapOptions reflectionCubeSidesOptions) {
		this.reflectionCubeSidesOptions = reflectionCubeSidesOptions;
	}
	public Texture getReflectionCubeTop() {
		return reflectionCubeTop;
	}
	public void setReflectionCubeTop(Texture reflectionCubeTop) {
		this.reflectionCubeTop = reflectionCubeTop;
	}
	public TextureMapOptions getReflectionCubeTopOptions() {
		return reflectionCubeTopOptions;
	}
	public void setReflectionCubeTopOptions(
			TextureMapOptions reflectionCubeTopOptions) {
		this.reflectionCubeTopOptions = reflectionCubeTopOptions;
	}
	public Texture getReflectionCubeBottom() {
		return reflectionCubeBottom;
	}
	public void setReflectionCubeBottom(Texture reflectionCubeBottom) {
		this.reflectionCubeBottom = reflectionCubeBottom;
	}
	public TextureMapOptions getReflectionCubeBottomOptions() {
		return reflectionCubeBottomOptions;
	}
	public void setReflectionCubeBottomOptions(
			TextureMapOptions reflectionCubeBottomOptions) {
		this.reflectionCubeBottomOptions = reflectionCubeBottomOptions;
	}
	public Texture getReflectionCubeFront() {
		return reflectionCubeFront;
	}
	public void setReflectionCubeFront(Texture reflectionCubeFront) {
		this.reflectionCubeFront = reflectionCubeFront;
	}
	public TextureMapOptions getReflectionCubeFrontOptions() {
		return reflectionCubeFrontOptions;
	}
	public void setReflectionCubeFrontOptions(
			TextureMapOptions reflectionCubeFrontOptions) {
		this.reflectionCubeFrontOptions = reflectionCubeFrontOptions;
	}
	public Texture getReflectionCubeBack() {
		return reflectionCubeBack;
	}
	public void setReflectionCubeBack(Texture reflectionCubeBack) {
		this.reflectionCubeBack = reflectionCubeBack;
	}
	public TextureMapOptions getReflectionCubeBackOptions() {
		return reflectionCubeBackOptions;
	}
	public void setReflectionCubeBackOptions(
			TextureMapOptions reflectionCubeBackOptions) {
		this.reflectionCubeBackOptions = reflectionCubeBackOptions;
	}
	public Texture getReflectionCubeLeft() {
		return reflectionCubeLeft;
	}
	public void setReflectionCubeLeft(Texture reflectionCubeLeft) {
		this.reflectionCubeLeft = reflectionCubeLeft;
	}
	public TextureMapOptions getReflectionCubeLeftOptions() {
		return reflectionCubeLeftOptions;
	}
	public void setReflectionCubeLeftOptions(
			TextureMapOptions reflectionCubeLeftOptions) {
		this.reflectionCubeLeftOptions = reflectionCubeLeftOptions;
	}
	public Texture getReflectionCubeRight() {
		return reflectionCubeRight;
	}
	public void setReflectionCubeRight(Texture reflectionCubeRight) {
		this.reflectionCubeRight = reflectionCubeRight;
	}
	public TextureMapOptions getReflectionCubeRightOptions() {
		return reflectionCubeRightOptions;
	}
	public void setReflectionCubeRightOptions(
			TextureMapOptions reflectionCubeRightOptions) {
		this.reflectionCubeRightOptions = reflectionCubeRightOptions;
	}
	
	public int getMaterialId() {
		return materialId;
	}
	
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	
	public List<Integer> getFragmentShaderRawIds() {
		return fragmentShaderRawIds;
	}
	public void setFragmentShaderRawIds(List<Integer> fragmentShaderRawIds) {
		this.fragmentShaderRawIds = fragmentShaderRawIds;
	}
	public List<Integer> getVertexShaderRawIds() {
		return vertexShaderRawIds;
	}
	public void setVertexShaderRawIds(List<Integer> vertexShaderRawIds) {
		this.vertexShaderRawIds = vertexShaderRawIds;
	}
	public List<Integer> getProgramIds() {
		return programIds;
	}
	public void setProgramIds(List<Integer> programIds) {
		this.programIds = programIds;
	}
	public SparseArray<int[]> getMaterialHandlers() {
		return materialHandlers;
	}
	public void setMaterialHandlers(SparseArray<int[]> materialHandlers) {
		this.materialHandlers = materialHandlers;
	}
}
