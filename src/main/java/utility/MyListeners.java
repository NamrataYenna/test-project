package utility;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class MyListeners extends TestListenerAdapter{
	
	
	public void onTestStart (ITestResult result) {
		System.out.println("on Test Start");
	}
	
	public void onTestSuccess (ITestResult result) {
		System.out.println(" on Test Success ");
	}
	
	public void onTestFailure (ITestResult result) {
		System.out.println("on Test Failure");
	}
	
	public void onTestSkipped (ITestResult result) {
		System.out.println("on test Skipped");
	}
	
	public void onFinish (ITestContext context) {
		System.out.println("on Finish");
	}
	
		}