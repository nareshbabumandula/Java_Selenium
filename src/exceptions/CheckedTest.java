package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedTest {
	
	public void ReadFile() throws IOException
	{
		String str;
		String strFilePath = "C:\\Users\\NareshBabu\\Documents\\GitHub\\Java_Selenium\\Files\\Input.txt";
	
		FileReader fr = new FileReader(strFilePath);
		BufferedReader br = new BufferedReader(fr);
		
		//Read line from the file till it reaches null
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}
	
	public void ReadFileTest() 
	{
		try {
			String str;
			String strFilePath = "C:\\Users\\NareshBabu\\Documents\\GitHub\\Java_Selenium\\Files\\Input123.txt";
		
			FileReader fr = new FileReader(strFilePath);
			BufferedReader br = new BufferedReader(fr);
			
			//Read line from the file till it reaches null
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured..!");
		}
		
	}

	public static void main(String[] args) throws IOException {
		
		CheckedTest ct = new CheckedTest();
		//ct.ReadFile();
		ct.ReadFileTest();
	}

}
