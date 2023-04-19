package auto.samples.jackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.ArrayList;
import java.util.List;

public final class TestCasesPOJO {

    private List<TestCase> tests = new ArrayList<>();

    TestCasesPOJO(){}

    @JsonAnyGetter
    public List<TestCase> getTests() {
        return tests;
    }

    public void setTests(List<TestCase> tests) {
        this.tests = tests;
    }
}
