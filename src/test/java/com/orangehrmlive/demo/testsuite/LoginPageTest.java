package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginpage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        loginpage.getEnterUserName("Admin");
        loginpage.getEnterPassword("admin123");
        loginpage.getclickOnLoginButton();
        String expectedText = "Dashboard";
        Assert.assertEquals(loginpage.getVerifyText(), expectedText, "Test not displayed");
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link
        loginpage.clickOnForgotPassword();
        //* Verify the text ‘Reset Password’
        String expectedErrorMessage = "Reset Password";
        Assert.assertEquals(loginpage.getResetPassword(), expectedErrorMessage, "Error message not displayed");

    }
}
