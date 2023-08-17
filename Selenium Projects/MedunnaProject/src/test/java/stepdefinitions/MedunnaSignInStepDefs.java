package stepdefinitions;

import io.cucumber.java.en.When;
import pages.MedunnaHomePage;
import utilities.WaitUtils;

public class MedunnaSignInStepDefs {

    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();

    @When("click on user icon")
    public void click_on_user_icon() {
        WaitUtils.waitFor(1);
        medunnaHomePage.userIcon.click();
    }
    @When("click on sign in link")
    public void click_on_sign_in_link() {
        WaitUtils.waitFor(1);
       medunnaHomePage.signInLink.click();
    }
    @When("enter username")
    public void enter_username() {

    }
    @When("enter password")
    public void enter_password() {

    }
    @When("click on sign in submit button")
    public void click_on_sign_in_submit_button() {

    }
}
