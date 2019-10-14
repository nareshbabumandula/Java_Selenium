package oops;

public class MethodOverloadTest {
	
	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("Addition of a and b with arguments is : " + c);
	}
	
	public void addition(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Addition of a, b  and c is : " + d);
	}

	public void addition() {
		int a =100;
		int b = 40;
		int c = a + b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	public void addition(double a, double b) {
		double c = a + b;
		System.out.println("Addition of double a and b is : " + c);
	}
	
	public static void main(String[] args) {
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.addition(12,10,49);
	}

}
