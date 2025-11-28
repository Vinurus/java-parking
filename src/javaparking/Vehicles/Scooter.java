package javaparking.Vehicles;

public class Scooter extends Vehicle{


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
