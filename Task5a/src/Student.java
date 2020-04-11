public class Student extends Person {

    private final String type_person = "Student";

    public Student () {}

    public String getType () {
        return this.type_person;
    }

    public void print() {
        System.out.println("I am a " + type_person);
    }

    public void salary() {
        System.out.println("Nope");
    }
}
