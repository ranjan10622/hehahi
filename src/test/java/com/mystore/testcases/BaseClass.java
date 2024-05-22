package com.mystore.testcases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	ReadConfig  readconfig = new ReadConfig();
	
	String url =readconfig.getBaseUrl();
	String browser = readconfig.getBrowser();
	
	public static WebDriver driver;
	public static org.apache.logging.log4j.Logger logger;
	
	
	
	    @BeforeClass
	   public void setup()
	   {
		   
		   String browser = "chrome";
		   
		   switch(browser.toLowerCase())
		   {
		    
		   case "chrome":
			   
			   WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();
			    break;
			    
			    
		   case "msedge":
			   
			   WebDriverManager.edgedriver().setup();
			    driver = new EdgeDriver();
			    break;
			    
		   case "firefox":
			   
			   WebDriverManager.firefoxdriver().setup();
			    driver = new FirefoxDriver();
			    break;
			    
			    default:
			    	
			    	driver = null;
			    	break;
		   
		   }
		   
		   // wait 
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   //for logging
		   
		   logger = LogManager.getLogger("MyStoreV1");
		   
		   
	   }
	    
	    @AfterClass
	   
	   public void tearDown()
	   {
		   driver.close();
		   driver.quit();
	   }

}
