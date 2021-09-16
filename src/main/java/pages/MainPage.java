package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class MainPage {

    private static final  By AUTOS = By
            .xpath("//span[@class=\"b-main-navigation__text\" and contains(text(),'Автобарахолка')]");
    private static final  By HOMESANDFLATS = By
            .xpath("//span[@class=\"b-main-navigation__text\" and contains(text(),'Дома и квартиры')]");
    private static final  By SUBMENU = By
            .xpath("//span[@class=\"b-main-navigation__dropdown-advert-sign\"]");


    public void hoverOverTheItemAuto(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(AUTOS));
        action.perform();
    }

    public void hoverOverTheItemHouses(WebDriver driver) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(HOMESANDFLATS));
        action.perform();
    }

    public List<String> submenuWithCategories(WebDriver driver) {
        List<WebElement> elements = driver.findElements(SUBMENU);
        List<String> elem = new ArrayList<>();

        for (WebElement element : elements) {
            elem.add(element.getText());
        }
        return elem;
    }
}
