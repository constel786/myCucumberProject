package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { //report plugins
                "pretty", //generates reports on the console
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt" //to return failed report
        },
        monochrome = true, //makes reports more readable in the console
        features = "@target/failedRerun.txt", //path of failedRerun.txt
        glue = "stepdefinitions", //path of the step definitions
        //NO TAG
        dryRun = false //true option executes for only missing step definitions
)
public class FailedTestsRunner {
}
