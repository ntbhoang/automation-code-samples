package auto.samples.webdriver_factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class WebDriverFactory {

    public static WebDriver driver;

    public static void initDriver() {
        System.out.println(Thread.currentThread().getId() + " : " + driver);
        WebDriverManager.chromedriver().setup();
        if(Objects.isNull(driver))
            driver = new ChromeDriver();
    }

    public static void quitDriver(){
        driver.quit();
        driver = null;
    }
}
