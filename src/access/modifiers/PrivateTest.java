package access.modifiers;

public class PrivateTest {
	
	private String USERNAME = "Aruna";
	private String PASSWORD = "Secure1234";
	
	private void Login()
	{
		System.out.println("Executing login method...!");
	}
	
	
	private void searchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}

	// Constructor
	private PrivateTest() {
		System.out.println("Executing private constructor..!");
	}
	
	
	public static void main(String[] args) {
			
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();
		pt.searchProduct();

	}

}
