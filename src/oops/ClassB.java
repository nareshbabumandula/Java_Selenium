package oops;

public class ClassB extends ClassA {
	
	public void Average(int a, int b, int c)
	{
		int d = (a+b+c)/3;
		System.out.println("Average of a, b and c is : " + d);
	}

	public static void main(String[] args) {
		ClassB bb = new ClassB();
		bb.addition();
		

	}

}
