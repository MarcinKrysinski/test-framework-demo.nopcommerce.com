package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.waits.CustomWait;

import static org.junit.Assert.assertTrue;
import static utils.data.Constants.*;
import static utils.data.Variables.*;
import static utils.data.Xpath.*;

public class LoginTest extends BaseTest {

    private static final String PAGE_URL = "https://demo.nopcommerce.com";


    @Before
    public void setUpForTest(){
        driver.get(PAGE_URL);
    }


    @Test
    public void incorrectLoginEmailWithoutMonkeyTest() {
        homeLoginPage.login(emailWithoutMonkey, correctLoginPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(emailError));
        WebElement emailErrorText = driver.findElement((By.xpath(emailError)));
        assertTrue(emailErrorText.isDisplayed());
    }


    @Test
    public void incorrectLoginEmailWithoutDotTest() {
        homeLoginPage.login(emailWithoutMonkey, correctLoginPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(emailError));
        WebElement emailErrorText = driver.findElement((By.xpath(emailError)));
        assertTrue(emailErrorText.isDisplayed());
    }


    @Test
    public void incorrectLoginEmailWithoutDomainTest() {
        homeLoginPage.login(emailWithoutDomain, correctLoginPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(emailError));
        WebElement emailErrorText = driver.findElement((By.xpath(emailError)));
        assertTrue(emailErrorText.isDisplayed());
    }


    @Test
    public void incorrectLoginPasswordTest() {
        homeLoginPage.login(correctEmail, incorrectConfirmPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(loginError));
        WebElement loginErrorText = driver.findElement((By.xpath(loginError)));
        assertTrue(loginErrorText.isDisplayed());
    }


    @Test
    public void correctLoginTest() {
        homeLoginPage.login(correctEmail, correctPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(icoAcoount));
        WebElement icoAccountButton = driver.findElement((By.xpath(icoAcoount)));
        assertTrue(icoAccountButton.isDisplayed());
    }


    @After
    public void tearDown() {
        driver.close();
    }
}
