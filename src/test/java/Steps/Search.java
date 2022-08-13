package Steps;

import Pages.GooglePage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Search {
    String texto = "Chile - Wikipedia, la enciclopedia libre";

    GooglePage google = new GooglePage();

    @Given("I am on the Google search page")
    public void navigateToGoogle() {
        google.navigateToGoogle();
    }
    @When("I enter a search criteria")
    public void enterSearchCriteria() {
        google.enterSearchCriteria("Chile");
    }

    @And("click on the search button")
    public void clickSearchButton() {
        google.clickGoogleSearch();
    }

    @Then("The results match the criteria")
    public void resultsMatchCriteria() {
        Assert.assertEquals(texto, google.firstResults());
    }
}
