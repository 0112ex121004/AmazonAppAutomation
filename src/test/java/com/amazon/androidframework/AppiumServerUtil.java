package com.amazon.androidframework.test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;

public class AppiumServerUtil {

    static AppiumDriverLocalService appium;

    public static void start() {
        AppiumServiceBuilder builder = new AppiumServiceBuilder()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
        appium = builder.build();
        appium.start();
    }

    public static void stop() {
        appium.stop();
    }
}