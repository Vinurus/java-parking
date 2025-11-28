package javaparking.Vehicles;

public class Motorbike extends Vehicle {

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
