package com.fairyteller.gles20boilerplate.shaders;

public class HandlerDictionary {

	public enum AttribUniform{
		attrib,
		uniform
	}
	
	public enum HandlerType{
		matrix4f, vec2f, vec3f, vec4f
	}
	
	public static class HandlerEntry{
		String glslName;
		int handler;
		int entryIndex;
		AttribUniform callType;
		HandlerType handlerType;
	}
	
	
	
}
