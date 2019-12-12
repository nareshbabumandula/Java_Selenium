package testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPriority {
	
	/**
	 * priority - The priority for this test method. Lower priorities will be scheduled first..
	 */
	
	@BeforeClass
	public void Login()
	{
		System.out.println("@BeforeClass - Login");
	}
	
	@Test(priority=0)
	public void SearchProduct()
	{
		System.out.println("@Test - SearchProduct");
	}
	
	@Test(priority=1)
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
