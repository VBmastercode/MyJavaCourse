package task2a;

import java.util.Calendar;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear, Age;

    public Person () {}

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void input (String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void output () {
        System.out.println (lastName + " " + firstName + " " + "Birth:" + birthYear + " Age= " + getAge ());
    }

    public void changeName (String fN, String lN) {
        this.firstName = fN;
        this.lastName = lN;
    }

    public int getAge () {
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        this.Age = yearNow - birthYear;
        return Age;
    }


}