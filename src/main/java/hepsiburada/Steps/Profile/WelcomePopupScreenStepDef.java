package hepsiburada.Steps.Profile;

import hepsiburada.Page.Profile.WelcomePopupScreenObj;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class WelcomePopupScreenStepDef {

    private WelcomePopupScreenObj welcomePopupScreenObj = new WelcomePopupScreenObj();

    private static final String message = "Hoş geldin Test Test. Keyifli alışverişler dileriz.";

    @Then("I should see success message")
    public void profileScreen() {
        Assert.assertEquals(message, welcomePopupScreenObj.welcomeMessage());
    }
}
