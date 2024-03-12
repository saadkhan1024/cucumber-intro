package test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featuresFiles/AmazonSearch.feature"},
        glue = {"step_definitions", "hooks"},
        tags = "@Smoke or @Regression",
        plugin = {"pretty",
        "json:target/generated-reports/report.json"}
        //"junit:target/generated-report/report.xml"}
        //publish = true} or keep cucumber.publish.enabled=true in cucumber.properties file
)
public class AmazonSearchTest {
}
