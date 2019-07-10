package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps extends HomePage {

	@Given("^user is on URL \"([^\"]*)\" of emirates website$")
	public void user_is_on_URL_of_emirates_website(String url) throws Throwable {
		openBrowser(url);
	}

	@When("^user selects (.*) as country of departure$")
	public void user_selects_dep_as_country_of_departure(String departure) throws Throwable {
		enterDepartureAirport(departure);
	}

	@When("^user selects (.*) as country of arrival$")
	public void user_selects_arr_as_country_of_arrival(String arrival) throws Throwable {
		enterArrivalAirport(arrival);
	}

	@When("^user selects (.*) as departing date$")
	public void user_selects_Jul_as_departing_date(String departureDate) throws Throwable {
		selectDepartureDate(departureDate);

	}

	@When("^user click on search flights button$")
	public void user_click_on_search_flights_button() throws Throwable {
		clickFlightSearch();
	}

	@Then("^user should be able to see the flight results$")
	public void user_should_be_able_to_see_the_flight_results() throws Throwable {
		validateFlightResults();

	}

	@Then("^user is making a one way journey$")
	public void user_is_making_a_one_way_journey() throws Throwable {
		{
			clickOneWay();
		}

	}
}
