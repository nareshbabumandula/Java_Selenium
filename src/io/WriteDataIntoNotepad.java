package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoNotepad {
	
	public void FileWrite() throws IOException 
	{
		
		try {
			String strFilepath = "C:\\Users\\NareshBabu\\Documents\\GitHub\\Java_Selenium\\Files\\Output.txt";
			FileWriter fw = new FileWriter(strFilepath);
			
			for (int i = 1; i < 10; i++) {
				fw.write("Java Selenium - "  + i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) throws IOException {
		WriteDataIntoNotepad write = new WriteDataIntoNotepad();
		write.FileWrite();
	}

}
