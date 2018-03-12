package com.automation.working.Day1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver ffdriver=new FirefoxDriver();
		ffdriver.navigate().to("http://www.google.com");
		System.out.println(ffdriver.getTitle());
		
		/*
		Dimension d=new Dimension(350,400);
		ffdriver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p=new Point(300,200);
		ffdriver.manage().window().setPosition(p);
		Thread.sleep(2000);
		ffdriver.manage().window().maximize();*/
		ffdriver.quit();
	}

}
