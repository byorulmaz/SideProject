package hepsiburada.Steps.HomePage;


import hepsiburada.Page.HomePage.HomeScreenObj;
import io.cucumber.java.en.Given;


/**
 * @author byorulmaz
 */
public class HomeScreenStepDef {

  private HomeScreenObj homeScreenObj = new HomeScreenObj();

  @Given("I click close button on all popup")
  public void closePopup()
  {
    homeScreenObj.orderPopupClose();
    homeScreenObj.homePagePopupClose();
    //isTrue(homeScreenObj.homePageExist(), "Home screen is not displayed");
  }

}
