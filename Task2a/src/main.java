package task2a;

public class main {

    public static void main (String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input ("Oleg", "Romanov", 1994);
        person2.input ("Anna", "Ignatova", 1985);
        person3.input ("Maxim", "Rudenko", 1990);
        person4.input ("Kirill", "Orekhov", 1988);
        person5.input ("Nina", "Mikhaylova", 1996);

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();

    }
}