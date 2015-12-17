package by.bsuir.myfullviolin.service;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileService {
	private Context context;
	public void save(String filename,String content) throws Exception{
		FileOutputStream outStream = context.openFileOutput(filename, Context.MODE_PRIVATE);
		outStream.write(content.getBytes());
		outStream.close();
	}
	
	public FileService(Context context) {
		this.context = context;
	}
	
	public void write(String inputFilename,String outputFilename) throws IOException 
	{
		
		InputStream fis = context.getAssets().open(inputFilename);
		FileOutputStream fos = context.openFileOutput(outputFilename,Context.MODE_PRIVATE);
		int hasRead=0;
		byte[] buffer = new byte[1024];
		while((hasRead=fis.read(buffer))>0)
		{
			fos.write(buffer,0,hasRead);
		}
		if(fis!=null)
		{
			fis.close();
		}
		if(fos!=null)
		{
			fos.close();
		}
	}

	public String read(String filename) throws Exception{
	
		FileInputStream fis = context.openFileInput(filename);
		byte[] buff = new byte[1024];
		int hasRead = 0;
		StringBuilder sb = new StringBuilder("");
		while((hasRead = fis.read(buff))>0)
		{
			sb.append(new String(buff,0,hasRead));
		}
		if(fis!=null)
		{
			fis.close();
		}
		return sb.toString();
	}
		
		
	}

