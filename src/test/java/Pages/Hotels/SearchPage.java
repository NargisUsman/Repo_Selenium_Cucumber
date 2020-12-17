package Pages.Hotels;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {

    By inputLocation = By.xpath("//input[@data-current-location='Current location']");
    By hotelsPrice = By.xpath("//a[@data-menu='sort-submenu-price']");
    By sortPriceLowToHigh = By.linkText("//a[text()='Price (low to high)']");
    By hotelName = By.linkText("//a[text()='Lake View Inn']");
    By hotelsLowestPrice = By.xpath("//ins[contains(text(),'$47')]");

    public String searchPageTitle() {
      return  getPageTitle();
    }

    public String textSameOnSearchPage() {
        return isTextSameOnLandingPage(inputLocation);
    }

    public void sortByPrice() {
        scrollDown(200);
        clickThis(hotelsPrice);
        clickThis(sortPriceLowToHigh);
    }

    public void printLowestPriceAndHotel() {
        String hotel = getText(hotelName);
        String lowPrice = getText(hotelsLowestPrice);

        System.out.println("Lowest priced Hotel search result " + hotel + "-" + lowPrice);
    }

    public int verifyLowestPriceIsLess() {
        String lowestHotelPrice = getText(hotelsLowestPrice);
        int lPrice = Integer.valueOf(lowestHotelPrice);
        return lPrice;
    }

}
