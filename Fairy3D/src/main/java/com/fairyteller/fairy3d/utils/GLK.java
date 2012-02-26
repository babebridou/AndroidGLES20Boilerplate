package com.fairyteller.fairy3d.utils;

import java.lang.reflect.Field;

class GLK {
	
//	public static int GL_STACK_OVERFLOW;
//    public static int GL_STACK_UNDERFLOW;
	//from GL
	public static int GL_DEPTH_BUFFER_BIT;

	public static int GL_STENCIL_BUFFER_BIT;

	public static int GL_COLOR_BUFFER_BIT;

	public static int GL_FALSE;

	public static int GL_TRUE;

	public static int GL_POINTS;

	public static int GL_LINES;

	public static int GL_LINE_LOOP;

	public static int GL_LINE_STRIP;

	public static int GL_TRIANGLES;

	public static int GL_TRIANGLE_STRIP;

	public static int GL_TRIANGLE_FAN;

	public static int GL_ZERO;

	public static int GL_ONE;

	public static int GL_SRC_COLOR;

	public static int GL_ONE_MINUS_SRC_COLOR;

	public static int GL_SRC_ALPHA;

	public static int GL_ONE_MINUS_SRC_ALPHA;

	public static int GL_DST_ALPHA;

	public static int GL_ONE_MINUS_DST_ALPHA;

	public static int GL_DST_COLOR;

	public static int GL_ONE_MINUS_DST_COLOR;

	public static int GL_SRC_ALPHA_SATURATE;

	public static int GL_FUNC_ADD;

	public static int GL_BLEND_EQUATION;

	public static int GL_BLEND_EQUATION_RGB;

	public static int GL_BLEND_EQUATION_ALPHA;

	public static int GL_FUNC_SUBTRACT;

	public static int GL_FUNC_REVERSE_SUBTRACT;

	public static int GL_BLEND_DST_RGB;

	public static int GL_BLEND_SRC_RGB;

	public static int GL_BLEND_DST_ALPHA;

	public static int GL_BLEND_SRC_ALPHA;

	public static int GL_ARRAY_BUFFER;

	public static int GL_ELEMENT_ARRAY_BUFFER;

	public static int GL_ARRAY_BUFFER_BINDING;

	public static int GL_ELEMENT_ARRAY_BUFFER_BINDING;

	public static int GL_STATIC_DRAW;

	public static int GL_DYNAMIC_DRAW;

	public static int GL_BUFFER_SIZE;

	public static int GL_BUFFER_USAGE;

	public static int GL_FRONT;

	public static int GL_BACK;

	public static int GL_FRONT_AND_BACK;

	public static int GL_TEXTURE_2D;

	public static int GL_CULL_FACE;

	public static int GL_BLEND;

	public static int GL_DITHER;

	public static int GL_STENCIL_TEST;

	public static int GL_DEPTH_TEST;

	public static int GL_SCISSOR_TEST;

	public static int GL_POLYGON_OFFSET_FILL;

	public static int GL_SAMPLE_ALPHA_TO_COVERAGE;

	public static int GL_SAMPLE_COVERAGE;

	public static int GL_NO_ERROR;

	public static int GL_INVALID_ENUM;

	public static int GL_INVALID_VALUE;

	public static int GL_INVALID_OPERATION;

	public static int GL_OUT_OF_MEMORY;

	public static int GL_CW;

	public static int GL_CCW;

	public static int GL_LINE_WIDTH;

	public static int GL_ALIASED_POINT_SIZE_RANGE;

	public static int GL_ALIASED_LINE_WIDTH_RANGE;

	public static int GL_CULL_FACE_MODE;

	public static int GL_FRONT_FACE;

	public static int GL_DEPTH_RANGE;

	public static int GL_DEPTH_WRITEMASK;

	public static int GL_DEPTH_CLEAR_VALUE;

	public static int GL_DEPTH_FUNC;

	public static int GL_STENCIL_CLEAR_VALUE;

	public static int GL_STENCIL_FUNC;

	public static int GL_STENCIL_FAIL;

	public static int GL_STENCIL_PASS_DEPTH_FAIL;

	public static int GL_STENCIL_PASS_DEPTH_PASS;

	public static int GL_STENCIL_REF;

