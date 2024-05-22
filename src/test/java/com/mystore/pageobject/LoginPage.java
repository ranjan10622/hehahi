package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	//identify web element
	
	@FindBy(xpath = "//input[@id=\"user-name\"]")
	 WebElement username;
	
	@FindBy(xpath ="//input[@id=\"password\"]")
	 WebElement password;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	  WebElement submit;
	
	
	//identify action
	
	public void uname()
	{
		username.sendKeys("standard_user");
	}
	
	public void upassw()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void login()
	{
		submit.click();
	}

}
