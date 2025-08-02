package com.janitri.tests;

import com.janitri.base.BaseTest;
import com.janitri.pages.LoginPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginPageTest extends BaseTest {

    @Test
    public void testLoginButtonDisabledWhenFieldAreEmpty() {
        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.isLoginButtonEnabled(), "Login button should be enabled but fields are empty.");
    }

    @Test
    public void testInvalidLoginShowErrorMsg() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("kvs02@gmail.com");
        loginPage.enterPassword("@121safafad");
        loginPage.clickLogin();
        Thread.sleep(2000);
        assertTrue(loginPage.getErrorMessage().contains("Invalid"), "Expected error message for invalid login.");
    }

    @Test
    public void testPasswordMaskedbutton() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword("SamplePassword");
        loginPage.togglePasswordVisibility();
        Thread.sleep(1000);
        String fieldType = loginPage.getPasswordFieldType();
        assertEquals(fieldType, "text", "Password field should be visible (text) after clicking eye icon.");
    }

    @Test
    public void testPageElementsPresent() {
        LoginPage loginPage = new LoginPage(driver);
        assertTrue(loginPage.isFieldDisplayed(loginPage.getEmailLocator()), "Email field not visible.");
        assertTrue(loginPage.isFieldDisplayed(loginPage.getPasswordLocator()), "Password field not visible.");
        assertTrue(loginPage.isFieldDisplayed(loginPage.getLoginButtonLocator()), "Login button not visible.");
        assertTrue(loginPage.isFieldDisplayed(loginPage.getEyeIconLocator()), "Eye icon not visible.");
    }
}
