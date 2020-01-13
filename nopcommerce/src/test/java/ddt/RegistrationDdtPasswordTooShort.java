package ddt;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.RegistrationPage;
import utils.driver.WebDriverCreators;
import utils.driver.WebDriverProvider;
import static org.assertj.core.api.Assertions.assertThat;
import static utils.data.Variables.*;

@RunWith(DataProviderRunner.class)
public class RegistrationDdtPasswordTooShort {

    private static final String PAGE_URL = "https://demo.nopcommerce.com";
    private WebDriver driver;
    private RegistrationPage registrationPage;


    @DataProvider
    public static Object[][] dataForRegistrationTest(){
        return new String [][]{
                new String[] {firstName, lastName, email, passwordTooShort, passwordTooShort},
                new String[] {firstName, lastName, email, passwordTooShort, passwordTooShort},
                new String[] {firstName, lastName, email, passwordTooShort, passwordTooShort},
                new String[] {firstName, lastName, email, passwordTooShort, passwordTooShort},
                new String[] {firstName, lastName, email, passwordTooShort, passwordTooShort},
                new String[] {firstName, lastName, email, passwordTooShort, passwordTooShort},
                new String[] {firstName, lastName, email, passwordTooShort, passwordTooShort},
        };
    }


    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        driver.get(PAGE_URL);
    }


    @Test
    @UseDataProvider("dataForRegistrationTest")
    public void registerNewUserTest(String firstName, String lastName, String email, String password, String confirmPassword) {



        registrationPage.clickOnFieldIcoRegister();
        registrationPage.typeInFirstName(firstName);
        registrationPage.typeInLastName(lastName);
        registrationPage.typeInEmail(email);
        registrationPage.typeInPassword(password);
        registrationPage.typeInConfirmPassword(confirmPassword);
        registrationPage.clickOnRegisterButton();


        WebElement alertElement = driver.findElement(By.xpath("//li[contains(text(),'must have at least 6 characters')]"));

        String alert = alertElement.getText();

        assertThat(alert).contains("must have at least 6 characters").as("Not found text: 'must have at least 6 characters'");
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
