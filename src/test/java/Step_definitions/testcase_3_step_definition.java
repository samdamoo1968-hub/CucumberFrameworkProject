package Step_definitions;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.FeatureProductsPage;
import demowebshop_tricentis.Pages.HomePage;
import demowebshop_tricentis.Pages.WishlistPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testcase_3_step_definition extends TestBase {
    public static String product_name;
    @When("click on any item from Featured products")
    public void click_on_any_item_from_featured_products() {
        FeatureProductsPage featureProducts=new FeatureProductsPage(getdriver());
        featureProducts.click_on_giftcard_product();
        product_name=featureProducts.get_giftcard_product_name();
    }
    @When("fill Recepients name and email")
    public void fill_recepients_name_and_email() {
        FeatureProductsPage featureProducts=new FeatureProductsPage(getdriver());
        featureProducts.fill_recepient_name();
        featureProducts.fill_recepient_email();
    }
    @When("add the product to wishlist")
    public void add_the_product_to_wishlist() {
        FeatureProductsPage featureProducts=new FeatureProductsPage(getdriver());
        featureProducts.add_product_to_wishlist();
    }
    @Then("Verify message and click on click on close button.")
    public void verify_message_and_click_on_click_on_close_button() {
        FeatureProductsPage featureProducts=new FeatureProductsPage(getdriver());
        featureProducts.validate_wishlist_notification_message();
    }
    @Then("Click on wishlist link from navigation menu at the top of homepage")
    public void click_on_wishlist_link_from_navigation_menu_at_the_top_of_homepage() {
        HomePage homePage=new HomePage(getdriver());
        homePage.click_on_wishlist();
    }
    @Then("verify product name in wishlistpage")
    public void verify_product_name_in_wishlistpage() {
        WishlistPage wishlistPage=new WishlistPage(getdriver());
        wishlistPage.validate_product_name(product_name);

    }


}
