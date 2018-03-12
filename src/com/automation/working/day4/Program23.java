package com.automation.working.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String key2="webdriver.gecko.driver";
			String value2="./drivers/geckodriver.exe";
			System.setProperty(key2, value2);	
			FirefoxDriver driver=new FirefoxDriver();
			driver.navigate().to("http://irctc.co.in/");
			
			driver.findElement(By.id("loginbutton")).click();
			
			try
			{
				Alert alert=driver.switchTo().alert();
				System.out.println("Alert Pop-Up is displayed");
				String text=alert.getText();
				System.out.println(text);
				
				alert.accept();
				System.out.println("Clicked on OK");
				//alert.dismiss();
			}
			catch(NoAlertPresentException e)
			{
				System.out.println("Alerts Pop-Up is not displayed");
			}
	}

}
