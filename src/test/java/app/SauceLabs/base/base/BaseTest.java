package app.SauceLabs.base.base;

import app.SauceLabs.base.factory.DriverFactory;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class BaseTest {

    protected AppiumDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        driver = new DriverFactory().initializeDriver();
    }

    @AfterMethod
    public void teardown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
