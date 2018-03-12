package com.automation.working.day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program28 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http:localhost/login.do");
		
		driver.findElement(By.linkText("Actimind Inc.")).click();
		
		Set<String> a =driver.getWindowHandles();
		
		for(String b:a)
		{
			System.out.println(b);
			driver.switchTo().window(b);
		}
		Thread.sleep(15000);
		driver.findElement(By.xpath("html/body/header/div/div/div/nav/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
