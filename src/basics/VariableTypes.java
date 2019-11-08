package basics;

public class VariableTypes {

	//Instance variables
	int a = 10;
	int b = 20;
	static int g = 100; //Static variable 
	
	public void addition(){
		//Local variables 
		int d = 30;
		int e = 40;
		int f = d + e;
		System.out.println("Addition of d and e : "+f);
	}
	
	public void Substraction(){
		System.out.println(a);
	}
		public static void main(String[] args) {
		VariableTypes vt = new VariableTypes();
		vt.addition();
		vt.Substraction();

		System.out.println(vt.a);
		System.out.println(vt.b);
		System.out.println(g); 
		
		}
	
}
