package auto.samples.data_providers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public final class DataProviderToMultipleTests {


    @Test(dataProvider = "employeeData")
    public void test1(Employee employee){
        System.out.println("Inside test1: " + employee.getFullName());
        System.out.println("Inside test1: " + employee.getAge());
        System.out.println("Inside test1: " + employee.getOccupation());
    }

    @Test(dataProvider = "employeeData")
    public void test2(Employee employee){
        System.out.println("Inside test2: " + employee.getFullName());
        System.out.println("Inside test2: " + employee.getAge());
        System.out.println("Inside test2: " + employee.getOccupation());
    }



    @DataProvider(name = "employeeData")
    public Employee[] employeeData(Method m){
        if (m.getName() == "test1"){
            return new Employee[] {
                    new Employee("max.nguyen", 38, "QA Manager"),
                    new Employee("rita.hoang", 39, "Office Manager")
            };
        } else if (m.getName() == "test2") {
            return new Employee[] {
                    new Employee("hung.nguyen", 10, "Freelancer"),
                    new Employee("phong.hoang", 2, "Not Yet")
            };
        }
        return new Employee[] {};
    }
}
