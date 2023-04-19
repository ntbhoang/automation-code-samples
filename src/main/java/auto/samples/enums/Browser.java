package auto.samples.enums;

public enum Browser {

    CHROME("chrome"),
    FIREFOX("firefox");

    private String browserString;

    Browser(String value) {
        browserString = value;
    }

    public String getBrowserString(){
        return browserString;
    }
}
