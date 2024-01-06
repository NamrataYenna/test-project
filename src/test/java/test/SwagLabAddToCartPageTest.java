package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.SwagLabAddToCartPage;
import pom.SwagLabLoginPage;
import utility.PageElement;
import utility.Parametrization;
import utility.Screenshots;

public class SwagLabAddToCartPageTest extends PageElement {
	
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void createReports() {
//		reports = ExtentReports.getReports();
		}
	
	@BeforeMethod 
	public void openBrowser () throws IOException {
	driver = Browser.openChromeBrowser("https://www.saucedemo.com/");
		}
	
	@Test
	public void validateSwagLabLogin () throws EncryptedDocumentException, IOException {
		test = reports.createTest("validateSwagLabLogin");
		SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage (driver);
		swagLabLoginPage.enterUserName(Parametrization.getExcelData(0,0,"sheet1"));
		swagLabLoginPage.enterPassword(Parametrization.getExcelData(1, 0, "sheet1"));
		swagLabLoginPage.clickONLogin();
		String exceptedUrl = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(driver.getCurrentUrl(), exceptedUrl);
				 }
	
	@Test 
	public void validateSwagLabAddToCart () throws IOException {
		test = reports.createTest("validateSwagLabAddToCart");
		SwagLabAddToCartPage swagLabAddToCart = new SwagLabAddToCartPage (driver);
		swagLabAddToCart.clickOnAddToCart();
		swagLabAddToCart.clickOnCart();
		swagLabAddToCart.enterCount();
		swagLabAddToCart.clickOnCheckOut();
		swagLabAddToCart.clickOnContinueButton();
		swagLabAddToCart.clickOnFinish();
		swagLabAddToCart.clickOnBackToProducts();
		Screenshots.takesScreenshot(driver,"C:\\Users\\Namra\\eclipse-workspace\\FirstProject\\Screenshots");
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
