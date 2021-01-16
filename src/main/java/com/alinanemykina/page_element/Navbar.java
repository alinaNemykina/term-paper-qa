package com.alinanemykina.page_element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navbar {
    @FindBy(xpath = "//*[contains(@class, 'INd zI7 iyn Hsu')]")
    private WebElement profileButton;

    @FindBy(xpath = "//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[2]/a/div")
    private WebElement homeButton;

    @FindBy(xpath = "//*[contains(@data-test-id, 'header-accounts-options-button')]")
    private WebElement navbarMenu;

    @FindBy(xpath = "//*[contains(@class, 'DUt Jea b8T gjz wYR zI7 iyn Hsu')]")
    private WebElement logoutItem;

    public void clickProfileButton() {
        profileButton.click();
    }

    public void clickHomeButton() {
        homeButton.click();
    }

    public void clickNavbarMenu() {
        navbarMenu.click();
    }

    public void logout() {
        logoutItem.click();
    }
}
