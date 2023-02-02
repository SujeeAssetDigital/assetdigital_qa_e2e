package com.assetdigital.qa.framework.ui;

import com.assetdigital.qa.framework.ui.login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void LoginTest() {
        WebDriver webDriver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.openBrowse("https://backend2.dev.europe.express/en/login");
        loginPage.setUsernameInput("navoda@asset.digital");
        loginPage.setPasswordInput("12345678");
        loginPage.clickSubmitButton();

    }
}
