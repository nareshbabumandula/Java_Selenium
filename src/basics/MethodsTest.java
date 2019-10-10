package basics;

public class MethodsTest 
{

	// Method without arguments/parameters and without return value
	public void Addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	// Method with arguments/parameters and without return value
	public void Subtraction(int a, int b)
	{
		int c=a-b;
		System.out.println("Subtraction of a and b is : " + c);
	}
	
	// Method without arguments/parameters and with return value
	public int Multiplication()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("Multiplication of a and b is : " + c);
		return c;
	}
	
	// Method with arguments/parameters and without return value
	public int Modulus(int a, int b)
	{
		int c=a%b;
		System.out.println("Modulus of a and b is : " + c);
		return c;
	}
	
	
	
	public static void main(String[] args) 
	{
		// Classname objname = new Constructor(); 
		MethodsTest mt = new MethodsTest();
		mt.Addition();
		mt.Subtraction(30, 10);
		mt.Multiplication();
		mt.Modulus(100,20);
		
	}

}
