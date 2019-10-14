package oops;

public class MethodOverridingTest extends MethodOverloadTest {

	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("Addition of a and b in subclass : " + c);
	}
	
	public void Demo()
	{
		this.addition(10,20); //Current or subclass addition method will be called
		super.addition(30,40); //Superclass addition method will be called
	}
	
	
	
	public static void main(String[] args) {
		MethodOverridingTest mot = new MethodOverridingTest();
		//mot.addition(20,30);
		mot.Demo();

	}

}
