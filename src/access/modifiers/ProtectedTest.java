package access.modifiers;

public class ProtectedTest {
	
	protected String USERNAME = "Aruna";
	protected String PASSWORD = "Secure1234";
	
	protected void Login()
	{
		System.out.println("Executing login method...!");
	}
	
	
	protected void searchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}
	

	// Constructor
	protected ProtectedTest() {
		System.out.println("Executing proctected constructor..!");
	}
	
	
	public static void main(String[] args) {
			
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();
		pt.searchProduct();

	}

}
