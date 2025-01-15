package enumdemo;

public enum Day {
    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    // custom constructor in enum class :
    private Day(String lower){
        this.lower=lower;
    }

    // making fields in enum class :
    private String lower;

    public String getLower() {
        return lower;
    }

    // a custom method in enum class :
    public void display() {
        System.out.println("Today is "+this.name());
    }
}
