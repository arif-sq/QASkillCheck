package Utils;

import ObjectModel.CategoryPage;
import ObjectModel.Config;
import ObjectModel.DriverManager;
import ObjectModel.HomePage;
import TestSuites.Scenario_01_searching_with_category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Helper extends Scenario_01_searching_with_category {

    public static WebDriver driver = DriverManager.driver;

    public static void validatePageTitle(String pageTitle) {
        Assert.assertEquals(driver.getTitle(), pageTitle);
    }

    public static void clickOnElement(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
    }

    public static void scenario_2_prerequsite() throws InterruptedException{
        //Adding one more search category for generating history
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().to(Config.baseURL);
        driver.navigate().refresh();
        clickOnElement(HomePage.Locator.searchBar);
        clickOnElement(HomePage.Locator.searchByCategory);
        clickOnElement(CategoryPage.Locators.catHomeSmartPhoneCamera);
        clickOnElement(CategoryPage.Locators.catSmartPhone);
        clickOnElement(CategoryPage.Locators.catSmartPhoneBody);

        //Running Scenario 1 as Pre-Requisite
        Scenario_01_searching_with_category.TC_01_search_with_category();
        Thread.sleep(2000);
        driver.navigate().refresh();
    }
}



