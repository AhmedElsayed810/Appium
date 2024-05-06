package app.SauceLabs.base.testcases;

import app.SauceLabs.base.Products.ProductsPage;
import app.SauceLabs.base.base.BaseTest;
import app.SauceLabs.base.pages.Login.LoginPage;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {


    private LoginPage loginPage;
    private ProductsPage productsPage;



    @Test
    public void loginWithValidCredentials() {
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        productsPage.assertThatProductPageAppear();

    }


    @Test
    public void loginWithInValidCredentials() {
        loginPage = new LoginPage(driver);
        loginPage.login("standard", "secret");
        loginPage.assertInvalidUsernameOrPasswordErrorMessage();
    }

    @Test
    public void loginWithInValidUsername() {
        loginPage = new LoginPage(driver);
        loginPage.login("standard", "secret_sauce");
        loginPage.assertInvalidUsernameOrPasswordErrorMessage();
    }


    @Test
    public void loginWithInValidPassword() {
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "sauce");
        loginPage.assertInvalidUsernameOrPasswordErrorMessage();
    }


    @Test
    public void loginWithEmptyCredentials() {
        loginPage = new LoginPage(driver);
        loginPage.login("", "");
        loginPage.assertEmptyUsernameOrBothErrorMessageIsDisplayed();
    }

    @Test
    public void loginWithEmptyUsername() {
        loginPage = new LoginPage(driver);
        loginPage.login("", "secret_sauce");
        loginPage.assertEmptyUsernameOrBothErrorMessageIsDisplayed();
    }


    @Test
    public void loginWithEmptyPassword() {
        loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "");
        loginPage.assertEmptyPasswordErrorMessageIsDisplayed();
    }



}
