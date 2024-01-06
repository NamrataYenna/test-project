package test;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pojo.Browser;
import utility.PageElement;


public class AlertTest {

	@Listeners (utility.MyListeners.class) 

	public class BataLoginPageTest extends PageElement{

		
		@BeforeMethod 
		public void openBrowser () throws IOException {
		driver = Browser.openChromeBrowser("https://omayo.blogspot.com/");
				}
		
		@Test
		public void validateAlertpopup () {
			driver.findElement(By.id("alert1")).click();
			Alert alert = driver.switchTo().alert();
			String urlText= alert.getText();
			System.out.println(urlText);
			alert.accept();
				}
		
		@AfterMethod
		public void closeBrowser () {
			driver.close();
			driver.quit();
				}
}}
