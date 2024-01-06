package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabBuyPage {

	@FindBy (xpath = "//img[@alt='Sauce Labs Bike Light']") private WebElement bikelight;
	@FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addtocart;
	@FindBy (xpath = "//a[@class='shopping_cart_link']") private WebElement cart;
	@FindBy (xpath = "//button[@id='continue-shopping']") private WebElement continueshopping;
	
	public SwagLabBuyPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBikeLight(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//img[@alt='Sauce Labs Bike Light']")));
		bikelight.click();
	}
	
	public void clickOnAddToCart () {
		addtocart.click();
	}
	
	public void clickOnCart () {
		cart.click();
	}
	
	public void clickOnContinueShopping () {
		continueshopping.click();
	}	
	
}
