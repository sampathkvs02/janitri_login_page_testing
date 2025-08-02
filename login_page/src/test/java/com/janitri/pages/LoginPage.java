package com.janitri.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private By emailField = By.id("formEmail");
    private By passwordField = By.id("formPassword");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By eyeIcon = By.xpath("//img[@class='passowrd-visible']");
    private By errorMessage = By.xpath("//p[@class='normal-text']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void togglePasswordVisibility() {
        driver.findElement(eyeIcon).click();
    }

    public String getPasswordFieldType() {
        return driver.findElement(passwordField).getAttribute("type");
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public boolean isFieldDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public By getEmailLocator() {
        return emailField;
    }

    public By getPasswordLocator() {
        return passwordField;
    }

    public By getLoginButtonLocator() {
        return loginButton;
    }

    public By getEyeIconLocator() {
        return eyeIcon;
    }
}
