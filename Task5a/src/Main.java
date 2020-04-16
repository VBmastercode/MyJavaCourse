public class Main {

    public static void main (String[] args) {

        Person[] persons = {new Student("Vasya"), new Student("Petya"), new Teacher("Igor"), new Cleaner("Oleg"), new Teacher("Nikolay")};


        persons[0].print();
        persons[1].print();
        persons[2].print();
        persons[3].print();
        persons[4].print();

        ((Staff) persons[2]).salary();
        ((Staff) persons[3]).salary();
        ((Staff) persons[4]).salary();
    }
}