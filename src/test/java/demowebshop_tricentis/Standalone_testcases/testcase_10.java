package demowebshop_tricentis.Standalone_testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testcase_10 {
   @Test
    public void tc_10(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kjhfdhhrg@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testuser");
        driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
        driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//a[@class='ico-login']")).getText(),"Log in");
        driver.close();
    }
}
