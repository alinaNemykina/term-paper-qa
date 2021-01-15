package com.alinanemykina;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'tBJ dyH iFc yTZ pBj DrD IZT swG')]")
    private WebElement usernameElement;

    public String getUsername() {
        return usernameElement.getText();
    }
}
