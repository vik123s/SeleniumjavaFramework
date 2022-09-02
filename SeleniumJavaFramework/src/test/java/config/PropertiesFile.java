package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop=new Properties();
	

	public static void main(String[] args) {
		getProperties();
		setProperties();
	

	}
	
	public static void getProperties()  {
		try {
		
		
		InputStream input =new FileInputStream("C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser1=prop.getProperty("browser");
		System.out.println(browser1);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public static void setProperties() {
		try {
		OutputStream output=new FileOutputStream("C:\\Users\\Vikash\\eclipse-workspace\\SeleniumJavaFramework\\src\\test\\java\\config\\config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(output, null);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

}
