package demowebshop_tricentis.Standalone_testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testcase_1 {

    public void TC_01_registration(){
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     //Navigate to URL
     driver.get("https://demowebshop.tricentis.com/");
     //2.print page title
     System.out.println(driver.getTitle());
     //3.Click on Register link
     driver.findElement(By.xpath("//a[@class='ico-register']")).click();
     driver.findElement(By.xpath("//input[@id='gender-male']")).click();
     //5.Fill First Name
     driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("sam");
     //6.fill last name
     driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("carter");
     //7.fill email id
     driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kjhfdhhrg@gmail.com");
     //8.fill password
     driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testuser");
     //9.confirm password
     driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("testuser");
     //10.click on Register button
     driver.findElement(By.xpath("//input[@id='register-button']")).click();
     //11.Your registration completed
     Assert.assertEquals(driver.findElement(By.xpath("//div[@class='result']")).getText(),"Your registration completed");
     //12.click on continue button
     driver.findElement(By.xpath("//input[contains(@class,'continue-button')]")).click();
    // 13.Verify the home page by validating page title
     driver.getTitle();
     driver.close();


    }
    @Test
    public void TC_01_login(){

      //  1.Navigate to URL
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Navigate to URL
        driver.get("https://demowebshop.tricentis.com/");
      //  2.click on log in button
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
       // 3.fill email
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kjhfdhhrg@gmail.com");
       // 4.fill password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testuser");
      //click on login button
        driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
       // 5.verify mail id in the home after login.
        Assert.assertEquals(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText(), "kjhfdhhrg@gmail.com");
        //6.clcik on logout button
        driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
        driver.close();

    }
}
