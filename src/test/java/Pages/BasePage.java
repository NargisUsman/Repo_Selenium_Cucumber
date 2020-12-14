package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    //Custom methods, just incase if in future any of Selenium methods will change
    //Benefit of this BasePage I dont have to change each lines/location of code

    public void clearThis(By locator) {
        Web.getDriver().findElement(locator).clear();
    }

    public void clickThis(By locator) {
        Web.getDriver().findElement(locator).click();
    }

    public void enterThis(By locator, String text) {
        Web.getDriver().findElement(locator).sendKeys(text);
    }

    public void enterLocation(By locator, String location) {
        Web.getDriver().findElement(locator).sendKeys(location);
    }

    public String getSearchPageTitle() {
        return  Web.getDriver().getTitle();
    }

    public String isTextSameOnLandingPage(By locator) {
        return Web.getDriver().findElement(locator).getText();
    }

    public WebElement selectChildQuantity(By locator) {
     return Web.getDriver().findElement(locator);
    }

    public WebElement selectChildAge(By locator) {
        return Web.getDriver().findElement(locator);
    }

    public WebElement selectChildAge2(By locator) {
        return Web.getDriver().findElement(locator);
    }

    public void sortByLowToHighPrice(By locator) {
        Web.getDriver().findElement(locator);
    }

    public WebElement verifyTheLowestPrice(By locator) {
       return Web.getDriver().findElement(locator);

    }


}



