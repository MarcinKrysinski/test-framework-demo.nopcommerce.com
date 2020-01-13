package utils.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomWait {
    private static final int EXPLICIT_WAIT_TIMEOUT = 5;

    WebDriver driver;

    public CustomWait(WebDriver driver) {
        this.driver = driver;
    }



    public void waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT_TIMEOUT);
        WebElement waitForElement = wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT_TIMEOUT);
        WebElement waitForElement = wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT_TIMEOUT);
        WebElement waitForElement = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}

