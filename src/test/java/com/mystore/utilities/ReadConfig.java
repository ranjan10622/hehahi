package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	
	String path ="C:\\Users\\Ranjan Mohan\\eclipse-workspace\\MyStoreV1\\Configuration\\config.properties";
	
	
	public  ReadConfig()
	{
		try {
		properties= new Properties();
		
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public String getBaseUrl()
	{
		String value = properties.getProperty("baseUrl");
		
		if(value!=null)
		{
			return value;
		}
		else
			
		{
			throw new RuntimeException(" url not specified in config file");
		}
	}
	
	public String getBrowser()
	{
		String value = properties.getProperty("browser");
		
		if(value!=null)
		{
			return value;
		}
		else
			
		{
			throw new RuntimeException(" url not specified in config file");
		}
	}
}
