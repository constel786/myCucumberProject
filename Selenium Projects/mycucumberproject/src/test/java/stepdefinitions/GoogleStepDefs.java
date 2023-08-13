package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class GoogleStepDefs { //Defs: Definitions
    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Given("user searches for iPhone")
    public void user_searches_for_i_phone() {

    }
    @Then("verify the page title contains iPhone")
    public void verify_the_page_title_contains_i_phone() {

    }
}
