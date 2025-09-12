package Step_definitions;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.AddToCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testcase_8_step_definition extends TestBase {

    @When("remove item in the cart page")
    public void remove_item_in_the_cart_page() {
        AddToCartPage addToCartPage=new AddToCartPage(getdriver());
        addToCartPage.remove_item_from_cart();
    }
    @Then("validate empty cart message")
    public void validate_empty_cart_message() {
        AddToCartPage addToCartPage=new AddToCartPage(getdriver());
        addToCartPage.Validate_cart_after_removing_item();
    }
}
