package auto.samples.enums;

public class GetEnumKeyFromValue {


    public static void main(String[] args) {
        Browser browser = Browser.valueOf("FIREFOX");
        System.out.println(Browser.valueOf("FIREFOX"));
        System.out.println(Browser.FIREFOX.getBrowserString());
    }

}
