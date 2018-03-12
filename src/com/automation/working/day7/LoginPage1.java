package com.automation.working.day7;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SetUserName(String un)
	{
		username.sendKeys(un);
	}
	
	public void SetPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void ClickLogin()
	{
		loginButton.click();
	}
	
	public void printLinkCount()
	{
		int count=allLinks.size();
		
		System.out.println(count);
	}

}
