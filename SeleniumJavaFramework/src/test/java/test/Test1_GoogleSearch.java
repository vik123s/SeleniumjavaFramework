package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		
		driver.close();
		
		
		

	}

}
