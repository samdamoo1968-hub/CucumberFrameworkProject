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
@Test
public class testcase_5 {
    public void tc5() throws InterruptedException {
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
        org.testng.Assert.assertEquals(product_name,product_name_confir);

        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        String billing_address=driver.findElement(By.xpath("//select[@name='billing_address_id']//option[1]")).getText();
        org.testng.Assert.assertFalse(billing_address.isEmpty());
        driver.findElement(By.xpath("//input[@title='Continue']")).click();
        driver.findElement(By.xpath("//input[@id='paymentmethod_0']")).click();
        driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
        Thread.sleep(3000);
        String type_of_payment=driver.findElement(By.xpath("(//p)[2]")).getText();
        org.testng.Assert.assertEquals(type_of_payment,"You will pay by COD");
        driver.findElement(By.xpath("(//input[@type='button'])[4]")).click();
        String confirm_oder_product_name=driver.findElement(By.xpath("//td[@class='product']//a")).getText();
        Assert.assertEquals(confirm_oder_product_name,product_name);
        driver.findElement(By.xpath("(//input[@type='button'])[5]")).click();
        Thread.sleep(5000);
        org.testng.Assert.assertEquals(driver.findElement(By.xpath("//strong")).getText(),"Your order has been successfully processed!");
        System.out.println(driver.findElement(By.xpath("(//ul[@class='details']//li)[1]")).getText());


    }
}
