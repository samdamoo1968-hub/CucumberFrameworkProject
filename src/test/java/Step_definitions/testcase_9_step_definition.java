package Step_definitions;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.Newsletter_subscription;
import io.cucumber.java.en.Then;

public class testcase_9_step_definition extends TestBase {
    @Then("user fill email {string} in newsletter field")
    public void user_fill_email_in_newsletter_field(String string) {
        Newsletter_subscription newsletter=new Newsletter_subscription(getdriver());
        newsletter.fill_useremail_for_newsletter_subscription();


    }
    @Then("Validate subscription message after filling email")
    public void validate_subscription_message_after_filling_email() {
        Newsletter_subscription newsletter=new Newsletter_subscription(getdriver());
        newsletter.get_confirmation_text_message();
    }
}
