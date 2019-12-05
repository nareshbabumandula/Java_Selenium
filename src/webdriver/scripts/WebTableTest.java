package webdriver.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTableTest {

	public WebDriver driver;
	String strProjectPath = System.getProperty("user.dir");
	
	@Test
	public void WebTableMethods()
	{
		//No.of Columns
        List<WebElement>  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " + col.size()); 
        //No.of rows 
        List<WebElement>  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        
        String strCellText = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText();
        System.out.println(strCellText);
        
        for (int i = 0; i < rows.size(); i++) {
        	
        	for (int j = 0; j < col.size(); j++) {
        		String strCellValue = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+(i+1)+"]/td["+(j+1)+"]")).getText();
            	System.out.println(strCellValue);
			}
		}
        
	}
	
	@BeforeClass
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", strProjectPath + "\\browsers\\chromedriver.exe" );
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void CloseBrowser() 
	{
		driver.quit(); // Kill the browser completely
	}

}