	public static int GL_STENCIL_VALUE_MASK;

	public static int GL_STENCIL_WRITEMASK;

	public static int GL_VIEWPORT;

	public static int GL_SCISSOR_BOX;

	public static int GL_COLOR_CLEAR_VALUE;

	public static int GL_COLOR_WRITEMASK;

	public static int GL_UNPACK_ALIGNMENT;

	public static int GL_PACK_ALIGNMENT;

	public static int GL_MAX_TEXTURE_SIZE;

	public static int GL_MAX_VIEWPORT_DIMS;

	public static int GL_SUBPIXEL_BITS;

	public static int GL_RED_BITS;

	public static int GL_GREEN_BITS;

	public static int GL_BLUE_BITS;

	public static int GL_ALPHA_BITS;

	public static int GL_DEPTH_BITS;

	public static int GL_STENCIL_BITS;

	public static int GL_POLYGON_OFFSET_UNITS;

	public static int GL_POLYGON_OFFSET_FACTOR;

	public static int GL_TEXTURE_BINDING_2D;

	public static int GL_SAMPLE_BUFFERS;

	public static int GL_SAMPLES;

	public static int GL_SAMPLE_COVERAGE_VALUE;

	public static int GL_SAMPLE_COVERAGE_INVERT;

	public static int GL_NUM_COMPRESSED_TEXTURE_FORMATS;

	public static int GL_COMPRESSED_TEXTURE_FORMATS;

	public static int GL_DONT_CARE;

	public static int GL_FASTEST;

	public static int GL_NICEST;

	public static int GL_GENERATE_MIPMAP_HINT;

	public static int GL_BYTE;

	public static int GL_UNSIGNED_BYTE;

	public static int GL_SHORT;

	public static int GL_UNSIGNED_SHORT;

	public static int GL_UNSIGNED_INT;

	public static int GL_FLOAT;

	public static int GL_FIXED;

	public static int GL_ALPHA;

	public static int GL_RGB;

	public static int GL_RGBA;

	public static int GL_LUMINANCE;

	public static int GL_LUMINANCE_ALPHA;

	public static int GL_UNSIGNED_SHORT_4_4_4_4;

	public static int GL_UNSIGNED_SHORT_5_5_5_1;

	public static int GL_UNSIGNED_SHORT_5_6_5;

	public static int GL_NEVER;

	public static int GL_LESS;

	public static int GL_EQUAL;

	public static int GL_LEQUAL;

	public static int GL_GREATER;

	public static int GL_NOTEQUAL;

	public static int GL_GEQUAL;

	public static int GL_ALWAYS;

	public static int GL_KEEP;

	public static int GL_REPLACE;

	public static int GL_INCR;

	public static int GL_DECR;

	public static int GL_INVERT;

	public static int GL_INCR_WRAP;

	public static int GL_DECR_WRAP;

	public static int GL_VENDOR;

	public static int GL_RENDERER;

	public static int GL_VERSION;

	public static int GL_EXTENSIONS;

	public static int GL_NEAREST;

	public static int GL_LINEAR;

	public static int GL_NEAREST_MIPMAP_NEAREST;

	public static int GL_LINEAR_MIPMAP_NEAREST;

	public static int GL_NEAREST_MIPMAP_LINEAR;

	public static int GL_LINEAR_MIPMAP_LINEAR;

	public static int GL_TEXTURE_MAG_FILTER;

	public static int GL_TEXTURE_MIN_FILTER;

	public static int GL_TEXTURE_WRAP_S;

	public static int GL_TEXTURE_WRAP_T;

	public static int GL_TEXTURE;

	public static int GL_TEXTURE_CUBE_MAP;

	public static int GL_TEXTURE_BINDING_CUBE_MAP;

	public static int GL_TEXTURE_CUBE_MAP_POSITIVE_X;

	public static int GL_TEXTURE_CUBE_MAP_NEGATIVE_X;

	public static int GL_TEXTURE_CUBE_MAP_POSITIVE_Y;

	public static int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y;

	public static int GL_TEXTURE_CUBE_MAP_POSITIVE_Z;

	public static int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z;

	public static int GL_MAX_CUBE_MAP_TEXTURE_SIZE;

