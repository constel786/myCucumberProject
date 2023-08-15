package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleHomePage;
import utilities.Driver;

public class GoogleStepDefs { //Defs: Definitions
    GoogleHomePage googleHomePage = new GoogleHomePage();
    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Given("user searches for iPhone") //or @And is also fine here
    public void user_searches_for_i_phone() {
        googleHomePage.searchBox.sendKeys("iPhone" +Keys.ENTER);
    }
    @Then("verify the page title contains iPhone")
    public void verify_the_page_title_contains_i_phone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }

    @Given("user search for porcelain tea pot") //for TC02
    public void user_search_for_porcelain_tea_pot() {
        googleHomePage.searchBox.sendKeys("porcelain tea pot" +Keys.ENTER);
    }
    @Then("verify the page title contains porcelain tea pot")
    public void verify_the_page_title_contains_porcelain_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("porcelain tea pot"));
    }

    @And("user search for {string}")
    public void userSearchFor(String arg0) {
        googleHomePage.searchBox.sendKeys(arg0+Keys.ENTER);
    }
    @Then("verify the page title contains {string}")
    public void verifyThePageTitleContains(String arg0) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arg0));
    }
}
