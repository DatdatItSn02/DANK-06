package DACK_06;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class case_IT0 {
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
            String currentItem = driver.findElement(By.xpath("//div[1]/a[1]/span[1]/div[1]/div[2]/div[1]/h3[1]")).getText();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[1]/a[1]/span[1]/div[1]/div[2]/div[1]/h3[1]")).click();

            Thread.sleep(2000);

            String currentVersion = driver.findElement(By.xpath("//div[2]/div[1]/div[1]/button[1]")).getText();
            Thread.sleep(2000);
            //step 4 chọn mua 1 sản phẩm
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id='__next']/div/main/div/div/div/div/div/div/div/button[1]")).click();
            //step 5 Vào giỏ hàng
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[2]/a[1]/div[1]")).click();
            Thread.sleep(3000);
            String cartItem = driver.findElement(By.xpath("//div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).getText();
            Thread.sleep(2000);
            assertEquals(currentItem+" - "+currentVersion,cartItem);
        } catch (Exception ignored){
        }
        Thread.sleep(5000);
        driver.close();
    }
}
