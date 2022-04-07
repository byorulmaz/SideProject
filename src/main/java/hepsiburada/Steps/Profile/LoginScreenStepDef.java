package hepsiburada.Steps.Profile;

import hepsiburada.Page.Profile.LoginScreenObj;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * @author byorulmaz
 */
public class LoginScreenStepDef {

  private LoginScreenObj loginScreenObj = new LoginScreenObj();

  @Then("I should see login screen exist")
  public void loginScreenExist() {
    //isTrue(loginScreenObj.loginScreenExist(), "Login screen is not displayed");
  }

  @When("I enter the email address")
  public void enterUserMail() {
    loginScreenObj.enterUserMail();
    loginScreenObj.submitMail();
  }

  @Then("I should see user email text")
  public void userMailText() {
    Assert.assertEquals(loginScreenObj.UserMail, loginScreenObj.userMailText());
  }

  @When("I enter password")
  public void enterPassword() {
    loginScreenObj.enterPassword();
    loginScreenObj.submitPassword();
  }
}
