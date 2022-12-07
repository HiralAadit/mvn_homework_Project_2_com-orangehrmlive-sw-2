package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.checkerframework.checker.units.qual.Temperature;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By enterUsername = By.name("username");

    public void getEnterUserName(String username) {
        sendTextToElement(enterUsername, username);
    }

    By enterPassword = By.name("password");

    public void getEnterPassword(String password) {
        sendTextToElement(enterPassword, password);
    }

    By clickLoginButtun = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    public void getclickOnLoginButton() {
        clickOnElement(clickLoginButtun);
    }

    By verifyText = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public String getVerifyText() {
        return getTextFromElement(verifyText);
    }

By forgotPasswordField=By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    public  void clickOnForgotPassword(){
        clickOnElement(forgotPasswordField);
    }
    By resetPasswordText=By.xpath("//h6[text()='Reset Password']");
    public  String getResetPassword(){
        return getTextFromElement(resetPasswordText);
    }
    }


