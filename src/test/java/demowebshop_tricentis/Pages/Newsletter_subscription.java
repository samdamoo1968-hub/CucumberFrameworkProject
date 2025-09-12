package demowebshop_tricentis.Pages;

import demowebshop_tricentis.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newsletter_subscription extends BasePage {
    public Newsletter_subscription(WebDriver driver) {
        super(driver);
    }



        @FindBy(xpath = "//input[@id='newsletter-email']")
    WebElement fill_email_for_newsletter;

        @FindBy(xpath = "//input[@id='newsletter-subscribe-button']")
    WebElement click_on_button;

        @FindBy(xpath = "//*[contains(text(), 'signing up!')]")
    WebElement Confirmation_msg;


        public void fill_useremail_for_newsletter_subscription(){
            fill_email_for_newsletter.sendKeys("kjhfdhhrg@gmail.com");
            click_on_button.click();
        }

        public void get_confirmation_text_message(){
            String get_message=Confirmation_msg.getText();
            System.out.println(get_message);
        }
}
