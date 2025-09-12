package demowebshop_tricentis.Pages;

import demowebshop_tricentis.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BasePage {
    public LogoutPage(WebDriver driver) {
        super(driver);
       // PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logout;

    public void Logout(){
        logout.click();
    }

}
