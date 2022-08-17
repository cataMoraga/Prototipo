package Steps;

import Pages.NegativeLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NegativeLogin {
    String text = "Your password is invalid!";

    NegativeLoginPage NLogin = new NegativeLoginPage();

    @Given("Im on the login page")
    public void navigateLoginPage() {
        NLogin.navigateLoginPage();
    }

    @When("I enter my user")
    public void enterUser() {
        NLogin.enterUser("tomsmith");
    }

    @When("I enter wrong my password")
    public void enterPass() {
        NLogin.enterPass("password");
    }

    @And("click on login button")
    public void clickLoginBtton() {
        NLogin.clickLoginBtton();
    }

    @Then("I can see an incorrect login message")
    public void NegativeMessage() {
        Assert.assertTrue("El mensaje no es el que se esperaba", NLogin.NegativeMessage().contains(text));
    }
}
