public class Main {

    public static void main (String[] args) {

        Person[] persons = {new Student(), new Student(), new Teacher(), new Cleaner(), new Teacher()};

        persons[0].print();
        persons[1].print();
        persons[2].print();
        persons[3].print();
        persons[4].print();

        persons[2].salary();
        persons[3].salary();
        persons[4].salary();

    }
}