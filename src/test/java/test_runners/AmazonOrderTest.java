package test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featuresFiles/AmazonOrder.feature"},
        glue = {"step_definitions"},
        plugin = {"pretty"}
)
public class AmazonOrderTest {
}
