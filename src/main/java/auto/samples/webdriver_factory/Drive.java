package auto.samples.webdriver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Drive {
    public static WebDriver driver;

    public static void initDriver(){
        if(Objects.isNull(driver)){
            driver = new ChromeDriver();
            DriverThreadLocal.set(driver);
            driver.get("https://google.com");
        }
    }

    public static void quitDriver(){
        if(Objects.nonNull(driver)){
            driver.quit();
            driver = null;
        }
    }
}
