package DACK_06_A;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestForgotPassword {
    @Test
    //    Không nhập số điện thoại
    public void testUT20() {
        Methods methods1 = new Methods();
        boolean result = methods1.notInput("");
        assertEquals(true,result);
    }
    @Test
    //  Nhập email chưa được đăng ký
    public void testUT21() {
        Methods methods1 = new Methods();
        boolean result = methods1.isEmailRegited("nguyasndagh@gmail.com");
        assertEquals(false,result);
    }
    @Test
    //    Nhập sai định dạng Email
    public void testUT22() {
        Methods methods1 = new Methods();
        boolean result = methods1.isEmailValid("nah123125");
        assertEquals(false,result);
    }
    @Test
    // Nhập đúng Email
    public void testUT23() {
        Methods methods1 = new Methods();
        boolean result = methods1.isEmailRegited("datdat.itsn02@gmail.com");
        assertEquals(true, result);
    }
    @Test
    // Nhập đúng sđt
    public void testUT24() {
        Methods methods1 = new Methods();
        boolean result = methods1.inputPhoneNumberIsValid("0768872361");
        assertEquals(true, result);
    }
}
