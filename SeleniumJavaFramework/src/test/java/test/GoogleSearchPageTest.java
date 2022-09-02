package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearchTest();
		
		
	}
     public static void  googleSearchTest() {
    	 
 			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\Chromedriver\\chromedriver.exe");
 			 driver =new ChromeDriver();
 			 
 			 
 			GoogleSearchPageObjects  searchPageObj=new  GoogleSearchPageObjects(driver);
 			
 			driver.get("https://www.google.com/");
 			
 			searchPageObj.setTextInSearchBox("ABCD");
 			
 			searchPageObj.clickSearchButton();
 			
 			driver.close();
 			
 			
 			
     }
}
