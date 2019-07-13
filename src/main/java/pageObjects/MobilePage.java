package pageObjects;

import org.openqa.selenium.WebDriver;

import com.emirates.assess.CommonLibrary;
import com.emirates.assess.DriverProvider;

public class MobilePage {
	CommonLibrary locate = null;
	DriverProvider driver = new DriverProvider();
	WebDriver ad = driver.androidDriver();

	/**
	 * This method is the constructor. Using it to instantiate the objects.
	 */
	public MobilePage() {
		locate = new CommonLibrary();
	}


	/**
	 * Verifies whether the emirates app has been launched by locating the flight status from bottom navigation.
	 */
	public void isLaunchSuccess() {
		if (locate.findElementByID(ad, "bottom_navigation_flight_status").isDisplayed())
		{
			System.out.println("App launched successfully");
		}

	}
	/**
	 * Taps on flight status from bottom navigation.
	 */
	public void tapStatusBottomNav() {
		locate.findElementByID(ad, "bottom_navigation_flight_status").click();
		System.out.println("Tapped on status");
		

	}
	/**
	 * Enters the flight number in the textbox to check the status 
	 * @param flightNumber valid flight number e.g. '123'
	 */
	public void enterFlightNumber(String flightNumber)
	{
		locate.findElementByID(ad, "flight_number").sendKeys(flightNumber);
		locate.findElementByID(ad, "flight_status_submit").click();
		System.out.println("flight number entered");
	}
	/**
	 * Validates if the flight status of the entered flight has been displayed.
	 */
	public void isFlightStatusDisplayed()
	{
		locate.findElementByID(ad, "search_result_row_flight_no").isDisplayed();
		System.out.println("flight status displayed successfully");
	}
}