	public static int GL_TEXTURE0;

	public static int GL_TEXTURE1;

	public static int GL_TEXTURE2;

	public static int GL_TEXTURE3;

	public static int GL_TEXTURE4;

	public static int GL_TEXTURE5;

	public static int GL_TEXTURE6;

	public static int GL_TEXTURE7;

	public static int GL_TEXTURE8;

	public static int GL_TEXTURE9;

	public static int GL_TEXTURE10;

	public static int GL_TEXTURE11;

	public static int GL_TEXTURE12;

	public static int GL_TEXTURE13;

	public static int GL_TEXTURE14;

	public static int GL_TEXTURE15;

	public static int GL_TEXTURE16;

	public static int GL_TEXTURE17;

	public static int GL_TEXTURE18;

	public static int GL_TEXTURE19;

	public static int GL_TEXTURE20;

	public static int GL_TEXTURE21;

	public static int GL_TEXTURE22;

	public static int GL_TEXTURE23;

	public static int GL_TEXTURE24;

	public static int GL_TEXTURE25;

	public static int GL_TEXTURE26;

	public static int GL_TEXTURE27;

	public static int GL_TEXTURE28;

	public static int GL_TEXTURE29;

	public static int GL_TEXTURE30;

	public static int GL_TEXTURE31;

	public static int GL_ACTIVE_TEXTURE;

	public static int GL_REPEAT;

	public static int GL_CLAMP_TO_EDGE;

	public static int GL_MIRRORED_REPEAT;

	public static int GL_IMPLEMENTATION_COLOR_READ_TYPE;

	public static int GL_IMPLEMENTATION_COLOR_READ_FORMAT;

	public static int GL_FRAMEBUFFER;

	public static int GL_RENDERBUFFER;

	public static int GL_RGBA4;

	public static int GL_RGB5_A1;

	public static int GL_RGB565;

	public static int GL_DEPTH_COMPONENT16;

	public static int GL_STENCIL_INDEX8;

	public static int GL_RENDERBUFFER_WIDTH;

	public static int GL_RENDERBUFFER_HEIGHT;

	public static int GL_RENDERBUFFER_INTERNAL_FORMAT;

	public static int GL_RENDERBUFFER_RED_SIZE;

	public static int GL_RENDERBUFFER_GREEN_SIZE;

	public static int GL_RENDERBUFFER_BLUE_SIZE;

	public static int GL_RENDERBUFFER_ALPHA_SIZE;

	public static int GL_RENDERBUFFER_DEPTH_SIZE;

	public static int GL_RENDERBUFFER_STENCIL_SIZE;

	public static int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE;

	public static int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME;

	public static int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL;

	public static int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE;

	public static int GL_COLOR_ATTACHMENT0;

	public static int GL_DEPTH_ATTACHMENT;

	public static int GL_STENCIL_ATTACHMENT;

	public static int GL_NONE;

	public static int GL_FRAMEBUFFER_COMPLETE;

	public static int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT;

	public static int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT;

	public static int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS;

	public static int GL_FRAMEBUFFER_INCOMPLETE_FORMATS;

	public static int GL_FRAMEBUFFER_UNSUPPORTED;

	public static int GL_FRAMEBUFFER_BINDING;

	public static int GL_RENDERBUFFER_BINDING;

	public static int GL_MAX_RENDERBUFFER_SIZE;

	public static int GL_INVALID_FRAMEBUFFER_OPERATION;

	public static int GL_DEPTH_COMPONENT24;

	public static int GL_DEPTH_COMPONENT32;

	public static int GL_WRITE_ONLY;

	public static int GL_BUFFER_ACCESS;

	public static int GL_BUFFER_MAPPED;

	public static int GL_BUFFER_MAP_POINTER;

	public static int GL_DEPTH_STENCIL;

	public static int GL_UNSIGNED_INT_24_8;

	public static int GL_DEPTH24_STENCIL8;

	public static int GL_RGB8;

	public static int GL_RGBA8;

	public static int GL_STENCIL_INDEX1;

	public static int GL_STENCIL_INDEX4;

	public static int GL_HALF_FLOAT;

	public static int GL_UNSIGNED_SHORT_4_4_4_4_REV_EXT;

