package demowebshop_tricentis.Pages;

import demowebshop_tricentis.Base.BasePage;
import demowebshop_tricentis.Constants.Global_Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage extends BasePage {
    Global_Constants global_constants=new Global_Constants();
    public RegisterPage(WebDriver driver) {
        super(driver);
        //PageFactory.initElements(driver,this);
    }


    String Expected_Conf_Msg="Your registration completed";

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement Male_radio_button;

    @FindBy(xpath = "//input[@id='FirstName']")
            WebElement first_name;


    @FindBy(xpath="//input[@id='LastName']")
     WebElement last_name;

   @FindBy(xpath = "//input[@id='Email']")
     WebElement email_id;

   @FindBy(xpath = "//input[@id='Password']")
     WebElement password;


    @FindBy(xpath = "//input[@id='ConfirmPassword']")
      WebElement confirm_password;

    @FindBy(xpath="//input[@id='register-button']")
            WebElement register_button;

    @FindBy(xpath = "//div[@class='result']")
            WebElement register_conf_msg;

    @FindBy(xpath = "//input[contains(@class,'continue-button')]")
            WebElement continue_button;

    public void click_on_Male_RadioBtn(){
        Male_radio_button.click();
    }

    public void fill_first_name(){
        first_name.sendKeys("sam");
    }

    public void fill_last_name(){
        last_name.sendKeys("carter");
    }

    public void fill_email(){
        email_id.sendKeys("sdrtyhj@gmail.com");
    }

    public void fill_password(){
        password.sendKeys(global_constants.user_Password);
    }

    public void confirm_password(){
        confirm_password.sendKeys(global_constants.user_Password);
    }
    public void click_on_register_button(){
        register_button.click();
    }

    public void Verify_registration_msg(){
        Assert.assertEquals(register_conf_msg.getText(),Expected_Conf_Msg);
    }

    public void click_on_continue_button(){
        continue_button.click();
    }
}
