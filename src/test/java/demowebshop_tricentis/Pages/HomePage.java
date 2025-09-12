package demowebshop_tricentis.Pages;

import demowebshop_tricentis.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

String search_product="comp";


    public HomePage(WebDriver driver) {
        super(driver);
      //  PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement login_link;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement register_link;

    @FindBy(xpath = "(//a[@class='ico-cart'])[1]")
    WebElement shoppingCart_link;

    @FindBy(xpath = "(//a[@class='ico-wishlist'])[1]")
    WebElement wishlist_link;

    @FindBy(xpath="(//div[contains(@class,'listbox')])[1]//li//a")
    List<WebElement> category_items;

    public void getPageTitle(){
        driver.getTitle();
    }

    public void click_on_register_link(){
        register_link.click();
    }



        @FindBy(xpath = "//input[@id='small-searchterms']")
        WebElement search_feild;

        @FindBy(xpath = "(//input[@type='submit'])[1]")
        WebElement serach_button;

        @FindBy(xpath ="//div[@class='item-box']//div[@class='details']//h2" )
        List<WebElement> products;

    public void click_on_shoppingCartLink(){

        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(shoppingCart_link)).click();

    }

    public void click_on_wishlist(){
        wishlist_link.click();
    }

    public void click_on_LoginLink(){
        login_link.click();
    }

    public void validate_all_items_under_category(){
        List<String> textsBeforeClick = new ArrayList<>();

        for(int i=0;i<category_items.size();i++){
            String elementTextBeforeClick = category_items.get(i).getText();
            System.out.println(elementTextBeforeClick);
            category_items.get(i).click();
            WebElement product_name = driver.findElement(By.xpath("//div[@class='page-title']//h1"));
            wait.until(ExpectedConditions.visibilityOf(product_name));

            Assert.assertEquals(elementTextBeforeClick, product_name.getText());
            driver.findElement(By.xpath("//div[@class='header-logo']//a")).click();
            category_items=driver.findElements(By.xpath("(//div[contains(@class,'listbox')])[1]//li//a"));

        }


    }
    public void search_product() {
        search_feild.sendKeys(search_product);
        serach_button.click();
    }

    public void Verify_products_containing_searchproduct_name(){
        for(int i=0;i<products.size();i++){
            System.out.println(products.get(i).getText());
            Assert.assertTrue(products.get(i).getText().toLowerCase().contains(search_product));
        }
    }
}
