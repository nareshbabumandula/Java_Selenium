package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AlertTest {

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");

	@Test
	public void RadioButtonMethods() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		// Switch the WebDriver focus to an alert window
		Alert alertbox = driver.switchTo().alert();
		System.out.println(alertbox.getText());
		Thread.sleep(2000);
		//alertbox.accept(); // Click on OK button found om alert popup window
		alertbox.dismiss();

	}

	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}

}