	public static int GL_UNSIGNED_SHORT_1_5_5_5_REV_EXT;

	public static int GL_TEXTURE_MAX_ANISOTROPY_EXT;

	public static int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT;

	public static int GL_UNSIGNED_INT_2_10_10_10_REV_EXT;

	public static int GL_COMPRESSED_RGB_S3TC_DXT1_EXT;

	public static int GL_COMPRESSED_RGBA_S3TC_DXT1_EXT;

	public static int GL_R11F_G11F_B10F;

	public static int GL_UNSIGNED_INT_10F_11F_11F_REV;

	public static int GL_RGBA_SIGNED_COMPONENTS;

	public static int GL_TEXTURE_2D_ARRAY;

	public static int GL_SAMPLER_2D_ARRAY;

	public static int GL_TEXTURE_BINDING_2D_ARRAY;

	public static int GL_MAX_ARRAY_TEXTURE_LAYERS;

	public static int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER;

	public static int GL_COMPRESSED_RGBA_S3TC_DXT3_EXT;

	public static int GL_COMPRESSED_RGBA_S3TC_DXT5_EXT;

	public static int GL_AND;

	public static int GL_AND_INVERTED;

	public static int GL_AND_REVERSE;

	public static int GL_BLEND_DST;

	public static int GL_BLEND_SRC;

	public static int GL_CLEAR;

	public static int GL_COLOR_LOGIC_OP;

	public static int GL_COPY;

	public static int GL_COPY_INVERTED;

	public static int GL_EQUIV;

	public static int GL_LINE_SMOOTH;

	public static int GL_LINE_SMOOTH_HINT;

	public static int GL_LOGIC_OP_MODE;

	public static int GL_MULTISAMPLE;

	public static int GL_NAND;

	public static int GL_NOOP;

	public static int GL_NOR;

	public static int GL_OR;

	public static int GL_OR_INVERTED;

	public static int GL_OR_REVERSE;

	public static int GL_POINT_FADE_THRESHOLD_SIZE;

	public static int GL_POINT_SIZE;

	public static int GL_SAMPLE_ALPHA_TO_ONE;

	public static int GL_SET;

	public static int GL_SMOOTH_LINE_WIDTH_RANGE;

	public static int GL_SMOOTH_POINT_SIZE_RANGE;

	public static int GL_XOR;
	
	
	// from GL2ES2
	
	public static int GL_CONSTANT_COLOR;
	  
	public static int GL_ONE_MINUS_CONSTANT_COLOR;
	  
	public static int GL_CONSTANT_ALPHA;
	  
	public static int GL_ONE_MINUS_CONSTANT_ALPHA;
	  
	public static int GL_BLEND_COLOR;
	  
	public static int GL_STREAM_DRAW;
	  
	public static int GL_CURRENT_VERTEX_ATTRIB;
	  
	public static int GL_STENCIL_BACK_FUNC;
	  
	public static int GL_STENCIL_BACK_FAIL;
	  
	public static int GL_STENCIL_BACK_PASS_DEPTH_FAIL;
	  
	public static int GL_STENCIL_BACK_PASS_DEPTH_PASS;
	  
	public static int GL_STENCIL_BACK_REF;
	  
	public static int GL_STENCIL_BACK_VALUE_MASK;
	  
	public static int GL_STENCIL_BACK_WRITEMASK;
	  
	public static int GL_INT;
	  
	public static int GL_DEPTH_COMPONENT;
	  
	public static int GL_FRAGMENT_SHADER;
	  
	public static int GL_VERTEX_SHADER;
	  
	public static int GL_MAX_VERTEX_ATTRIBS;
	  
	public static int GL_MAX_VERTEX_UNIFORM_VECTORS;
	  
	public static int GL_MAX_VARYING_VECTORS;
	  
	public static int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS;
	  
	public static int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS;
	  
	public static int GL_MAX_TEXTURE_IMAGE_UNITS;
	  
	public static int GL_MAX_FRAGMENT_UNIFORM_VECTORS;
	  
	public static int GL_SHADER_TYPE;
	  
	public static int GL_DELETE_STATUS;
	  
	public static int GL_LINK_STATUS;
	  
	public static int GL_VALIDATE_STATUS;
	  
