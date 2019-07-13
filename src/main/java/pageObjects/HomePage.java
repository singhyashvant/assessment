package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.emirates.assess.CommonLibrary;
import com.emirates.assess.DriverProvider;
import static org.junit.Assert.*;

public class HomePage {
	WebDriver driver = null;
	CommonLibrary locate = null;
	DriverProvider webDriver;

	/**
	 * This method is the constructor. Using it to instantiate the objects.
	 */
	public HomePage() {
		locate = new CommonLibrary();
	}

	/**
	 * Opens the URL in the browser.
	 * @param url an absolute URL which user wants to open.
	 */
	public void openBrowser(String url) {
		webDriver = new DriverProvider();
		driver = webDriver.chromeDriver();
		driver.get(url);

	}

	/**
	 * Enters the departure airport name in the text field.
	 * @param airport departure airport name or keyword.
	 */
	public void enterDepartureAirport(String airport) {
		locate.findElementByName(driver, "Departure airport").sendKeys(airport);
		locate.findElementByName(driver, "Departure airport").sendKeys(Keys.TAB);
	}

	/**
	 * Enters the arrival airport name in the text field.
	 * @param airport arrival airport name or keyword.
	 */
	public void enterArrivalAirport(String airport) {
		locate.findElementByName(driver, "Arrival airport").sendKeys(airport);
		locate.findElementByName(driver, "Arrival airport").sendKeys(Keys.TAB);
	}

	/**
	 * Selects the date of travel departure.
	 * @param date the travel departure date ex. '1662019' which also be used in the creation of xpath to select that date
	 */
	public void selectDepartureDate(String date) {
		List<WebElement> es = locate.findElementsByXpath(driver, "//td[@data-string='" + date + "']");
		es.get(0).click();

	}
	/**
	 * Selects the date of travel departure.
	 * @param date the travel arrival date ex. '1662019' which also be used in the creation of xpath to select that date
	 */
	public void selectArrivalDate(String date) {
		List<WebElement> es = locate.findElementsByXpath(driver, "//td[@data-string='" + date + "']");
		es.get(0).click();

	}

	/**
	 * Clicks on the flight search button and submits the form to retrieve the flight search results.
	 */
	public void clickFlightSearch() {
		List<WebElement> es = locate.findElementsByXpath(driver,
				"//button[@class='cta cta--large cta--primary js-widget-submit ']");
		es.get(0).click();

	}

	/**
	 * Clicks on the one way checkbox to disable the return journey date field.
	 */
	public void clickOneWay() {
		locate.findElementByXpath(driver, "//input[@class='checkbox__input js-one-way control__one-way']").click();
	}

	/**
	 * Validates if the user has landed on the flight search results page. 
	 */
	public void validateFlightResults() {
		WebElement _tempE = locate.findElementByXpath(driver, "//h1[@id='ctl00_c_pH_heading1']");
		if (_tempE != null) {
			assertTrue("FLight search result is successfully diplayed", true);
		} else {
			assertTrue("FLight search result is not diplayed", true);
		}
	}
	/**
	 * Quits the driver i.e closes all the open browsers opened by the webdriver.
	 */
	public void teardown()
	{
		driver.quit();
	}

}
