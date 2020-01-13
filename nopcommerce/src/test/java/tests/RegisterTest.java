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

public class RegisterTest extends BaseTest {

    private static final String PAGE_URL = "https://demo.nopcommerce.com";


    @Before
    public void setUpForTest(){
        driver.get(PAGE_URL);
    }


    @Test
    public void incorrectRegisterEmailWitohoutMonkeyTest() {
        registrationPage.register(correctFirstName, correctLastName, emailWithoutMonkey, correctPassword, correctConfirmPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(validationEmailError));
        WebElement validationEmailErrorText = driver.findElement((By.xpath(validationEmailError)));
        assertTrue(validationEmailErrorText.isDisplayed());
    }


    @Test
    public void incorrectRegisterEmailWithoutDotTest() {
        registrationPage.register(correctFirstName, correctLastName, emailWithoutDot, correctPassword, correctConfirmPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(validationEmailError));
        WebElement validationEmailErrorText = driver.findElement((By.xpath(validationEmailError)));
        assertTrue(validationEmailErrorText.isDisplayed());
    }


    @Test
    public void incorrectRegisterEmailWithoutDomainTest() {
        registrationPage.register(correctFirstName, correctLastName, emailWithoutDomain, correctPassword, correctConfirmPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(validationEmailError));
        WebElement validationEmailErrorText = driver.findElement((By.xpath(validationEmailError)));
        assertTrue(validationEmailErrorText.isDisplayed());
    }


    @Test
    public void incorrectPasswordTooShortTest() {
        registrationPage.register(correctFirstName, correctLastName, email, passwordTooShort, passwordTooShort);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(passwordTooShortError));
        WebElement passwordTooShortErrorText = driver.findElement((By.xpath(passwordTooShortError)));
        assertTrue(passwordTooShortErrorText.isDisplayed());
    }


    @Test
    public void incorrectConfirmPasswordTest() {
        registrationPage.register(correctFirstName, correctLastName, email, correctPassword, incorrectConfirmPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(confirmPasswordError));
        WebElement confirmPasswordErrorText = driver.findElement((By.xpath(confirmPasswordError)));
        assertTrue(confirmPasswordErrorText.isDisplayed());
    }


    @Test
    public void emptyPasswordTest() {
        registrationPage.register(correctFirstName, correctLastName, email, emptyPassword, emptyPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(noPasswordError));
        WebElement noPasswordErrorText = driver.findElement((By.xpath(noPasswordError)));
        assertTrue(noPasswordErrorText.isDisplayed());
    }


    @Test
    public void correctRegisterEmailTest() {
        registrationPage.register(correctFirstName, correctLastName, email, correctPassword, correctConfirmPassword);
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(registrationCopletedMessage));
        WebElement registrationCopletedMessageText = driver.findElement((By.xpath(registrationCopletedMessage)));
        assertTrue(registrationCopletedMessageText.isDisplayed());
    }


    @After
    public void tearDown() {
        driver.close();
    }
}
