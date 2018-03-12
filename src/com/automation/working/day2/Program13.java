package com.automation.working.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://news.google.com");
		
		String xp=".//span[contains(text(),'Entertainment')]";
		int y=driver.findElement(By.xpath(xp)).getLocation().getY();
		
		RemoteWebDriver r=(RemoteWebDriver)driver;
		String jscode="window.scrollBy(0,"+y+")";
		r.executeScript(jscode);
		
		
	}

}
