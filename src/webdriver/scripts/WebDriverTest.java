package webdriver.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aruna Ravilla\\Documents\\GitHub\\Java_Selenium\\browsers\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com");
	}
	

}
