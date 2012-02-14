package com.fairyteller.gles20boilerplate.shaders;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.content.Context;
import android.util.Log;


public class Shader {
	private String shaderString;
	private int shaderGlId;

	public int getShaderGlId() {
		return shaderGlId;
	}

	public void setShaderGlId(int shaderGlId) {
		this.shaderGlId = shaderGlId;
	}

	// Takes in ids for files to be read
	public Shader(int vID, Context context) {
		StringBuffer vs = new StringBuffer();

		// read the files
		try {
			// Read the file from the resource
			// Log.d("loadFile", "Trying to read vs");
			// Read VS first
			InputStream inputStream = context.getResources().openRawResource(
					vID);
			// setup Bufferedreader
			BufferedReader in = new BufferedReader(new InputStreamReader(
					inputStream));

			String read = in.readLine();
			while (read != null) {
				vs.append(read + "\n");
				read = in.readLine();
			}

			vs.deleteCharAt(vs.length() - 1);

		} catch (Exception e) {
			Log.d("ERROR-readingShader", "Could not read shader: "
					+ e.getLocalizedMessage());
		}

		// Setup everything
		setup(vs.toString());
	}

	private void setup(String shader) {
		this.shaderString = shader;
	}

	public String getShaderString() {
		return shaderString;
	}


}
