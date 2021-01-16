package com.alinanemykina.pages;

import com.alinanemykina.page_element.Navbar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage extends Navbar {
    public WebDriver driver;

    public PinPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[contains(@class, 'PinBetterSave__Dropdown PinBetterSave__Dropdown--lego PinBetterSave__Dropdown--lego-closeup')]")
    private WebElement boardsMenu;

    @FindBy(xpath = "//*[contains(@title, 'Aesthetics')]")
    private WebElement boardElement;

    @FindBy(xpath = "//*[@id=\"__PWS_ROOT__\"]/div[1]/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[1]/div/div/a/div/div/div[1]/div/div/img\n")
    private WebElement imageElement;

    @FindBy(xpath = "//*[contains(@class, 'INd Jea gjz mQ8 zI7 iyn Hsu')]")
    private WebElement profileButton;

    public void clickBoardsMenu() {
        boardsMenu.click();
    }

    public void clickBoardElement() {
        boardElement.click();
    }

    public String getImageSrc() {
        return imageElement.getAttribute("src");
    }

    @Override
    public void clickProfileButton() {
        profileButton.click();
    }
}
