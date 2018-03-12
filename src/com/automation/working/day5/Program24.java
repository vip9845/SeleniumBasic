package com.automation.working.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxProfile profile=new FirefoxProfile();
		
		//If file is zip, then don't display pop-up download
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		
		//Open the browser with above setting
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		
		FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setProfile(profile);
        
		FirefoxDriver driver=new FirefoxDriver(firefoxOptions);
		driver.navigate().to("http://docs.seleniumhq.org/download");
		
		driver.findElement(By.id("close")).click();
		
		String xp="//td[.='Java']/../td[4]/a";
		
		driver.findElement(By.xpath(xp)).click();
		
	}

}
