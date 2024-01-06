package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabAddToCartPage {

	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addtocart;
	@FindBy (xpath = "//a[@class='shopping_cart_link']") private WebElement cart;
	@FindBy (xpath = "//div[text()='2']") private WebElement count;
	@FindBy (xpath = "//button[@id='checkout']") private WebElement checkout;
	@FindBy (xpath = "//input[@id=\'first-name\']") private WebElement firstname;
	@FindBy (xpath = "//input[@id=\'last-name\']") private WebElement lastname;
	@FindBy (xpath = "//input[@id='postal-code']") private WebElement postalcode;
	@FindBy (xpath = "//input[@id='continue']") private WebElement continuebutton;
	@FindBy (xpath = "//button[@id='finish']") private WebElement finish;
	@FindBy (xpath = "//button[@id='back-to-products']") private WebElement backtoproducts;
	
	
	public SwagLabAddToCartPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCart () {
		addtocart.click();
	}
	
	public void clickOnCart () {
		cart.click();
	}
	
	public void enterCount () {
		count.sendKeys("2");
	}
	
	public void clickOnCheckOut () {
		checkout.click();
	}
	
	public void enterFirstName (String name) {
		firstname.sendKeys(name);
	}
	
	public void enterLastName (String name) {
		lastname.sendKeys(name);
	}
	
	public void enterPostalCode (String num) {
		postalcode.sendKeys(num);
	}
	
	public void clickOnContinueButton () {
		continuebutton.click();
	}
	
	public void clickOnFinish () {
		finish.click();
	}
	
	public void clickOnBackToProducts () {
		backtoproducts.click();
	}
}
