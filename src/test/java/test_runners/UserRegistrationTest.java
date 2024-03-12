package test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature_files/UserRegistration.feature"},
        glue = {"step_definitions"},
        plugin = {"pretty"}
)
public class UserRegistrationTest {
}
