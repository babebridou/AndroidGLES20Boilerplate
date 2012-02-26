package com.fairyteller.fairy3d.scene.handlers;

import java.nio.FloatBuffer;

import com.fairyteller.fairy3d.scene.handlers.AttribComposition.Composition;
import com.fairyteller.fairy3d.scene.handlers.Program3D.ProgramHandlerType;

public class SimpleVerticesHandler extends ProgramHandler{

	public static final int FLOAT_SIZE_BYTES = 4;
	
	public SimpleVerticesHandler(String positionName, int stride, int offsetbytes) {
		type = ProgramHandlerType.glVertexAttribPointer3fv;
		variableName = positionName;
		glLocation = -1;
		this.attribStride = stride;
		this.attribOffsetBytes = offsetbytes;
	}
	
	public SimpleVerticesHandler(String positionName, Composition composition) {
		variableName = positionName;
		glLocation = -1;
		switch(composition){
		case FLOATBUFFER_VERTS:
			type = ProgramHandlerType.glVertexAttribPointer3fv;
			this.attribStride = 3*FLOAT_SIZE_BYTES;
			this.attribOffsetBytes = 0;
			break;
		case FLOATBUFFER_VERTS_UV:
			type = ProgramHandlerType.glVertexAttribPointer3fv;
			this.attribStride = 5*FLOAT_SIZE_BYTES;
			this.attribOffsetBytes = 0;
			break;
		case FLOATBUFFER_VERTS_NORMAL:
			type = ProgramHandlerType.glVertexAttribPointer3fv;
			this.attribStride = 6*FLOAT_SIZE_BYTES;
			this.attribOffsetBytes = 0;
			break;
		case FLOATBUFFER_VERTS_NORMAL_UV:
			type = ProgramHandlerType.glVertexAttribPointer3fv;
			this.attribStride = 8*FLOAT_SIZE_BYTES;
			this.attribOffsetBytes = 0;
			break;
		case FLOATBUFFER_VERTS_UV_NORMAL:
			type = ProgramHandlerType.glVertexAttribPointer3fv;
			this.attribStride = 8*FLOAT_SIZE_BYTES;
			this.attribOffsetBytes = 0;
			break;
		case VBO_VERTS:
			type = ProgramHandlerType.glVertexAttribPointer3fvVBO;
			this.attribStride = 3*FLOAT_SIZE_BYTES;
			this.attribOffsetBytes = 0;
			break;
		case VBO_VERTS_UV:
			type = ProgramHandlerType.glVertexAttribPointer3fvVBO;
			this.attribStride = 5*FLOAT_SIZE_BYTES;
			this.attribOffsetBytes = 0;
			break;
		case VBO_VERTS_NORMAL:
			type = ProgramHandlerType.glVertexAttribPointer3fvVBO;
			this.attribStride = 6*FLOAT_SIZE_BYTES;
			this.attribOffsetBytes = 0;
			break;
		case VBO_VERTS_NORMAL_UV:
			type = ProgramHandlerType.glVertexAttribPointer3fvVBO;
			this.attribStride = 8*FLOAT_SIZE_BYTES;
			this.attribOffsetBytes = 0;
			break;
		case VBO_VERTS_UV_NORMAL:
			type = ProgramHandlerType.glVertexAttribPointer3fvVBO;
			this.attribStride = 8*FLOAT_SIZE_BYTES;
			this.attribOffsetBytes = 0;
			break;
		default: throw new IllegalArgumentException("invalid composition for this handler");
		}
	}
	
	public void init(Program3D program){
		program.registerProgramHandler(this);
	}
	public void cleanup(Program3D program){
		glLocation = -1;
		program = null;
	}
	public void engage(){
		program.enableAttrib(this);
	}
	public void disengage(){
		program.disableAttrib(this);
	}
	
	public void updateBuffer(FloatBuffer buffer){
		this.floatBuffer = buffer;
		program.bindValue(this);
	}
}
