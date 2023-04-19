package auto.samples.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonToJavaObj {

    public static void main(String[] args) throws IOException {
        String jsonPath =
                "/Users/hoangntb/IdeaProjects/automation-code-samples/src/main/java/auto/samples/jackson/tests.json";
        File jsonFile =  new File(jsonPath);
        var objectMapper = new ObjectMapper();

        // JSON file to Java object
        TestCasesPOJO tests = objectMapper.readValue(jsonFile, TestCasesPOJO.class);

        List<TestCase> testCaseList = tests.getTests();
        for (TestCase testCase : testCaseList){
            System.out.println(testCase.getTestMethod());
            System.out.println(testCase.getBrowser());
        }

    }
}
