package ObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResult {
    public static class Text {
        public static final String historyJavascript = "javascript, コンピュータ/IT";
        public static final String historyComputerIT = "コンピュータ/IT";
        public static final String historySmartPhoneBody = "スマートフォン本体";
    }

    public static class Locator {
        public static final String mainCategory = "//*[@id=\"accordion_content\"]/div/div[1]/div/div[1]/select/option[6]";
        public static final String subCategory1 = "//*[@id=\"accordion_content\"]/div/div[2]/div/div[1]/select/option[2]";
        public static final String subCategory2 = "//*[@id=\"accordion_content\"]/div/div[3]/div/label[8]/div/div/span";
        public static final String subCategory3 = "//*[@id=\"accordion_content\"]/div/div[3]/div/label[8]/mer-checkbox/input";
        public static final String searchWithJavaScipt = "/html/body/div[1]/div/header/div/div/div[3]/mer-autocomplete/div[2]/div/div/div[2]/a/div/p[2]";
        public static final String historyJavaScipt = "/html/body/div[1]/div/header/div/div/div[3]/mer-autocomplete/div[2]/section/div[2]/div[1]/div[2]/a/p";
        public static final String historyComputerIT = "/html/body/div[1]/div/header/div/div/div[3]/mer-autocomplete/div[2]/section/div[2]/div[2]/div[2]/a/p";
        public static final String historySmartPhoneBody = "/html/body/div[1]/div/header/div/div/div[3]/mer-autocomplete/div[2]/section/div[2]/div[3]/div[2]/a/p";
    }
}
