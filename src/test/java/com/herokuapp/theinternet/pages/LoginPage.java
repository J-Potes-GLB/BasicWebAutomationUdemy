package com.herokuapp.theinternet.pages;

import com.herokuapp.theinternet.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(css = "button.radius")
    private WebElement loginButton;

    @FindBy(className = "button secondary radius")
    private WebElement logoutButton;

    @FindBy(id = "flash")
    private WebElement successfulLoginMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
