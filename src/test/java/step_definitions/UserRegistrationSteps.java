package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class UserRegistrationSteps {
    @Given("User is on registration page")
    public void user_is_on_registration_page() {

    }
    @When("User enters following user details")
    public void user_enters_following_user_details(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for(List<String> ls : userList) {
            System.out.println(ls);
        }
    }
    @When("User enters following user details with columns")
    public void user_enters_following_user_details_with_columns(DataTable dataTable) {
        List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
        for(Map<String, String> lm : userList) {
            System.out.println(lm.get("firstname") + " " + lm.get("lastname") + " " + lm.get("email") + " " + lm.get("phone") + " " + lm.get("city"));
        }
    }
    @Then("User registration should be successful")
    public void user_registration_should_be_successful() {

    }
}
