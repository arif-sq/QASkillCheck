package ObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    public class Text {
        public static final String catMusicBookGame = "本・音楽・ゲーム";
        public static final String catBook = "本";
        public static final String catCompIT = "コンピュータ/IT";
    }

    public class Locator {
        public static final String searchBar = "//*[@id=\"__next\"]/div/header/div/div/div[3]/mer-autocomplete/div[1]/form/input";
        public static final String searchByCategory = "//*[@id=\"__next\"]/div/header/div/div/div[3]/mer-autocomplete/div[2]/div[1]/div[1]/div[2]/a";
    }
}

