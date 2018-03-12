package com.automation.working.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File destFile=new File("D:/google.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
	}

}
