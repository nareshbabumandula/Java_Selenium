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

public class TextboxTest {
	
	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");
	
	@Test
	public void TextboxMethods() throws InterruptedException 
	{
		WebElement USERNAME = driver.findElement(By.name("userName"));
		
		System.out.println(USERNAME.getAttribute("type"));
		System.out.println(USERNAME.getAttribute("name"));
		System.out.println(USERNAME.getAttribute("size"));
		System.out.println(USERNAME.getTagName());
		Reporter.log("Successfully retrieved all the available attributes value");
		// Enter data in a textbox using WebDriver
		USERNAME.sendKeys("Shilpa@123");
		Thread.sleep(2000);
		USERNAME.clear();
		Thread.sleep(2000);
		USERNAME.sendKeys("Aruna");
	}
	
	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}

}
