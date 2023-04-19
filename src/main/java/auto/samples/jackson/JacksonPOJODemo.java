package auto.samples.jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JacksonPOJODemo {

    public static void main(String[] args) throws IOException {

        TestCasesPOJO tests = new TestCasesPOJO();

        TestCase test1 = new TestCase();
        test1.setTestMethod("test1");
        test1.setBrowser("chrome");

        TestCase test2 = new TestCase();
        test2.setTestMethod("test2");
        test2.setBrowser("chrome");

        TestCase test3 = new TestCase();
        test3.setTestMethod("test3");
        test3.setBrowser("firefox");

        List<TestCase> testList = new ArrayList<>();
        testList.add(test1);
        testList.add(test2);
        testList.add(test3);

        tests.setTests(testList);

        String jsonPath =
                "/Users/hoangntb/IdeaProjects/automation-code-samples/src/main/java/auto/samples/jackson/tests.json";
        File jsonFile =  new File(jsonPath);

        var objectMapper = new ObjectMapper();
        objectMapper.writeValue(jsonFile, tests);

        String jsonString = objectMapper.writeValueAsString(tests);
        System.out.println(jsonString);

        // Java objects to JSON string - pretty-print
        String jsonInString2 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(tests);

        System.out.println(jsonInString2);


    }
}
