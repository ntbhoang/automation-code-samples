package auto.samples.data_providers;

public final class Employee {

    private String fullName;
    private int age;
    private String occupation;

    public Employee(String fullName, int age, String occupation){
        this.fullName = fullName;
        this.age = age;
        this.occupation = occupation;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }
}
