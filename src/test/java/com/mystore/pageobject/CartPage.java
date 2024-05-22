package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver ldriver;
	
	public CartPage(WebDriver rdriver)
	{
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(xpath="//div[@class=\"inventory_item_name\"]")
	 WebElement verifyItem;
	
	@FindBy(xpath="//button[@id=\"checkout\"]")
	WebElement checkout;
	
	
	 public void verifyitempresent()
	 
	 {
		 if(verifyItem.equals("Sauce Labs Bolt T-Shirt"))
		 {
			 System.out.println(" Item is present on the page");
		 }
		 
		 else
		 {
			 System.out.println(" Item is not present on the page");
		 }
		 
		 
	 }
	 
	 public void clickoncheckout()
	 {
		 checkout.click();
	 }

}
