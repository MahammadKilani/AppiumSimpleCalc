package Driver;

import Elements.Elements;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {


    public static Elements elements;
    public static AppiumDriver appiumDriver;

    public static void startDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Phone");
        capabilities.setCapability("udid", "R9WN20N1YMJ");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        appiumDriver = new AppiumDriver(url, capabilities);

        elements = new Elements();
    }

    public static void killDriver() {
        appiumDriver.quit();
    }
}
