package webdriver.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ListboxTest {
	
	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");
	
	@Test
	public void TextboxMethods() throws InterruptedException 
	{
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement lstCountry = driver.findElement(By.name("country"));
		
		System.out.println(lstCountry.getAttribute("type"));
		System.out.println(lstCountry.getAttribute("size"));
		System.out.println(lstCountry.getTagName());
		
		Select list = new Select(lstCountry);
		list.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		list.selectByIndex(1);
		Thread.sleep(3000);
		
		List<WebElement> lstCountries = driver.findElements(By.tagName("option"));
		System.out.println("No of countries found in the Counrty dropdown are : " + lstCountries.size());
		
		for (Iterator iterator = lstCountries.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
			
			if(webElement.getText().equalsIgnoreCase("INDIA"))
			{
				System.out.println("Country INDIA is found");
				break;
			}
			
		}
		
		for (int i = 0; i < lstCountries.size(); i++) {
			System.out.println(lstCountries.get(i).getText());
		}
		
	}
	
	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}

}
