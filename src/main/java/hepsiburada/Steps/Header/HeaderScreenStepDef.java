package hepsiburada.Steps.Header;

import hepsiburada.Page.Header.HeaderScreenObj;
import io.cucumber.java.en.When;

/**
 * @author byorulmaz
 */
public class HeaderScreenStepDef {

  private HeaderScreenObj headerScreenObj = new HeaderScreenObj();

  @When("I click profile button")
  public void clickProfile() {
    headerScreenObj.clickProfile();
  }
}
