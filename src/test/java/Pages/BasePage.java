package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    //Custom methods, just incase if in future any of Selenium methods will change
    //Benefit of this BasePage I dont have to change each lines/location of code

    public void scrollDown(int y) {
        //if input needs to be converted to String --> String intTOString = String.valueOf(y)
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scroll(0," +y+");");
    }

    //public WebElement fluentDriver(By locator){}
        // fluentDriver().click();


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

    public String getPageTitle() {
        return  Web.getDriver().getTitle();
    }

    public String getText(By locator) {
        return Web.getDriver().findElement(locator).getText();
    }

    public String isTextSameOnLandingPage(By locator) {
        return Web.getDriver().findElement(locator).getText();
    }

    public void selectByVisibleText(By locator, String text){
        Select select = new Select(Web.getDriver().findElement(locator));
        select.selectByVisibleText(text);
    }




}