	public static int GL_ATTACHED_SHADERS;
	  
	public static int GL_ACTIVE_UNIFORMS;
	  
	public static int GL_ACTIVE_UNIFORM_MAX_LENGTH;
	  
	public static int GL_ACTIVE_ATTRIBUTES;
	  
	public static int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH;
	  
	public static int GL_SHADING_LANGUAGE_VERSION;
	  
	public static int GL_CURRENT_PROGRAM;
	  
	public static int GL_FLOAT_VEC2;
	  
	public static int GL_FLOAT_VEC3;
	  
	public static int GL_FLOAT_VEC4;
	  
	public static int GL_INT_VEC2;
	  
	public static int GL_INT_VEC3;
	  
	public static int GL_INT_VEC4;
	  
	public static int GL_BOOL;
	  
	public static int GL_BOOL_VEC2;
	  
	public static int GL_BOOL_VEC3;
	  
	public static int GL_BOOL_VEC4;
	  
	public static int GL_FLOAT_MAT2;
	  
	public static int GL_FLOAT_MAT3;
	  
	public static int GL_FLOAT_MAT4;
	  
	public static int GL_SAMPLER_2D;
	  
	public static int GL_SAMPLER_CUBE;
	  
	public static int GL_VERTEX_ATTRIB_ARRAY_ENABLED;
	  
	public static int GL_VERTEX_ATTRIB_ARRAY_SIZE;
	  
	public static int GL_VERTEX_ATTRIB_ARRAY_STRIDE;
	  
	public static int GL_VERTEX_ATTRIB_ARRAY_TYPE;
	  
	public static int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED;
	  
	public static int GL_VERTEX_ATTRIB_ARRAY_POINTER;
	  
	public static int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING;
	  
	public static int GL_COMPILE_STATUS;
	  
	public static int GL_INFO_LOG_LENGTH;
	  
	public static int GL_SHADER_SOURCE_LENGTH;
	  
	public static int GL_SHADER_COMPILER;
	  
	public static int GL_SHADER_BINARY_FORMATS;
	  
	public static int GL_NUM_SHADER_BINARY_FORMATS;
	  
	public static int GL_LOW_FLOAT;
	  
	public static int GL_MEDIUM_FLOAT;
	  
	public static int GL_HIGH_FLOAT;
	  
	public static int GL_LOW_INT;
	  
	public static int GL_MEDIUM_INT;
	  
	public static int GL_HIGH_INT;
	  
	public static int GL_STENCIL_INDEX;
	  
	public static int GL_PROGRAM_BINARY_LENGTH;
	  
	public static int GL_NUM_PROGRAM_BINARY_FORMATS;
	  
	public static int GL_PROGRAM_BINARY_FORMATS;
	  
	public static int GL_FRAGMENT_SHADER_DERIVATIVE_HINT;
	  
	public static int GL_TEXTURE_WRAP_R;
	  
	public static int GL_TEXTURE_3D;
	  
	public static int GL_TEXTURE_BINDING_3D;
	  
	public static int GL_MAX_3D_TEXTURE_SIZE;
	  
	public static int GL_SAMPLER_3D;
	  
	public static int GL_UNSIGNED_INT_10_10_10_2;
	  
	public static int GL_INT_10_10_10_2;
	
	public static int GL_ETC1_RGB8_OES;
	  
	//from GLES2
	public static int GL_PALETTE4_RGB8_OES;

	public static int GL_PALETTE4_RGBA8_OES;

	public static int GL_PALETTE4_R5_G6_B5_OES;

	public static int GL_PALETTE4_RGBA4_OES;

	public static int GL_PALETTE4_RGB5_A1_OES;

	public static int GL_PALETTE8_RGB8_OES;

	public static int GL_PALETTE8_RGBA8_OES;

	public static int GL_PALETTE8_R5_G6_B5_OES;

	public static int GL_PALETTE8_RGBA4_OES;

	public static int GL_PALETTE8_RGB5_A1_OES;

	public static int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET;

	public static int GL_VERTEX_ARRAY_BINDING_OES;

	public static int GL_3DC_X_AMD;

	public static int GL_3DC_XY_AMD;

	public static int GL_ATC_RGB_AMD;

