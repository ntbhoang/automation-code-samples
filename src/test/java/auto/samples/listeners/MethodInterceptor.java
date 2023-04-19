package auto.samples.listeners;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodInterceptor implements IMethodInterceptor {
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext iTestContext) {
        // List contains all the tests the going to execute
        List<IMethodInstance> results = new ArrayList<>();

        // But suppose we have 1000 test cases, we dont want to read from index
        // results.add(methods.get(0));
        Map<String, String> test_01 = new HashMap<>();
        test_01.put("name", "test1");
        test_01.put("count", "3");

        Map<String, String> test_02 = new HashMap<>();
        test_02.put("name", "test2");
        test_02.put("count", "3");

        List<Map<String, String>> tests = new ArrayList<>();
        tests.add(test_01);
        tests.add(test_02);

        for(int i=0; i < methods.size(); i++){
            for (int j=0; j < tests.size(); j++){
                boolean isNameMatched = methods.get(i).getMethod().getMethodName()
                        .equalsIgnoreCase(tests.get(j).get("name"));
                if (isNameMatched){{
                    methods.get(i).getMethod().setInvocationCount(Integer.parseInt(tests.get(j).get("count")));
                    results.add(methods.get(i));
                }}
            }
        }

        return results;
    }
}
