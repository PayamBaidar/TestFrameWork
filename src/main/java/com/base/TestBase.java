package com.base;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.util.CommonFunction;

public class TestBase {
	
	public static WebDriver driver;
	
	public void IntilizDriver() 
	{
		
		
	
		
		try {
			String path =System.getProperty("user.dir");
			String browser = CommonFunction.ReadPropertyFile("browserName");

			switch (browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",path+ "\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
					
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver",path+ "\\driver\\geckodriver.exe");
		        driver = new FirefoxDriver();
		        driver.manage().window().maximize();
		        break;
		       
			case "ie":
				System.setProperty("webdriver.ie.driver",path +"\\driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();

			default:
				break;
			}
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		} catch (Exception e) {
		}
		
		
		
	}

}
