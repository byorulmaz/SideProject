package hepsiburada.Page.Profile;


import hepsiburada.Core.DriverProvider;
import io.appium.java_client.MobileBy;

/**
 * @author byorulmaz
 */
public class ProfileScreenObj extends DriverProvider {

  private static final String loginButton = "//android.view.ViewGroup[@content-desc=\"account_menu_button_1\"]/android.view.ViewGroup/android.widget.Button";

  private static final String ordersButton = "//android.view.ViewGroup[@content-desc=\"account_menu_2\"]";

  private static final String legendsClub = "//android.view.ViewGroup[@content-desc=\"account_menu_3\"]";

  public boolean profileScreen() {
    return driver().findElements(MobileBy.id(waitMobileId("com.pozitron.hepsiburada:id/rvAccountMenu"))).size() > 0;
  }

  public void clickLoginButton() {
    driver().findElement(MobileBy.xpath(waitMobileXpath(loginButton))).click();
  }

  public void myOrders() {
    driver().findElement(MobileBy.xpath(waitMobileXpath(ordersButton))).click();
  }

  public void legendsClub() {
    driver().findElement(MobileBy.xpath(waitMobileXpath(legendsClub))).click();
  }
}
