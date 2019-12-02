package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TextboxText {
	
	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");
	
	@Test
	public void TextboxMethods() 
	{
		WebElement USERNAME = driver.findElement(By.name("userName"));
		System.out.println(USERNAME.getAttribute("type"));
		System.out.println(USERNAME.getAttribute("name"));
		System.out.println(USERNAME.getAttribute("size"));
		System.out.println(USERNAME.getTagName());
	}
	
	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}

}
