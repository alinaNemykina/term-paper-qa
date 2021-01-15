package com.alinanemykina;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfProperties;

import java.util.concurrent.TimeUnit;

public class PinterestTest {
    public static WebDriver driver;
    public static UnauthorizedMainPage unauthorizedMainPage;
    public static MainPage mainPage;
    public static ProfilePage profilePage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        unauthorizedMainPage = new UnauthorizedMainPage(driver);
        mainPage = new MainPage(driver);
        profilePage = new ProfilePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("mainpage"));
    }

    @Test
    public void loginTest() {
        unauthorizedMainPage.clickLoginButton();
        unauthorizedMainPage.inputLogin(ConfProperties.getProperty("login"));
        unauthorizedMainPage.inputPassword(ConfProperties.getProperty("password"));
        unauthorizedMainPage.clickModalLoginButton();
        mainPage.clickProfileButton();
        String username = profilePage.getUsername();
        Assert.assertEquals(ConfProperties.getProperty("username"), username);
    }
}
