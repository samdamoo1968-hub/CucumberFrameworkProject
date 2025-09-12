package demowebshop_tricentis.Standalone_testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
@Test
public class testcase_7 {
    public void tc_7() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Navigate to URL
        driver.get("https://demowebshop.tricentis.com/");
        String search_product="comp";

        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys(search_product);
        driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();

        List<WebElement> products=driver.findElements(By.xpath("//div[@class='item-box']//div[@class='details']//h2"));
      for(int i=0;i<products.size();i++){
          System.out.println(products.get(i).getText());
          Assert.assertTrue(products.get(i).getText().toLowerCase().contains(search_product));
      }

        driver.close();

    }
}
