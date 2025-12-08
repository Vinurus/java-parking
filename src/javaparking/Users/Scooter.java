package javaparking.Users;

public class Scooter extends User {


    public Scooter() {
        super();
    }

    public Scooter(String name){
        super(name);
    }

    @Override
    protected String getIdentifier() {
        return identifier+ " by scooter";
    }
}
