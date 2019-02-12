package com.amazon.androidframework.test.base;

import com.amazon.androidframework.test.builder.AndroidDriverBuilder;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import static com.amazon.androidframework.AppiumServerUtil.start;
import static com.amazon.androidframework.AppiumServerUtil.stop;

public class BaseTest extends AndroidDriverBuilder {

    public AppiumDriver appiumDriver;


    @BeforeTest
    public void startAppiumServer() {
        System.out.println("before test");
        start();
    }

    @BeforeMethod(description = "Setting Capabilities")
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

