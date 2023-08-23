package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
public class GridStepDefs {
    WebDriver driver;
    @Given("user is on the url {string} using {string} browser")
    public void user_is_on_the_url_using_browser(String url, String browser) throws MalformedURLException {
//        create url object
        URL remoteURL = new URL("http://10.0.110.172:4444");
//        instantiating the Remote Web Driver
        if (browser.equalsIgnoreCase("chrome")){
            driver = new RemoteWebDriver(remoteURL, new ChromeOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.manage().window().maximize();
        }else if (browser.equalsIgnoreCase("firefox")){
            driver = new RemoteWebDriver(remoteURL, new FirefoxOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.manage().window().maximize();
        }else if (browser.equalsIgnoreCase("edge")){
            driver = new RemoteWebDriver(remoteURL, new EdgeOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.manage().window().maximize();
        }

//        go to the URL
        driver.get(url);

    }
    @Then("verify the page title contains {string} on grid")
    public void verify_the_page_title_contains_on_grid(String string) {
        Assert.assertTrue(driver.getTitle().contains(string));
    }
    @Then("close the remote driver")
    public void close_the_remote_driver() {
        driver.quit();
    }
}