package hepsiburada.Core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author byorulmaz
 */
public class DriverProvider {

  private static final int TIME_OUT_IN_SECONDS = 60;

  public AppiumDriver driver() {
    return Hooks.driver;
  }

  protected TouchAction driverAction() {
    return Hooks.action;
  }

  protected String waitMobileId(String locatorId) {
    WebDriverWait webDriverWait = new WebDriverWait(driver(), TIME_OUT_IN_SECONDS);
    webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id(locatorId)));
    return locatorId;
  }

  protected String waitAccessibilityId(String locatorAccessibilityId) {
    WebDriverWait webDriverWait = new WebDriverWait(driver(), TIME_OUT_IN_SECONDS);
    webDriverWait.until(
        ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId(locatorAccessibilityId)));
    return locatorAccessibilityId;
  }

  protected String waitMobileXpath(String locatorXpath) {
    WebDriverWait webDriverWait = new WebDriverWait(driver(), TIME_OUT_IN_SECONDS);
    webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath(locatorXpath)));
    return locatorXpath;
  }

  protected void waitTest(int secondTime) {
    try {
      Thread.sleep(secondTime);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}