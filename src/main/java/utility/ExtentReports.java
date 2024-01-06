package utility;

import com.aventstack.extentreports.ExtentReports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReports {
	
	public static ExtentReports getReports () {
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter ("ExtentReports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		return extent;
			}

	private void attachReporter(ExtentSparkReporter sparkReporter) {
		
		
	}
	
	}
