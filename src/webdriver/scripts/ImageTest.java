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

public class ImageTest {

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");

	@Test
	public void ImageMethods() throws InterruptedException 
	{
		WebElement imgMercuryLogo = driver.findElement(By.xpath("//img[@alt='Mercury Tours']"));
		
		System.out.println(imgMercuryLogo.getAttribute("src"));
		System.out.println(imgMercuryLogo.getAttribute("width"));
		System.out.println(imgMercuryLogo.getAttribute("height"));
		System.out.println(imgMercuryLogo.getAttribute("alt"));
		System.out.println(imgMercuryLogo.getTagName());
		imgMercuryLogo.click();  // Click on Image
		
	}

	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}

}
