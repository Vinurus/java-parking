package javaparking.Vehicles;

public class Ambulance extends Vehicle implements EmergencyVehicle{

    private String plate;

    public Ambulance(String plate){
        super();
        this.plate = plate;
        this.takeSpace = false;
    }

    @Override
    protected String getIdentifier() {
        return "ambulance ("+plate+") ";
    }
}
