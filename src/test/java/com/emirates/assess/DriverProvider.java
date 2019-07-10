package com.emirates.assess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverProvider {
	WebDriver driver = null;
	WebDriver mobileDriver = null;
	public WebDriver fireFoxDriver()
	{
		driver = new FirefoxDriver();
		return driver;
	}
	public WebDriver chromeDriver()
	{	
	System.setProperty("webdriver.chrome.driver" , "./chromedriver");
	driver= new ChromeDriver();
	return driver;
}
	

}