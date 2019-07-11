package pageObjects;

import org.openqa.selenium.WebDriver;

import com.emirates.assess.CommonLibrary;
import com.emirates.assess.DriverProvider;

public class MobilePage{
	CommonLibrary locate = null;
	public MobilePage() {
		locate = new CommonLibrary();
	}
	DriverProvider driver = new  DriverProvider();
	WebDriver ad = driver.androidDriver();
	public void loginEmiratesApp(String usr,String pwd)
	{
		locate.findElementByID(ad, "login_button_login").click();
		
}
}