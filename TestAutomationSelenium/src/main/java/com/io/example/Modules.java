package com.io.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modules {
	public static WebDriver driver;
	static String browser;
	public static void setBrowser() {
		PropertiesEx.readProperties();
		
		//getting the browser from config.properties file
		browser=PropertiesEx.prop.getProperty("browser");
	}
	public static void setBrowserConfig() {
		if(browser.equals("chrome")) {
			
		//chromedriver location 	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse\\TestAutomationSelenium\\src\\main\\java\\chromedriver.exe");
		}
	}
	public static void runTest() {
		
		driver=new ChromeDriver();
		
		//getting url from the config.propetries file
		driver.get(PropertiesEx.prop.getProperty("url"));		
	}
	public static void endTest() {
		driver.quit();
	}
}
