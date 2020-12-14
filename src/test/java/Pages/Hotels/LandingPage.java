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
   By editInfo = By.xpath("//button[@type='button']");
   By childQuantity = By.id("qf-0q-room-0-children");
   By childAge = By.id("qf-0q-room-0-child-0-age");
   By childAge2 =By.id("qf-0q-room-0-child-1-age");


    /**
   By checkInCalendar = By.id("qf-0q-localised-check-in");
   By checkoutCalendar = By.id("qf-0q-localised-check-out");
   By allCalendarDate = By.xpath("//td[starts-with(@data-date='2020-11')]");
   By briefcase = By.xpath("//span[@class='widget-query-num-nights']");
    **/

   public void clearSearchBox() {
       clearThis(searchBox);
   }

   public void clickEditInfo(){
       clickThis(editInfo);
   }

   public void enterInput(String input) {
        enterThis(searchBox, input);
   }

   public void enterDestination(String destination) {
       enterLocation(searchBox, destination);

       String text = "Lake George, New York, United States of America";
       List<WebElement> places = Web.getDriver().findElements(By.xpath("//div[@class='widget-autosuggest widget-autosuggest-visible widget-autosuggest-results-15"));

       for (WebElement place: places) {
           if(place.getText().equalsIgnoreCase(destination)) {
               place.click();
               break;
           }

       }
   }

   public void enterChildQuantity(String value) {
       clickThis(childQuantity);

    WebElement quantity = selectChildQuantity(childQuantity);
       Select num = new Select(quantity);
       num.selectByValue(value);
   }

   public void enterChildAge1(String value) {
       clickThis(childAge);

    WebElement age = selectChildAge(childAge);
        Select num = new Select(age);
        num.selectByValue(value);
   }

    public void enterChildAge2(String value) {
        clickThis(childAge2);

        WebElement age = selectChildAge2(childAge2);
        Select num = new Select(age);
        num.selectByValue(value);
    }

   public void clickSearch() {
        clickThis(searchButton);
   }



    /**
   public boolean isSearchButtonEnabled() {
       return Web.getDriver().findElement(searchButton).isEnabled();
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
    return Web.getDriver().findElement(briefcase).getText();
   }
     **/
}

