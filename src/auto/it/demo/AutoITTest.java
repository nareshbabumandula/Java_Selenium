package auto.it.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AutoITTest {

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");

	@Test
	public void FileUpload() throws IOException, InterruptedException 
	{
		driver.findElement(By.id("uploadfile_0")).click();
		Thread.sleep(4000);
		// Upload a file using AUTOIT script
		Runtime.getRuntime().exec(strProjectPath + "\\autoit scripts\\FileUpload.au3");
		Thread.sleep(4000);
		
	}

	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}

}
