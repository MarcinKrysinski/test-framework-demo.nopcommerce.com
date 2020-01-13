package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.waits.CustomWait;

public class HomeLoginPage {

    private CustomWait customWait;

    @FindBy(xpath = "//a[@class='ico-login']")
    private WebElement fieldIcoLogin;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement fieldLoginEmail;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement fieldLoginPassword;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    private WebElement fieldLoginButton;

    @FindBy(xpath = "//a[@class='ico-account']")
    private WebElement fieldIcoAccount;

    public HomeLoginPage(WebDriver driver) {
        customWait = new CustomWait(driver);
    }

    private void clickOnFieldIcoLogin() {
        fieldIcoLogin.click();
    }

    private void typeInLoginEmail(String loginEmail) {
        customWait.waitForElementToBeClickable(fieldLoginEmail);
        fieldLoginEmail.sendKeys(loginEmail);
    }

    private void typeInLoginPassword(String loginPassword) {
        fieldLoginPassword.sendKeys(loginPassword);
    }

    private void clickOnLoginButton() {
        customWait.waitForElementToBeClickable(fieldLoginButton);
        fieldLoginButton.click();
    }

    public void login(String loginEmail, String loginPassword){
        clickOnFieldIcoLogin();
        typeInLoginEmail(loginEmail);
        typeInLoginPassword(loginPassword);
        clickOnLoginButton();
    }
}
