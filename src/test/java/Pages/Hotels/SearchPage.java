package Pages.Hotels;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {

    By inputLocation = By.xpath("//input[@data-current-location='Current location']");
    By price = By.xpath("//a[@data-menu='sort-submenu-price']");
    By lowToHigh = By.linkText("//a[text()='Price (low to high)']");
    By hotelName = By.linkText("//a[text()='Lake View Inn']");
    By lowestPrice = By.xpath("//ins[contains(text(),'$47')]");

    public String searchPageTitle() {
      return  getSearchPageTitle();
    }

    public String textSameOnSearchPage() {
        return isTextSameOnLandingPage(inputLocation);
    }

    public void sortByPrice() {
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scrollBy(0,200);");
        clickThis(price);
        clickThis(lowToHigh);
        sortByLowToHighPrice(lowToHigh);

    }

    public void printLowestPriceAndHotel() {
        WebElement hotel = Web.getDriver().findElement(hotelName);
        WebElement lowPrice =Web.getDriver().findElement(lowestPrice);
        System.out.println("Lowest priced Hotel search result " + hotel + "-" + lowPrice);
    }

    public int verifyLowestPriceIsLess() {
       WebElement lowPrice = verifyTheLowestPrice(lowestPrice);
       String price = lowPrice.getText();
       int lPrice = Integer.valueOf(price);
       return lPrice;
    }

}
