package com.automation.working.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.makemytrip.com/flights");
		
		String xp=".//*[@id='hp-widget__depart']";
		driver.findElement(By.xpath(xp)).click();
		
		String date=".//span[text()='March']/../../..//a[text()='11']";
		driver.findElement(By.xpath(date)).click();
	}

}
