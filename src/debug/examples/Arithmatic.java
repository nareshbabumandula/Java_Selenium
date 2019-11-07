package debug.examples;

public class Arithmatic
{
	
	
	// Step InTo - F5
	// Step Over - F6
	
	static int a,b;
	
	static void Addition()
	{
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}


	public static void main(String[] args)
	{
		a=10;
		b=20;
		Arithmatic arth = new Arithmatic();
		arth.Addition();
		int c=100;

	}


}