package object.repository;

import org.openqa.selenium.By;

public class RegistrationPage{

	
	// Page objects
	public By REGISTER = By.linkText("REGISTER");
	public By FIRSTNAME = By.name("firstName");
	public By LASTNAME = By.name("lastName");
	public By PHONE = By.name("phone");
	public By EMAIL = By.id("userName");
	public By ADDRESS = By.name("address1");
	public By CITY = By.name("city");
	public By STATE = By.name("state");
	public By COUNTRY = By.name("country");
	public By POSTALCODE = By.name("postalCode");
	public By USERNAME = By.name("email");
	public By PASSWORD = By.name("password");
	public By CNFPASSWORD = By.name("confirmPassword");
	public By SUBMIT = By.name("register");
	
}
