package com.alinanemykina.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinsPage {
    public WebDriver driver;

    public PinsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'hCL kVc L4E MIw')]")
    private WebElement pinElement;

    public void clickBoardElement() {
        pinElement.click();
    }
}
