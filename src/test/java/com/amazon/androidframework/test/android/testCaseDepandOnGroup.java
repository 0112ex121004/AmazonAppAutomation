package com.amazon.androidframework.test.android;

import com.amazon.androidframework.pages.android.AmazonHomePage;
import com.amazon.androidframework.pages.android.AmazonLoginPage;
import com.amazon.androidframework.test.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCaseDepandOnGroup extends BaseTest {
    @Test(groups = {"functionalTest"}, description = "search product without signup")
    public void searchProductWithoutSignIn() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        aHome.searchProduct("mobile");
        aHome.isSearchProductPresent();
    }

    @Test(groups = {"functionalTest"}, description = "search the product")
    public void checkSearchProduct() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.login("akashgupta.gupta16@gmail.com", "akash@787");
        aHome.searchProduct("mobile");
        aHome.isSearchProductPresent();
    }

    @Test(groups = {"functionalTest"}, description = "check action bar is clickable or  not")
    public void checkAction_bar() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.login("akashgupta.gupta16@gmail.com", "akash@787");
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        aHome.isActionBarPresent();

    }

    @Test(groups = {"functionalTest"}, description = "Check the amzon home icon present on amzon sign in page")
    public void checkAmazonIcone() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isAmazonIconPresent());
    }

    @Test(groups = {"functionalTest"}, description = "Check the Amazon sign in page primary title")
    public void amazonSigninPagePrimaryTitle() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isPrimaryTextPresent());
    }

    @Test(groups = {"smokeTest", "functionalTest"}, description = "Check the Amazon sign in page secondarys title")
    public void amazonSigninPageSecondarysTitle() {

        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSecondaryTextPresent());
        Assert.assertTrue(lgPage.isSecondaryText2Present());
        Assert.assertTrue(lgPage.isSecondaryText3Present());

    }


    @Test(groups = {"smokeTest", "functionalTest"}, description = "Check sign in the button present on Amazon sign in page")
    public void checkSignInBtn() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSignInBtnPresent());
    }


    @Test(groups = {"smokeTest", "functionalTest"}, description = "Check sign up the button present on Amazon sign in page")
    public void checkSignUpBtn() {

        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSignUpBtnPresent());
    }


    @Test(groups = {"smokeTest", "functionalTest"}, description = "Check skip sign in button on amazon sign in page")
    public void checkSkipSignIpBtn() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSkipSignInPresent());
    }


    @Test(groups = {"smokeTest"}, description = "login with Valid UserName and Valid Password")
    public void loginToAmazon() {

        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        lgPage.login("akashgupta.gupta16@gmail.com", "akash@787");
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
    }

    @Test(groups = {"smokeTest"}, description = "Chcek Amazon Pay display or not")
    public void checkAmazonPay() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isAmazonPayBtmnDisplay());

    }

    @Test(groups = {"smokeTest"}, description = "Chcek Add cart btn display or not")
    public void checkAddCartIcon() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isaddCartIconDisplay());
    }

    @Test(groups = {"smokeTest"}, description = "Chcek Offer text display or not")
    public void checkOfferBtn() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isOffersBtnDisplay());
    }

    @Test(groups = {"smokeTest"}, description = "Chcek Pay Bill display or not")
    public void checkPayBillDisplay() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isPayBillsDisplay());
    }

    @Test(groups = {"smokeTest"}, description = "Chcek Recharge option display or not")
    public void checkRechargeDisplay() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isRechargesBtnDisplay());
    }

    @Test(groups = {"smokeTest"}, description = "Chcek Scan icon display or not")
    public void checkScanBtndisplay() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isScanTextDisplay());
    }


    //
}
