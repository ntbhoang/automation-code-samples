package auto.samples.enums;

import java.util.Arrays;
import java.util.EnumSet;

public class EnumsDemo {

    public static void main(String[] args) {
        Arrays.asList(Severity.values()).forEach(System.out::println);

        EnumSet<Severity> enumSet = EnumSet.of(Severity.CRITICAL, Severity.HIGH);
        enumSet.forEach(System.out::println);
    }


}
