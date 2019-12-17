package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class JSTestExample {

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");

	@Test
	public void RadioButtonJSMethods() throws InterruptedException 
	{
		WebElement rbtnRoundTrip = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		// Click on a RoundTrip radio button using JavaScriptExecutor
		js.executeScript("arguments[0].click();", rbtnRoundTrip);
		Thread.sleep(2000);
		js.executeScript("document.getElementById('ctl00_mainContent_chk_IndArm').checked=true;");
		Thread.sleep(2000);
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
