package com.alinanemykina.page_element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navbar {
    @FindBy(xpath = "//*[contains(@class, 'INd zI7 iyn Hsu')]")
    private WebElement profileButton;

    @FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[2]/a/div")
    private WebElement homeButton;

    public void clickProfileButton() {
        profileButton.click();
    }

    public void clickHomeButton() {
        homeButton.click();
    }
}
