package testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDependsOnMethods {
	
	/**
	 * dependsOnMethods	- The list of methods this method depends on.
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
	
	@Test(dependsOnMethods= {"SearchProduct"})
	public void AddToCart()
	{
		System.out.println("@Test - AddToCart");
	}
		
	@Test(dependsOnMethods= {"AddToCart"})
	public void Checkout()
	{
		System.out.println("@Test - Checkout");
	}
	
	
	@AfterClass
	public void Logout()
	{
		System.out.println("@AfterClass - Logout");
	}

}
