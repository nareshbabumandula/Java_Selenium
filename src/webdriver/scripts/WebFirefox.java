package webdriver.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebFirefox {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Aruna Ravilla\\Documents\\GitHub\\Java_Selenium\\browsers\\geckodriver.exe" );
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com");
		

	}

}
