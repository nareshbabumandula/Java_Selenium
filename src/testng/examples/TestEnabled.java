package testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestEnabled {
	
	/**
	 * enabled - Whether methods on this class/method are enabled.
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
	
	@Test(enabled=false)
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
