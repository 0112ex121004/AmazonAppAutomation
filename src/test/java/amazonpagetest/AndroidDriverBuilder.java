package amazonpagetest;

import com.amazon.androidframework.AppiumServerUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverBuilder extends AppiumServerUtil
{
    private AppiumDriver appiumDriver;


    public AppiumDriver setUp() throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "2a2d916");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium version", "6.1");
        capabilities.setCapability("automationName", "UiAutomator");
        //capabilities.setCapability("app", "/Users/akash.gupta/Downloads/amazonandroidframeWork/app/Amazon.apk");
        capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
        capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
        //capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");

        appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
       appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        return appiumDriver;


    }
}
