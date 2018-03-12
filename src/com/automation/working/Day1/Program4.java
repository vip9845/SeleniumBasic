package com.automation.working.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key="webdriver.gecko.driver";
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);	
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/VISHNU/Tution/HTML/DemoA.html");
		Thread.sleep(2000);
		By b=By.tagName("a");
		WebElement e=driver.findElement(b);
		e.click();
		Thread.sleep(4000);
		driver.quit();
	}

}
