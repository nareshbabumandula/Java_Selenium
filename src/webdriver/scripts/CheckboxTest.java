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

public class CheckboxTest {

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");

	@Test
	public void CheckboxMethods() throws InterruptedException 
	{
		WebElement chkStudent = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));

		System.out.println("Before selecting the Student checkbox the selection status is - " + chkStudent.isSelected());
		System.out.println(chkStudent.getAttribute("id"));
		System.out.println(chkStudent.getAttribute("type"));
		System.out.println(chkStudent.getAttribute("name"));
		System.out.println(chkStudent.getTagName());
		chkStudent.click();  // Select Student checkbox
		System.out.println("After selecting the Student checkbox the selection status is - " + chkStudent.isSelected());
	
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
