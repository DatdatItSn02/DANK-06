package DACK_06_A;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class case_IT7 {
    public static void testLaunchBrowser() throws InterruptedException {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //step 1 Vào trang https://tiki.vn/
            driver.get("https://tiki.vn/");
            //Step 2. Click on Đăng nhập/đăng ký.
            driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/header/div[1]/div/div[2]/div[1]/span/span[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("0903457691");
            driver.findElement(By.xpath("//form[1]/button[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("emdeplam123456");
            driver.findElement(By.xpath("//form[1]/button[1]")).click();
            Thread.sleep(2000);
            //step 3 Vào 1 sản phẩm bất ki
            driver.findElement(By.xpath("//div[2]/div[1]/input[1]")).sendKeys("Mắt Biếc");
            driver.findElement(By.xpath("//div[2]/div[1]/button[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[1]/a[1]/span[1]/div[1]/div[2]/div[1]/h3[1]")).click();
            //step 4 chọn mua 1 sản phẩm
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id='__next']/div/main/div/div/div/div/div/div/div/button[1]")).click();
            //step 5 Vào giỏ hàng
            Thread.sleep(4000);
            driver.findElement(By.xpath("//div[2]/a[1]/div[1]")).click();
            //Step 6 nhấn biểu tượng thùng rác để xóa sản phẩm
            Thread.sleep(4000);
            driver.findElement(By.xpath("//div[5]/span[1]/img[1]")).click();
            //Step 7 xác nhận xóa sản phẩm
            driver.findElement(By.xpath("//div[10]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();
        } catch (Exception ignored){
        }
        Thread.sleep(5000);
        driver.close();
    }
}
