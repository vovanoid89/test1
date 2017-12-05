package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Log4Test;

/**
 * Created by Walker on 7/26/14.
 */
public class SearchPage extends GeneralPage {


    protected By searchProductLink =

            By.xpath("//*[@class='g-i-list-title']/a[@href='http://rozetka.com.ua/samsung_galaxy_s5_black/p527125/']");

    protected WebElement searchLinkElem;

    public String verifyProductLink() {

        Log4Test.info("Verify product link");

        searchLinkElem = elementIsLocated(searchProductLink);

        return searchLinkElem.getText();

    }

    public void openProductLink() {

        Log4Test.info("Open product characteristics");

        searchLinkElem.click();
    }
}
