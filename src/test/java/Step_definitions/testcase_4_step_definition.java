package Step_definitions;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.AddToCartPage;
import demowebshop_tricentis.Pages.FeatureProductsPage;
import demowebshop_tricentis.Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Step_definitions.testcase_3_step_definition.product_name;


public class testcase_4_step_definition extends TestBase {

    @When("click on add to cart button")
    public void click_on_add_to_cart_button() {
        FeatureProductsPage featureProducts=new FeatureProductsPage(getdriver());
        featureProducts.click_on_add_to_cart();
    }
    @Then("Validate notification message bar")
    public void validate_notification_message_bar() {
        FeatureProductsPage featureProducts=new FeatureProductsPage(getdriver());
        featureProducts.validate_addtoCart_notification_message();
    }
    @When("click on shopping cart link from navigation bar")
    public void click_on_shopping_cart_link_from_navigation_bar() {
        HomePage homepage=new HomePage(getdriver());
        homepage.click_on_shoppingCartLink();
    }
    @Then("Validate product name in cart page")
    public void validate_product_name_in_cart_page() throws InterruptedException {
        AddToCartPage addToCartPage=new AddToCartPage(getdriver());
        addToCartPage.validate_product_name(product_name);
    }

}
