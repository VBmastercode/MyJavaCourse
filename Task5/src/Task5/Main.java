package Task5;

public class Main {

    public interface Animal  {

        String name = "default";

        default void voice(String name) {
            System.out.println(name + " Emmit some sounds");
        }

        default void feed(String name) {
            System.out.println(name +" Hrum-hrum");
        }

        default String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {

        Animal[] animals = {new Cat("Vasya"), new Dog("Snoopy")};

        animals[0].voice(animals[0].getName());
        animals[0].feed(animals[0].getName());
        animals[1].voice(animals[1].getName());
        animals[1].feed(animals[1].getName());

    }

}
