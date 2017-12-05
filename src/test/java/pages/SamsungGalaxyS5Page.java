package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Log4Test;


public class SamsungGalaxyS5Page extends GeneralPage {

    protected By productDescription = By.className("pp-description");

    protected WebElement productContent;

    public WebElement verifyProductContent() {

        Log4Test.info("Verify product content");

        return productContent = elementIsLocated(productDescription);

    }
}
