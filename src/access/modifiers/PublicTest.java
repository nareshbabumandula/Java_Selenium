package access.modifiers;

public class PublicTest {
	
	public String USERNAME = "Aruna";
	public String PASSWORD = "Secure1234";
	
	public void Login()
	{
		System.out.println("Executing login method...!");
	}
	
	
	public void searchProduct()
	{
		System.out.println("Executing SearchProduct method...!");
	}
	

	// Constructor
	public PublicTest() {
		System.out.println("Executing public constructor..!");
	}
	
	
	public static void main(String[] args) {
			
		PublicTest pt = new PublicTest();
		System.out.println(pt.USERNAME);
		System.out.println(pt.PASSWORD);
		pt.Login();
		pt.searchProduct();

	}

}
