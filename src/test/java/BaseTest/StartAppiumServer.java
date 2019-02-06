package BaseTest;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.io.File;
import java.io.IOException;

public class StartAppiumServer
{


    private static AppiumDriverLocalService appiumservice;

    @BeforeTest
    public static void StartAppiumServer() throws IOException {
        System.out.println("appium server is started");
        System.out.println(appiumservice);
        int port = 4723;
        String nodeJS_Path = "C://Program Files//NodeJS/node.exe";
        String appiumJS_Path = "C://Program Files/Appium//node_modules//appium//bin//appium.js";
        String osName = System.getProperty("os.name");
        if (osName.contains("Mac")) {
            appiumservice = AppiumDriverLocalService.buildService(
                    new AppiumServiceBuilder()
                            .withAppiumJS(new File("/usr/local/bin/appium"))
                            .usingDriverExecutable(new File("/usr/local/bin/node"))
                            .withIPAddress("127.0.0.1")
                            .usingPort(port));

        } else if (osName.contains("Windows")) {
            appiumservice = AppiumDriverLocalService.buildService(
                    new AppiumServiceBuilder()
                            .usingDriverExecutable(new File(nodeJS_Path))
                            .withAppiumJS(new File(appiumJS_Path))
                            .withIPAddress("0.0.0.0")
                            .usingPort(port)
                            .withLogFile(new File("build/appium.log")));
        }
        appiumservice.start();
    }


    @AfterTest
    public static void StopAppiumServer() {
        appiumservice.stop();
        System.out.println("appium server is killed");



    }

}
