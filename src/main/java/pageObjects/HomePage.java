package pageObjects;

import org.openqa.selenium.WebDriver;

import com.emirates.assess.DriverProvider;

public class HomePage {
WebDriver driver = null;
DriverProvider webDriver;

public void openBrowser(String url)
{
	webDriver = new DriverProvider();
	driver=webDriver.chromeDriver(); 
	driver.get(url);
	
}
}
