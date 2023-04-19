package auto.samples.pages.inventory_page;

import auto.samples.webdriver_factory.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryWebElements {

    public WebElement inventoryItemsList = WebDriverFactory.driver.findElement(By.cssSelector(".inventory_list"));
}
