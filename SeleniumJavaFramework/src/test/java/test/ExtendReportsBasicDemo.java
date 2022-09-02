package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {
	static WebDriver driver=null;

	public static void main(String[] args) {
	ExtentHtmlReporter htmlReporter =new   ExtentHtmlReporter("extentReports.html");
	
	ExtentReports extent =new 	ExtentReports();
	extent.attachReporter(htmlReporter);
	
	ExtentTest test=extent.createTest("Google Search One");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\Chromedriver\\chromedriver.exe");
	 driver =new ChromeDriver();
	 
	 test.log(Status.INFO, "Starting Test case");
	 driver.get("https://google.com");
	 
	 test.pass("Navigated to google.com");
	 
	 driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	 test.pass("Enter text in Searchbox");
	 
	 
	 
	 test.pass("pressed keyboard enter key");
	 
	 driver.close();
	 
	 driver.quit();
	 test.pass("Closed the browser");
	 
	 test.info("Test Completed");
	 
	 
	 extent.flush();
	 
	 
	 
	
	
   
	}

}
