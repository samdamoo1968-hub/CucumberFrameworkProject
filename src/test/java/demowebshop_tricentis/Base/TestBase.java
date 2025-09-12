package demowebshop_tricentis.Base;

import demowebshop_tricentis.Constants.Global_Constants;
import demowebshop_tricentis.Pages.AccountPage;
import demowebshop_tricentis.Pages.HomePage;
import demowebshop_tricentis.Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;

public class TestBase {

    Global_Constants global_constants = new Global_Constants();

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Set driver in ThreadLocal
    public void setDriver(WebDriver driverInstance) {
        driver.set(driverInstance);
    }

    // Get driver from ThreadLocal
    public static WebDriver getdriver() {
        return driver.get();
    }

    // Start driver and return it
    public WebDriver start_driver() {
        setDriver(new DriverManager().initialize_driver());
        return getdriver();
    }

    // Launch application URL
    public void OpenUrl() {
        getdriver().get(global_constants.URL);
    }

    // Close / quit browser safely
    public void CloseUrl() {
        WebDriver driverInstance = getdriver();
        if (driverInstance != null) {
            driverInstance.quit();
            driver.remove(); // ✅ cleanup ThreadLocal to avoid memory leaks
        }
    }
}


//    Global_Constants global_constants = new Global_Constants();
//
//    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//
//
//    public void setdriver(WebDriver driver) {
//        this.driver.set(driver);
//    }
//
//    public static WebDriver getdriver() {
//        return driver.get();
//    }
//
//
//    public void start_driver() {
//
//        setdriver(new DriverManager().initialize_driver());
//    }
//
//    public void OpenUrl() {
//        getdriver().get(global_constants.URL);
//    }
//
//    public void CloseUrl() {
//        getdriver().close();
//    }


