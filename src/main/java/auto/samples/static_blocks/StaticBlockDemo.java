package auto.samples.static_blocks;

import java.util.HashMap;
import java.util.Map;

public class StaticBlockDemo {

    private static String str = "Hello, Max!";
    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("PMP", "80");
        map.put("AWS", "90");
        map.put("Python", "92");
    }

    public static void main(String[] args) {
        System.out.println(str);
        System.out.println(map);
    }
}
