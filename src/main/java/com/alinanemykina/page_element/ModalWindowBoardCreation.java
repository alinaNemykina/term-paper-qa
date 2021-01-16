package com.alinanemykina.page_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModalWindowBoardCreation {
    public ModalWindowBoardCreation(WebDriver driver) {
        this.switchButton = driver.findElement(By.id("secret"));
        this.createBoardButton = driver.findElement(By.xpath("//*[contains(@type, 'submit')]"));
    }

    private WebElement switchButton;

    private WebElement createBoardButton;

    public void clickSwitchButton() {
        switchButton.click();
    }

    public void clickCreateBoardButton() {
        createBoardButton.click();
    }
}
