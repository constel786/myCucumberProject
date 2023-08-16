package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features", //path of feature file
        glue = "stepdefinitions", //path of the step definitions
        tags = "@data_tables", //only runs this test case
        dryRun = false //true option executes for only missing step definitions
)
public class Runner {
}
