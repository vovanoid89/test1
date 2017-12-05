package ui_tests;

import core.TestBase;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SamsungGalaxyS5Page;
import pages.SearchPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmartphoneSearchTest extends TestBase {

    HomePage page = new HomePage();

    SamsungGalaxyS5Page samsungGalaxyS5Page = new SamsungGalaxyS5Page();

    SearchPage searchPage = new SearchPage();

    @Test
    public void setUpPreconditions() {

        page.open();

        assertTrue(page.isOpened());

    }


    @Test(dependsOnMethods = {"setUpPreconditions"})

    public void searchSmartphoneAndVerifyCharacteristics() {

        page.searchProduct(TestData.SAMSUNG_G900H_GALAXY_S5);

        assertEquals(searchPage.verifyProductLink(), TestData.SAMSUNG_G900H_GALAXY_S5);

        searchPage.openProductLink();

        assertTrue(samsungGalaxyS5Page.verifyProductContent().getText().contains(TestData.SAMSUNG_PROCESSOR));

    }

}
