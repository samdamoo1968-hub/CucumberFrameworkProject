package demowebshop_tricentis.Frameworked_tcs;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.HomePage;
import org.testng.annotations.Test;

public class testcase_2 extends TestBase {
    @Test
    public void tc_2(){
        start_driver();
        OpenUrl();
        HomePage homepage=new HomePage(getdriver());
        homepage.validate_all_items_under_category();
        CloseUrl();
    }
}
