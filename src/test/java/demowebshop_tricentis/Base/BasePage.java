package demowebshop_tricentis.Base;

import demowebshop_tricentis.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver=driver;

        wait=new WebDriverWait(driver,5);
        PageFactory.initElements(driver,this);

    }
}
