package com.automation.working.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://facebook.com");
		
		String t="Forgotten account?";
		WebElement link=driver.findElement(By.linkText(t));
		
		Actions actions=new Actions(driver);
		actions.contextClick(link).build().perform();
		actions.sendKeys("t").perform();
	}

}
