package sikuli.scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SikuliTest {
	
	public WebDriver driver;
	String strRootPath = System.getProperty("user.dir");
	
	@Test
	public void SikuliMethods() throws FindFailed, InterruptedException {
		Screen screen = new Screen();
		Pattern SearchTextbox = new Pattern(strRootPath + "/images/txtSearch.png");
		Pattern Searchbutton = new Pattern(strRootPath + "/images/btnSearch.png");

		Thread.sleep(4000);
		driver.findElement(By.linkText("Login & Signup")).sendKeys(Keys.ESCAPE);
		Thread.sleep(4000);
		screen.type(SearchTextbox, "Mobile charger");
		Thread.sleep(1000);
		screen.click(Searchbutton);
		Thread.sleep(4000);
	}
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", strRootPath + "/browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
