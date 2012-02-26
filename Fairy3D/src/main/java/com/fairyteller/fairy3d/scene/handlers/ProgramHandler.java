package com.fairyteller.fairy3d.scene.handlers;

import java.nio.FloatBuffer;

import com.fairyteller.fairy3d.scene.handlers.Program3D.ProgramHandlerType;

public class ProgramHandler {
	int glLocation = -1;
	ProgramHandlerType type;
	String variableName;
	int value1i;
	float value1f;
	float[] valuefv;
	int attribStride;
	int attribOffsetBytes;
	int uniformCount = 1;
	int uniformOffset = 0;
	FloatBuffer floatBuffer;
	int glVBOindex = -1;
	int glIBOindex = -1;
	
	Program3D program;
}
