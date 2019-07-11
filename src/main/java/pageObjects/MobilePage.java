package pageObjects;

import org.openqa.selenium.WebDriver;

import com.emirates.assess.CommonLibrary;
import com.emirates.assess.DriverProvider;

public class MobilePage {
	CommonLibrary locate = null;

	public MobilePage() {
		locate = new CommonLibrary();
	}

	DriverProvider driver = new DriverProvider();
	WebDriver ad = driver.androidDriver();

	public void isLaunchSuccess() {
		if (locate.findElementByID(ad, "bottom_navigation_flight_status").isDisplayed())
		{
			System.out.println("App launched successfully");
		}

	}
	public void tapStatusBottomNav() {
		locate.findElementByID(ad, "bottom_navigation_flight_status").click();
		System.out.println("Tapped on status");
		

	}
	public void enterFlightNumber(String flightNumber)
	{
		locate.findElementByID(ad, "flight_number").sendKeys(flightNumber);
		locate.findElementByID(ad, "flight_status_submit").click();
		System.out.println("flight number entered");
	}
	public void isFlightStatusDisplayed()
	{
		locate.findElementByID(ad, "search_result_row_flight_no").isDisplayed();
		System.out.println("flight status displayed successfully");
	}
}