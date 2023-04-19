package auto.samples.page_factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunTests {


    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    // 1: 1837, 2:1810, 3:1949
    @Test
    public void testUsingPageFactory(){
        PageFactoryDemo pfd = new PageFactoryDemo(driver);
        pfd.find10Times();
    }

    //1: 1762, 2:1728
    @Test
    public void testUsingPageFactoryWithCache(){
        PageFactoryUsingCache pfd = new PageFactoryUsingCache(driver);
        pfd.find10Times();
    }

    //1: 1615, 2:1612
    @Test
    public void testNoPageFactory(){
        NotRecommendPageFactory nonPfd = new NotRecommendPageFactory(driver);
        nonPfd.find10Times();
    }

}
