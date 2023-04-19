package auto.samples;

import org.testng.annotations.*;

public class sampleTest {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BEFORE SUITE");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AFTER SUITE");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLASS");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AFTER CLASS");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BEFORE METHOD");
    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("AFTER METHOD");
    }


    @Test
    public void test1(){
        System.out.println("Running test 1");
    }

    @Test
    public void test2(){
        System.out.println("Running test 2");
    }

    @Test
    public void test3(){
        System.out.println("Running test 3");
    }
}
