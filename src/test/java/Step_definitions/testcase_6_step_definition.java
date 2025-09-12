package Step_definitions;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.WishlistPage;
import io.cucumber.java.en.Then;

public class testcase_6_step_definition extends TestBase {
    @Then("remove item from wishlist page")
    public void remove_item_from_wishlist_page() {
        WishlistPage wishlistPage=new WishlistPage(getdriver());
        wishlistPage.remove_item_from_wishlist();

    }
    @Then("Validate wishlist page is empty")
    public void validate_wishlist_page_is_empty() {
        WishlistPage wishlistPage=new WishlistPage(getdriver());
        wishlistPage.validate_empty_wishlist();
    }

}
