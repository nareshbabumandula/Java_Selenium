package oops;

public class ClassA {

	int a = 10;
	int b = 20;

	public void addition() {
		int c = a + b;
		System.out.println("Addition of a and b is : " + c);
	}

	public void subtraction() {
		int c = a - b;
		System.out.println("Subtraction of a and b is : " + c);
	}

	public void multiplication() {
		int c = a * b;
		System.out.println("Multiplication of a and b is : " + c);
	}

	public void division() {
		int c = a / b;
		System.out.println("Division of a and b is : " + c);
	}

	public void modulus() {
		int c = a % b;
		System.out.println("Modulus of a and b is : " + c);
	}

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.addition();
		obj.subtraction();
		obj.division();
		obj.modulus();
		obj.multiplication();
	
	}

}
