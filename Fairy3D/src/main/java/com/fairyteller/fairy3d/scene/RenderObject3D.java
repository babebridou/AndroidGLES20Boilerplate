package com.fairyteller.fairy3d.scene;

import java.util.List;

public class RenderObject3D extends Object3D{
	
	@Override
	public ObjectClass getObjectClass() {
		return ObjectClass.RENDER;
	}
	
	private List<RenderSet> rendersets;

	public List<RenderSet> getRendersets() {
		return rendersets;
	}

	public void setRendersets(List<RenderSet> rendersets) {
		this.rendersets = rendersets;
	}
}
