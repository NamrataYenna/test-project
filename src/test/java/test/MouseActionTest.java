package test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import utility.PageElement;

public class MouseActionTest extends PageElement {
	
	@BeforeMethod 
	public void openBrowser () throws IOException {
	driver = Browser.openChromeBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		}
	
	@Test
	public void validateMouseAction () throws InterruptedException {
	WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions action = new Actions (driver);
	action.contextClick(rightclick);
	action.perform();
//	WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
//	edit.click();
//	Alert a = driver.switchTo().alert();
//	a.accept();
//	System.out.println("edit done");
//	Thread.sleep(5000);
	WebElement cut = driver.findElement(By.xpath("//span[text()='Cut']"));
	cut.click();
	Thread.sleep(5000);
	Alert a1 = driver.switchTo().alert();
	a1.accept();
	}

	@AfterMethod
	public void closeBrowser () {
		driver.close();
		driver.quit();
			}
}
