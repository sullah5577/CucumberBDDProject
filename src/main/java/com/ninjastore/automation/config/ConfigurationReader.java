package com.ninjastore.automation.config;

public interface ConfigurationReader {
	
	public String getUrl();
	public String getBrowser();
	public int getPageLoadTimeOut();

	public String getUsername();
	public String getPassword();
	public String getProduct();

	//Personal details
	public String getFname();
	public String getLname();
	public String getAddress();
	public String getCity();
	public String getPostCode();

}
