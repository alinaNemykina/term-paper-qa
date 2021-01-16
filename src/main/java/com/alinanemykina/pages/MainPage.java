package com.alinanemykina.pages;

import com.alinanemykina.page_element.Navbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Navbar {
    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'XiG sLG zI7 iyn Hsu')]")
    private WebElement pinElement;

    public void clickPinElement() {
        pinElement.click();
    }
}
