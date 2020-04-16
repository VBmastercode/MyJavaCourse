public class Cleaner extends Staff {

    private final String type_person = "Cleaner";

    public Cleaner (String name) {
        this.name = name;
    }

    public String getType () {
        return this.type_person;
    }

    public void print() {
        System.out.println("I am a " + type_person + " " + name);
    }

    public void salary() {
        System.out.println("Salary = " + 5000);
    }

}
