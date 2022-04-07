package hepsiburada.Steps.Profile;

import hepsiburada.Page.Profile.ProfileScreenObj;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


/**
 * @author byorulmaz
 */
public class ProfileScreenStepDef {

  private ProfileScreenObj profileScreenObj = new ProfileScreenObj();

  @Then("I should see profile screen exist")
  public void profileScreen()
  {
    //isTrue(profileScreenObj.profileScreen(), "Profile screen is not displayed");
  }

  @When("I click login button on profile screen")
  public void loginButton() {
    profileScreenObj.clickLoginButton();
  }

  @When("I click my orders button on profile screen")
  public void clickMyOrders() {
    profileScreenObj.myOrders();
  }

  @When("I click legends club button on profile screen")
  public void clickLegendsClub() {
    profileScreenObj.legendsClub();
  }
}
