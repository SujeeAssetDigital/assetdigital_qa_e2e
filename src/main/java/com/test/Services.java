package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Services {

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
    @Test(description = " Navigate to Services", priority = 1)
    public void testServicesNavigate() throws InterruptedException {

        WebElement ServicesNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a"));

        ServicesNav.click();


    }

    //test case 2 check the URL

    @Test(description = "Furniture Dismanting", priority = 1)

    public void FD() throws InterruptedException {


        WebElement ServicesNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a"));

        ServicesNav.click();

        Thread.sleep(2000);

        WebElement FD = driver.findElement(By.xpath("/html/body/section/section"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", FD);
        Thread.sleep(2000);

        //click url

        WebElement Dismanting = driver.findElement(By.xpath("/html/body/section/section/div/div[1]/div[1]/div[1]/a[2]/h5"));
        Dismanting.click();
        Thread.sleep(2000);
        System.out.println("Furniture Dismanting and Assembly");
    }

    //test case 3 check the URL

    @Test(description = "Local Removal", priority = 3)

    public void LR() throws InterruptedException {


        WebElement ServicesNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a"));

        ServicesNav.click();

        Thread.sleep(2000);

        WebElement LR = driver.findElement(By.xpath("/html/body/section/section"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", LR);
        Thread.sleep(2000);

        //click url

        WebElement Local = driver.findElement(By.xpath("/html/body/section/section/div/div[1]/div[2]/div[1]/a[2]/h5"));
        Local.click();
        Thread.sleep(2000);
        System.out.println("Local Removal");
    }

    //test case 4 check the URL

    @Test(description = "Piano Removal", priority = 4)

    public void PR() throws InterruptedException {


        Object By;
        WebElement ServicesNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a"));

        ServicesNav.click();

        Thread.sleep(2000);

        WebElement PR = driver.findElement(By.xpath("/html/body/section/section"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", PR);
        Thread.sleep(2000);

        //click url

        WebElement Piano = driver.findElement(By.xpath("/html/body/section/section/div/div[1]/div[3]/div[1]/a[2]/h5"));
        Piano.click();
        Thread.sleep(2000);
        System.out.println("Piano Removals");
    }

    //test case 5 check the URL

    @Test(description = "Orpington Packing", priority = 5)

    public void OP() throws InterruptedException {


        WebElement ServicesNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a"));

        ServicesNav.click();

        Thread.sleep(2000);

        WebElement OP = driver.findElement(By.xpath("/html/body/section/section"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", OP);
        Thread.sleep(2000);

        //click url

        WebElement Packing = driver.findElement(By.xpath("/html/body/section/section/div/div[1]/div[4]/div[1]/a[2]/h5"));
        Packing.click();
        Thread.sleep(2000);
        System.out.println(" Orpington Pcaking");
    }
    //test case 6 check the URL

    @Test(description = "Orpington  Man and Van", priority = 6)

    public void MV() throws InterruptedException {


        WebElement ServicesNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a"));

        ServicesNav.click();

        Thread.sleep(2000);

        WebElement MV = driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div[1]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", MV);
        Thread.sleep(2000);

        //click url

        WebElement ManVan = driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div[1]/div[1]/a[2]/h5"));
        ManVan.click();
        Thread.sleep(2000);
        System.out.println(" Man and Van");
    }

    //test case 7 check the URL

    @Test(description = "Packaging Supplies", priority = 7)

    public void PS() throws InterruptedException {


        WebElement ServicesNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a"));

        ServicesNav.click();

        Thread.sleep(2000);

        WebElement PS = driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div[1]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", PS);
        Thread.sleep(2000);

        //click url

        WebElement Suplies= driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div[2]/div[1]/a[2]/h5"));
        Suplies.click();
        Thread.sleep(2000);
        System.out.println(" Pacakaging Suppliies");
    }

    //test case 8 check the URL

    @Test(description = "Business Removals", priority = 8)
    public void BS() throws InterruptedException {


        WebElement ServicesNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a"));

        ServicesNav.click();

        Thread.sleep(2000);

        WebElement BS = driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div[1]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", BS);
        Thread.sleep(2000);

        //click url

        WebElement Business= driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div[3]/div[1]/a[2]/h5"));
        Business.click();
        Thread.sleep(2000);
        System.out.println(" Business Removals");
    }

    //test case 9 check the URL

    @Test(description = "Storage Service", priority = 9)
    public void SS() throws InterruptedException {


        WebElement ServicesNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a"));

        ServicesNav.click();

        Thread.sleep(2000);

        WebElement SS = driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div[1]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", SS);
        Thread.sleep(2000);

        //click url

        WebElement Business= driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div[4]/div[1]/a[2]/h5"));
        Business.click();
        Thread.sleep(2000);
        System.out.println(" Storage Service");
    }

}
