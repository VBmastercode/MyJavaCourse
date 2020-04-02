package task3a;

public enum  Breed {

    FOXHOUND("foxhound"), GREYHOUND("greyhound"), PITBULL("pitbull");

    private final String breednm;

    Breed (String breednm) {
        this.breednm = breednm;
    }

    public String getBreed () {
        return breednm;
    }

}