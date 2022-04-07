package hepsiburada.Core;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

    public Capabilities() {}

    static DesiredCapabilities androidCapabilities(String platformName) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformVersion", "12");
        capabilities.setCapability("app", "/Users/byorulmaz/Desktop/HBCase/src/main/java/hepsiburada/apk/Hepsiburada.apk");
        capabilities.setCapability("appPackage", "com.pozitron.hepsiburada");
        capabilities.setCapability("appActivity", "com.hepsiburada.launcher.DefaultLauncherAlias");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("platformName", platformName);
        return capabilities;
    }

    static DesiredCapabilities iosCapabilities(String platformName) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "iPhone 11");
        capabilities.setCapability("platformVersion", "14.0");
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("app", "/Users/byorulmaz/Library/Developer/Xcode/DerivedData/Hepsiburada-bjvxfslbwekffpcziefxyofejppv/Build/Products/Debug-iphonesimulator/Hepsiburada.app");
        return capabilities;
    }

    static DesiredCapabilities capabilities(String deviceName, String platformVersion) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("app", "/Users/byorulmaz/Desktop/HBCase/src/main/java/hepsiburada/apk/Hepsiburada.apk");
        capabilities.setCapability("appPackage", "com.pozitron.hepsiburada");
        capabilities.setCapability("appActivity", "com.hepsiburada.launcher.DefaultLauncherAlias");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("platformName", "Android");
        return capabilities;
    }

}
