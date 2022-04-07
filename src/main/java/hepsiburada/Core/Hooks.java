package hepsiburada.Core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author byorulmaz
 */

public class Hooks {

    protected static AppiumDriver driver;

    protected static TouchAction action;

    private static Runtime rt = Runtime.getRuntime();

    private static AppiumDriverLocalService service;

    private static Boolean isFirst = true;

    private static final String appPackage = "com.pozitron.hepsiburada";

    private static final String deviceName = "emulator-5554";

    /*
        @BeforeMethod
        @Parameters({ "platformName" })
        public void beforeTest(String platformName) throws MalformedURLException {
            if(platformName == "iOS")
            {
                if (isFirst) {
                    System.out.println("------------START APPIUM SERVICE 1------------");
                    Emulator.iosEmulatorStart();
                    service = AppiumDriverLocalService.buildService(AppiumStart.appiumIosService(platformName));
                    service.start();
                    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                        tearDown();
                        stopService();
                    }));
                    isFirst = false;
                }
                driver = new IOSDriver(new URL("http:127.0.0.1:4725/wd/hub"), Capabilities.iosCapabilities(platformName));
            } else {
                if (isFirst) {
                    System.out.println("------------START APPIUM SERVICE 2------------");
                    Emulator.AndroidEmulatorStart();
                    service = AppiumDriverLocalService.buildService(AppiumStart.appiumAndroidService(platformName));
                    service.start();
                    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                        tearDown();
                        stopService();
                    }));
                    isFirst = false;
                }
                driver = new AndroidDriver(new URL("http:127.0.0.1:4723/wd/hub"), Capabilities.androidCapabilities(platformName));
            }
            action = new TouchAction(driver);
        }*/

    public void beforeTest(String deviceName, String platformVersion, String port) throws MalformedURLException {
        if (isFirst) {
            System.out.println("------------START APPIUM SERVICE 2------------");
            //Emulator.AndroidEmulatorStart();
            service = AppiumDriverLocalService.buildService(AppiumStart.appiumService(deviceName,platformVersion,port));
            service.start();
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                tearDown();
                stopService();
            }));
            isFirst = false;
        }
        driver = new AndroidDriver(new URL("http:127.0.0.1:" +  port + "/wd/hub"), Capabilities.capabilities(deviceName,platformVersion));
        action = new TouchAction(driver);
    }


    public void tearDown() {
        System.out.println("--- Stop Appium Test Scenario ---");
        driver.quit();
    }

    public void stopService() {
        System.out.println("--- STOP APPIUM SERVICE ---");
        service.stop();
        try {
            rt.exec("adb uninstall " + appPackage);
            rt.exec("adb -s " + deviceName + " emu kill");
            System.out.println("------------ Emulator Stopped ------------");
        } catch (Exception ex) {
        }
    }
}
