package hepsiburada.Page.Header;

import hepsiburada.Core.DriverProvider;
import io.appium.java_client.MobileBy;

/**
 * @author byorulmaz
 */
public class HeaderScreenObj extends DriverProvider {

  public void clickProfile() {
    driver().findElement(MobileBy.id(waitMobileId("com.pozitron.hepsiburada:id/account_icon_frame"))).click();
  }
}
