package TestSuites;

import ObjectModel.DriverManager;
import ObjectModel.HomePage;
import ObjectModel.SearchResult;
import Utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Scenario_02_searching_with_browsing_history extends Helper {
    @Test
    public void TC_02_search_with_category_history() throws InterruptedException {
        //Initialing Web Driver
        WebDriver driver = DriverManager.driver;
        //Setting maximum wait time for elements to be present
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Setting Pre-Requisites
        scenario_2_prerequsite();

        //Searching with Keyword "Javascript"
        driver.findElement(By.xpath(HomePage.Locator.searchBar)).click();
        driver.findElement(By.xpath(HomePage.Locator.searchBar)).sendKeys("javascript");
        clickOnElement(SearchResult.Locator.searchWithJavaScipt);

        //Validating search conditions on the left sidebar are set correctly
        assertEquals(driver.findElement(By.xpath(SearchResult.Locator.mainCategory)).getText(), HomePage.Text.catMusicBookGame);
        assertEquals(driver.findElement(By.xpath(SearchResult.Locator.subCategory1)).getText(), HomePage.Text.catBook);
        assertEquals(driver.findElement(By.xpath(SearchResult.Locator.subCategory2)).getText(), HomePage.Text.catCompIT);
        WebElement checkbox = driver.findElement(By.xpath(SearchResult.Locator.subCategory3));
        checkbox.isSelected();

        //Verifying the latest browsing history is showing correctly
        driver.navigate().refresh();
        driver.findElement(By.xpath(HomePage.Locator.searchBar)).clear();
        driver.findElement(By.xpath(HomePage.Locator.searchBar)).click();
        assertEquals(driver.findElement(By.xpath(SearchResult.Locator.historyJavaScipt)).getText(), SearchResult.Text.historyJavascript);
        assertEquals(driver.findElement(By.xpath(SearchResult.Locator.historyComputerIT)).getText(), SearchResult.Text.historyComputerIT);
        assertEquals(driver.findElement(By.xpath(SearchResult.Locator.historySmartPhoneBody)).getText(), SearchResult.Text.historySmartPhoneBody);
    }
}
