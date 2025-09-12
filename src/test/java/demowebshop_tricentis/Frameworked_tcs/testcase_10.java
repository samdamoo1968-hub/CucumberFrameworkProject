package demowebshop_tricentis.Frameworked_tcs;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.AccountPage;
import demowebshop_tricentis.Pages.HomePage;
import demowebshop_tricentis.Pages.LoginPage;
import demowebshop_tricentis.Pages.LogoutPage;
import org.testng.annotations.Test;

public class testcase_10 extends TestBase {
    @Test
    public void tc_10(){
        start_driver();
        OpenUrl();
        HomePage homePage=new HomePage(getdriver());
        homePage.click_on_LoginLink();
        LoginPage loginPage=new LoginPage(getdriver());
        loginPage.enter_email_id();
        loginPage.enter_password();
        loginPage.click_on_login_button();
        AccountPage accountPage=new AccountPage(getdriver());
        accountPage.Validate_user_email_id_link();
        LogoutPage logoutPage=new LogoutPage(getdriver());
        logoutPage.Logout();
    }
}
