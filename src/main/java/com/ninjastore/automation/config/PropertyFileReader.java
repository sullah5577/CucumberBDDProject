package com.ninjastore.automation.config;


import java.io.IOException;
import java.util.Properties;

import com.ninjastore.automation.util.PathHelper;


public class PropertyFileReader implements ConfigurationReader{
	
	Properties properties=null;
	
	public PropertyFileReader() {
		properties=new Properties();
		try {
			properties.load(PathHelper.getInputStreamResourcePath("/src/main/resources/ConfigurationFile/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		return properties.getProperty("url");
	}

	public String getBrowser() {
		return properties.getProperty("browser");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
	}

	public String getUsername(){
		return properties.getProperty("username");
	}

	public String getPassword(){
		return properties.getProperty("password");
	}

	public String getProduct(){
		return properties.getProperty("product");
	}

	public String getFname() {
		return properties.getProperty("firstname");
	}

	public String getLname() {
		return properties.getProperty("lastname");
	}

	public String getAddress() {
		return properties.getProperty("address");
	}

	public String getCity() {
		return properties.getProperty("city");
	}

	public String getPostCode() {
		return properties.getProperty("postcode");
	}


}
