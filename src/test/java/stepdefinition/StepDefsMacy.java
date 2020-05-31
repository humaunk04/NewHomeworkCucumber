package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefsMacy {
    @Given("I navigate to macy.com")
    public void i_navigate_to_www_macy_com() {
        System.out.println("I navigate to macy.com");
    }
    @Given("I click SignIn")
    public void i_click_SignIn() {
        System.out.println("I click SignIn");

    }
    @When("I enter Email and Password")
    public void i_enter_Email_and_Password() {
        System.out.println("I enter Email and Password ");

    }
    @When("I click SignIn Button")
    public void i_click_SignIn_Button() {
        System.out.println("I click SignIN Button");

    }
    @Then("I should see MyAccount")
    public void i_should_see_MyAccount() {
        System.out.println("I shuld see MyAccount");

    }
}
