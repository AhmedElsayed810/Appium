package app.SauceLabs.base.pages.Products;

import app.SauceLabs.base.base.BasePage;
import app.SauceLabs.base.pages.Products.ProductsKeywords;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super((AppiumDriver) driver);
    }

    ProductsKeywords productsKeywords = new ProductsKeywords(driver);



    public void assertThatProductPageAppear(){

        productsKeywords.assertProductsTextIsDisplayed();

    }


}
