package com.amazon.androidframework.test.android;

import com.amazon.androidframework.pages.android.AmazonLoginPage;
import com.amazon.androidframework.test.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonLoginTest2 extends BaseTest {


    @Test(priority = 1, description = "Check the amzon home icon present on amzon sign in page")
    public void checkAmazonIcone() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isAmazonIconPresent());
    }

    @Test(priority = 2, description = "Check the Amazon sign in page primary title")
    public void amazonSigninPagePrimaryTitle() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isPrimaryTextPresent());
    }

    @Test(priority = 3, description = "Check the Amazon sign in page secondarys title")
    public void amazonSigninPageSecondarysTitle() {

        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSecondaryTextPresent());
        Assert.assertTrue(lgPage.isSecondaryText2Present());
        Assert.assertTrue(lgPage.isSecondaryText3Present());

    }


    @Test(priority = 4, description = "Check sign in the button present on Amazon sign in page")
    public void checkSignInBtn() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSignInBtnPresent());


    }


    @Test(priority = 5, description = "Check sign up the button present on Amazon sign in page")
    public void checkSignUpBtn() {

        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSignUpBtnPresent());
    }


    @Test(priority = 6, description = "Check skip sign in button on amazon sign in page")
    public void checkSkipSignIpBtn() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSkipSignInPresent());
    }


    @Test(priority = 7, enabled = true, description = "login with Valid UserName and Valid Password")
    public void loginToAmazon() throws InterruptedException {

        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        lgPage.login("akashgupta.gupta16@gmail.com", "akash@787");
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());


    }


}


