package com.io.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesEx {
	static Properties prop = new Properties();
	public static void readProperties() {
		
		//consist the location of config.properties 
		
		try {
			InputStream is = new FileInputStream(
					"C:\\Users\\hp\\eclipse\\TestAutomationSelenium\\src\\main\\java\\config.properties");
			prop.load(is);
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
