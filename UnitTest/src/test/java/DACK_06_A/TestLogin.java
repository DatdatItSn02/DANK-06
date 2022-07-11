package DACK_06_A;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestLogin {
    @Test
//    Không nhập số điện thoại
    public void testUT1() {
        Methods methods1 = new Methods();
        boolean result = methods1.notInput("");
        assertEquals(true,result);
    }
    @Test
    // Nhập không đúng sđt(trên hoặc dưới 10 kí tự)
    public void testUT2() {
        Methods methods1 = new Methods();
        boolean result = methods1.inputWrongPhoneNumber("09876543210");
        assertEquals(true,result);
    }
    @Test
//    Nhập kiểu chữ vào form login
    public void testUT3 () {
        Methods methods1 = new Methods();
        boolean result = methods1.inputPhoneNumberIsValid("aloalo");
        assertEquals(false,result);
    }
    @Test
//    Nhập kí tự đặc biệt vào form login
    public void testUT5 () {
        Methods methods1 = new Methods();
        boolean result = methods1.inputPhoneNumberIsValid("&#$#!@#^");
        assertEquals(false,result);
    }

    @Test
    // Đăng nhập bằng Email
    public void testUT11() {
        Methods methods1 = new Methods();
        boolean result = methods1.isEmailRegited("datdat.itsn02@gmail.com");
        assertEquals(true, result);
    }

}
