package step_definitions;

import implementation.Product;
import implementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchSteps {
    Product product;
    Search search;

    @Given("I have a search field on Amazon home page")
    public void i_have_a_search_field_on_amazon_home_page() {
    }
    @When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
    public void i_search_for_a_product_with_name_and_price(String productName, int price) {
        product = new Product(productName, price);
    }
    @Then("Products with name {string} and price {int} should be displayed")
    public void products_with_name_and_price_should_be_displayed(String productName, int price) {
        search = new Search();
        search.displayProduct(product);
    }
}
