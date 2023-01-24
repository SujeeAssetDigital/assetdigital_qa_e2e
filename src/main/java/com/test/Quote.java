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

public class Quote {

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
    @Test(description =  "This method validate the error messaages in empty position" , priority = 1)
    public void testValidName() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("Title & Name");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys("");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" ");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys(" ");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" ");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys(" ");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("");
        System.out.println("Entered ease access");
        Thread.sleep(3100);


        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case 2

    @Test(description =  "This method validate the error messaage in radio butons" , priority = 2)
    public void test() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("Title & Name");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys("East London,");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" London,");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys(" E");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan,");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan,");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys(" BL");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);


        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }


    //test case3
    @Test(description =  "This method validate the error messages", priority = 3)
    public void error() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("This method validate the error messages");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys("East London,");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" London,");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys(" E");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan,");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan,");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys(" BL");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);





        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field

        WebElement radio1 = driver.findElement(By.id("myCheckboxes"));
        WebElement radio2 = driver.findElement(By.id("myCheckboxes"));
        WebElement radio3 = driver.findElement(By.id("myCheckboxes"));
        //Radio Button is selected
        radio1.click();
        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case4
    @Test(description =  "this method check the error message in name " , priority = 4)
    public void name() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("this method check the error message in name");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys("East London,");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" London,");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys(" E");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan,");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan,");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys(" BL");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field

        WebElement radio1 = driver.findElement(By.id("myCheckboxes"));
        WebElement radio2 = driver.findElement(By.id("myCheckboxes"));
        WebElement radio3 = driver.findElement(By.id("myCheckboxes"));
        //Radio Button is selected
        radio1.click();
        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case5
    @Test(description =  "this method check the error message in email " , priority =5)
    public void email() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("this method check the error message in email");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys("East London,");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" London,");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys(" E");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan,");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan,");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys(" BL");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field

        WebElement radio1 = driver.findElement(By.id("myCheckboxes"));
        WebElement radio2 = driver.findElement(By.id("myCheckboxes"));
        WebElement radio3 = driver.findElement(By.id("myCheckboxes"));
        //Radio Button is selected
        radio1.click();
        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }
    //test case6
    @Test(description =  "this method check the error message move " , priority =6)
    public void move() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("this method check the error message in move");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys("");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" ");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys(" ");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" ");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys(" ");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field

        WebElement radio1 = driver.findElement(By.id("myCheckboxes"));
        WebElement radio2 = driver.findElement(By.id("myCheckboxes"));
        WebElement radio3 = driver.findElement(By.id("myCheckboxes"));
        //Radio Button is selected
        radio1.click();
        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case7
    @Test(description =  "this method check the radio button 1 " , priority =7)
    public void rd() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("this method check the radio button 1");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys(" East London ,");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys( " London ,  ");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys(" E ,");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan ,");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan , ");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys("  BL");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field

        WebElement radio1 = driver.findElement(By.id("myCheckboxes"));

        //Radio Button is selected
        radio1.click();
        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case8
    @Test(description =  "this method check the radio button 2 " , priority =8)
    public void rb() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("this method check the radio button 2");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys(" East London ,");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys("  London , ");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys(" E ");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan ,");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan ,");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys("  BL ");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field


        WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"myCheckboxes\" and  @value='furniture dismantling']"));
        radio2.click();
        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case9
    @Test(description =  "this method check the radio button 3 " , priority =9)
    public void button() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("this method check the radio button 3");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys(" East London , ");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" London ,");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys("  E ,");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys("BL ");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field


        WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"myCheckboxes\" and @value='cleaning service']"));
        //Radio Button is selected
        radio3.click();
        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case10
    @Test(description =  "this method check the multiple tic " , priority =10)
    public void multiple() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("this method check the multiple tic  ");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys("East London ,");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" London ,");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys("  E ");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan ,");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan ,");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys(" BL ");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field
        WebElement radio1 = driver.findElement(By.id("myCheckboxes"));
        WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"myCheckboxes\" and  @value='furniture dismantling']"));
        WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"myCheckboxes\" and @value='cleaning service']"));
        //Radio Button is selected
        radio1.click();
        radio2.click();
        radio3.click();
        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case11
    @Test(description =  "this method check the multiple tic " , priority =10)
    public void onetwo() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("this method check the multiple tic  ");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys("East London ,");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" London ,");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys("  E ");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan ,");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan ,");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys(" BL ");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field
        WebElement radio1 = driver.findElement(By.id("myCheckboxes"));
        WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"myCheckboxes\" and  @value='furniture dismantling']"));

        //Radio Button is selected
        radio1.click();
        radio2.click();

        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case12
    @Test(description =  "this method check the multiple tic " , priority =12)
    public void twothree() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("this method check the multiple tic  ");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys("East London ,");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" London ,");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys("  E ");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan ,");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan ,");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys(" BL ");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field

        WebElement radio2 = driver.findElement(By.xpath("//*[@id=\"myCheckboxes\" and  @value='furniture dismantling']"));
        WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"myCheckboxes\" and @value='cleaning service']"));
        //Radio Button is selected

        radio2.click();
        radio3.click();
        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }

    //test case13
    @Test(description =  "this method check the multiple tic " , priority =13)
    public void onethree() throws InterruptedException {

        WebElement QuoteNav = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        QuoteNav.click();

        System.out.println("this method check the multiple tic  ");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/section/div/div/form"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);


        //enter Name
        WebElement Name = driver.findElement(By.id("name"));
        Name.sendKeys("David");
        Thread.sleep(3000);
        System.out.println("Entered Name");

        //enter Telephone Number
        WebElement TelephoneNumber = driver.findElement(By.id("telephone"));
        TelephoneNumber.sendKeys("01234567894");
        Thread.sleep(3100);
        System.out.println("Entered TelephoneNumber");


        //enter Email
        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("andrewsdaniel049@gmail.com");
        Thread.sleep(3200);
        System.out.println("Entered E-mail");

        //enter  moving from Street , post town / post code
        WebElement Street = driver.findElement(By.id("from"));
        Street.sendKeys("East London ,");

        System.out.println("Entered Street");

        WebElement PostTown = driver.findElement(By.id("from"));
        PostTown.sendKeys(" London ,");

        System.out.println("Entered Post Town");

        WebElement Postcode = driver.findElement(By.id("from"));
        Postcode.sendKeys("  E ");

        System.out.println("Entered Postcode");



        Thread.sleep(3200);

        //enter  moving to Street , post town / post code
        WebElement street = driver.findElement(By.id("destination"));
        street.sendKeys("Boltan ,");

        System.out.println("Entered street");

        WebElement posttown = driver.findElement(By.id("destination"));
        posttown.sendKeys(" Boltan ,");

        System.out.println("Entered post town");

        WebElement postcode = driver.findElement(By.id("destination"));
        postcode.sendKeys(" BL ");

        System.out.println("Entered postcode");



        Thread.sleep(3200);

        //enter Date
        WebElement Date = driver.findElement(By.id("date"));
        Date.sendKeys("28/09/2022");

        System.out.println("Entered date");
        Thread.sleep(3100);

        //enter Number of bedroom
        WebElement numberofmoving= driver.findElement(By.id("number_of_moving"));
        numberofmoving.sendKeys("05");

        System.out.println("Entered number of moving");
        Thread.sleep(3100);


        JavascriptExecutor javas = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//*[@id=\"furniture_list\"]"));

        //This will scroll the page Horizontally till the element is found
        javas.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);







        //enter furniture list
        WebElement furniturelist=driver.findElement(By.id("furniture_list"));
        furniturelist.sendKeys("Bed,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("Sofa,") ;
        System.out.println("Entered furniture list");
        furniturelist.sendKeys("TV") ;
        System.out.println("Entered furniture list");
        Thread.sleep(3100);
        //enterEase access
        WebElement easeaccess=driver.findElement(By.id("ease_access"));
        easeaccess.sendKeys("separate the part of furnitures");
        System.out.println("Entered ease access");
        Thread.sleep(3100);
        // tic  the field
        WebElement radio1 = driver.findElement(By.id("myCheckboxes"));

        WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"myCheckboxes\" and @value='cleaning service']"));
        //Radio Button is selected
        radio1.click();
        radio3.click();
        Thread.sleep(3150);

        //click on button
        WebElement SEND = driver.findElement(By.id("submitQuote"));
        SEND.click();
        Thread.sleep(2000);


    }





}
