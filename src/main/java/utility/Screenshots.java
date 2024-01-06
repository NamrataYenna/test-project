package utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {

	public static void takesScreenshot (WebDriver driver, String name) throws IOException {
		 
		 File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File destination = new File ("C:\\Users\\Namra\\eclipse-workspace\\FirstProject\\Screenshots"+ name +".png");
		
		 FileHandler.copy(source, destination);

	}
}
