package app.SauceLabs.base.Products;

import app.SauceLabs.base.base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class ProductsKeywords extends BasePage {
    public ProductsKeywords(WebDriver driver) {
        super((AppiumDriver) driver);
    }
    private static final By productTitle = (ProductsAssertions.productTitle);


    public void assertProductsTextIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "PRODUCTS";
        assertEquals(expectedText, actualText, "Product title text does not match expected text");
    }












}
