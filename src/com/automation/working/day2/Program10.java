package com.automation.working.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/VISHNU/Tution/HTML/DemoC.html");
		
		driver.findElement(By.id("t2")).clear();
		
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL+"ac");
		
		driver.findElement(By.id("t2")).sendKeys(Keys.CONTROL+"v");
		
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);

	}

}
