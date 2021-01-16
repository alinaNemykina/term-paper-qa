package com.alinanemykina;

import com.alinanemykina.pages.*;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfProperties;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PinterestTest {
    public static WebDriver driver;
    public static UnauthorizedMainPage unauthorizedMainPage;
    public static MainPage mainPage;
    public static ProfilePage profilePage;
    public static PinPage pinPage;
    public static PinsPage pinsPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        unauthorizedMainPage = new UnauthorizedMainPage(driver);
        mainPage = new MainPage(driver);
        profilePage = new ProfilePage(driver);
        pinPage = new PinPage(driver);
        pinsPage = new PinsPage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("mainpage"));
    }

    @Test
    public void case1Login() {
        unauthorizedMainPage.clickLoginButton();
        unauthorizedMainPage.inputLogin(ConfProperties.getProperty("login"));
        unauthorizedMainPage.inputPassword(ConfProperties.getProperty("password"));
        unauthorizedMainPage.clickModalLoginButton();
        mainPage.clickProfileButton();
        String username = profilePage.getUsername();
        Assert.assertEquals(ConfProperties.getProperty("username"), username);
    }

    @Test
    public void case2AddPin() {
        profilePage.clickHomeButton();
        mainPage.clickPinElement();
        pinPage.clickBoardsMenu();
        pinPage.clickBoardElement();
        String imageSrc = pinPage.getImageSrc();
        pinPage.clickProfileButton();
        profilePage.clickAllPins();
        pinsPage.clickBoardElement();
        Assert.assertEquals(pinPage.getImageSrc(), imageSrc);
    }

    @Test
    public void case3MovingPinToANewBoard() throws InterruptedException {
        pinPage.clickBoardsMenu();
        String boardName = UUID.randomUUID().toString();
        pinPage.inputBoardName(boardName);
        pinPage.clickCreateBoardButton();
        pinPage.initModalWindow();
        pinPage.clickSwitchButton();
        pinPage.clickCreateBoardModalButton();
        Thread.sleep(5000);
        pinPage.clickProfileButton();
        Thread.sleep(5000);
        Assert.assertEquals(boardName, profilePage.getBoardTitle(boardName));
    }

    @AfterClass
    public static void tearDown() {
        profilePage.clickNavbarMenu();
        profilePage.logout();
        driver.quit();
    }
}
