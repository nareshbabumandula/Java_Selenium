package access.modifiers.outside;

import access.modifiers.ProtectedTest;

public class ProtectedOutsidePackage extends ProtectedTest{
	
	
	public static void main(String[] args) {
			
		ProtectedOutsidePackage pt1 = new ProtectedOutsidePackage();
		System.out.println(pt1.USERNAME);
		System.out.println(pt1.PASSWORD);
		pt1.Login();
		pt1.searchProduct();

	}

}
