package testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAlwaysRun {
	
	/**
	 * alwaysrun - If set to true, this test method will always be run even if it depends on a method that failed.
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
	
	@Test(dependsOnMethods= {"SearchProduct"}, alwaysRun=true)
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
