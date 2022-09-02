package test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	WebDriver driver=null;
	
	
	
	@BeforeSuite
	public void setUp() {
		
		 htmlReporter =new   ExtentHtmlReporter("extentReports.html");
		
		
		
		
		
		 extent =new 	ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
	}
		 
		 @BeforeTest
			public void setUPTest() {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\Chromedriver\\chromedriver.exe");
				 driver =new ChromeDriver();
		 
		
		
	}
	@Test
	public void test1() throws Exception {
		 ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		 
		 driver.get("https://www.google.com/");
		 test.pass("Navigated to google.com");

		
		  // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
	}
        
        
        @AfterTest
    	public void tearDownTest() {
    		driver.close();
    		driver.quit();
    		
		
		
		
	}
	@AfterSuite
    public void tearDown() {
		extent.flush();
    	
    }
}
