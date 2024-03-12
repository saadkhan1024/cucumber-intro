package test_runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/featuresFiles/UberCarBooking.feature"},
        glue = {"step_definitions"},
        tags = "@All",
        plugin = {"pretty"}
)
public class UberCarBookingTest {
}
