package auto.samples.e2e;

import auto.samples.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;


/**
 * Set the class to final because we don't want other classes inherit from it
 *
 * @author max.nguyen
 * Jan 2022
 */
public final class SearchGoogleTests extends BaseTest {

    ExtentReports extent;
    ExtentSparkReporter reporterType;
    ExtentTest test;

    @BeforeTest
    public void preparation(){
        extent = new ExtentReports();
        reporterType = new ExtentSparkReporter("extent-reports/extent-report.html");
        extent.attachReporter(reporterType);
    }

    @AfterTest
    public void cleanUp() throws IOException {
        extent.flush();
        Desktop.getDesktop().browse(new File("extent-reports/extent-report.html").toURI());
    }

    @Test
    public void test1(Method method){
        test = extent.createTest(method.getName());
        test.pass("Search with keyword `Test Automation` test is passed");

    }

    @Test
    public void test2(Method method){
        test = extent.createTest(method.getName());
        test.pass("Search with keyword `Selenium` test is passed");

        Assert.assertTrue(false);
    }

    @Test
    public void test3(Method method){
        test = extent.createTest(method.getName());
        test.fail("Search with keyword `Playwright` test is failed");

        Assert.assertTrue(false);
    }
}
