package demowebshop_tricentis.Frameworked_tcs;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.*;
import org.testng.annotations.Test;

public class testcase_8 extends TestBase {
    @Test
    public void tc_8() throws InterruptedException {
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
        featureProducts.click_on_add_to_cart();
        featureProducts.validate_addtoCart_notification_message();
        homepage.click_on_shoppingCartLink();
        AddToCartPage addToCartPage=new AddToCartPage(getdriver());
        addToCartPage.validate_product_name(product_name);
        addToCartPage.remove_item_from_cart();
        addToCartPage.Validate_cart_after_removing_item();
        CloseUrl();
    }
}
