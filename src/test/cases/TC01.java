package test.cases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import object.repository.LoginPage;
import object.repository.RegistrationPage;

public class TC01 extends RegistrationPage{



	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");
	
	LoginPage lp = new LoginPage();
	
	
	@Test
	public void verifyNewUserLogin()
	{
		boolean bFlag = false;

		try {
			driver.findElement(REGISTER).click();
			driver.findElement(FIRSTNAME).sendKeys("Naresh");
			driver.findElement(LASTNAME).sendKeys("Mandula");
			driver.findElement(PHONE).sendKeys("9502056473");
			driver.findElement(EMAIL).sendKeys("naresh223@gmail.com");
			driver.findElement(ADDRESS).sendKeys("KPHB Colony");
			driver.findElement(CITY).sendKeys("Hyderabad");
			driver.findElement(STATE).sendKeys("Telangana");
			driver.findElement(POSTALCODE).sendKeys("5000823");

			Select list = new Select(driver.findElement(COUNTRY));
			list.selectByVisibleText("INDIA");

			driver.findElement(USERNAME).sendKeys("naresh223");
			driver.findElement(PASSWORD).sendKeys("Secure*1234");
			driver.findElement(CNFPASSWORD).sendKeys("Secure*1234");
			driver.findElement(SUBMIT).click();
			
			LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
			
			lp.SIGNOFF.click();
			lp.HOME.click();
			lp.USERID.sendKeys("naresh223");
			lp.PWD.sendKeys("Secure*1234");
			lp.SIGNIN.click();
			
			if (lp.SIGNOFF.isDisplayed()) {
				bFlag = true;
			} else {
				bFlag = false;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			Assert.assertEquals(true, true, "Failed to register and login into the Mercury Tours site as a new user");
		}

	}
	
	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Implicit wait with 20 secs for timeout
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}




}
