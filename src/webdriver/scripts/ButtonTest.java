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

public class ButtonTest {

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");

	@Test
	public void ButtonMethods() throws InterruptedException 
	{
		WebElement txtSEARCHBOX = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement btnSEARCH = driver.findElement(By.cssSelector("input[value='Go']"));

		System.out.println(btnSEARCH.getAttribute("type"));
		System.out.println(btnSEARCH.getAttribute("class"));
		System.out.println(btnSEARCH.getAttribute("value"));
		System.out.println(btnSEARCH.getAttribute("tabindex"));
		System.out.println(btnSEARCH.getTagName());

		txtSEARCHBOX.sendKeys("mobile");
		// Click on Search button
		btnSEARCH.click();

	}

	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}

}
