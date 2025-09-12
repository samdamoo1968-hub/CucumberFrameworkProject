package demowebshop_tricentis.Frameworked_tcs;

import demowebshop_tricentis.Base.TestBase;
import demowebshop_tricentis.Pages.HomePage;
import org.testng.annotations.Test;

public class testcase_7 extends TestBase {
    @Test
    public void tc_7(){
        start_driver();
        OpenUrl();
        HomePage homePage=new HomePage(getdriver());
        homePage.search_product();
        homePage.Verify_products_containing_searchproduct_name();
    }
}
