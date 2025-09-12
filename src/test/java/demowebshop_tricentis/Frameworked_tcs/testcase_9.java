package demowebshop_tricentis.Frameworked_tcs;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.AccountPage;
import demowebshop_tricentis.Pages.HomePage;
import demowebshop_tricentis.Pages.LoginPage;
import demowebshop_tricentis.Pages.Newsletter_subscription;
import org.testng.annotations.Test;

public class testcase_9 extends TestBase {
@Test
    public void tc_09(){
        start_driver();
        OpenUrl();
        HomePage homepage=new HomePage(getdriver());
        homepage.click_on_LoginLink();
        LoginPage loginpage=new LoginPage(getdriver());
        loginpage.enter_email_id();
        loginpage.enter_password();
        loginpage.click_on_login_button();
        AccountPage accountPage=new AccountPage(getdriver());
        accountPage.Validate_user_email_id_link();
        Newsletter_subscription newsletter=new Newsletter_subscription(getdriver());
        newsletter.fill_useremail_for_newsletter_subscription();
        newsletter.get_confirmation_text_message();

    }
}
