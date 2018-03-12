package com.automation.working.Day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver ffdriver=new FirefoxDriver();
		ffdriver.navigate().to("http://www.google.com");
		System.out.println(ffdriver.getTitle());
		Thread.sleep(1000);
		ffdriver.get("http://www.gmail.com");
		System.out.println(ffdriver.getTitle());
		Thread.sleep(2000);
		ffdriver.navigate().back();
		Thread.sleep(2000);
		ffdriver.navigate().forward();
		Thread.sleep(2000);
		ffdriver.navigate().refresh();
		Thread.sleep(2000);
		ffdriver.navigate().back();
		Thread.sleep(2000);
		ffdriver.quit();

	}

}
