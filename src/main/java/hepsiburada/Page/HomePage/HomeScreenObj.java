package hepsiburada.Page.HomePage;

import hepsiburada.Core.DriverProvider;
import io.appium.java_client.MobileBy;

/**
 * @author byorulmaz
 */
public class HomeScreenObj extends DriverProvider {

  public void orderPopupClose() {
    driver().findElement(MobileBy.id(waitMobileId("com.pozitron.hepsiburada:id/imageViewClose"))).click();
  }

  public void homePagePopupClose() {
    driver().findElement(MobileBy.AccessibilityId(waitAccessibilityId("close"))).click();
  }

  public boolean homePageExist() {
    return driver().findElements(MobileBy.id(waitMobileId("com.pozitron.hepsiburada:id/coordinator"))).size() > 0;
  }
}
