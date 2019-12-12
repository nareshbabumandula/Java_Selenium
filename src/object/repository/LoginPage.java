package object.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
	// Page Factory
	
	 @FindBy(id = "foobar") WebElement foobar;
	
	// Syntax - 1
	@FindBy(linkText="SIGN-OFF")
	public WebElement SIGNOFF;
	
	// Syntax - 2
	@FindBy(how=How.LINK_TEXT, using="Home")
	public WebElement HOME;
	
	
	// Syntax - 3
	@FindBy(xpath="//input[@name='userName']")
	public WebElement USERID;

	@CacheLookup
	@FindBy(name="password")
	public WebElement PWD;

	@FindBy(name="login")
	public WebElement SIGNIN;

	
	// Reusable methods
	public void Login()
	{
		//USERID.sendKeys("naresh");
		//PWD.sendKeys("Secure*1234");
	}
	
	public void forgotPassword()
	{
		
	}
	
	
}
