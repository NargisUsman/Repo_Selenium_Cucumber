package DriverWrapper;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Web {

    /**
     * Any Driver related actions will be inside the Web package
     */

    private static WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "./DriverExe.chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.hotels.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * Example of if requirements states to test on more than one browser
     * switch(browser)
     *    case "chrome"
     *          driver=new ChromeDriver();
     *    case "firefox"
     *          driver= new Firefox();
     */

    @After
    public void quitDriver() {
        driver.quit();
    }

    public static WebDriver getDriver() { // this static so I can use the getDriver method in any class in this project
        return driver;
    }
}
