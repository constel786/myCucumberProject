package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BlueRentalLoginPage;
import utilities.Driver;

import java.util.List;

import static utilities.WaitUtils.waitFor;

public class BlueRentalStepDefs {
    BlueRentalLoginPage blueRentalLoginPage = new BlueRentalLoginPage();
    @When("user enters the admin email and password")
    public void user_enters_the_admin_email_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<String> credentials = dataTable.row(1);
        blueRentalLoginPage.email.sendKeys(credentials.get(0));
        blueRentalLoginPage.password.sendKeys(credentials.get(1));
        //We can get the data in different forms such as List, Map, List of Map, Map List, ..
    }
    @When("user click on the login button")
    public void user_click_on_the_login_button() {
        blueRentalLoginPage.loginButton.click();
    }
    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {
        //If URL doesn't contain login, then we are able to login
        waitFor(2);
        Assert.assertFalse(Driver.getDriver().getCurrentUrl().contains("login"));
    }
}
