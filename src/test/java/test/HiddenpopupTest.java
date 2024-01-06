package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.BataLoginPage;
import utility.PageElement;
import utility.Parametrization;
import utility.Screenshots;

public class HiddenpopupTest extends PageElement {
	
	@BeforeMethod 
	public void openBrowser () throws IOException {
	driver = Browser.openChromeBrowser("https://www.bata.com/in/");
		}
	
	@Test
	public void validateHiddenpopups () throws InterruptedException {
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		Thread.sleep(3000);
		WebElement practice = driver.findElement(By.xpath("//body/span[@class='page-meta-data']/div[@class='cc-main-wrapper page']/div[@id='maincontent']/span[@class='js-analytics-pageDesigner']/div[@id='home-page']/div[@class='cc-page-designer']/div[@class='cc-experience-component']/div[1]/div[1]/div[1]/div[1]/a[1]"));
		practice.click();
		practice.click();
		practice.click();
		Set <String> handles = driver.getWindowHandles();
		Iterator <String> i = handles.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
	}

	@AfterTest
	public void closeapp() {
	driver.close();
	driver.quit();
			}
}
