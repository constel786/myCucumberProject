package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

import static utilities.WaitUtils.waitFor;

public class DataTablesStepDefs {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Given("user clicks on new button")
    public void user_clicks_on_new_button() {
        dataTablesPage.newButton.click();
    }
    @Given("user enters first name as {string}")
    public void user_enters_first_name_as(String string) {
        waitFor(1);
        dataTablesPage.firstname.sendKeys(string);
    }
    @Given("user enters last name as {string}")
    public void user_enters_last_name_as(String string) {
        waitFor(1);
        dataTablesPage.lastname.sendKeys(string);
    }
    @Given("user enters position as {string}")
    public void user_enters_position_as(String string) {
        waitFor(1);
        dataTablesPage.position.sendKeys(string);
    }
    @Given("user enters office as {string}")
    public void user_enters_office_as(String string) {
        waitFor(1);
        dataTablesPage.office.sendKeys(string);
    }
    @Given("user enters extension as {string}")
    public void user_enters_extension_as(String string) {
        waitFor(1);
        dataTablesPage.extension.sendKeys(string);
    }
    @Given("user enters start date as {string}")
    public void user_enters_start_date_as(String string) {
        waitFor(1);
        dataTablesPage.startDate.sendKeys(string);
    }
    @Given("user enters salary as {string}")
    public void user_enters_salary_as(String string) {
        waitFor(1);
        dataTablesPage.salary.sendKeys(string);
    }
    @Given("user clicks create button")
    public void user_clicks_create_button() {
        waitFor(1);
        dataTablesPage.createButton.click();
    }

    @When("user searches for the first name {string}")
    public void userSearchesForTheFirstName(String arg0) {
        waitFor(1);
        dataTablesPage.searchBox.sendKeys(arg0);
    }
    @Then("verify the name field contains the first name {string}")
    public void verifyTheNameFieldContainsTheFirstName(String arg0) {
        waitFor(1);
        Assert.assertTrue(dataTablesPage.nameField.getText().contains(arg0));
    }
}
