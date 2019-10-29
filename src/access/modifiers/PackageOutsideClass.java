package access.modifiers;

public class PackageOutsideClass {

	public static void main(String[] args) {
		PackageTest pt1 = new PackageTest();
		System.out.println(pt1.USERNAME);
		System.out.println(pt1.PASSWORD);
		pt1.Login();
		pt1.searchProduct();


	}

}
