package com.automation.working.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://news.google.com/news");
		
		driver.findElement(By.xpath(".//span[.='Technology']")).click();
		driver.close();
		
	}

}
