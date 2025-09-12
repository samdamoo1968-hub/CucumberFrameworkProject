package Step_definitions;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.HomePage;
import io.cucumber.java.en.Then;

public class testcase_2_step_definition extends TestBase {
    HomePage homepage;
    @Then("browse all items under categories by clicking each item and validate the header section.")
    public void browse_all_items_under_categories_by_clicking_each_item_and_validate_the_header_section() throws InterruptedException {

       homepage=new HomePage(getdriver());
        Thread.sleep(5000);
        homepage.validate_all_items_under_category();
    }


}
