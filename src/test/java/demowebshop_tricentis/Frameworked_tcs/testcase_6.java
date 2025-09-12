package demowebshop_tricentis.Frameworked_tcs;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.*;
import org.testng.annotations.Test;

public class testcase_6 extends TestBase {
    @Test
    public void tc_6(){
        start_driver();
        OpenUrl();
        HomePage homepage=new HomePage(getdriver());
        homepage.click_on_LoginLink();
        LoginPage loginpage=new LoginPage(getdriver());
        loginpage.enter_email_id();
        loginpage.enter_password();
        loginpage.click_on_login_button();
        AccountPage accountPage=new AccountPage(getdriver());
        accountPage.Validate_user_email_id_link();
        FeatureProductsPage featureProducts=new FeatureProductsPage(getdriver());
        featureProducts.click_on_giftcard_product();
        String product_name=featureProducts.get_giftcard_product_name();
        featureProducts.fill_recepient_name();
        featureProducts.fill_recepient_email();
        featureProducts.add_product_to_wishlist();
        featureProducts.validate_wishlist_notification_message();
        homepage.click_on_wishlist();
        WishlistPage wishlistPage=new WishlistPage(getdriver());
        wishlistPage.validate_product_name(product_name);
        wishlistPage.remove_item_from_wishlist();
        wishlistPage.validate_empty_wishlist();
        CloseUrl();
    }
}
