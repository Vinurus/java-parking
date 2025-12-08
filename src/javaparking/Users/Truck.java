package javaparking.Users;

public class Truck extends User {

    private String plate;

    public Truck(String companyName, String plate){
        super(companyName);
        this.plate = plate;
        this.takeSpace = false;
    }

    @Override
    protected String getIdentifier() {
        return identifier+"'s truck ("+plate+") ";
    }
}
