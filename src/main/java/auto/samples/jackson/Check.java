package auto.samples.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.builder.ToStringExclude;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Check {


    public static void main(String[] args) throws IOException {
        String jsonPath =
                "/Users/hoangntb/IdeaProjects/automation-code-samples/src/main/java/auto/samples/jackson/tests.json";
        File jsonFile =  new File(jsonPath);
        var objectMapper = new ObjectMapper();
        TestCasesPOJO tests = objectMapper.readValue(jsonFile, TestCasesPOJO.class);

        List<TestCase> testCaseList = tests.getTests();
        Object[][] params = new Object[testCaseList.size()][];





    }

}
