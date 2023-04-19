package auto.samples.page_factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicElements {

    private WebDriver driver;


    private String menuItems = "//div[text()='%value%']/parent::a";

    public void selectMenuItem(String value){
        this.driver.findElement(By.xpath(menuItems.replace("%value%", value)));
    }

    public DynamicElements(WebDriver diver){
        this.driver = diver;
    }


}
