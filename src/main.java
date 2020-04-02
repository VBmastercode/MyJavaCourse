package task3a;

public class main {

    public static void main(String[] args) {

        Breed breed = Breed.FOXHOUND;
        Dog dog = new Dog("Snoopy", breed.getBreed(), 3);
        Breed breed1 = Breed.GREYHOUND;
        Dog dog1 = new Dog("Rex", breed1.getBreed(), 2);
        Breed breed2 = Breed.PITBULL;
        Dog dog2 = new Dog("Spike", breed2.getBreed(), 5);

        if (dog.getName() == dog1.getName() || dog.getName() == dog2.getName() || dog1.getName() == dog2.getName()) {
            System.out.println(" Names of dogs matches ");
        } else {
            System.out.println(" Names of dogs doesnt match ");
        }

        if (dog.getAge() > dog1.getAge() && dog.getAge() > dog2.getAge()) {
            System.out.println(" Oldest dog is " + dog.getName() + " Its breed is " + breed);
        } else {
            if (dog1.getAge() > dog.getAge() && dog1.getAge() > dog2.getAge()) {
                System.out.println(" Oldest dog is " + dog1.getName() + " Its breed is " + breed1);
            } else {
                System.out.println(" Oldest dog is " + dog2.getName() + " Its breed is " + breed2);
            }
        }

    }
}