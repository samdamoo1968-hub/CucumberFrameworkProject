package Step_definitions;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.LogoutPage;
import io.cucumber.java.en.Then;

public class testcase_10_step_definition extends TestBase {
    @Then("click on logout button")
    public void click_on_logout_button() {
        LogoutPage logout=new LogoutPage(getdriver());
        logout.Logout();

    }
}
