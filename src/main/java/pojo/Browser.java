package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openChromeBrowser (String url) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Namra/Drivers/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to(url);
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
	}


}
