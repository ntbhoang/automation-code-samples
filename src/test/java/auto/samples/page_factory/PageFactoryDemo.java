package auto.samples.page_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryDemo {

    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement searchTextBox;

    public PageFactoryDemo(WebDriver diver){
        this.driver = diver;
        PageFactory.initElements(driver, this);
    }


    public void find10Times(){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 11; i++){
            searchTextBox.clear();
            searchTextBox.sendKeys("Testing Best Practices");
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
