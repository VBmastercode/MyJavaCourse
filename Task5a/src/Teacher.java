public class Teacher extends Staff {

    private final String type_person = "Teacher";

    public Teacher (String name) {
        super(name);
    }

    public void print() {
        System.out.println("I am a " + type_person + " " + name);
    }

    public void salary() {
        System.out.println("Salary = " + 10000);
    }


}
