package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import pojo.Browser;
import pom.BataLoginPage;
import utility.PageElement;
import utility.Parametrization;
import utility.Screenshots;



@Listeners (utility.MyListeners.class) 

public class BataLoginPageTest extends PageElement{
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void createReports() {
//	reports = ExtentReports.getReports();
		}
	
	@BeforeMethod 
	public void openBrowser () throws IOException {
	driver = Browser.openChromeBrowser("https://www.bata.com/in/");
		}
	
	@Test
	public void validateBataLogin () throws EncryptedDocumentException, IOException {
		BataLoginPage bataLoginPage = new BataLoginPage (driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		bataLoginPage.clickONLoginButton();
		bataLoginPage.enterUserName(Parametrization.getExcelData(0,0,"Bata"));
		bataLoginPage.enterPassword(Parametrization.getExcelData(1, 0, "Bata"));
		bataLoginPage.clickONLogin();
		Screenshots.takesScreenshot(driver, "validateBataLogin");
		String exceptedUrl = "https://www.bata.com/in/?registration=false";
		Assert.assertEquals(driver.getCurrentUrl(), exceptedUrl);
		
		 }

	@AfterMethod
	public void captureResults(ITestResult result) throws IOException 
	  {
		if (result.getStatus()==ITestResult.SUCCESS)
			{
			test.log(Status.PASS, result.getName());
			}
		else if (result.getStatus()==ITestResult.FAILURE)
			{
			test.log(Status.FAIL, result.getName());	
			Screenshots.takesScreenshot(driver, "C:\\Users\\Namra\\eclipse-workspace\\FirstProject\\Screenshots");
			}
		else {
			test.log(Status.SKIP, result.getName());
				}
	  }
	
	@AfterTest
	public void flushResults() {
	reports.flush();
			}	
		}
