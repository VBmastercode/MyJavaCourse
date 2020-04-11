public class Teacher extends Staff {

    private final String type_person = "Teacher";

    public Teacher () {}

    public String getType () {
        return this.type_person;
    }

    public void print() {
        System.out.println("I am a " + type_person);
    }

    public void salary() {
        System.out.println("Salary = " + 10000);
    }


}
