package demowebshop_tricentis.Standalone_testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testcase_6 {
    @Test
    public void tc_6(){
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
        String product_name=driver.findElement(By.xpath("//div[@class='product-name']//h1")).getText();
        //4,fill Recepients name and email
        driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("william");
        driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientEmail']")).sendKeys("gfertyuj@gmail.com");
        //5.add the product to wishlist
        driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-2']")).click();
        //6.Verify notification message and cancel the message.
        String notification_message=driver.findElement(By.xpath("//div[@id='bar-notification']//p")).getText();
        Assert.assertEquals(notification_message,"The product has been added to your wishlist");
        driver.findElement(By.xpath("//span[@class='close']")).click();
        //7.Click on wishlist link from navigation menu at the top of homepage
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@class='ico-wishlist'])[1]"))));
        driver.findElement(By.xpath("(//a[@class='ico-wishlist'])[1]")).click();
        //8.verify product name under wishlist section
        String prod_name_wishlist_page=driver.findElement(By.linkText("$25 Virtual Gift Card")).getText();
        Assert.assertEquals(product_name,prod_name_wishlist_page);

        driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
        driver.findElement(By.xpath("//input[@name='updatecart']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='wishlist-content']")).getText(),"The wishlist is empty!" );

    }
}
