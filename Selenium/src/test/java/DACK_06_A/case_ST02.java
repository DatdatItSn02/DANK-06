/*
Test Steps
Step 1. Go to http://tiki.vn/.
Step 2. Click on Đăng nhập/đăng ký.
Step 3. Enter phone field ('0903457691')
Step 4. Click on Tiếp tục button.
Step 5. Enter password field ('emdeplam123456')
Step 6. Click on Đăng nhập button.
Step 7. Check username ('Dat Dat')
Step 8: Quit browser session
*/
package DACK_06_A;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
@Test
public class case_ST02 {
    public static void testcase_ST02(){
        //Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to http://tiki.vn/.
            driver.get("https://tiki.vn/");
            //Step 2. Click on Đăng nhập/đăng ký.
            driver.findElement(By.xpath("//span[1]/span[1]")).click();
            //debug purpose only
            Thread.sleep(3000);

            //Step 3. Enter phone field ('0903457691')
            driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("0903457691");
            //debug purpose only
            Thread.sleep(3000);

            //Step 4. Click on Tiếp tục button.
            driver.findElement(By.xpath("//form[1]/button[1]")).click();
            //debug purpose only
            Thread.sleep(4000);
            //Step 5. Enter password field ('emdeplam123456')
            driver.findElement(By.xpath("//form[1]/div[1]/input[1]")).sendKeys("emdeplam123456");
            //debug purpose only
            Thread.sleep(3000);
            //Step 6. Click on Đăng nhập button.
            driver.findElement(By.xpath("//form[1]/button[1]")).click();
            //debug purpose only
            Thread.sleep(4000);
            //Step 7. Check username ('Dat Dat')
            String username = driver.findElement(By.xpath("//span[1]/span[2]/span[1]")).getText();
            Thread.sleep(4000);
            assertEquals("Dat Dat", username);
            //debug purpose only
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Step 8: Quit browser session
        driver.quit();
    }
}
