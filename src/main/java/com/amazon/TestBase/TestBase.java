package com.amazon.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * This is the End to End Script
 * @author-Kavya
 * 
*/
public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	 public static String URL = "https://www.amazon.co.uk";

	 public void beforeTest(){
		 try {
			 init_browser();
			 driver.get(URL);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }


	 public void afterTest() throws NullPointerException {
	   driver.close();
	   driver.quit();
	  }
	 

	public static void init_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

}
