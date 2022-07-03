package DACK_06;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.nio.channels.SelectableChannel;

@Test
public class case_UA1 {
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
            //Step 4 Vào mục Sổ địa chỉ
            Thread.sleep(4000);
            driver.findElement(By.xpath("//li[5]/a[1]")).click();
            //Step 5 Nhấn thêm địa chỉ
            Thread.sleep(4000);
            driver.findElement(By.xpath("//div[1]/div[2]/div[1]/a[1]")).click();
//            //Step 6 Thêm dữ liệu mới vào
            Thread.sleep(4000);
            driver.findElement(By.xpath("//div[1]/div[1]/input[1]")).clear();
            driver.findElement(By.xpath("//div[1]/div[1]/input[1]")).sendKeys("Thanh Dat");
            driver.findElement(By.xpath("//div[3]/div[1]/input[1]")).sendKeys("0909292929");
            Thread.sleep(4000);
            driver.findElement(By.xpath("//textarea[1]")).sendKeys("322 / 4");
            Thread.sleep(4000);
            driver.findElement(By.xpath("//div[10]/button[1]")).click();
        } catch (Exception ignored){
        }
        Thread.sleep(5000);
        driver.close();
    }
}
