package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class RadioButtonTest {

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");

	@Test
	public void RadioButtonMethods() throws InterruptedException 
	{
		WebElement rbtnRoundTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));

		System.out.println("Before selecting the Round Trip radio button the selection status is - " + rbtnRoundTrip.isSelected());
		System.out.println(rbtnRoundTrip.getAttribute("id"));
		System.out.println(rbtnRoundTrip.getAttribute("type"));
		System.out.println(rbtnRoundTrip.getAttribute("value"));
		System.out.println(rbtnRoundTrip.getAttribute("name"));
		System.out.println(rbtnRoundTrip.getTagName());
		rbtnRoundTrip.click();  // Select Round Trip radio button
		System.out.println("After selecting the Round Trip radio button the selection status is - " + rbtnRoundTrip.isSelected());
	
	}

	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}

}
