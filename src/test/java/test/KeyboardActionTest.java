package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Browser;
import utility.PageElement;

public class KeyboardActionTest extends PageElement {

	@BeforeMethod 
	public void openBrowser () throws IOException {
	driver = Browser.openChromeBrowser("https://demoqa.com/text-box");
		}
	
	@Test
	public void validateKeyBoardAction () {
		WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("namrata"); 
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB); 
		actions.sendKeys("xyz@gmail.com"); 
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("India"); 
		actions.keyDown(Keys.CONTROL); 
		actions.sendKeys("a");
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL); 
		actions.sendKeys(Keys.TAB);
		actions.perform();
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform(); 
	}
}
