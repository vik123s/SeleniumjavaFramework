package test;

import org.openqa.selenium.By;
import pages.GoogleSearchPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	 static WebDriver driver=null;

	public static void main(String[] args) {
		googleSearch();
		
	}
		
		
		
		
		
		public static void googleSearch() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\Chromedriver\\chromedriver.exe");
			 driver =new ChromeDriver();
			
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
			
			//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
			
			GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
			
			//driver.findElement(By.xpath("//input[@name='btnK']")).click();
			//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			
			
			
			GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
			
			
			
			
			driver.close();
			
			
			
		}
		
		
		
		
		
		
		
		
		

	}


