package TestSuites;

import ObjectModel.*;
import Utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class Scenario_01_searching_with_category {
    @Test
    public static void TC_01_search_with_category() {
        //Initialing Web Driver
        WebDriver driver = DriverManager.driver;

        //Setting maximum wait time for elements to be present
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Hitting Homepage URL and set the screen to Maximum
        driver.get(Config.baseURL);
        driver.manage().window().maximize();

        //Clicking on Searchbar and selecting search By category
        Helper.clickOnElement(HomePage.Locator.searchBar);
        Helper.clickOnElement(HomePage.Locator.searchByCategory);
        Helper.clickOnElement(CategoryPage.Locators.catBookMusicGame);
        Helper.clickOnElement(CategoryPage.Locators.catBook);
        Helper.clickOnElement(CategoryPage.Locators.catComputerIT);

        //Validating search conditions on the left sidebar are set correctly
        assertEquals(driver.findElement(By.xpath(SearchResult.Locator.mainCategory)).getText(), HomePage.Text.catMusicBookGame);
        assertEquals(driver.findElement(By.xpath(SearchResult.Locator.subCategory1)).getText(), HomePage.Text.catBook);
        assertEquals(driver.findElement(By.xpath(SearchResult.Locator.subCategory2)).getText(), HomePage.Text.catCompIT);
        WebElement checkBoxCatComputerIT = driver.findElement(By.xpath(SearchResult.Locator.subCategory3));
        checkBoxCatComputerIT.isSelected();
        driver.get(Config.baseURL);
    }
}

