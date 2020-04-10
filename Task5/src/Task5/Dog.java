package Task5;

public class Dog implements Main.Animal {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
