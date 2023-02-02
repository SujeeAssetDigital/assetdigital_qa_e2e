package com.assetdigital.qa.framework.ui.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {

    @Test
    public void testDashboard() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\AssetDigital\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://backend2.dev.europe.express/en/login");
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("navoda@asset.digital");
        Thread.sleep(2000);
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("12345678");
        Thread.sleep(2000);
        WebElement signup = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[6]/button"));
        signup.click();

        driver.navigate().to("https://backend2.dev.europe.express/home");

        driver.findElement(By.xpath(" //*[@id=\"quoteList\"]/tbody/tr/td[1]")).click();



    }

}
