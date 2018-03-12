package com.automation.working.day5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Program30 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);
        
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://docs.seleniumhq.org/download");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\VISHNU\\Documents\\script2.exe");
		
		driver.findElement(By.id("close")).click();
	}

}
