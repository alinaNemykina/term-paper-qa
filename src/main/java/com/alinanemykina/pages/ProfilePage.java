package com.alinanemykina.pages;

import com.alinanemykina.page_element.Navbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends Navbar {
    public WebDriver driver;

    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'tBJ dyH iFc yTZ pBj DrD IZT swG')]")
    private WebElement usernameElement;

    @FindBy(xpath = "//*[contains(@class, 'Jea ho- zI7 iyn Hsu')]")
    private WebElement allPins;

    public String getUsername() {
        return usernameElement.getText();
    }

    public void clickAllPins() {
        allPins.click();
    }
}
