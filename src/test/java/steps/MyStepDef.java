package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyStepDef {
    public static WebDriver driver;
    public static MainPage mainPage = new MainPage();

    @When("open onliner.by")
    public void openWebSite() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.onliner.by/");
    }

    @And("hover over the item Autobaraholcka market")
    public void hoverOverTheItemAuto() {
        mainPage.hoverOverTheItemAuto(driver);
    }

    @And("hover over the item Houses and Flats market")
    public void hoverOverTheItemHouses() {
        mainPage.hoverOverTheItemHouses(driver);
    }

    @Then("a submenu appears")
    public void findSubmenuWithCategories(List<String> args) {

        for (String s : args) {
            Assertions.assertTrue(mainPage.submenuWithCategories(driver).contains(s));
        }
        driver.quit();
    }
}

