package com.herokuapp.theinternet.tests;

import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTests extends BaseTest {
    @Test
    public void loginTest(){
        // Open Login Page
        LoginPage loginPage = getFirstPage();

        // Maximize window
        loginPage.maximizeWindow();

        // Enter username

        // Enter password

        // Click login button

        // Verifications
        // New url

        // Log out button is visible

        // Successful login message
    }
}
