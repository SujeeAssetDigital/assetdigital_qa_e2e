package com.assetdigital.qa.framework.test;

import com.assetdigital.qa.framework.ui.PageBase;
import com.assetdigital.qa.framework.ui.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void LoginTest() {
        WebDriver webDriver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.openBrowse("https://portal.dev.vanone.co.uk/");
        loginPage.setUsernameInput("dilumi123test@gmail.com");
        loginPage.setPasswordInput("b8DVgCu9");
        loginPage.clickSubmitButton();

    }

}
