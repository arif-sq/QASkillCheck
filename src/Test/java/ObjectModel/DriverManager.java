package ObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class DriverManager {

    static {
        System.setProperty("webdriver.gecko.driver", "src/TestDriver/geckodriver");
    }

    public static WebDriver driver = new FirefoxDriver();
}
