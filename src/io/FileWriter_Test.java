package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriter_Test {

	public static void main(String[] args) throws IOException {
		
		String str;
		String strFilepath = "C:\\Users\\NareshBabu\\Documents\\GitHub\\Java_Selenium\\Files\\Output.txt";
			
		FileWriter fr = new FileWriter(strFilepath);
		BufferedWriter bw = new BufferedWriter(fr);
		
		//Write data into the notepad
		bw.write("hello");
		bw.newLine();
		bw.write("world");
		bw.newLine();
		bw.write("this is core java");
		bw.close();
		
	}

}
