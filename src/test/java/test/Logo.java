package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Browser;

public class Logo {

	public static void main(String[] args) {
	
		WebDriver driver = Browser.openChromeBrowser("https://kite.zerodha.com/?next=%2Fdashboard");
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Kite']"));
		
		String value = logo.getAttribute("src");
		
		System.out.println(value);
	}

}
