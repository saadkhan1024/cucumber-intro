package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberCarBookingSteps {
    @Given("User wants to select a car type {string} from uber app")
    public void user_wants_to_select_a_car_type_from_uber_app(String carType) {

    }
    @When("User selects car {string} and pick up point is {string} and drop off point is {string}")
    public void user_selects_car_and_pick_up_point_is_and_drop_off_point_is(String carType, String pickUpLocation, String dropOffLocation) {

    }
    @Then("Driver starts the journey")
    public void driver_starts_the_journey() {

    }
    @Then("Driver ends the journey")
    public void driver_ends_the_journey() {

    }
    @Then("User pays {int} inr")
    public void user_pays_inr(int price) {

    }
}
