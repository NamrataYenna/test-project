package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pojo.Browser;
import pom.SwagLabBuyPage;
import pom.SwagLabLoginPage;
import utility.PageElement;
import utility.Parametrization;
import utility.Screenshots;

@Listeners 

public class SwagLabBuyPageTest extends PageElement {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void createReports() {
//	reports = ExtentReports.getReports();
		}
	
	
	@BeforeMethod 
	public void openBrowser () throws IOException {
	driver = Browser.openChromeBrowser("https://www.saucedemo.com/");
		}
	
	@Test
	
	public void validateSwagLabLogin () throws EncryptedDocumentException, IOException, InterruptedException {
	SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage (driver);
	swagLabLoginPage.enterUserName(Parametrization.getExcelData(0,0,"Credentials"));
	swagLabLoginPage.enterPassword(Parametrization.getExcelData(1, 0, "Credentials"));
	swagLabLoginPage.clickONLogin();
	Screenshots.takesScreenshot(driver, "C:\\Users\\Namra\\eclipse-workspace\\FirstProject\\Screenshots");
	String exceptedUrl = "https://www.saucedemo.com/inventory.html";
	Assert.assertEquals(driver.getCurrentUrl(), exceptedUrl);
	Thread.sleep(1000);
			}
	
	@Test 
	
	public void validateSwagLabBuy () throws InterruptedException {
	SwagLabBuyPage swagLabBuyPage = new SwagLabBuyPage (driver);
	swagLabBuyPage.clickOnBikeLight (driver);
	swagLabBuyPage.clickOnAddToCart();
	swagLabBuyPage.clickOnCart();
	swagLabBuyPage.clickOnContinueShopping();
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