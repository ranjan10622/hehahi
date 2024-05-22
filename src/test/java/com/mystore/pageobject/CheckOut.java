package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	
	WebDriver ldriver;
	
	
    public CheckOut(WebDriver rdriver)
    {
    	PageFactory.initElements(rdriver, this);
    }
    
    
    
    @FindBy(xpath="//button[@id=\"finish\"]")
    
      WebElement finish;
    
    
    //Action method
    
     public void  complete()
     {
    	 finish.click();
     }
     
}
