package demowebshop_tricentis.Standalone_testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testcase_4 {
    @Test
    public void tc_4(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //1.Navigate to URL
        driver.get("https://demowebshop.tricentis.com/");
        //2.Perform login
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kjhfdhhrg@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("testuser");
        driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
        //3.click on any item from Featured products
        driver.findElement(By.linkText("$25 Virtual Gift Card")).click();
        //4.get the product name
        String product_name=driver.findElement(By.xpath("//div[@class='product-name']//h1")).getText();
        //5.fill Recepients name and email
        driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("william");
        driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientEmail']")).sendKeys("gfertyuj@gmail.com");
        //6.Click on add to cart
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
        //7.Validate notification message and dismiss it.
        String notifiaction_message=driver.findElement(By.xpath("//div[@id='bar-notification']//p")).getText();
        Assert.assertEquals(notifiaction_message,"The product has been added to your shopping cart");
        driver.findElement(By.xpath("//span[@class='close']")).click();
        //8.click on shopping cart link frm navigation bar
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")))).click();
        // 9.Validate product name
        String product_name_confir=driver.findElement(By.xpath("//a[@class='product-name']")).getText();
       // 10.close the url
        driver.close();


    }
}
