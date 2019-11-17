package webdriver.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebIE {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\Aruna Ravilla\\Documents\\GitHub\\Java_Selenium\\browsers\\IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com");
	}

}
