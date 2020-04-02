package task3a;

public class Dog {

    public String name;
    public int age;
    public String breed;

    public Dog (String name,String breed,int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}