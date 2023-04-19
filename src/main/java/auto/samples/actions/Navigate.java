package auto.samples.actions;

import org.openqa.selenium.WebDriver;

public class Navigate {

    private static WebDriver driver;

    private Navigate(WebDriver driver){
        this.driver = driver;
    }

    public static void to(String url){
        driver.get(url);
    }
}
