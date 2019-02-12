package com.amazon.androidframework;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumServerUtil {

    static AppiumDriverLocalService appium;

    public static void start() {

        appium = AppiumDriverLocalService.buildDefaultService();
        appium.start();

    }

    public static void stop() {
        appium.stop();
    }
}


//        AppiumServiceBuilder builder = new AppiumServiceBuilder()
//        .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
//        .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
//        appium = builder.build();
//        appium.start();