	public static int GL_ATC_RGBA_EXPLICIT_ALPHA_AMD;

	public static int GL_ATC_RGBA_INTERPOLATED_ALPHA_AMD;

	public static int GL_COUNTER_TYPE_AMD;

	public static int GL_COUNTER_RANGE_AMD;

	public static int GL_UNSIGNED_INT64_AMD;

	public static int GL_PERCENTAGE_AMD;

	public static int GL_PERFMON_RESULT_AVAILABLE_AMD;

	public static int GL_PERFMON_RESULT_SIZE_AMD;

	public static int GL_PERFMON_RESULT_AMD;

	public static int GL_Z400_BINARY_AMD;

	public static int GL_READ_FRAMEBUFFER_ANGLE;

	public static int GL_DRAW_FRAMEBUFFER_ANGLE;

	public static int GL_DRAW_FRAMEBUFFER_BINDING_ANGLE;

	public static int GL_READ_FRAMEBUFFER_BINDING_ANGLE;

	public static int GL_RENDERBUFFER_SAMPLES_ANGLE;

	public static int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_ANGLE;

	public static int GL_MAX_SAMPLES_ANGLE;

	public static int GL_RGB_422_APPLE;

	public static int GL_UNSIGNED_SHORT_8_8_APPLE;

	public static int GL_UNSIGNED_SHORT_8_8_REV_APPLE;

	public static int GL_RENDERBUFFER_SAMPLES_APPLE;

	public static int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_APPLE;

	public static int GL_MAX_SAMPLES_APPLE;

	public static int GL_READ_FRAMEBUFFER_APPLE;

	public static int GL_DRAW_FRAMEBUFFER_APPLE;

	public static int GL_DRAW_FRAMEBUFFER_BINDING_APPLE;

	public static int GL_READ_FRAMEBUFFER_BINDING_APPLE;

	public static int GL_TEXTURE_MAX_LEVEL_APPLE;

	public static int GL_MALI_SHADER_BINARY_ARM;

	public static int GL_COLOR_EXT;

	public static int GL_DEPTH_EXT;

	public static int GL_STENCIL_EXT;

	public static int GL_SGX_PROGRAM_BINARY_IMG;

	public static int GL_BGRA_IMG;

	public static int GL_UNSIGNED_SHORT_4_4_4_4_REV_IMG;

	public static int GL_SGX_BINARY_IMG;

	public static int GL_COMPRESSED_RGB_PVRTC_4BPPV1_IMG;

	public static int GL_COMPRESSED_RGB_PVRTC_2BPPV1_IMG;

	public static int GL_COMPRESSED_RGBA_PVRTC_4BPPV1_IMG;

	public static int GL_COMPRESSED_RGBA_PVRTC_2BPPV1_IMG;

	public static int GL_RENDERBUFFER_SAMPLES_IMG;

	public static int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_IMG;

	public static int GL_MAX_SAMPLES_IMG;

	public static int GL_TEXTURE_SAMPLES_IMG;

	public static int GL_ALL_COMPLETED_NV;

	public static int GL_FENCE_STATUS_NV;

	public static int GL_FENCE_CONDITION_NV;

	public static int GL_COVERAGE_SAMPLES_NV;

	public static int GL_DEPTH_COMPONENT16_NONLINEAR_NV;

	public static int GL_TEXTURE_WIDTH_QCOM;

	public static int GL_TEXTURE_HEIGHT_QCOM;

	public static int GL_TEXTURE_DEPTH_QCOM;

	public static int GL_TEXTURE_INTERNAL_FORMAT_QCOM;

	public static int GL_TEXTURE_FORMAT_QCOM;

	public static int GL_TEXTURE_TYPE_QCOM;

	public static int GL_TEXTURE_IMAGE_VALID_QCOM;

	public static int GL_TEXTURE_NUM_LEVELS_QCOM;

	public static int GL_TEXTURE_TARGET_QCOM;

	public static int GL_TEXTURE_OBJECT_VALID_QCOM;

	public static int GL_STATE_RESTORE;

	public static int GL_PERFMON_GLOBAL_MODE_QCOM;

	public static int GL_WRITEONLY_RENDERING_QCOM;

	public static int GL_COLOR_BUFFER_BIT0_QCOM;

