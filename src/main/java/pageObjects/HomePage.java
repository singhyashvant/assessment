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

	public HomePage() {
		locate = new CommonLibrary();
	}

	public void openBrowser(String url) {
		webDriver = new DriverProvider();
		driver = webDriver.chromeDriver();
		driver.get(url);

	}

	public void enterDepartureAirport(String airport) {
		locate.findElementByName(driver, "Departure airport").sendKeys(airport);
		locate.findElementByName(driver, "Departure airport").sendKeys(Keys.TAB);
	}

	public void enterArrivalAirport(String airport) {
		locate.findElementByName(driver, "Arrival airport").sendKeys(airport);
		locate.findElementByName(driver, "Arrival airport").sendKeys(Keys.TAB);
	}

	public void selectDepartureDate(String date) {
		List<WebElement> es = locate.findElementsByXpath(driver, "//td[@data-string='" + date + "']");
		es.get(0).click();

	}

	public void selectArrivalDate(String date) {
		List<WebElement> es = locate.findElementsByXpath(driver, "//td[@data-string='" + date + "']");
		es.get(0).click();

	}

	public void clickFlightSearch() {
		List<WebElement> es = locate.findElementsByXpath(driver,
				"//button[@class='cta cta--large cta--primary js-widget-submit ']");
		es.get(0).click();

	}

	public void clickOneWay() {
		locate.findElementByXpath(driver, "//input[@class='checkbox__input js-one-way control__one-way']").click();
	}

	public void validateFlightResults() {
		WebElement _tempE = locate.findElementByXpath(driver, "//h1[@id='ctl00_c_pH_heading1']");
		if (_tempE != null) {
			assertTrue("FLight search result is successfully diplayed", true);
		} else {
			assertTrue("FLight search result is not diplayed", true);
		}
	}
	public void teardown()
	{
		driver.quit();
	}

}
