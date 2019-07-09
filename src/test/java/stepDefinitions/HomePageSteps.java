package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps extends HomePage{
	
	

@Given("^user is on URL \"([^\"]*)\" of emirates website$")
public void user_is_on_URL_of_emirates_website(String url) throws Throwable {
	openBrowser(url);
}

@When("^user selects the departure$")
public void user_selects_the_departure() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}
