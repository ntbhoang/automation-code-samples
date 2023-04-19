package auto.samples.listeners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Runner {


    @BeforeSuite
    public void setUpSuite(){
        // DB Connection can be done here
        // Init the report
        // But using the @annotation like that tightly couple the test, imagine if in the future
        // We don't want to make db connection, we want to read data from json files

        System.out.println("Before suite in Runner");
    }

    @AfterSuite
    public void tearDownSuite(){
        // DB Connection can be done here
        // Init the report

        System.out.println("Before suite in Runner");
    }
}
