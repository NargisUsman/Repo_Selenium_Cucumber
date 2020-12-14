package Tests.Hotels;

import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPage_Tests {

    LandingPage lPage = new LandingPage();
    SearchPage sPage = new SearchPage();

    @Test
    public void verifyUserSelection(String destination) {

        lPage.clearSearchBox();
        lPage.enterInput("york");
        lPage.enterDestination("Lake George, New York, United States of America");
        lPage.clickSearch();
        Assert.assertEquals(sPage.searchPageTitle(),"hotels in Lake George, New York, United States of America");
        Assert.assertEquals(sPage.textSameOnSearchPage(), destination, "Else destination does not match");


    }

    @Test
    public void verifyCheapestHotelPrice() {

        lPage.clearSearchBox();
        lPage.enterInput("york");
        lPage.enterDestination("Lake George, New York, United States of America");
        lPage.clickEditInfo();
        lPage.enterChildQuantity("2");
        lPage.enterChildAge1("4");
        lPage.enterChildAge2("1");
        lPage.clickSearch();
        sPage.sortByPrice();
        sPage.printLowestPriceAndHotel();
        Assert.assertTrue(sPage.verifyLowestPriceIsLess()<100, "The lowest price is greater than the budget");

    }
}
