package Pages.Hotels;


import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LandingPage extends BasePage {

    /**
     * All the methods/codes related to webPage will be in this class
     * For every webPage will be creating 1 Java class
     * Locators
     * Methods that will interact with the WebElement(searchButton)
     */

   By searchButton = By.xpath("//button[@type='submit']");
   By searchBox = By.id("qf-0q-destination");
   By editReservationInfo = By.xpath("//button[@type='button']");
   By childQuantityDropDown = By.id("qf-0q-room-0-children");
   By childAgeDropDown = By.id("qf-0q-room-0-child-0-age");
   By childAge2DropDown =By.id("qf-0q-room-0-child-1-age");
   By destinationAutosuggest = By.xpath("//div[@class='widget-autosuggest widget-autosuggest-visible widget-autosuggest-results-15");



    /**
   By checkInCalendar = By.id("qf-0q-localised-check-in");
   By checkoutCalendar = By.id("qf-0q-localised-check-out");
   By allCalendarDate = By.xpath("//td[starts-with(@data-date='2020-11')]");
   By briefcase = By.xpath("//span[@class='widget-query-num-nights']");
    **/

   //public void clearSearchBox() { clearThis(searchBox); }

   public void clickEditReservationInfo(){
       clickThis(editReservationInfo);
   }

   public void enterInput(String input) {
       clickThis(searchBox);
       clearThis(searchBox);
       enterThis(searchBox, input);
   }

   public void enterDestination(String destination) {

       List<WebElement> places = Web.getDriver().findElements(destinationAutosuggest);

       for (WebElement place: places) {
           if(place.getText().equalsIgnoreCase(destination)) {
               place.click();
               break;
           }

       }
   }

   public void enterChildQuantity(String value) {
       selectByVisibleText(childQuantityDropDown, value);
   }

   public void enterChildAge1(String value) {
       selectByVisibleText(childAgeDropDown, value);
   }

    public void enterChildAge2(String value) {
        selectByVisibleText(childAge2DropDown, value);
    }

   public void clickSearch() {
        clickThis(searchButton);
   }



    /**
   public boolean isSearchButtonEnabled() {
       return Web.getDriver().findElement(searchButton).isEnabled();
     or create a genetic method for isEnabled(); and than use it like --> isEnabled(searchButton);
   }

   public void selectCheckInDate(String checkInDate) {
       clickThis(checkInCalendar);
       List<WebElement> dates = Web.getDriver().findElements(allCalendarDate);
       for(WebElement date: dates) {
           if(date.getText().equalsIgnoreCase(checkInDate)) {
               date.click();
               break;
           }
       }

   }

   public void selectCheckOutDate(String checkOutDate) {
       clickThis(checkoutCalendar);
       List<WebElement> dates = Web.getDriver().findElements(allCalendarDate);
       for(WebElement date: dates) {
           if(date.getText().equalsIgnoreCase(checkOutDate)) {
               date.click();
               break;
           }
       }
   }

   public String getBriefcaseText() {
       return getText(locator);
   }
     **/
}

