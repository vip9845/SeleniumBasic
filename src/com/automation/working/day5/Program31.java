package com.automation.working.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program31 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);
        
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://docs.seleniumhq.org/download");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		Thread.sleep(10000);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Finally reached");
		
		
	}

}
