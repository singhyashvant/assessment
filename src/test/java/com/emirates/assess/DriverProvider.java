package com.emirates.assess;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverProvider {
	WebDriver driver = null;
	WebDriver mDriver = null;
	WebDriverWait waitVar =null;
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
	public WebDriver androidDriver(){

        // set up appium
        final File classpathRoot = new File(System.getProperty("user.dir"));
        final File appDir = new File(classpathRoot, "src/test/resources/apps");
        final File app = new File(appDir, "emirates.apk");

        final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("app", app.getAbsolutePath());
        try {
			mDriver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),
			        capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        waitVar = new WebDriverWait(mDriver, 90);
		return mDriver;

        //Thread.sleep(90000);

    }
	 public void mobileTearDown(){
         //close the app
		 mDriver.quit();
     }
	 public void webTearDown(){
         //close the app
		 driver.quit();
     }
}