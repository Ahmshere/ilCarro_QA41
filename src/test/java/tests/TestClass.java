package tests;

import config.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class TestClass extends BaseTest {

    @Test
    public void test002Branch() throws InterruptedException {
       HomePage hp = new HomePage(getDriver());
       LogInPage logInPage = hp.openTopMenu(TopMenuItem.LOGIN);
       logInPage.tryToFindAnElement();
       LetTheCarWorkPage lcwp = logInPage.openTopMenu(TopMenuItem.LET_THE_CAR_WORK);
       lcwp.setManufacturer("BMW").addLocation("Montana")
               .setFuelType().photoAttachment("C:\\Pictures\\BlueCar.jpg");
       Thread.sleep(3000);
    }
    // my string
    @Test
    public void findYourCarBranch22() throws InterruptedException {
        HomePage hp = new HomePage(getDriver());
        SearchPage searchPage = hp.openTopMenu(TopMenuItem.SEARCH);
        searchPage.addCity("Moscow").addDates(5);
        Thread.sleep(3000);
    }
}
