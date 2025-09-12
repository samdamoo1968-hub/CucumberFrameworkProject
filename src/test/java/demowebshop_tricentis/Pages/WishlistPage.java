package demowebshop_tricentis.Pages;

import demowebshop_tricentis.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WishlistPage extends BasePage {
    public WishlistPage(WebDriver driver) {
        super(driver);
      //  PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//td[@class='product']//a")
    WebElement product_name_on_wishlistpage;

    @FindBy(xpath = "//input[@name='removefromcart']")
            WebElement remove_checkbox;

    @FindBy(xpath = "//input[@name='updatecart']")
            WebElement update_wishlist_button;

    @FindBy(xpath="//div[@class='wishlist-content']")
            WebElement empty_wishlist_text;


    public void validate_product_name(String productname){
        Assert.assertEquals(productname,product_name_on_wishlistpage.getText());
    }

    public void remove_item_from_wishlist(){
        remove_checkbox.click();
        update_wishlist_button.click();
    }
    public void validate_empty_wishlist(){
        if(empty_wishlist_text.getText().contains("The wishlist is empty!") ){

        }
        else{
            remove_item_from_wishlist();
        }
    }
}
