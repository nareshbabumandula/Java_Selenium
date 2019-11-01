package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {

	public void CheckedExceptionExample()
	{
		int a =100/0;
		
		boolean bFlag=false;
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
			bFlag=true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally
		{
			if (bFlag) {
				System.out.println("No Exception Occured..!");	
			}
			else
			{
				System.out.println("Method failed due to exception");	
			}
		}
	}

	public void CheckedExceptionThrows() throws IOException
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


	public static void main(String[] args) throws IOException {
		CheckedExceptionTest ce = new CheckedExceptionTest();
		//ce.CheckedExceptionThrows();
		ce.CheckedExceptionExample();

	}
}
