package auto.samples.json;

import auto.samples.jackson.TestCase;
import auto.samples.jackson.TestCasesPOJO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonTestDemo {

    WebDriver driver;

    public void setUp(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get("https");
    }

    public void tearDown(){
        driver.quit();
    }

    @Test(dataProvider = "jsonData")
    public void test1(TestCasesPOJO data){
       for(TestCase test : data.getTests()){
           System.out.println(test.getTestMethod());
           System.out.println(test.getBrowser());
       }

    }

    @Test
    public void test2(){

    }

    @Test
    public void test3(){

    }


    @DataProvider(name = "jsonData")
    public Object[][] jsonData() throws IOException {
        String jsonPath =
                "/Users/hoangntb/IdeaProjects/automation-code-samples/src/main/java/auto/samples/jackson/tests.json";
        File jsonFile =  new File(jsonPath);

        TestCasesPOJO tc = new ObjectMapper().readValue(jsonFile, TestCasesPOJO.class);
        List<TestCase> tcList = tc.getTests();

        Object[][] data = new Object[tcList.size()][tcList.size()];

        for (var i = 0; i < tcList.size(); i++)
            for (var j = 0; j < tcList.size(); j++){
                data[i][j] = tcList.get(i);
            }

        return new Object[][] {
                {"test1", "chrome"},
                {"test2", "chrome"},
                {"test3", "chrome"},

        };

    }
}

// 1st dimension: how many times you run your test
// 2nd dimension: how many params you pass to the test
