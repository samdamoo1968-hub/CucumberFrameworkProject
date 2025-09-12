package demowebshop_tricentis.Standalone_testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testcase_9 {
    @Test
    public  void tc_9(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Navigate to URL
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        // 3.fill email
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kjhfdhhrg@gmail.com");
        // 4.fill password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testuser");
        //click on login button
        driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
        // 5.verify mail id in the home after login.
        Assert.assertEquals(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText(), "kjhfdhhrg@gmail.com");
        driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("kjhfdhhrg@gmail.com");
        driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
        String Confirmation_msg=driver.findElement(By.xpath("//*[contains(text(), 'signing up!')]")).getText();
        System.out.println(Confirmation_msg);
    }
}
