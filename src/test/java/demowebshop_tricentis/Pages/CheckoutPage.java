package demowebshop_tricentis.Pages;

import demowebshop_tricentis.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1")
    WebElement Checkout_page_header;


    @FindBy(xpath = "(//h2)[1]")
    WebElement billing_address_header;


    @FindBy(xpath = "(//h2)[2]")
    WebElement payment_method_header;

    @FindBy(xpath = "//select[@name='billing_address_id']//option[1]")
    WebElement Billing_address_dropdown;

    @FindBy(xpath = "//input[@title='Continue']")
    WebElement billing_address_continue_button;

    @FindBy(xpath = "//input[@id='paymentmethod_0']")
    WebElement cash_on_delivery_radio_button;

    @FindBy(xpath = "(//input[@type='button'])[3]")
    WebElement payment_method_continue_button;

    @FindBy(xpath = "(//h2)[3]")
    WebElement payment_info_header;

    @FindBy(xpath = "(//p)[2]")
    WebElement payment_info_text;

    @FindBy(xpath = "(//input[@type='button'])[4]")
    WebElement payment_info_continue_button;

    @FindBy(xpath = "(//h2)[4]")
    WebElement Confirm_order_header;

    @FindBy(xpath = "//td[@class='product']//a")
    WebElement Confirm_order_product_name_text;

    @FindBy(xpath="(//input[@type='button'])[5]")
    WebElement confirm_button;

    @FindBy(xpath = "//strong")
    WebElement successfull_oder_confirm_message;

    @FindBy(xpath = "(//ul[@class='details']//li)[1]")
    WebElement order_number;

    @FindBy(xpath = "//input[@type='button']")
    WebElement last_continue_button;

    public void validate_checkout_page_header(){
        wait.until(ExpectedConditions.visibilityOf(Checkout_page_header));
        Assert.assertEquals(Checkout_page_header.getText(),"Checkout");
    }

    public void validate_billing_address_Header(){
        Assert.assertEquals(billing_address_header.getText().toLowerCase(),"billing address");
    }

    public void Validate_Billing_address_dropdown(){
    String gettext=Billing_address_dropdown.getText();
     Assert.assertFalse(gettext.isEmpty());
    }
    public void click_on_continue_after_validating_billing_adress(){
        billing_address_continue_button.click();

    }

    public void validate_payment_method_header() {
        Assert.assertTrue(payment_method_header.getText().equalsIgnoreCase("Payment method"));

        }

        public void select_cash_on_delivery(){
        cash_on_delivery_radio_button.click();
        }

        public void click_on_continue_button_after_selecting_COD(){
            payment_method_continue_button.click();
        }

        public void validate_payment_information_header(){
        Assert.assertTrue(payment_info_header.getText().equalsIgnoreCase("Payment information"));
        }

        public void Validate_payment_mode_confirmation_message(){
        wait.until(ExpectedConditions.visibilityOf(payment_info_text));
        Assert.assertTrue(payment_info_text.getText().equalsIgnoreCase("You will pay by COD"));
        }

        public void click_on_continue_button_after_payment_mode_validation(){
            payment_info_continue_button.click();
        }

        public void Validate_confirm_order_header(){
        Assert.assertTrue(Confirm_order_header.getText().equalsIgnoreCase("Confirm order"));
        }
        public void validate_product_name_in_confirm_order_section(String product_name){
        Assert.assertTrue(Confirm_order_product_name_text.getText().equalsIgnoreCase(product_name));
         }

         public void click_on_confirm_button(){
        confirm_button.click();
         }

         public void validate_order_successful_message(){
        wait.until(ExpectedConditions.visibilityOf(successfull_oder_confirm_message));
        Assert.assertEquals(successfull_oder_confirm_message.getText(),"Your order has been successfully processed!");
         }

         public void get_order_number(){
             System.out.println(order_number.getText());
         }

         public void click_on_continue_button_after_fetching_order_number(){
        last_continue_button.click();
         }



    }



