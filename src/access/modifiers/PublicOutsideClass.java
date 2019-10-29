package access.modifiers;

public class PublicOutsideClass {

	public static void main(String[] args) {
		PublicTest pt1 = new PublicTest();
		System.out.println(pt1.USERNAME);
		System.out.println(pt1.PASSWORD);
		pt1.Login();
		pt1.searchProduct();


	}

}
