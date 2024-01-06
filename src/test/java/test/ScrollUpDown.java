package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import pojo.Browser;

public class ScrollUpDown {

	public static void main(String[] args) {
		
		WebDriver driver = Browser.openChromeBrowser("https://www.bata.com/in/");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(100,1900)");

	}

}
