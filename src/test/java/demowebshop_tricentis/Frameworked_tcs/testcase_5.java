package demowebshop_tricentis.Frameworked_tcs;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.*;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class testcase_5 extends TestBase {
@Test
    public void tc_5() throws InterruptedException {
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
        addToCartPage.accept_terms_and_condition();
        addToCartPage.click_on_checkout_button();
        CheckoutPage checkoutPage=new CheckoutPage(getdriver());
        checkoutPage.validate_checkout_page_header();
        checkoutPage.validate_billing_address_Header();
        checkoutPage.Validate_Billing_address_dropdown();
        checkoutPage.click_on_continue_after_validating_billing_adress();
        checkoutPage.validate_payment_method_header();
        checkoutPage.select_cash_on_delivery();
        checkoutPage.click_on_continue_button_after_selecting_COD();
        checkoutPage.validate_payment_information_header();
        checkoutPage.Validate_payment_mode_confirmation_message();
        checkoutPage.click_on_continue_button_after_payment_mode_validation();
        checkoutPage.Validate_confirm_order_header();
        checkoutPage.validate_product_name_in_confirm_order_section(product_name);
        checkoutPage.click_on_confirm_button();
        checkoutPage.validate_order_successful_message();
        checkoutPage.get_order_number();
        checkoutPage.click_on_continue_button_after_fetching_order_number();
        homepage.getPageTitle();



//
//        System.out.println(driver.findElement(By.xpath("(//ul[@class='details']//li)[1]")).getText());


    }
}
