package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomeShopPage{


    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    private WebElement fieldComputers;

    @FindBy(xpath = "//li[@class='inactive']//a[contains(text(),'Desktops')]")
    private WebElement fieldDesktops;

    @FindBy(xpath = "//a[contains(text(),'Lenovo IdeaCentre 600 All-in-One PC')]")
    private WebElement fieldLenovoIdeaCentre600AllInOnePC;

    @FindBy(xpath = "//input[@id='add-to-cart-button-3']")
    private WebElement fieldAddToCartButton;

    @FindBy(xpath = "//span[@class='cart-label']")
    private WebElement fieldCartLabel;


    private void clickOnFieldComputers() {
        fieldComputers.click();
    }

    private void clickOnFieldDesktops() { fieldDesktops.click(); }

    private void clickOnFieldLenovoIdeaCentre600AllInOnePC() {
        fieldLenovoIdeaCentre600AllInOnePC.click();
    }

    private void clickOnFieldAddToCartButton() {
        fieldAddToCartButton.click();
    }

    private void clickOnFieldCartLabel() {
        fieldCartLabel.click();
    }

    public void addToCart() {
        clickOnFieldComputers();
        clickOnFieldDesktops();
        clickOnFieldLenovoIdeaCentre600AllInOnePC();
        clickOnFieldAddToCartButton();
        clickOnFieldCartLabel();
    }

}
