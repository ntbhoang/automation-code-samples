package auto.samples;

import auto.samples.webdriver_factory.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Objects;

public class BaseTest {

    public WebDriver driver;

    protected BaseTest(){
        this.driver = WebDriverFactory.driver;
    }

    @BeforeTest
    public void setUp(){
        WebDriverFactory.initDriver();
        //initWindow();
    }

    @AfterTest
    public void tearDown(){
        WebDriverFactory.quitDriver();
    }

    //private void initWindow(){
        //WebDriverFactory.getDriver().manage().window().maximize();
        //WebDriverFactory.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        //.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    //}
}
