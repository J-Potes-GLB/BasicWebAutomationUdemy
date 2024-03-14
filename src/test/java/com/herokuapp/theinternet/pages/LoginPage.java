package com.herokuapp.theinternet.pages;

import com.herokuapp.theinternet.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(css = "button.radius")
    private WebElement loginButton;
//
//    @FindBy(className = "button secondary radius")
//    private WebElement logoutButton;
//
    @FindBy(id = "flash")
    private WebElement successfulLoginMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUserName(String username){
        waitUntilVisibleElement(usernameField);
        usernameField.click();
        usernameField.sendKeys(username);
    }

    public void inputPassword(String password){
        waitUntilVisibleElement(passwordField);
        passwordField.click();
        passwordField.sendKeys(password);
    }
}
