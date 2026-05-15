package Runner;

import com.cucumber.listener.Reporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileReader;

@CucumberOptions(
        tags = "",
        features = {"src/test/resources/Features/Testcase1.feature"},

       glue = {"Step_definitions"},
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        dryRun = false
        )
public class Testng_Runner extends AbstractTestNGCucumberTests {
//    @DataProvider( parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//
//        };

    }

