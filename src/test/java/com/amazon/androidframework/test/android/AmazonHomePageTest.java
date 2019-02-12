package com.amazon.androidframework.test.android;

import com.amazon.androidframework.pages.android.AmazonHomePage;
import com.amazon.androidframework.pages.android.AmazonLoginPage;
import com.amazon.androidframework.test.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHomePageTest extends BaseTest {

    @Test(priority = 7, description = "search product without signup")
    public void searchProductWithoutSignIn() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        aHome.searchProduct("mobile");
        aHome.isSearchProductPresent();
    }

    @Test(priority = 8, description = "search the product")
    public void checkSearchProduct() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.login("akashgupta.gupta16@gmail.com", "akash@787");
        aHome.searchProduct("mobile");
        aHome.isSearchProductPresent();


    }

    @Test(priority = 9, description = "check action bar is clickable or  not")
    public void checkAction_bar() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.login("akashgupta.gupta16@gmail.com", "akash@787");
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        aHome.isActionBarPresent();
    }

    @Test(priority = 10, description = "Chcek Amazon Pay display or not")
    public void checkAmazonPay() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isAmazonPayBtmnDisplay());

    }

    @Test(priority = 15, description = "Chcek Add cart btn display or not")
    public void checkAddCartIcon() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isaddCartIconDisplay());
    }

    @Test(priority = 12, description = "Chcek Offer text display or not")
    public void checkOfferBtn() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isOffersBtnDisplay());
    }

    @Test(priority = 13, description = "Chcek Pay Bill display or not")
    public void checkPayBillDisplay() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isPayBillsDisplay());
    }

    @Test(priority = 11, description = "Chcek Recharge option display or not")
    public void checkRechargeDisplay() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isRechargesBtnDisplay());
    }

    @Test(priority = 14, description = "Chcek Scan icon display or not")
    public void checkScanBtndisplay() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage aHome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(aHome.isScanTextDisplay());
    }


}
