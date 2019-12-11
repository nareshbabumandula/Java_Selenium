package testng.annotations.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterSuite {
	
	/**
	 * @BeforeSuite: The annotated method will be run before all tests in this suite have run.
	   @AfterSuite: The annotated method will be run after all tests in this suite have run.
	 */
	

	@BeforeSuite
	public void LaunchBrowser()
	{
		System.out.println("@BeforeSuite - LaunchBrowser");
	}
	

	@AfterSuite
	public void TearDown()
	{
		System.out.println("@AfterSuite - TearDown");
	}
	
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
