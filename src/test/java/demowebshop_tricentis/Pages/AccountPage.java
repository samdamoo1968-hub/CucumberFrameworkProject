package demowebshop_tricentis.Pages;

import demowebshop_tricentis.Base.BasePage;
import demowebshop_tricentis.Constants.Global_Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AccountPage extends BasePage {
    Global_Constants global_constants=new Global_Constants();
    public AccountPage(WebDriver driver) {
        super(driver);
       // PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//a[@class='account'])[1]")
    WebElement email_id_link;

    public void Validate_user_email_id_link(){
        Assert.assertEquals(email_id_link.getText(),global_constants.user_emailId);
    }
}
