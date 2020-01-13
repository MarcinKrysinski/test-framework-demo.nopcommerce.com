package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.waits.CustomWait;

import static org.junit.Assert.assertTrue;
import static utils.data.Xpath.*;

public class AddToCartTest extends BaseTest{

    private static final String PAGE_URL = "https://demo.nopcommerce.com";


    @Before
    public void setUpForTest(){
        driver.get(PAGE_URL);
    }

    @Test
    public void AddToCart() {
        homeShopPage.addToCart();
        new CustomWait(driver).waitForElementToBeVisible(By.xpath(inCart));
        WebElement lenovoInCartText = driver.findElement((By.xpath(lenovoInCart)));
        assertTrue(lenovoInCartText.isDisplayed());
    }

    @After
    public void tearDown() {
        driver.close();
    }

}
