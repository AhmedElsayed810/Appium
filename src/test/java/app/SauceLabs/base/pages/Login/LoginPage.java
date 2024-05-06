package app.SauceLabs.base.pages.Login;

import app.SauceLabs.base.base.BasePage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super((AppiumDriver) driver);
    }
    LoginKeywords loginKeywords = new LoginKeywords(driver);





    public void login(String username, String password){

        loginKeywords.enterUserName(username);
        loginKeywords.enterPassword(password);
        loginKeywords.clickLoginButton();
    }

    public void assertInvalidUsernameOrPasswordErrorMessage(){
        loginKeywords.assertInvalidUsernameOrPasswordErrorMessageIsDisplayed();

    }


    public void assertEmptyUsernameOrBothErrorMessageIsDisplayed(){
        loginKeywords.assertEmptyUsernameOrBothErrorMessageIsDisplayed();

    }

    public void assertEmptyPasswordErrorMessageIsDisplayed(){
        loginKeywords.assertEmptyPasswordErrorMessageIsDisplayed();

    }
}
