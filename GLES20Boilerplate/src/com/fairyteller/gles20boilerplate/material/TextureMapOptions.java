package com.fairyteller.gles20boilerplate.material;

public final class TextureMapOptions{
		
		/**
		 * -blendu on | off
		 * The -blendu option turns texture blending in the horizontal direction 
(u direction) on or off.  The default is on.
		 */
		boolean blendu = true;
		/**
		 * -blendv on | off
		 * The -blendv option turns texture blending in the vertical direction (v 
direction) on or off.  The default is on.
		 */
		boolean blendv = true;
		
		/**
		 *  -bm mult
 
		 The -bm option specifies a bump multiplier.  You can use it only with 
		the "bump" statement.  Values stored with the texture or procedural 
		texture file are multiplied by this value before they are applied to the 
		surface.
		 "mult" is the value for the bump multiplier.  It can be positive or 
		negative.  Extreme bump multipliers may cause odd visual results because 
		only the surface normal is perturbed and the surface position does not 
		change.  For best results, use values between 0 and 1.
		 */
		float bumpMultiplier;
		
		/**
		 *  -boost value
 
		 The -boost option increases the sharpness, or clarity, of mip-mapped 
		texture files -- that is, color (.mpc), scalar (.mps), and bump (.mpb) 
		files.  If you render animations with boost, you may experience some 
		texture crawling.  The effects of boost are seen when you render in 
		Image or test render in Model or PreView; they aren't as noticeable in 
		Property Editor.
		 
		 "value" is any non-negative floating point value representing the 
		degree of increased clarity; the greater the value, the greater the 
		clarity.  You should start with a boost value of no more than 1 or 2 and 
		increase the value as needed.  Note that larger values have more 
		potential to introduce texture crawling when animated.
		 */
		float boost;
		
		/**
		-cc on | off
		 
		 The -cc option turns on color correction for the texture.  You can use 
		it only with the color map statements:  map_Ka, map_Kd, and map_Ks.*/
		boolean colorCorrection;
		
		/**
		 * -clamp on | off
 
			The -clamp option turns clamping on or off.  When clamping is on, 
			textures are restricted to 0-1 in the uvw range.  The default is off.
			 
			 When clamping is turned on, one copy of the texture is mapped onto the 
			surface, rather than repeating copies of the original texture across the 
			surface of a polygon, which is the default.  Outside of the origin 
			texture, the underlying material is unchanged.
			 
			 A postage stamp on an envelope or a label on a can of soup is an 
			example of a texture with clamping turned on.  A tile floor or a 
			sidewalk is an example of a texture with clamping turned off.
			 
			 Two-dimensional textures are clamped in the u and v dimensions; 3D 
			procedural textures are clamped in the u, v, and w dimensions.
		 */
		boolean clamp;
		
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
		Channel.ColorChannel imfchan;
		
		 /**-mm base gain
		 
		 The -mm option modifies the range over which scalar or color texture 
		values may vary.  This has an effect only during rendering and does not 
		change the file.
		 
		 "base" adds a base value to the texture values.  A positive value makes 
		everything brighter; a negative value makes everything dimmer.  The 
		default is 0; the range is unlimited.
		 */
		float magnitude_base;
		/**-mm base gain
		 
		 The -mm option modifies the range over which scalar or color texture 
		values may vary.  This has an effect only during rendering and does not 
		change the file.
		 
		 "gain" expands the range of the texture values.  Increasing the number 
		increases the contrast.  The default is 1; the range is unlimited.*/
		float magnitude_gain;
		
		/**
		-o u v w
		 
		 The -o option offsets the position of the texture map on the surface by 
		shifting the position of the map origin.  The default is 0, 0, 0.
		 
		 "u" is the value for the horizontal direction of the texture
		*/
		float offsetU;
		/**
		-o u v w
		 
		 The -o option offsets the position of the texture map on the surface by 
		shifting the position of the map origin.  The default is 0, 0, 0.
		 
		 "v" is an optional argument.
		 "v" is the value for the vertical direction of the texture.*/
		float offsetV;
		/**
		-o u v w
		 
		 The -o option offsets the position of the texture map on the surface by 
		shifting the position of the map origin.  The default is 0, 0, 0.
		 
		 "w" is an optional argument.
		 "w" is the value used for the depth of a 3D texture.*/
		float offsetW;
		/**
		-s u v w
		 The -s option scales the size of the texture pattern on the textured 
		surface by expanding or shrinking the pattern.  The default is 1, 1, 1.
		 
		 "u" is the value for the horizontal direction of the texture
 
		 */
		float scaleU;
		/**
		-s u v w
		 The -s option scales the size of the texture pattern on the textured 
		surface by expanding or shrinking the pattern.  The default is 1, 1, 1.
		
		 "v" is an optional argument.
		 "v" is the value for the vertical direction of the texture.
		
		 */
		float scaleV;
		/**
		-s u v w
		 The -s option scales the size of the texture pattern on the textured 
		surface by expanding or shrinking the pattern.  The default is 1, 1, 1.
		 
		 "w" is an optional argument.
		 "w" is a value used for the depth of a 3D texture.
		 "w" is a value used for the amount of tessellation of the displacement 
		map.
		 */
		float scaleW;
		
