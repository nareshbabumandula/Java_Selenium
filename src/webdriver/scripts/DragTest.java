package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class DragTest {
	
	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");
	
	@Test
	public void DragMethods() throws InterruptedException 
	{
		Actions menu = new Actions(driver);
		driver.findElement(By.linkText("Draggable")).click();
		// Switch the driver focus into the iframe
		driver.switchTo().frame(0); 
		menu.dragAndDropBy(driver.findElement(By.id("draggable")), 330, 30).perform();
		Thread.sleep(4000);
		// Switch the driver focus out from the iframe
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Autocomplete")).click();
		Thread.sleep(2000);
	}
	
	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}

}
