package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapablities_Demo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("");
	}
	}


