package test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.BataLoginPage;
import utility.PageElement;

@Listeners (utility.MyListeners.class)

public class DropdownPageTest extends PageElement {
	
	@BeforeMethod 
	public void openBrowser () throws IOException {
	driver = Browser.openChromeBrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		}
	
	@Test
	public void validateDropDown () throws InterruptedException {
		WebElement animals =driver.findElement(By.xpath("//select[@id='animals']"));
		Select select = new Select (animals);
		select.selectByVisibleText("Cat");
		Thread.sleep(3000);
		select.selectByVisibleText("Baby Cat");
		Thread.sleep(3000);
		select.selectByValue("avatar");
		Thread.sleep(3000);
		select.selectByIndex(2);
		
		WebElement products =driver.findElement(By.xpath("//select[@id='first']"));
		Select select1 = new Select (products);
		select1.selectByVisibleText("Bing");
		Thread.sleep(3000);
		select1.selectByVisibleText("Google");
		Thread.sleep(3000);
		select1.selectByValue("Apple");
		Thread.sleep(3000);
		select1.selectByIndex(3);
	}
	

	

}
