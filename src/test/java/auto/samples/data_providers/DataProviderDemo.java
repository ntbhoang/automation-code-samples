package auto.samples.data_providers;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {


    public void test1(){
        String[] names = {"Max", "Rita", "Phong", "Hung"};
        for(var i = 0; i < names.length; i++){
            System.out.println("Enter userName: " + names[i]);
            Assert.assertTrue(false);
        }

    }


    @Test(dataProvider = "employeeData")
    public void testDataProvider(Employee employee){
        System.out.println(employee.getFullName() + "\n");
        System.out.println(employee.getAge() + "\n");
        System.out.println(employee.getOccupation() + "\n");
    }

    @DataProvider(name = "getData")
    public String[] getData(){
        String[] names = {"Max", "Rita", "Phong", "Hung"};
        return names;
    }


    @DataProvider(name = "Pizza")
    public Object[][] pizza(){
       return new Object[][] {
               {"Large"},
               {"Medium"},
               {"Small"}
       };
    }
    // 1st dimension is how many iterations
    // 2nd dimension is how many params to feed to your test

    @DataProvider(name = "employeeData")
    public Employee[] employeeData(){
        return new Employee[] {
                new Employee("max.nguyen", 38, "QA Manager"),
                new Employee("rita.hoang", 39, "Office Manager")
        };
    }
}
