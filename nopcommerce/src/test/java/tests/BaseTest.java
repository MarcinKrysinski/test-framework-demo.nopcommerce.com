package tests;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomeLoginPage;
import pages.HomeShopPage;
import pages.RegistrationPage;

import java.net.MalformedURLException;


public class BaseTest {

    protected WebDriver driver;

    RegistrationPage registrationPage;
    HomeLoginPage homeLoginPage;
    HomeShopPage homeShopPage;

    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "/home/marcin/Pulpit/Test/nopcommerce/src/test/resources/drivers/chrome/chromedriver_linux64");
        driver = new ChromeDriver();

        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        homeLoginPage = PageFactory.initElements(driver, HomeLoginPage.class);
        homeShopPage = PageFactory.initElements(driver, HomeShopPage.class);
    }
}


