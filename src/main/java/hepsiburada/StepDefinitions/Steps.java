package hepsiburada.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    @When("test 1")
    public void clickProfile1() {
        System.out.println("test 1");
    }

    @When("test 2")
    public void clickProfile2() {
        System.out.println("test 2");
    }
}
