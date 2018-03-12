package com.automation.working.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement userName;
	private WebElement password;
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		userName=driver.findElement(By.id("username"));
		password=driver.findElement(By.name("pwd"));
		loginButton=driver.findElement(By.id("loginButton"));
	}
	
	public void setUserName(String un)
	{
		userName.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void ClickLogin()
	{
		loginButton.click();
	}
}
