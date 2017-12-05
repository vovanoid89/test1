package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;

public class WebDriverFactory {

    static {
        try {
//          System.setProperty("webdriver.ie.driver", WebDriverFactory.class.getClassLoader().getResource("iedriver.exe").getPath());
//
            System.setProperty("webdriver.chrome.driver", WebDriverFactory.class.getClassLoader().getResource("drivers/windows/chromedriver.exe").getPath());
//            System.setProperty("webdriver.chrome.driver", WebDriverFactory.class.getClassLoader().getResource("drivers/mac/chromedriver").getPath());


        } catch (Exception e) {

            System.out.println("Cannot launch FireFox or Chrome driver \n" + e.getMessage());
        }
    }

    public static WebDriver getWebDriver(BrowserTypes browserType) throws IOException {


        switch (browserType) {

            case FIRE_FOX:
                return new FirefoxDriver();

            case CHROME:
                return new ChromeDriver();

            case IE:
                return new InternetExplorerDriver();

            default:
                throw new IllegalArgumentException("Browser is not supported" + browserType);

        }
    }

}
