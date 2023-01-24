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

public class Contact {

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

    //test case1
    @Test(description =  "Name" , priority = 1)
    public void testValidName() throws InterruptedException {

        WebElement ContactsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/a"));
        ContactsNav.click();

        System.out.println("Name");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("//*[@id=\"name\"]"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");




        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");

        // enter message
        WebElement Message = driver.findElement(By.id("message"));
        Message.sendKeys("Hey, Any one can assist me ?");
        Thread.sleep(3100);
        System.out.println("Entered Message");


        //click on button
        WebElement SEND = driver.findElement(By.id("submitContact"));
        SEND.click();
        Thread.sleep(2000);


    }


    //test case 2
    @Test(description = "This method validate the  create functionality", priority = 2)
    public void create() throws InterruptedException {

        WebElement ContactsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/a"));
        ContactsNav.click();

        System.out.println("Name");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("//*[@id=\"name\"]"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("");
        Thread.sleep(3000);
        System.out.println("Entered Name");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("");
        Thread.sleep(3200);
        System.out.println("Entered Email");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");

        // enter message
        WebElement Message = driver.findElement(By.id("message"));
        Message.sendKeys(" ");
        Thread.sleep(3100);
        System.out.println("");


        //click on button
        WebElement SEND = driver.findElement(By.id("submitContact"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case 3
    @Test(description = "This method validate the  error functionality", priority = 3)
    public void check() throws InterruptedException {

        WebElement ContactsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/a"));
        ContactsNav.click();

        System.out.println("Name");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("//*[@id=\"name\"]"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("");
        Thread.sleep(3000);
        System.out.println("Entered Name");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");

        // enter message
        WebElement Message = driver.findElement(By.id("message"));
        Message.sendKeys(" Hey, Any one can assist me");
        Thread.sleep(3100);
        System.out.println("Entered Message");


        //click on button
        WebElement SEND = driver.findElement(By.id("submitContact"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case 4
    @Test(description = "This method validate the  error functionality", priority = 4)
    public void  identify() throws InterruptedException {

        WebElement ContactsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/a"));
        ContactsNav.click();

        System.out.println("Name");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("//*[@id=\"name\"]"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");

        // enter message
        WebElement Message = driver.findElement(By.id("message"));
        Message.sendKeys(" Hey, Any one can assist me");
        Thread.sleep(3100);
        System.out.println("Entered Message");


        //click on button
        WebElement SEND = driver.findElement(By.id("submitContact"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case 5
    @Test(description = "This method validate the  error functionality", priority = 5)
    public void validate() throws InterruptedException {

        WebElement ContactsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/a"));
        ContactsNav.click();

        System.out.println("Name");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("//*[@id=\"name\"]"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.co");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");

        // enter message
        WebElement Message = driver.findElement(By.id("message"));
        Message.sendKeys(" Hey, Any one can assist me");
        Thread.sleep(3100);
        System.out.println("Entered Message");


        //click on button
        WebElement SEND = driver.findElement(By.id("submitContact"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case 6
    @Test(description = "This method validate the  error functionality", priority = 6)
    public void expect() throws InterruptedException {

        WebElement ContactsNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/a"));
        ContactsNav.click();

        System.out.println("Name");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("//*[@id=\"name\"]"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.co");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");

        // enter message
        WebElement Message = driver.findElement(By.id("message"));
        Message.sendKeys(" ");
        Thread.sleep(3100);
        System.out.println("Entered Message");


        //click on button
        WebElement SEND = driver.findElement(By.id("submitContact"));
        SEND.click();
        Thread.sleep(2000);


    }






}
