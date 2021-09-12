package steps;

import pages.MainPage;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.То;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyStepDef {
    public static WebDriver driver;
    public static MainPage mainPage = new MainPage();

    @Если("open onliner.by")
    public void openWebSite() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.onliner.by/");
    }

    @Если("hover over the item Autobaraholcka market")
    public void hoverOverTheItemAuto() {
        mainPage.hoverOverTheItemAuto(driver);
    }

    @Если("hover over the item Houses and Flats market")
    public void hoverOverTheItemHouses() {
        mainPage.hoverOverTheItemHouses(driver);
    }

    @То("a submenu appears")
    public void findSubmenuWithCategories(List<String> args) {

        for (String s : args) {
            Assertions.assertTrue(mainPage.submenuWithCategories(driver).contains(s));
        }
        driver.quit();
    }
}

