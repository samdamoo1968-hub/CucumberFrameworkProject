package Step_definitions;

import demowebshop_tricentis.Base.BasePage;
import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.AccountPage;
import demowebshop_tricentis.Pages.HomePage;
import demowebshop_tricentis.Pages.LoginPage;
import demowebshop_tricentis.Pages.LogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testcase_1_step_definition extends TestBase {
 HomePage homepage;
    LoginPage loginpage;
     AccountPage accountPage;
    @Given("Navigate to the URL")
    public void navigate_to_the_url() {
       // start_driver();
        //OpenUrl();
    }
    @When("click on log in link")
    public void click_on_log_in_link() {
        homepage=new HomePage(getdriver());

        homepage.click_on_LoginLink();
    }
    @When("fill email {string}")
    public void fill_email(String string) {
        loginpage=new LoginPage(getdriver());
        loginpage.enter_email_id();
    }
    @When("fill password {string}")
    public void fill_password(String string) {
      //  LoginPage loginpage=new LoginPage(getdriver());
        loginpage.enter_password();
    }
    @When("click on login button")
    public void click_on_login_button() {
       // LoginPage loginpage=new LoginPage(getdriver());
        loginpage.click_on_login_button();
    }
    @When("verify mail id link in the home after login.")
    public void verify_mail_id_link_in_the_home_after_login() {
       accountPage=new AccountPage(getdriver());
        accountPage.Validate_user_email_id_link();
    }



}
