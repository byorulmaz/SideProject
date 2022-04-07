package hepsiburada.Core;

import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;


public class AppiumStart {

    private static final int PORT_ANDROID = 4723;
    private static final int PORT_IOS = 4725;

    public static AppiumServiceBuilder appiumAndroidService(String platformName) {

        AppiumServiceBuilder builder = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(PORT_ANDROID);
        builder.withCapabilities(Capabilities.androidCapabilities(platformName));
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
        return builder;
    }

    public static AppiumServiceBuilder appiumIosService(String platformName) {

        AppiumServiceBuilder builder = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(PORT_IOS);
        builder.withCapabilities(Capabilities.iosCapabilities(platformName));
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
        return builder;
    }

    public static AppiumServiceBuilder appiumService(String deviceName, String platformVersion, String port) {

        AppiumServiceBuilder builder = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
        builder.withIPAddress("127.0.0.1");
        builder.usingPort(Integer.parseInt(port));
        builder.withCapabilities(Capabilities.capabilities(deviceName,platformVersion));
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
        return builder;
    }

}
