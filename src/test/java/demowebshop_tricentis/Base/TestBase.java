package demowebshop_tricentis.Base;

import demowebshop_tricentis.Constants.Global_Constants;
import org.openqa.selenium.WebDriver;

public class TestBase {

    Global_Constants global_constants = new Global_Constants();

    // Thread-safe WebDriver
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Set driver
    public void setDriver(WebDriver driverInstance) {
        driver.set(driverInstance);
    }

    // Get driver
    public static WebDriver getdriver() {
        return driver.get();
    }

    // Initialize driver
    public WebDriver start_driver() {

        DriverManager driverManager = new DriverManager();

        setDriver(driverManager.initialize_driver());

        getdriver().manage().window().maximize();

        return getdriver();
    }

    // Open application URL
    public void OpenUrl() {

        getdriver().get(global_constants.URL);
    }

    // Quit browser safely
    public void CloseUrl() {

        WebDriver driverInstance = getdriver();

        if (driverInstance != null) {

            driverInstance.quit();

            driver.remove(); // cleanup ThreadLocal
        }
    }
}
