package com.fairyteller.gles20boilerplate.material;

public class Channel {

	public enum ColorChannel{
		red, green, blue, matte, luminance, zdepth, undefined
	}
	
	
	/**
	 * -imfchan r | g | b | m | l | z

	 The -imfchan option specifies the channel used to create a scalar or 
	bump texture.  Scalar textures are applied to:
	 
	 transparency
	 specular exponent
	 decal
	 displacement
	 
	 The channel choices are:
	 
	 r specifies the red channel.
	 g specifies the green channel.
	 b specifies the blue channel.
	 m specifies the matte channel.
	 l specifies the luminance channel.
	 z specifies the z-depth channel.
	  
	 The default for bump and scalar textures is "l" (luminance), unless you 
	are building a decal.  In that case, the default is "m" (matte).
	 */
	public static final ColorChannel getChannel(String def){
		if(def==null)
			return null;
		return getChannel(def.toLowerCase().charAt(0));
	}
	/**
	 * -imfchan r | g | b | m | l | z

	 The -imfchan option specifies the channel used to create a scalar or 
	bump texture.  Scalar textures are applied to:
	 
	 transparency
	 specular exponent
	 decal
	 displacement
	 
	 The channel choices are:
	 
	 r specifies the red channel.
	 g specifies the green channel.
	 b specifies the blue channel.
	 m specifies the matte channel.
	 l specifies the luminance channel.
	 z specifies the z-depth channel.
	  
	 The default for bump and scalar textures is "l" (luminance), unless you 
	are building a decal.  In that case, the default is "m" (matte).
	 */
	public static final ColorChannel getChannel(char def){
		switch(def){
			case 'r':
				return ColorChannel.red;
			case 'g':
				return ColorChannel.green;
			case 'b':
				return ColorChannel.blue;
			case 'm':
				return ColorChannel.matte;
			case 'l':
				return ColorChannel.luminance;
			case 'z':
				return ColorChannel.zdepth;
			default:
				return ColorChannel.undefined;
		}
	}
	
	
}
