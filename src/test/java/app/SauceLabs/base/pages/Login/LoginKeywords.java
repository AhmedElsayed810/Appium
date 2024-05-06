package app.SauceLabs.base.pages.Login;

import app.SauceLabs.base.base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class LoginKeywords extends BasePage {
    public LoginKeywords(WebDriver driver) {
        super((AppiumDriver) driver);
    }
    private static final By errorMessage = (LoginAssertions.errorMessage);







    public void enterUserName(String username){
        driver.findElement(LoginLocators.usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(LoginLocators.passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(LoginLocators.loginbutton).click();
    }

    public void assertInvalidUsernameOrPasswordErrorMessageIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Username and password do not match any user in this service.";
        assertEquals(expectedText, actualText, "error message text does not match expected text");
    }


    public void assertEmptyUsernameOrBothErrorMessageIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Username is required";
        assertEquals(expectedText, actualText, "error message text does not match expected text");
    }


    public void assertEmptyPasswordErrorMessageIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Password is required";
        assertEquals(expectedText, actualText, "error message text does not match expected text");
    }


}


