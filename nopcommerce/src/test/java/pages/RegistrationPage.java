package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.waits.CustomWait;


public class RegistrationPage {

    private CustomWait customWait;

    @FindBy(xpath = "//a[@class='ico-register']")
    private WebElement fieldIcoRegister;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement fieldFirstName;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement fieldLastName;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement fieldEmail;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    private WebElement fieldConfirmPassword;

    @FindBy(xpath = "//input[@id='register-button']")
    private WebElement fieldRegisterButton;

    @FindBy(xpath = "//div[@class='result']")
    private WebElement fieldRegistrationCopletedMessage;

    public RegistrationPage(WebDriver driver) {
        customWait = new CustomWait(driver);
    }

    public void clickOnFieldIcoRegister() {
        customWait.waitForElementToBeClickable(fieldIcoRegister);
        fieldIcoRegister.click();
    }

    public void typeInFirstName(String firstName) {
        fieldFirstName.sendKeys(firstName);
    }

    public void typeInLastName(String lastName) {
        fieldLastName.sendKeys(lastName);
    }

    public void typeInEmail(String email) {
        fieldEmail.sendKeys(email);
    }

    public void typeInPassword(String password) {
        fieldPassword.sendKeys(password);
    }

    public void typeInConfirmPassword(String confirmPassword) {
        fieldConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickOnRegisterButton() {
        customWait.waitForElementToBeClickable(fieldRegisterButton);
        fieldRegisterButton.click();
    }

    public void register(String firstName, String lastName, String email, String password, String confirmPassword){
        clickOnFieldIcoRegister();
        typeInFirstName(firstName);
        typeInLastName(lastName);
        typeInEmail(email);
        typeInPassword(password);
        typeInConfirmPassword(confirmPassword);
        clickOnRegisterButton();
    }
}
