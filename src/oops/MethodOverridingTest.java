package oops;

public class MethodOverridingTest extends MethodOverloadTest {

	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("Addition of a and b in subclass : " + c);
	}
	
	static void compare(boolean a, boolean b)
	{
		 System.out.println("Executing static method in subclass..");
	}
	
	public void Demo()
	{
		this.addition(10,20); //Current or subclass addition method will be called
		super.addition(30,40); //Superclass addition method will be called
	}
	
	public MethodOverridingTest() {
		System.out.println("This is contructor in subclass..!");
	}
	
	
	public static void main(String[] args) {
		MethodOverridingTest mot = new MethodOverridingTest();
		//mot.addition(20,30);
		//mot.compare(true, false);
	}
 

}
