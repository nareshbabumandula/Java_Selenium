package webdriver.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

	// Project Path
		String strProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com");
		System.out.println(driver.getWindowHandle()); // Session ID
		System.out.println(driver.getCurrentUrl()); // Page current URL
		String strTitle = driver.getTitle();
		System.out.println(strTitle);
		driver.findElement(By.name("userName")).sendKeys("Aruna");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Secure1234");
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click(); // Selenium WebDriver code to click on a link
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle()); // Session ID
		System.out.println(driver.getCurrentUrl()); // Page current URL
		driver.navigate().back(); // Navigate the browser back
		Thread.sleep(2000);
		driver.navigate().forward(); // Navigate the browser forward
		Thread.sleep(2000);
		driver.navigate().refresh(); // Refresh the browser
		System.out.println(driver.getWindowHandles()); // Session ID's of the tabs opened
		driver.quit(); // Close the browser instances
	}
	

}
