package grid.demo;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GridTest 
{
	WebDriver driver;
	String baseUrl, nodeUrl1, nodeUrl2;

	@BeforeTest
	public void Testing() throws MalformedURLException
	{
		baseUrl = "http://newtours.demoaut.com";
		nodeUrl1 = "http://169.254.208.63:5566/wd/hub";
		nodeUrl2 = "http://169.254.208.63:5556/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setBrowserName("internet explorer");
		capability.setVersion("11.0");
		capability.setPlatform(Platform.WINDOWS);
		try 
		{
			driver = new RemoteWebDriver(new URL(nodeUrl1), capability);
			driver = new RemoteWebDriver(new URL(nodeUrl2), capability);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/*@AfterTest

	public void afterTest()
	{
		driver.quit();
	}*/

	@Test

	public void simpleTest()
	{		
		driver.get(baseUrl);
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}
}