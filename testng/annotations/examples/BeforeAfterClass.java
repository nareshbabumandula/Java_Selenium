package testng.annotations.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	
	/**
	 * @BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	   @AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	 */
	
	@BeforeClass
	public void Login()
	{
		System.out.println("@BeforeClass - Login");
	}
	
	@Test
	public void SearchProduct()
	{
		System.out.println("@Test - SearchProduct");
	}
	
	@Test
	public void AddToCart()
	{
		System.out.println("@Test - AddToCart");
	}
	
	
	@AfterClass
	public void Logout()
	{
		System.out.println("@AfterClass - Logout");
	}

}
