package textureloading;


import java.util.HashMap;
import java.util.Map;

import com.fairyteller.fairy3d.scene.Texture2D;

public class TextureRepository {

//	public static final String floorcube = "SimpleCubeFloor1/texture0.jpg";
//	public static final String androidRobot = "robot.png";
//	private boolean isTexture0Loaded = false;
//	
//	public int getRawTextureId(String s){
//		if(s.equals(floorcube))
//			return R.raw.texture0;
//		if(s.equals(androidRobot))
//			return R.raw.robot;
//		
//		return R.raw.texture0wall;
//	}
//	
//	public void markTextureAsLoadedInGl(int rawTextureId){
//		this.isTexture0Loaded = true;
//	}
//	
//	public boolean isLoadedInGL(int rawTextureId){
//		return isTexture0Loaded;
//	}
	
	private Map<String, Boolean> loadedTextures;
	
	public boolean isTextureLoadedInGL(Texture2D texture){
		if(loadedTextures==null){
			return false;
		}
		return (loadedTextures.containsKey(texture.getName()) && loadedTextures.get(texture.getName()));
	}
	public void markTextureAsLoadedInGl(Texture2D texture){
		if(loadedTextures==null){
			loadedTextures = new HashMap<String, Boolean>();
		}
		loadedTextures.put(texture.getName(), true);
		texture.setReady(true);
	}
	
	public TextureReader.TextureBuffer loadTextureBitmap(Texture2D texture){
		if(texture.getName()==null)
			return null;
		TextureReader.TextureBuffer bitmap = null;
		try {
		bitmap = TextureReader.readTexture(texture.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bitmap;
	}
}
