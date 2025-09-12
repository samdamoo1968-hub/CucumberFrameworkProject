package Step_definitions;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testcase_7_step_definition extends TestBase {

    @When("user search a product {string}")
    public void user_search_a_product(String string) {
        HomePage homePage=new HomePage(getdriver());
        homePage.search_product();

    }
    @Then("user Validates the result product contains the search productname in it")
    public void user_validates_the_result_product_contains_the_search_productname_in_it() {
        HomePage homePage=new HomePage(getdriver());
        homePage.Verify_products_containing_searchproduct_name();
    }
}
