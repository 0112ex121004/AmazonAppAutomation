package com.amazon.androidframework.test.base;

import amazonpagetest.AndroidDriverBuilder;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class BaseTest extends AndroidDriverBuilder {

    public AppiumDriver appiumDriver;


    @BeforeTest
    public void startAppiumServer() {
        System.out.println("before test");
        start();
    }

    @BeforeClass(description = "Setting Capabilities")
    public AppiumDriver setUpAppiumdDriver() throws IOException {
        System.out.println("before class");
        this.appiumDriver = setUp();

        return this.appiumDriver;


    }


    @AfterTest
    public void tearDown() {
        stop();
    }
}