	public static int GL_COLOR_BUFFER_BIT1_QCOM;

	public static int GL_COLOR_BUFFER_BIT2_QCOM;

	public static int GL_COLOR_BUFFER_BIT3_QCOM;

	public static int GL_COLOR_BUFFER_BIT4_QCOM;

	public static int GL_COLOR_BUFFER_BIT5_QCOM;

	public static int GL_COLOR_BUFFER_BIT6_QCOM;

	public static int GL_COLOR_BUFFER_BIT7_QCOM;

	public static int GL_DEPTH_BUFFER_BIT0_QCOM;

	public static int GL_DEPTH_BUFFER_BIT1_QCOM;

	public static int GL_DEPTH_BUFFER_BIT2_QCOM;

	public static int GL_DEPTH_BUFFER_BIT3_QCOM;

	public static int GL_DEPTH_BUFFER_BIT4_QCOM;

	public static int GL_DEPTH_BUFFER_BIT5_QCOM;

	public static int GL_DEPTH_BUFFER_BIT6_QCOM;

	public static int GL_DEPTH_BUFFER_BIT7_QCOM;

	public static int GL_STENCIL_BUFFER_BIT0_QCOM;

	public static int GL_STENCIL_BUFFER_BIT1_QCOM;

	public static int GL_STENCIL_BUFFER_BIT2_QCOM;

	public static int GL_STENCIL_BUFFER_BIT3_QCOM;

	public static int GL_STENCIL_BUFFER_BIT4_QCOM;

	public static int GL_STENCIL_BUFFER_BIT5_QCOM;

	public static int GL_STENCIL_BUFFER_BIT6_QCOM;

	public static int GL_STENCIL_BUFFER_BIT7_QCOM;

	public static int GL_MULTISAMPLE_BUFFER_BIT0_QCOM;

	public static int GL_MULTISAMPLE_BUFFER_BIT1_QCOM;

	public static int GL_MULTISAMPLE_BUFFER_BIT2_QCOM;

	public static int GL_MULTISAMPLE_BUFFER_BIT3_QCOM;

	public static int GL_MULTISAMPLE_BUFFER_BIT4_QCOM;

	public static int GL_MULTISAMPLE_BUFFER_BIT5_QCOM;

	public static int GL_MULTISAMPLE_BUFFER_BIT6_QCOM;

	public static long GL_MULTISAMPLE_BUFFER_BIT7_QCOM;

	public static int GL_SHADER_BINARY_VIV;

	public static int GL_NVIDIA_PLATFORM_BINARY_NV;
	  
	
	static final void initAndroid() throws ClassNotFoundException{
		try{
			Class<?> gles20 = Class.forName("android.opengl.GLES20");
			Field[] fields = GLK.class.getFields();
			int fieldcount = fields.length;
			for(int i = 0; i<fieldcount;i++){
				Field f = fields[i];
				try{
				f.setInt(GLK.class, gles20.getField(f.getName()).getInt(gles20));
				} catch(IllegalArgumentException ae){
					ae.printStackTrace();
					f.setLong(GLK.class, gles20.getField(f.getName()).getLong(gles20));
				}
			}
		} catch(NoSuchFieldException e){
			e.printStackTrace();
		} catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}
	
	static final void initJogl() throws ClassNotFoundException{
		try{
			Class<?> gles20 = Class.forName("javax.media.opengl.GLES2");
			Field[] fields = GLK.class.getFields();
			int fieldcount = fields.length;
			for(int i = 0; i<fieldcount;i++){
				Field f = fields[i];
				try{
					f.setInt(GLK.class, gles20.getField(f.getName()).getInt(gles20));
				} catch(IllegalArgumentException ae){
					f.setLong(GLK.class, gles20.getField(f.getName()).getLong(gles20));
				} 
			}
		} catch(NoSuchFieldException e){
			e.printStackTrace();
		} catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}
	
	static{
		try{
			initAndroid();
		} catch(ClassNotFoundException e){
			try{
				System.out.println("initializing jogl");
				initJogl();
			} catch(Exception e2){
				System.err.println("no opengl could be initialized");
				e2.printStackTrace();
			}
		}
	}
	
	
	
}
