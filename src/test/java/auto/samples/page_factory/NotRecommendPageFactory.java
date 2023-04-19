package auto.samples.page_factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotRecommendPageFactory {

    private WebDriver driver;


    private WebElement searchTextBox;

    public NotRecommendPageFactory(WebDriver diver){
        this.driver = diver;
        this.searchTextBox = driver.findElement(By.name("q"));
    }

    public void find10Times(){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 11; i++){
            this.searchTextBox.clear();
            this.searchTextBox.sendKeys("Testing Best Practices");
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
