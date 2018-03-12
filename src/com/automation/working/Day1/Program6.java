package com.automation.working.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");
		
		String xp1=".//input[@id='email']";
		driver.findElement(By.xpath(xp1)).sendKeys("vishnu");
		
		String xp2=".//input[@id='pass']";
		driver.findElement(By.xpath(xp2)).sendKeys("********");
		
		String xp3=".//label[@id='loginbutton']";
		driver.findElement(By.xpath(xp3)).click();
	}

}
