package com.automation.working.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://localhost/login.do;jsessionid=6fqrqroa4fudh");
		
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Click operation done");
		
		driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		System.out.println("Enter Click operation done");
					
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('loginButton').click()");
		System.out.println("Javascript Click operation done");
		
		driver.findElement(By.id("loginButton")).submit();
		System.out.println("Submit operation done");
		
	}

}
