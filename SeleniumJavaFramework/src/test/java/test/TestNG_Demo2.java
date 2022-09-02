package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	WebDriver driver=null;
	
	@BeforeTest
	public void setUPTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\Chromedriver\\chromedriver.exe");
		 driver =new ChromeDriver();
		
		
		
		
		

	}
	
	@Test
	
	public void googleSearch2() {
	driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		
		
		
		
		
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		
	}

}
