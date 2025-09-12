package demowebshop_tricentis.Pages;

import demowebshop_tricentis.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddToCartPage extends BasePage {
    public AddToCartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//td[@class='product']//a")
    WebElement product_name_on_addToCartPage;



    @FindBy(xpath = "//input[@name='removefromcart']")
            WebElement click_on_remove_checkbox;

    @FindBy(xpath = "//input[@name='updatecart']")
            WebElement update_button;

    @FindBy(xpath = "//div[@class='order-summary-content']")
            WebElement Empty_cart_message;

    @FindBy(xpath = "//input[@id='termsofservice']")
            WebElement terms_and_conditions_checkbox;

    @FindBy(xpath = "//button[@id='checkout']")
            WebElement checkout_button;






    public void validate_product_name(String productname) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(productname, product_name_on_addToCartPage.getText());
    }

    public void remove_item_from_cart(){
        click_on_remove_checkbox.click();
        update_button.click();
    }

    public void Validate_cart_after_removing_item(){
        String gettext=Empty_cart_message.getText();
        Assert.assertTrue(gettext.contains("empty"));
    }

    public void accept_terms_and_condition(){
        terms_and_conditions_checkbox.click();
    }

    public void click_on_checkout_button(){
        checkout_button.click();
    }

    }
