package com.automation.working.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);	
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/VISHNU/Tution/HTML/EG1.html");
		driver.findElement(By.tagName("input")).sendKeys("admin");
		Thread.sleep(2000);
		String css="input[type='password']";
		driver.findElement(By.cssSelector(css)).sendKeys("12345");
		Thread.sleep(2000);
		driver.quit();
	}

}
