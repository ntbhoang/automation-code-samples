package auto.samples.webdriver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class DriverThreadLocal {
    public static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static void set(WebDriver driver){
        driverThreadLocal.set(driver);
    }

    public static WebDriver get(){
        return driverThreadLocal.get();
    }

    public static void remove(){
        driverThreadLocal.remove();
    }
}
