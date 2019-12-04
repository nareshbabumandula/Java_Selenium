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

public class LinkTest {

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");

	@Test
	public void LinkMethods() throws InterruptedException 
	{
		//WebElement lnkCorporate = driver.findElement(By.linkText("Corporate Governance"));
		WebElement lnkCorporate = driver.findElement(By.partialLinkText("Governance"));
		
		System.out.println(lnkCorporate.getAttribute("href"));
		System.out.println(lnkCorporate.getTagName());
		System.out.println(lnkCorporate.getText()); // Get the link name/text

		// Click on Link
		lnkCorporate.click();

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
