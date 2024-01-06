package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BataLoginPage {
	
	@FindBy (xpath = "//span[@class='cc-headerBar-label'][normalize-space()='Login']") private WebElement loginbutton;
	@FindBy (xpath = "//input[@id='login-form-email']") private WebElement username;
	@FindBy (xpath= "//input[@id='login-form-password']") private WebElement password;
	@FindBy (xpath = "//button[normalize-space()='Sign in']") private WebElement login;
	
	public BataLoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickONLoginButton () {
		loginbutton.click();
	}
	
	public void enterUserName (String user) {
		username.sendKeys(user);
	}
	
	public void enterPassword (String pass) {
		password.sendKeys(pass);
	}
	
	public void clickONLogin () {
		login.click();
	}

}
