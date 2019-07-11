package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MobilePage;

public class MobilePageSteps extends MobilePage{

@Given("^user has launch the emirates app$")
public void user_has_launch_the_emirates_app() throws Throwable {
	isLaunchSuccess();
}

@Given("^user is logged in as a guest$")
public void user_is_logged_in_as_a_guest() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^user navigate to flight status screen$")
public void user_navigate_to_flight_status_screen() throws Throwable {
	tapStatusBottomNav();
}

@When("^user enters the (.*) to see the status$")
public void user_enters_the_abc_to_see_the_status(String flightNumber) throws Throwable {
enterFlightNumber(flightNumber);
}

@Then("^user should be displayed with the listing$")
public void user_should_be_displayed_with_the_listing() throws Throwable {
isFlightStatusDisplayed();
}



}
