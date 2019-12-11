package testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	
	/**
	 * @BeforeMethod: The annotated method will be run before each test method.
	   @AfterMethod: The annotated method will be run after each test method.
	 */
	
	@BeforeClass
	public void Login()
	{
		System.out.println("@BeforeClass - Login");
	}
	
	@BeforeTest
	public void AccessSite()
	{
		System.out.println("@BeforeTest - AccessSite");
	}
	
	@BeforeMethod
	public void ReadProductName()
	{
		System.out.println("@BeforeMethod - ReadProductName");
	}
	
	@AfterMethod
	public void ProductAvailability()
	{
		System.out.println("@AfterMethod - ProductAvailability");
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
	
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("@AfterTest - CloseBrowser");
	}
	
	
	@AfterClass
	public void Logout()
	{
		System.out.println("@AfterClass - Logout");
	}

}
