package access.modifiers.outside;

import access.modifiers.PublicTest;

public class PublicOutsidePackage {

	public static void main(String[] args) {
		PublicTest pt2 = new PublicTest();
		System.out.println(pt2.USERNAME);
		System.out.println(pt2.PASSWORD);
		pt2.Login();
		pt2.searchProduct();

	}

}
