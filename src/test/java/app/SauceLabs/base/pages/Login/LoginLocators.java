package app.SauceLabs.base.pages.Login;

import org.openqa.selenium.By;

public class LoginLocators {

    public static By usernameField = By.xpath("//*[@content-desc=\"test-Username\"]");
    public static By passwordField = By.xpath("//*[@content-desc=\"test-Password\"]");
    public static By loginbutton = By.xpath("//*[@content-desc=\"test-LOGIN\"]/android.widget.TextView");
}

