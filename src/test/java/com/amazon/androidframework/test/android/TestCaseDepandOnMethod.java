package com.amazon.androidframework.test.android;

import com.amazon.androidframework.pages.android.AmazonHomePage;
import com.amazon.androidframework.pages.android.AmazonLoginPage;
import com.amazon.androidframework.test.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseDepandOnMethod extends BaseTest {

    @Test(priority = 4, dependsOnMethods = {"checkSearchProduct"}, description = "search product without signup")
    public void searchProductWithoutSignIn() throws InterruptedException {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage ahome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        ahome.searchProduct("mobile");
        ahome.isSearchProductPresent();
    }

    @Test(priority = 7, description = "search the product")
    public void checkSearchProduct() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage ahome = lgPage.login("akashgupta.gupta16@gmail.com", "akash@787");
        ahome.searchProduct("mobile");
        ahome.isSearchProductPresent();
    }

    @Test(priority = 5, dependsOnMethods = {"checkSearchProduct"}, description = "check action bar is clickable or  not")
    public void checkAction_bar() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage ahome = lgPage.login("akashgupta.gupta16@gmail.com", "akash@787");
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        ahome.isActionBarPresent();

    }

    @Test(priority = 10, dependsOnMethods = {"amazonSigninPageSecondarysTitle"}, description = "Check the amzon home icon present on amzon sign in page")
    public void checkAmazonIcone() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isAmazonIconPresent());
    }

    @Test(priority = 2, dependsOnMethods = {"checkSignUpBtn"}, description = "Check the Amazon sign in page primary title")
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


    @Test(priority = 9, description = "Check sign in the button present on Amazon sign in page")
    public void checkSignInBtn() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSignInBtnPresent());
    }


    @Test(priority = 1, dependsOnMethods = {"checkSkipSignIpBtn"}, description = "Check sign up the button present on Amazon sign in page")
    public void checkSignUpBtn() {

        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSignUpBtnPresent());
    }


    @Test(priority = 6, description = "Check skip sign in button on amazon sign in page")
    public void checkSkipSignIpBtn() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        Assert.assertTrue(lgPage.isSkipSignInPresent());
    }


    @Test(priority = 8, dependsOnMethods = {"checkSkipSignIpBtn"}, enabled = true, description = "login with Valid UserName and Valid Password")
    public void loginToAmazon() throws InterruptedException {

        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        lgPage.login("akashgupta.gupta16@gmail.com", "akash@787");
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
    }
    @Test(priority = 10,dependsOnMethods = {"checkAddCartIcon"},  description = "Chcek Amazon Pay display or not")
    public void checkAmazonPay() {
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage ahome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(ahome.isAmazonPayBtmnDisplay());

    }
    @Test(priority = 15,dependsOnMethods = {"checkOfferBtn"},  description = "Chcek Add cart btn display or not")
    public void checkAddCartIcon(){
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage ahome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(ahome.isaddCartIconDisplay());
    }
    @Test(priority = 12,dependsOnMethods = {"checkPayBillDisplay"},  description = "Chcek Offer text display or not")
    public void checkOfferBtn(){
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage ahome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(ahome.isOffersBtnDisplay());
    }
    @Test(priority = 13, dependsOnMethods = {"checkRechargeDisplay"},  description = "Chcek Pay Bill display or not")
    public void checkPayBillDisplay(){
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage ahome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(ahome.isPayBillsDisplay());
    }
    @Test(priority = 11, dependsOnMethods = {"checkScanBtndisplay"},   description = "Chcek Recharge option display or not")
    public void checkRechargeDisplay(){
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage ahome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(ahome.isRechargesBtnDisplay());
    }
    @Test(priority = 14, description = "Chcek Scan icon display or not")
    public void checkScanBtndisplay(){
        AmazonLoginPage lgPage = new AmazonLoginPage(appiumDriver);
        AmazonHomePage ahome = lgPage.clickOnSkipSignIn();
        Assert.assertTrue(lgPage.isAmazonHomePageIconDisplay());
        Assert.assertTrue(ahome.isScanTextDisplay());
    }


    //groups = { "functionalTest" }
}
