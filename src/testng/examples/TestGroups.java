package testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGroups {
	
	/**
	 * @BeforeSuite: The annotated method will be run before all tests in this suite have run.
	   @AfterSuite: The annotated method will be run after all tests in this suite have run.
	 */
	

	@BeforeSuite(groups={"smoke"})
	public void LaunchBrowser()
	{
		System.out.println("@BeforeSuite - LaunchBrowser");
	}
	

	@AfterSuite
	public void TearDown()
	{
		System.out.println("@AfterSuite - TearDown");
	}
	
	@BeforeClass(groups={"smoke"})
	public void Login()
	{
		System.out.println("@BeforeClass - Login");
	}
	
	@BeforeTest(groups={"smoke"})
	public void AccessSite()
	{
		System.out.println("@BeforeTest - AccessSite");
	}
	
	@BeforeMethod(groups={"regression"})
	public void ReadProductName()
	{
		System.out.println("@BeforeMethod - ReadProductName");
	}
	
	@AfterMethod(groups={"regression"})
	public void ProductAvailability()
	{
		System.out.println("@AfterMethod - ProductAvailability");
	}
	
		
	@Test(priority=0, groups={"smoke", "regression"})
	public void SearchProduct()
	{
		System.out.println("@Test - SearchProduct");
	}
	
	@Test(priority=1, groups={"smoke", "regression"})
	public void AddToCart()
	{
		System.out.println("@Test - AddToCart");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("@AfterTest - CloseBrowser");
	}
	
	
	@AfterClass(groups= {"smoke"})
	public void Logout()
	{
		System.out.println("@AfterClass - Logout");
	}

}
