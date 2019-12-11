package testng.annotations.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest {
	
	/**
	 * @BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	   @AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
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
