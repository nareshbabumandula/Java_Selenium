package oops;

public class ClassC extends ClassB{

	public static void main(String[] args) {
		ClassC cc = new ClassC();
		System.out.println(cc.a);
		System.out.println(cc.b);
		cc.addition();
		cc.subtraction();
		cc.multiplication();
		cc.division();
		cc.modulus();
		cc.Average(10, 20, 30);

	}

}
