package Task5;

public class Main {

    public interface Animal {

        private void voice() {
            System.out.println("Emmit some sounds");
        }

        private void feed() {
            System.out.println("Hrum-hrum");
        }

    }

    public static void main(String[] args) {

        Animal[] animals = {new Cat("Vasya"), new Dog("Snoopy")};

        animals[0].voice();
        animals[0].feed();
        animals[1].voice();
        animals[1].feed();

    }

}
