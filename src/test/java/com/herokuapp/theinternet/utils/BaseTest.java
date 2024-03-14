package com.herokuapp.theinternet.utils;

import com.herokuapp.theinternet.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver = null;
    protected String baseURL = "http://the-internet.herokuapp.com/login";

    public void setDriver(){
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void setup(){
        setDriver();
    }

    @AfterMethod
    public void close(){
        this.driver.close();
    }

    public LoginPage getFirstPage(){
        driver.get(baseURL);
        return new LoginPage(driver);
    }
}
