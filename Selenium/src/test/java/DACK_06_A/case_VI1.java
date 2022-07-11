package DACK_06_A;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class case_VI1 {
    public static void testLaunchBrowser() throws InterruptedException {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //step 1 Vào trang https://tiki.vn/
            driver.get("https://tiki.vn/");
            Thread.sleep(2000);
            //Step 2. Click on Đăng nhập/đăng ký.
            driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/div[2]/div[1]/span/span[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("0903457691");
            driver.findElement(By.xpath("//form[1]/button[1]")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("emdeplam123456");
            driver.findElement(By.xpath("//form[1]/button[1]")).click();
            Thread.sleep(4000);
            //Step 3 vào mục Tài khoản của tôi
            driver.findElement(By.xpath("//span[1]/span[2]/span[1]")).click();
            driver.findElement(By.xpath("//a[4]/p[1]")).click();
            //Step 4 Vào mục Sản phẩm bạn đã xem
            Thread.sleep(4000);
            driver.findElement(By.xpath("//li[8]/a[1]")).click();
        } catch (Exception ignored){
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
