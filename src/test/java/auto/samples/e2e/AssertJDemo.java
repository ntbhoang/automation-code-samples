package auto.samples.e2e;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.BDDAssertions;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.data.Offset;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AssertJDemo {


    @Test
    public void  testAssertString(){
        String str = "Hello World";

        Assertions.assertThat(str)
                .isNotNull()
                .isNotEmpty()
                .isNotBlank()
                .isEqualTo("Hello World")
                .contains("Hello")
                .doesNotContain("Hi")
                .containsIgnoringCase("world")
                .matches("\\w.*"+"World")
                .doesNotContainPattern("\\d.*")
                .hasSize(11)
                .endsWith("World");
    }

    @Test
    public void testNumber(){
        int number = 11;

        Assertions.assertThat(number)
                .isEqualTo(11)
                .isCloseTo(12, Offset.offset(4))
                .isInstanceOf(Integer.class)
                .isPositive()
                .isEven();
    }


    @Test
    public void testList(){
        List<String> stringList = Arrays.asList("Testing", "Max", "QA");

        Assertions.assertThat(stringList)
                .hasSize(3)
                .hasAtLeastOneElementOfType(String.class)
                .doesNotContain("Automation")
                .withFailMessage(() -> "String not having size less than 3").allMatch(s -> s.length() < 3);
    }

    @Test
    public void testSoftAssert(){
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat("Hello Max")
                .isNotEmpty()
                .hasSize(4)
                .contains("Rita");
    }


    @Test
    public void testBDDAssertions(){
        BDDAssertions.assertThat("Hello Max");
    }
}
