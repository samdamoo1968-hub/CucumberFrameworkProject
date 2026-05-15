package demowebshop_tricentis.Standalone_testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
@Test
public class testcase_2 {

    public void tc_02() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement> elements=driver.findElements(By.xpath("(//div[contains(@class,'listbox')])[1]//li//a"));

        List<String> textsBeforeClick = new ArrayList<>();

        for(int i=0;i< elements.size();i++){
            String elementTextBeforeClick = elements.get(i).getText();
            System.out.println(elementTextBeforeClick);
            elements.get(i).click();
            WebElement product_name = driver.findElement(By.xpath("//div[@class='page-title']//h1"));
            wait.until(ExpectedConditions.visibilityOf(product_name));

            Assert.assertEquals(elementTextBeforeClick, product_name.getText());
            driver.findElement(By.xpath("//div[@class='header-logo']//a")).click();
            elements=driver.findElements(By.xpath("(//div[contains(@class,'listbox')])[1]//li//a"));

        }
    }

}