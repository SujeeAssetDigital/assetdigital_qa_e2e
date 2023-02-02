package com.assetdigital.qa.framework.ui.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class PageBase {

    public WebDriver webDriver;

    @BeforeClass
    public void testSetup() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize(); //maximize window
        webDriver.manage().deleteAllCookies(); //delete all cookies

        //dynamic wait
        webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void openBrowse(String url) {
        webDriver.get(url);
        System.out.println("We are currently on the following URL  " + webDriver.getCurrentUrl());
    }

    @AfterMethod
    public void postSignup() {
        System.out.println(webDriver.getCurrentUrl());
    }

    @AfterClass
    public void afterClass() {
        webDriver.quit();
    }

}

