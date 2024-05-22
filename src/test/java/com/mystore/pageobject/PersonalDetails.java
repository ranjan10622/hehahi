package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails {
	
	WebDriver ldriver;
	
	public PersonalDetails(WebDriver rdriver)
	{
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath ="//input[@id=\"first-name\"]")
	 WebElement firstName;
	
	@FindBy(xpath="//input[@id=\"last-name\"]")
	 WebElement lastName;
	
	@FindBy(xpath="//input[@id=\"postal-code\"]")
	 WebElement postalCode;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	  WebElement continuen;
	
	
	//Action
	
	public void fname()
	{
		firstName.sendKeys("Ranjan");
	}
	
	public void lname()
	{
		lastName.sendKeys("Mohan");
	}
	
	public void pcode()
	{
		postalCode.sendKeys("560035");
	}
	
	public void sub()
	{
		continuen.click();
	}
	

}
