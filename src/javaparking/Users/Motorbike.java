package javaparking.Users;

public class Motorbike extends User {

    private String plate;

    public Motorbike (String plate){
        super();
        this.plate = plate;
    }

    public Motorbike (String name, String plate){
        super(name);
        this.plate = plate;
    }

    @Override
    protected String getIdentifier() {
        return identifier + " by motorbike ("+plate+")";
    }
}
