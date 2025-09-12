package demowebshop_tricentis.Pages;

import demowebshop_tricentis.Base.BasePage;
import demowebshop_tricentis.Constants.Global_Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {
    Global_Constants global_constants=new Global_Constants();
    public LoginPage(WebDriver driver) {
        super(driver);
       // PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email_id;

    @FindBy(xpath = "//input[@id='Password']")
            WebElement password;

    @FindBy(xpath = "//input[contains(@class,'login-button')]")
            WebElement login_button;


    public void enter_email_id(){
        email_id.sendKeys(global_constants.user_emailId);
    }
    public void enter_password(){
        password.sendKeys(global_constants.user_Password);
    }

    public void click_on_login_button(){
        login_button.click();
    }

}
