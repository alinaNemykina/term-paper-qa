package com.alinanemykina.pages;

import com.alinanemykina.page_element.ModalWindowBoardCreation;
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

    @FindBy(xpath = "//*[contains(@class, 'hCL kVc L4E MIw')]")
    private WebElement imageElement;

    @FindBy(xpath = "//*[contains(@class, 'INd XiG qJc zI7 iyn Hsu')]")
    private WebElement profileButton;

    @FindBy(xpath = "//*[contains(@id, 'pickerSearchField')]")
    private WebElement boardSearchField;

    @FindBy(xpath = "//*[contains(@data-test-id, 'create-board')]")
    private WebElement createBoardButton;

    private ModalWindowBoardCreation modalWindowBoardCreation;

    public void clickBoardsMenu() {
        boardsMenu.click();
    }

    public void clickBoardElement() {
        boardElement.click();
    }

    public void clickCreateBoardButton() {
        createBoardButton.click();
    }

    public String getImageSrc() {
        return imageElement.getAttribute("src");
    }

    public void inputBoardName(String boardName) {
        boardSearchField.sendKeys(boardName);
    }

    public void initModalWindow() {
        modalWindowBoardCreation = new ModalWindowBoardCreation(driver);
    }

    public void clickSwitchButton() {
        modalWindowBoardCreation.clickSwitchButton();
    }

    public void clickCreateBoardModalButton() {
        modalWindowBoardCreation.clickCreateBoardButton();
    }

    @Override
    public void clickProfileButton() {
        profileButton.click();
    }
}
