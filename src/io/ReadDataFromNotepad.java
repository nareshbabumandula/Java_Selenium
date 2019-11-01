package io;

import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromNotepad {
	
	public void FileRead() throws IOException 
	{
		String strFilepath = "C:\\Users\\NareshBabu\\Documents\\GitHub\\Java_Selenium\\Files\\Input.txt";
		FileReader fr = new FileReader(strFilepath);
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.println((char)i); //Converting or casting Integer to Char
		}
	}

	public static void main(String[] args) throws IOException {
		ReadDataFromNotepad read = new ReadDataFromNotepad();
		read.FileRead();
	}

}
