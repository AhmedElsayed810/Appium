package app.SauceLabs.base.factory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    private AppiumDriver driver;

    public AppiumDriver initializeDriver() throws MalformedURLException {
        String platformName = "Android";
        String deviceName = "Pixel 3a API 30";
        String appPath = "C:\\Users\\11224\\IdeaProjects\\saucelabs\\app\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", platformName);
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("app", appPath);
        caps.setCapability("appPackage", "com.swaglabsmobileapp");
        caps.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity");

        URL appiumServerUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(appiumServerUrl, caps);
        return driver;
    }
}
