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

public class News {

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
    @Test(description= " Navigate to News",priority=1)
    public void testNewsNavigate() throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();


    }


    //test case 2 check the news blogs

    @Test(description = "check the park side restaurent",priority = 2)

    public void ParkRes()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement ParkRes=driver.findElement(By.xpath("/html/body/section/div/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", ParkRes);
        Thread.sleep(2000);

        //click park restaurent

        WebElement Chineserestaurent = driver.findElement(By.xpath("/html/body/section/div/div[1]/div[1]/h4/a"));
        Chineserestaurent.click();
        Thread.sleep(2000);
        System.out.println("Chineserestaurent");
    }

    //test case 3 check the news blogs

    @Test(description = "check the park side Pizza express",priority = 3)

    public void Pizza()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement Pizza=driver.findElement(By.xpath("/html/body/section/div/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", Pizza);
        Thread.sleep(2000);

        //click

        WebElement PizzaExpress = driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/h4/a"));
        PizzaExpress.click();
        Thread.sleep(2000);
        System.out.println("PizzaExpress");
    }



    //test case 4 check the news blogs

    @Test(description = "check the Fiesta Mexicana",priority = 4)

    public void Fiesta()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement Fiesta=driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",  Fiesta);
        Thread.sleep(2000);

        //click

        WebElement FiestaMexicana = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/h4/a"));
        FiestaMexicana.click();
        Thread.sleep(2000);
        System.out.println(" FiestaMexicana");
    }


    //test case 5 check the news blogs

    @Test(description = "check the Reku Zen Asian Restaurent",priority = 5)

    public void Rekuzen()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement Rekuzen=driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",  Rekuzen);
        Thread.sleep(2000);

        //click
        WebElement AsianRestaurent = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/h4/a"));
        AsianRestaurent.click();
        Thread.sleep(2000);
        System.out.println(" AsianRestaurent");
    }

    //test case 6 check the news blogs

    @Test(description = "check the Reku Zen Asian Restaurent",priority = 6)

    public void MezeBar()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement MezeBar=driver.findElement(By.xpath("/html/body/section/div/div[3]/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",  MezeBar);
        Thread.sleep(2000);

        //click

        WebElement BarMEZE = driver.findElement(By.xpath("/html/body/section/div/div[3]/div[1]/h4/a"));
        BarMEZE.click();
        Thread.sleep(2000);
        System.out.println(" BarMEZE");
    }


    //test case 7 check the news blogs

    @Test(description = "check the PATO Lounge",priority = 7)

    public void PATO()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement PATO=driver.findElement(By.xpath("/html/body/section/div/div[3]/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",  PATO);
        Thread.sleep(2000);

        //click
        WebElement PATOlounge = driver.findElement(By.xpath("/html/body/section/div/div[3]/div[2]/h4/a"));
        PATOlounge.click();
        Thread.sleep(2000);
        System.out.println(" PATOlounge");
    }

    //test case 8 check the news blogs

    @Test(description = "check the Harvest moon pub",priority = 8)

    public void Harvest()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement  Harvest=driver.findElement(By.xpath("/html/body/section/div/div[4]/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",   Harvest);
        Thread.sleep(2000);

        //click

        WebElement Harvestmoonpub = driver.findElement(By.xpath("/html/body/section/div/div[4]/div[1]/h4/a"));
        Harvestmoonpub.click();
        Thread.sleep(2000);
        System.out.println(" Harvest moon pub");
    }


    //test case 9 check the news blogs

    @Test(description = "check the things to do",priority = 9)

    public void things()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement  things=driver.findElement(By.xpath("/html/body/section/div/div[4]/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",   things);
        Thread.sleep(2000);

        //click

        WebElement thingstodo= driver.findElement(By.xpath("/html/body/section/div/div[4]/div[2]/h4/a"));
        thingstodo.click();
        Thread.sleep(2000);
        System.out.println(" Things to do");
    }

    //test case 10 check the news blogs

    @Test(description = "check the postbox collection times",priority = 10)

    public void  collectiontimes()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement   collectiontimes=driver.findElement(By.xpath("/html/body/section/div/div[5]/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",  collectiontimes);
        Thread.sleep(2000);

        //click

        WebElement  collection= driver.findElement(By.xpath("/html/body/section/div/div[5]/div[1]/h4/a"));
        collection.click();
        Thread.sleep(2000);
        System.out.println("  collection times");
    }


    //test case 11 check the news blogs

    @Test(description = "check the postbox collection times",priority = 11)

    public void  Bridgerd()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement  Bridgerd=driver.findElement(By.xpath("/html/body/section/div/div[5]/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",  Bridgerd);
        Thread.sleep(2000);

        //click

        WebElement  Brd= driver.findElement(By.xpath("/html/body/section/div/div[5]/div[2]/h4/a"));
        Brd.click();
        Thread.sleep(2000);
        System.out.println("  collection times in Bridge rd");
    }


    //test case 12 check the news blogs

    @Test(description = "check the postbox collection times",priority = 12)

    public void  Highst()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement  Highst=driver.findElement(By.xpath("/html/body/section/div/div[6]/div[2]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",  Highst);
        Thread.sleep(2000);

        //click

        WebElement  HST= driver.findElement(By.xpath("/html/body/section/div/div[6]/div[1]/h4/a"));
        HST.click();
        Thread.sleep(2000);
        System.out.println("  collection times in High Street");
    }

    //test case 13 check the news blogs

    @Test(description = "check the postbox collection times",priority = 13)

    public void  MC()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement  MC=driver.findElement(By.xpath("/html/body/section/div/div[7]/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",  MC);
        Thread.sleep(2000);

        //click

        WebElement  MCDonald= driver.findElement(By.xpath("/html/body/section/div/div[7]/div[1]/h4/a"));
        MCDonald.click();
        Thread.sleep(2000);
        System.out.println("  collection times near MC");
    }

    //test case 14 check the news blogs

    @Test(description = "check the postbox collection times",priority = 14)

    public void  Ctimes()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement  Ctimes=driver.findElement(By.xpath("/html/body/section/div/div[7]/div[1]"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();",  Ctimes);
        Thread.sleep(2000);

        //click

        WebElement  OrpingtonCtimes= driver.findElement(By.xpath("/html/body/section/div/div[7]/div[2]/h4/a"));
        OrpingtonCtimes.click();
        Thread.sleep(2000);
        System.out.println("  collection times Orpington");
    }

    //test case 15 check the news blogs

    @Test(description = "check the List of removal companies",priority = 15)

    public void Rcompanies()throws InterruptedException{

        WebElement NewsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));

        NewsNav.click();
        Thread.sleep(2000);

        WebElement  Rcompanies=driver.findElement(By.xpath("/html/body/section/div/div[8]/div"));

        JavascriptExecutor js =(JavascriptExecutor)  driver;

        //this will scroll the page Horizontally till the element is found

        js.executeScript("arguments[0].scrollIntoView();", Rcompanies);
        Thread.sleep(2000);

        //click

        WebElement  RemovalCompanies= driver.findElement(By.xpath("/html/body/section/div/div[8]/div/h4/a"));
        RemovalCompanies.click();
        Thread.sleep(2000);
        System.out.println(" List of Removal Companies");
    }



}
