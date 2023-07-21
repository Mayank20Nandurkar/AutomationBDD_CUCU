package com.pakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public WebDriver m1()
	{
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Automation\\drivers\\chromedriver.exe");
	       
	        WebDriver driver = new ChromeDriver();
	 
	       
	        driver.manage().window().maximize();
	        driver.get("https://adactinhotelapp.com/");
	        return driver;
	 
	        
	}
	
	
	public static void main(String[] args) {
	
	
		
}
	
	
	
}
