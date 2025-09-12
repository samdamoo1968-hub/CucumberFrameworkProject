package demowebshop_tricentis.Pages;

import demowebshop_tricentis.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class FeatureProductsPage extends BasePage {
    String Expected_wishlist_notification_msg="The product has been added to your wishlist";
    String Expected_add_to_cart_notification_msg="The product has been added to your shopping cart";

    public FeatureProductsPage(WebDriver driver) {
        super(driver);
       // PageFactory.initElements(driver,this);
    }
    @FindBy(linkText ="$25 Virtual Gift Card" )
    WebElement giftcard_product;

    @FindBy(xpath ="//div[@class='product-name']//h1" )
            WebElement giftcard_product_name;


   @FindBy(xpath = "//input[@id='giftcard_2_RecipientName']")
           WebElement recepient_name;
   @FindBy(xpath = "//input[@id='giftcard_2_RecipientEmail']")
           WebElement recepient_email;


   @FindBy(xpath = "//input[@id='add-to-wishlist-button-2']")
           WebElement add_to_wishlist;

   @FindBy(xpath = "//div[@id='bar-notification']//p")
           WebElement notification_message;

   @FindBy(xpath ="//span[@class='close']" )
           WebElement cancel_notification;

   @FindBy(xpath = "//input[@id='add-to-cart-button-2']")
   WebElement add_to_cart_button;


   public void click_on_giftcard_product(){
       giftcard_product.click();
   }

   public String get_giftcard_product_name(){
      return giftcard_product_name.getText();

   }

   public void fill_recepient_name(){
       recepient_name.sendKeys("sam");
   }
   public void fill_recepient_email(){
       recepient_email.sendKeys("xyfg@gmail.com");
   }

   public void add_product_to_wishlist(){
       add_to_wishlist.click();
   }
   public void validate_wishlist_notification_message(){
       Assert.assertEquals(notification_message.getText(),Expected_wishlist_notification_msg);
       wait.until(ExpectedConditions.visibilityOf( cancel_notification)).click();

    }
    public void click_on_add_to_cart(){
       add_to_cart_button.click();
    }
    public void validate_addtoCart_notification_message(){
        Assert.assertEquals(notification_message.getText(),Expected_add_to_cart_notification_msg);
        wait.until(ExpectedConditions.visibilityOf( cancel_notification)).click();

    }




}
