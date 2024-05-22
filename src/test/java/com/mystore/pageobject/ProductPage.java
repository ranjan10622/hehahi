package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver ldriver;
	
	public ProductPage(WebDriver rdriver)
	{
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	 WebElement addToCart;
	
	
	@FindBy(xpath="//span[@class=\"shopping_cart_badge\"]")
	  WebElement shopcart;
	
	
	//Action method
	
	  public void cartadding()
	  {
		  addToCart.click();
	  }
	  
	  public void cartclick()
	  {
		  shopcart.click();
	  }
	

}
