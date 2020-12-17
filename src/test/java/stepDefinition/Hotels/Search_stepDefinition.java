package stepDefinition.Hotels;


import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Search_stepDefinition {

    LandingPage lPage = new LandingPage();
    SearchPage sPage = new SearchPage();


    @When("^I enter (.+) in search$")
    public void enterInSearch(String text) {
        lPage.enterInput(text);
    }

    @When("^I enter (.+) from autosuggestion$")
    public void enterDestination(String destination) {
        lPage.enterDestination(destination);
    }

    @When("^Click search button$")
    public void clickSearchButton() {
        lPage.clickSearch();
    }

    @Then("^I verify search header contains text selected from autosuggestion$")
    public void isHeaderContainsSameText() {
        Assert.assertEquals(sPage.searchPageTitle(),"hotels in Lake George, New York, United States of America", "Else incorrect header");
    }

    @Then("^I verify text under (.+) is same as selecetd from autosuggestion$")
    public void isTextSameAsOnLandingPage(String destination) {
        Assert.assertEquals(sPage.textSameOnSearchPage(), destination, "Else destination does not match");
    }

    @When("^I select (.+) in children dropdown$")
    public void selectChildQuantity(String value) {
        lPage.enterChildQuantity(value);
    }

    @When("^I enter Child 1 age (.+)$")
    public void enterChildAge(String value) {
        lPage.enterChildAge1(value);
    }

    @When("^I enter Child 2 age (.+)$")
    public void enterSecondChildAge(String value) {
        lPage.enterChildAge2(value);
    }

    @When("^I sort the result by Prices 'low to high'$")
    public void sortByLowToHigh() {
        sPage.sortByPrice();
    }

    @Then("^I print the lowest price and the hotel name in Console$")
    public void printLowestHotelAndPrice() {
        sPage.printLowestPriceAndHotel();
    }

    @Then("^I verify the lowest price is less than 100$")
    public void verifyLowestPrice() {
        Assert.assertTrue(sPage.verifyLowestPriceIsLess()<100, "The lowest price is greater than the budget");
    }
}
