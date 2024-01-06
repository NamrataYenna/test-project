package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openChromeBrowser("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(1000);
		WebElement preclose = driver.findElement(By.xpath("(//table//tbody)[2]//tr[1]//td[3]"));
		System.out.println(preclose.getText());

	}

}
