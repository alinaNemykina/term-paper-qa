package com.alinanemykina.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnauthorizedMainPage {
    public WebDriver driver;

    public UnauthorizedMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@id, 'email')]")
    private WebElement loginField;

    @FindBy(xpath = "//*[contains(@class, 'RCK Hsu USg adn CCY czT Vxj aZc Zr3 hA- Il7 Jrn hNT BG7 gn8 L4E kVc')]")
    private WebElement loginButton;

    @FindBy(xpath = "//*[contains(@id, 'password')]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[contains(@class, 'red SignupButton active')]")
    private WebElement modalLoginButton;

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickModalLoginButton() {
        modalLoginButton.click();
    }
}