package DACK_06_A;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class case_IT1 {
    public static void testLaunchBrowser() throws InterruptedException {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //step 1 Vào trang https://tiki.vn/
            driver.get("https://tiki.vn/");
            //Step 2. Click on Đăng nhập/đăng ký.
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[1]/span[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("0903457691");
            driver.findElement(By.xpath("//form[1]/button[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("emdeplam123456");
            driver.findElement(By.xpath("//form[1]/button[1]")).click();
            Thread.sleep(2000);
            //step 3 Vào 1 sản phẩm bất ki
            driver.findElement(By.xpath("//div[2]/div[1]/input[1]")).sendKeys("Mắt Biếc");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[2]/div[1]/button[1]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[1]/a[1]/span[1]/div[1]/div[2]/div[1]/h3[1]")).click();
            //step 4 chọn mua 1 sản phẩm
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id='__next']/div/main/div/div/div/div/div/div/div/button[1]")).click();
            //step 5 Vào giỏ hàng
            Thread.sleep(5000);
            driver.findElement(By.xpath("//div[2]/a[1]/div[1]")).click();
            Thread.sleep(5000);
            //Step 6 nhấn biểu tượng cộng để tăng số lượng sản phẩm

            driver.findElement(By.xpath("//div[1]/span[2]/img[1]")).click();



        } catch (Exception ignored){
        }
        Thread.sleep(5000);
        driver.close();
    }
}