		/**
		 -t u v w
 
		 The -t option turns on turbulence for textures.  Adding turbulence to a 
		texture along a specified direction adds variance to the original image 
		and allows a simple image to be repeated over a larger area without 
		noticeable tiling effects.
		 
		 turbulence also lets you use a 2D image as if it were a solid texture, 
		similar to 3D procedural textures like marble and granite.
		 
		 "u" is the value for the horizontal direction of the texture 
		turbulence.
		 
		 By default, the turbulence for every texture map used in a material is 
		uvw = (0,0,0).  This means that no turbulence will be applied and the 2D 
		texture will behave normally.
		 
		 Only when you raise the turbulence values above zero will you see the 
		effects of turbulence.
		 */
		float turbulenceU;
		/**
		 -t u v w

		The -t option turns on turbulence for textures.  Adding turbulence to a 
		texture along a specified direction adds variance to the original image 
		and allows a simple image to be repeated over a larger area without 
		noticeable tiling effects.
		
		turbulence also lets you use a 2D image as if it were a solid texture, 
		similar to 3D procedural textures like marble and granite.
		
		"v" is an optional argument.
		"v" is the value for the vertical direction of the texture turbulence.
		
		By default, the turbulence for every texture map used in a material is 
		uvw = (0,0,0).  This means that no turbulence will be applied and the 2D 
		texture will behave normally.
		
		Only when you raise the turbulence values above zero will you see the 
		effects of turbulence.
		 */
		float turbulenceV;
		/**
		 -t u v w

		The -t option turns on turbulence for textures.  Adding turbulence to a 
		texture along a specified direction adds variance to the original image 
		and allows a simple image to be repeated over a larger area without 
		noticeable tiling effects.
		
		turbulence also lets you use a 2D image as if it were a solid texture, 
		similar to 3D procedural textures like marble and granite.
		
		"w" is an optional argument.
		"w" is a value used for the depth of the texture turbulence.
		
		By default, the turbulence for every texture map used in a material is 
		uvw = (0,0,0).  This means that no turbulence will be applied and the 2D 
		texture will behave normally.
		
		Only when you raise the turbulence values above zero will you see the 
		effects of turbulence.
		 */
		float turbulenceW;
		/**
		-texres resolution
		 
		 The -texres option specifies the resolution of texture created when an 
		image is used.  The default texture size is the largest power of two 
		that does not exceed the original image size.
		 
		 If the source image is an exact power of 2, the texture cannot be built 
		any larger.  If the source image size is not an exact power of 2, you 
		can specify that the texture be built at the next power of 2 greater 
		than the source image size.
		 
		 The original image should be square, otherwise, it will be scaled to 
		fit the closest square size that is not larger than the original.  
		Scaling reduces sharpness.
		 */
		int textureResolution;
		
		
		public boolean isBlendu() {
			return blendu;
		}
		public void setBlendu(boolean blendu) {
			this.blendu = blendu;
		}
		public boolean isBlendv() {
			return blendv;
		}
		public void setBlendv(boolean blendv) {
			this.blendv = blendv;
		}
		public float getBumpMultiplier() {
			return bumpMultiplier;
		}
		public void setBumpMultiplier(float bumpMultiplier) {
			this.bumpMultiplier = bumpMultiplier;
		}
		public float getBoost() {
			return boost;
		}
		public void setBoost(float boost) {
			this.boost = boost;
		}
		public boolean isColorCorrection() {
			return colorCorrection;
		}
		public void setColorCorrection(boolean colorCorrection) {
			this.colorCorrection = colorCorrection;
		}
		public boolean isClamp() {
			return clamp;
		}
		public void setClamp(boolean clamp) {
			this.clamp = clamp;
		}
		public Channel.ColorChannel getImfchan() {
			return imfchan;
		}
		public void setImfchan(Channel.ColorChannel imfchan) {
			this.imfchan = imfchan;
		}
		public float getMagnitude_base() {
			return magnitude_base;
		}
		public void setMagnitude_base(float magnitude_base) {
			this.magnitude_base = magnitude_base;
		}
		public float getMagnitude_gain() {
			return magnitude_gain;
		}
		public void setMagnitude_gain(float magnitude_gain) {
			this.magnitude_gain = magnitude_gain;
		}
		public float getOffsetU() {
			return offsetU;
		}
		public void setOffsetU(float offsetU) {
			this.offsetU = offsetU;
		}
		public float getOffsetV() {
			return offsetV;
		}
		public void setOffsetV(float offsetV) {
			this.offsetV = offsetV;
		}
		public float getOffsetW() {
			return offsetW;
		}
		public void setOffsetW(float offsetW) {
			this.offsetW = offsetW;
		}
		public float getScaleU() {
			return scaleU;
		}
		public void setScaleU(float scaleU) {
			this.scaleU = scaleU;
		}
		public float getScaleV() {
			return scaleV;
		}
		public void setScaleV(float scaleV) {
			this.scaleV = scaleV;
		}
		public float getScaleW() {
			return scaleW;
		}
		public void setScaleW(float scaleW) {
			this.scaleW = scaleW;
		}
		public float getTurbulenceU() {
			return turbulenceU;
		}
		public void setTurbulenceU(float turbulenceU) {
			this.turbulenceU = turbulenceU;
		}
		public float getTurbulenceV() {
			return turbulenceV;
		}
		public void setTurbulenceV(float turbulenceV) {
			this.turbulenceV = turbulenceV;
		}
		public float getTurbulenceW() {
			return turbulenceW;
		}
		public void setTurbulenceW(float turbulenceW) {
			this.turbulenceW = turbulenceW;
		}
		public int getTextureResolution() {
			return textureResolution;
		}
		public void setTextureResolution(int textureResolution) {
			this.textureResolution = textureResolution;
		}
		
		
	}