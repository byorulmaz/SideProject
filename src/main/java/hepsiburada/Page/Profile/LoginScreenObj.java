package hepsiburada.Page.Profile;


import hepsiburada.Core.DriverProvider;
import io.appium.java_client.MobileBy;

/**
 * @author byorulmaz
 */
public class LoginScreenObj extends DriverProvider {

  public String UserMail = "testcase@test.com";

  private static final String mailText = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]";

  private static final String password = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.widget.EditText";

  private static final String loginScreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View";

  private static final String loginMail = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText";

  private static final String mailSubmit = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.Button";

  private static final String passwordSubmit = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.Button";


  public boolean loginScreenExist() {
    return driver().findElements(MobileBy.xpath(waitMobileXpath(loginScreen))).size() > 0;
  }

  public void enterUserMail() {
    driver().findElement(MobileBy.xpath(waitMobileXpath(loginMail))).sendKeys(UserMail);
  }

  public void submitMail() {
    driver().findElement(MobileBy.xpath(waitMobileXpath(mailSubmit))).click();
  }

  public String userMailText() {
    return driver().findElement(MobileBy.xpath(waitMobileXpath(mailText))).getText();
  }

  public void enterPassword() {
    driver().findElement(MobileBy.xpath(waitMobileXpath(password))).sendKeys("Testcase1");
  }

  public void submitPassword() {
    driver().findElement(MobileBy.xpath(waitMobileXpath(passwordSubmit))).click();
  }
}
