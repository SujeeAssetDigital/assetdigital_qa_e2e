package com.assetdigital.qa.framework.ui.test;

import com.assetdigital.qa.framework.ui.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Login {

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
