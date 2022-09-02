package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestNGListnerDemo {
	
	@Test
	public void test1() {
		System.out.println("i am inside Test 1");
	}
	@Test
	public void test2() {
		System.out.println("i am inside Test 2");
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("abc");
		driver.close();
		
		
	}
	@Test
	public void test3() {
		System.out.println("i am inside Test 3");
		throw new SkipException("This test is skipped");
	}
	@Test
	public void test4() {
		System.out.println("i am inside Test 4");
	}

}
