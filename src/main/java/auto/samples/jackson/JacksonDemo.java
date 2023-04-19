package auto.samples.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;

public class JacksonDemo {

    public static void main(String[] args) throws IOException {
        var objectMapper = new ObjectMapper();
        TypeReference<Map<String, Object>> ref = new TypeReference<>(){};
        Map<String, Object> employeeInformation = objectMapper.readValue(
                new File(
                        "/Users/hoangntb/IdeaProjects/automation-code-samples/src/main/java/auto/samples/jackson/employee.json"), ref);

        System.out.println(employeeInformation.get("id"));
        System.out.println(employeeInformation.get("name"));
        System.out.println(employeeInformation.get("address"));

    }
}
