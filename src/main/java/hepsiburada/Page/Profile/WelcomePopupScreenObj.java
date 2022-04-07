package hepsiburada.Page.Profile;


import hepsiburada.Core.DriverProvider;
import io.appium.java_client.MobileBy;

public class WelcomePopupScreenObj extends DriverProvider {

    private static final String popupExist = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat";

    public boolean welcomePopupExist() {
        return driver().findElements(MobileBy.xpath(waitMobileXpath(popupExist))).size() > 0;
    }

    public String welcomeMessage() {
        return driver().findElement(MobileBy.id(waitMobileId("android:id/message"))).getText();
    }
}
