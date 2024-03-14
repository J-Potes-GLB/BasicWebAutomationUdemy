package com.herokuapp.theinternet.tests;

import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTests extends BaseTest {
    @Test
    public void loginTest(){
        LoginPage loginPage = getFirstPage();
        Assert.assertTrue(true);
    }
}
