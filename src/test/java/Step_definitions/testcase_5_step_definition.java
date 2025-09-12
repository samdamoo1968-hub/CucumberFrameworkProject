package Step_definitions;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.AddToCartPage;
import demowebshop_tricentis.Pages.CheckoutPage;
import demowebshop_tricentis.Pages.HomePage;
import io.cucumber.java.en.Then;
import static Step_definitions.testcase_3_step_definition.product_name;
public class testcase_5_step_definition extends TestBase {
    HomePage homepage;

    CheckoutPage checkoutPage;






    @Then("click on terms and condition checkbox")
    public void click_on_terms_and_condition_checkbox() {
        AddToCartPage addToCartPage=new AddToCartPage(getdriver());
        addToCartPage.accept_terms_and_condition();
    }
    @Then("click on checkout button")
    public void click_on_checkout_button() {
        AddToCartPage addToCartPage=new AddToCartPage(getdriver());
        addToCartPage.click_on_checkout_button();
    }
    @Then("Validate checkout page header")
    public void validate_checkout_page_header() {
        checkoutPage=new CheckoutPage(getdriver());
        checkoutPage.validate_checkout_page_header();
    }
    @Then("Validate billing address header")
    public void validate_billing_address_header() {
        checkoutPage.validate_billing_address_Header();
    }
    @Then("Validate billing address dropdown")
    public void validate_billing_address_dropdown() {
        checkoutPage.Validate_Billing_address_dropdown();
    }
    @Then("click on continue button after validating billing address")
    public void click_on_continue_button_after_validating_billing_address() {
        checkoutPage.click_on_continue_after_validating_billing_adress();
    }
    @Then("Validate Payment method header")
    public void validate_payment_method_header() {
        checkoutPage.validate_payment_method_header();
    }
    @Then("click on Cash on delivery option")
    public void click_on_cash_on_delivery_option() {
        checkoutPage.select_cash_on_delivery();
    }
    @Then("click on continue button after choosing COD")
    public void click_on_continue_button_after_choosing_cod() {
        checkoutPage.click_on_continue_button_after_selecting_COD();
    }
    @Then("Validate Payment information header")
    public void validate_payment_information_header() {
        checkoutPage.validate_payment_information_header();
    }
    @Then("validate payment option selected message")
    public void validate_payment_option_selected_message() {
        checkoutPage.Validate_payment_mode_confirmation_message();
    }
    @Then("click on continue button after validating payment option message")
    public void click_on_continue_button_after_validating_payment_option_message() {
        checkoutPage.click_on_continue_button_after_payment_mode_validation();
    }
    @Then("Validate Confirm order header")
    public void validate_confirm_order_header() {
        checkoutPage.Validate_confirm_order_header();
    }
    @Then("Validate product name in confirm order section")
    public void validate_product_name_in_confirm_order_section() {
        checkoutPage.validate_product_name_in_confirm_order_section(product_name);
    }
    @Then("click on confirm button")
    public void click_on_confirm_button() {
        checkoutPage.click_on_confirm_button();
    }
    @Then("Validate order successful message")
    public void validate_order_successful_message() {
        checkoutPage.validate_order_successful_message();
    }
    @Then("print order number in console")
    public void print_order_number_in_console() {
        checkoutPage.get_order_number();


    }
    @Then("click on continue button after printing order number")
    public void click_on_continue_button_after_printing_order_number() {
        checkoutPage.click_on_continue_button_after_fetching_order_number();
    }
    @Then("validate page title in homepage")
    public void validate_page_title_in_homepage() {
        homepage=new HomePage(getdriver());
        homepage.getPageTitle();
    }

}
