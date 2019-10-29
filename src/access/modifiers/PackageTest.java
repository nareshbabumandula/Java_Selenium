package access.modifiers;

public class PackageTest {
	
	String USERNAME = "Aruna";
	String PASSWORD = "Secure1234";
	
	void Login()
	{
		System.out.println("Executing login method...!");
	}
	
	
	void searchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}
	

	// Constructor
	PackageTest() {
		System.out.println("Executing package constructor..!");
	}
	
	
	public static void main(String[] args) {
			
		PackageTest pt = new PackageTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();
		pt.searchProduct();

	}

}
