package hepsiburada.Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Emulator {

    private static Runtime rt = Runtime.getRuntime();

    private static final int WAIT_SECOND_TIME = 500;

    public static void AndroidEmulatorStart() {
        try {
            rt.exec("/Users/" + System.getProperty("user.name") + "/Library/Android/sdk/emulator/emulator" + " @" + "Nexus_6P_API_31");
            rt.exec("adb wait-for-device");
            /*
            String waitEmulator;
            do {
                waitEmulator = getCommandLineResult("adb shell getprop sys.boot_completed");
            } while (!"1".equals(waitEmulator));
            */
            rt.exec("adb uninstall io.appium.uiautomator2.server");
            rt.exec("adb uninstall io.appium.uiautomator2.server.test");
            Thread.sleep(WAIT_SECOND_TIME);
            System.out.println("------------ Emulator Started ------------");
        } catch (Exception e) {
        }
    }

    public static void iosEmulatorStart() {
        try {
            rt.exec("open -a Simulator --args -CurrentDeviceUDID D62B2043-A49F-407A-B47D-59EF5CAAE16C");
            Thread.sleep(WAIT_SECOND_TIME);
        } catch (Exception e) {
        }
    }

    private static String getCommandLineResult(String processExec) throws IOException {
        Process exec = rt.exec(processExec);
        InputStream is = exec.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        return reader.readLine();
    }
}
