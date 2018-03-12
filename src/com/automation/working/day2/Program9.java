package com.automation.working.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String key2="webdriver.gecko.driver";
		String value2="./drivers/geckodriver.exe";
		System.setProperty(key2, value2);	
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.irctc.com/displayServlet");
		
		String xp="//label[.='Mumbai']/../label[starts-with(.,': 022-')]";
		WebElement ph=driver.findElement(By.xpath(xp));
		
		System.out.println(ph.getText());
		
		driver.close();
		
		
	}

}
