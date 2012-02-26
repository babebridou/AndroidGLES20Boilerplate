package com.fairyteller.fairy3d.scene.handlers;

import com.fairyteller.fairy3d.scene.handlers.Program3D.ProgramHandlerType;

public class SimpleMatrixHandler extends ProgramHandler{

	public SimpleMatrixHandler(String matrixName) {
		type = ProgramHandlerType.glUniformMatrix4fv;
		variableName = matrixName;
		uniformCount = 1;
		uniformOffset = 0;
		glLocation = -1;
	}
	
	public void init(Program3D program){
		program.registerProgramHandler(this);
	}
	public void cleanup(){
		glLocation = -1;
		program = null;
	}
	
	public void updateMatrix(float[] matrix){
		valuefv = matrix;
		uniformCount = 1;
		uniformOffset = 0;
		program.bindValue(this);
	}
}
