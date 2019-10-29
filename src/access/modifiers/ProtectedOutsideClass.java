package access.modifiers;

public class ProtectedOutsideClass {

	public static void main(String[] args) {
		ProtectedTest pt1 = new ProtectedTest();
		System.out.println(pt1.USERNAME);
		System.out.println(pt1.PASSWORD);
		pt1.Login();
		pt1.searchProduct();


	}

}
