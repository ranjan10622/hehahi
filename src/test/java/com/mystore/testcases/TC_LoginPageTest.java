package com.mystore.testcases;

import org.testng.annotations.Test;

import com.mystore.pageobject.CartPage;
import com.mystore.pageobject.CheckOut;
import com.mystore.pageobject.LoginPage;
import com.mystore.pageobject.PersonalDetails;
import com.mystore.pageobject.ProductPage;

public class TC_LoginPageTest extends BaseClass {
	
	
	@Test
	
	public void verifyLogin()
	{
		//openURL
		
		driver.get(url);
		logger.info("url opened");
		
		LoginPage lp = new LoginPage(driver);
		
		  lp.uname();
		  lp.upassw();
		  lp.login();
		  
		  
		  ProductPage pp =new ProductPage(driver);
		    pp.cartadding();
		    pp.cartclick();
		    
		    CartPage cp = new CartPage(driver);
		      cp.verifyitempresent();
		      cp.clickoncheckout();
		      
		      CheckOut co = new CheckOut(driver);
		       co.complete();
		       
		       PersonalDetails pd = new PersonalDetails(driver);
		         pd.fname();
		         pd.lname();
		         pd.pcode();
		         pd.sub();
		    
		    
		    
		    
	}

}
