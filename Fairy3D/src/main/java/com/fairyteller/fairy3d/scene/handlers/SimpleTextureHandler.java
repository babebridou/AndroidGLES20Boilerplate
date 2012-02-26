package com.fairyteller.fairy3d.scene.handlers;

import com.fairyteller.fairy3d.scene.Texture2D;
import com.fairyteller.fairy3d.scene.handlers.Program3D.ProgramHandlerType;

public class SimpleTextureHandler extends ProgramHandler{

	public SimpleTextureHandler(String variableName) {
		this.variableName = variableName;
		this.type = ProgramHandlerType.glUniform1i;
	}
	public void init(Program3D program){
		program.registerProgramHandler(this);
	}
	public void cleanup(){
		glLocation = -1;
		program = null;
	}
	public void setTexture(Texture2D texture){
		this.value1i = texture.getGlTextureId();
	}

}
