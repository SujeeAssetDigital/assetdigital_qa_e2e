package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Profile {

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
    @Test(description= " Navigate to Our Profile",priority=1)
    public void testOurProfileNavigate() throws InterruptedException{

        Thread.sleep(2000);

        WebElement OurProfileNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a"));

        OurProfileNav.click();




    }


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


