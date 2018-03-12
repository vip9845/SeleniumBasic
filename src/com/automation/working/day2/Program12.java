package com.automation.working.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");		
					
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='admin123'");
		System.out.println("Javascript Entering operation done");

		
	}

}
