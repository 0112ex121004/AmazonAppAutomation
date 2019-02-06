package amazonpagetest;


import builder.StartAppiumServer;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



public class AmazonTest extends StartAppiumServer {


    WebDriverWait wait;
    private AppiumDriver appiumDriver;

    @BeforeClass(description = "Setting Capabilities")
    public void setUp() throws IOException {

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
        wait = new WebDriverWait(appiumDriver, 10);

    }

    @Test( priority = 1,description = "Check the amzon home icon present on amzon sign in page")
    public void checkAmazonIcone() {
        boolean amazonIcon = appiumDriver.findElement(By.id("sso_splash_logo")).isDisplayed();
        Assert.assertTrue(amazonIcon);

    }

    @Test(priority = 2,description = "Check the Amazon sign in page primary title")
    public void amazonSigninPagePrimaryTitle() {
        String pageText1 = appiumDriver.findElement(By.id("signin_to_yourAccount")).getText();
        Assert.assertEquals(pageText1, "Sign in to your account");

        String pageText2 = appiumDriver.findElement(By.id("view_your_wish_list")).getText();
        Assert.assertEquals(pageText2, "View your wish list");

        String pageText3 = appiumDriver.findElement(By.id("Find_purchase")).getText();
        Assert.assertEquals(pageText3, "Find & reorder past purchases");

        String pageText4 = appiumDriver.findElement(By.id("track_your_packages")).getText();
        Assert.assertEquals(pageText4, "Track your purchases");

    }

    @Test(priority = 3,description = "Check the Amazon sign in page secondarys title")
    public void amazonSigninPageSecondarysTitle() {

        String pageText2 = appiumDriver.findElement(By.id("view_your_wish_list")).getText();
        Assert.assertEquals(pageText2, "View your wish list");

        String pageText3 = appiumDriver.findElement(By.id("Find_purchase")).getText();
        Assert.assertEquals(pageText3, "Find & reorder past purchases");

        String pageText4 = appiumDriver.findElement(By.id("track_your_packages")).getText();
        Assert.assertEquals(pageText4, "Track your purchases");

    }


    @Test(priority = 4,description = "Check sign in the button present on Amazon sign in page")
    public void checkSignInBtn() {
        WebElement signInBtn = appiumDriver.findElement(By.id("sign_in_button"));
        if (signInBtn.isDisplayed() && signInBtn.isEnabled())
            System.out.println("sign in button is present and its a clickable");
        else {
            System.out.println("sign in button is not present and its not clickable");
        }


    }


    @Test(priority = 5,description = "Check sign up the button present on Amazon sign in page")
    public void checkSignUpBtn() {
        WebElement signUpBtn = appiumDriver.findElement(By.id("new_user"));
        if (signUpBtn.isDisplayed() && signUpBtn.isEnabled()) {
            System.out.println("sign Up button is present and its a clickable");
        } else {
            System.out.println("sign Up button is not present and its not clickable");
        }
    }


    @Test(priority = 6,description = "Check skip sign in button on amazon sign in page")
    public void checkSkipSignIpBtn() {
        WebElement skipSignInpBtn = appiumDriver.findElement(By.id("skip_sign_in_button"));
        if (skipSignInpBtn.isDisplayed() && skipSignInpBtn.isEnabled()) {
            System.out.println("skip sign in button is present and its a clickable");
        } else {
            System.out.println("skip sign in button is not present and its not clickable");
        }
    }


    @Test(priority = 8, enabled = false,description = "login with Valid UserName and Valid Password")
    public void loginToAmazon() throws InterruptedException {
        appiumDriver.findElement(By.id("sign_in_button")).click();
        String currentview = appiumDriver.getContext();

        if (currentview.equalsIgnoreCase("NATIVE_APP")) {
            WebElement loginUser = appiumDriver.findElement(By.id("ap_email_login"));
           loginUser.sendKeys("7879556515");
            appiumDriver.findElement(By.id("continue")).click();
            loginUser.clear();
            appiumDriver.findElement(By.id("ap_email_login")).sendKeys("7879556515");
            appiumDriver.findElement(By.id("ap_password")).sendKeys("akash@787");
            appiumDriver.findElement(By.id("signInSubmit")).click();
        } else {
            System.out.println("web view is display");
        }
    }

    @Test(priority = 7,enabled = true, description = "search product without signup")
    public void searchProductWithoutSignIn() throws InterruptedException {
        appiumDriver.findElement(By.id("skip_sign_in_button")).click();
        appiumDriver.findElement(By.id("rs_search_src_text")).click();

        appiumDriver.findElement(By.id("rs_search_src_text")).sendKeys("mobile");

        appiumDriver.findElement(By.id("iss_search_dropdown_item_text")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("item_title")));
        boolean searchresultpage = appiumDriver.findElement(By.id("item_title")).isDisplayed();
        Assert.assertTrue(searchresultpage);


    }

    @Test(priority = 8,description = "search the product")
    public void checkSearchProduct() throws InterruptedException {
        appiumDriver.findElement(By.id("rs_search_src_text")).click();
        appiumDriver.findElement(By.id("rs_search_src_text")).sendKeys("mobile");
        appiumDriver.findElement(By.id("iss_search_dropdown_item_text")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("item_title")));
        boolean searchresultpage = appiumDriver.findElement(By.id("item_title")).isDisplayed();
        Assert.assertTrue(searchresultpage);
    }

    @Test(priority = 9, description = "check action bar is clickable or  not")
    public void checkAction_bar() {
        appiumDriver.findElement(By.id("action_bar_burger_icon")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("drawer_item_title")));


    }


}
