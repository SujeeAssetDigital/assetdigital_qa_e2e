package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Home {

    public WebDriver driver;


    @BeforeClass
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "D://AssetDigital//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //maximize window
        driver.manage().deleteAllCookies(); //delete all cookies

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void openBrowser() {
        driver.get("https://removalsorpington.co.uk/");
        System.out.println("We are currently on the following URL  " + driver.getCurrentUrl());
    }

    // test case1
    @Test(description = " Navigate to Home", priority = 1)
    public void testHomeNavigate() throws InterruptedException {

        WebElement HomeNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a"));

        HomeNav.click();


    }

   //test case 2

   @Test(description = " check the quote button", priority = 2)

    @AfterMethod
    public void postSignUp() {
        System.out.println(driver.getCurrentUrl());

    }

    @AfterClass
    public void afterClass()
    {
        driver.quit();
    }


}
