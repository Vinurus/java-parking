package javaparking.Users;

public class Ambulance extends User implements EmergencyVehicle{

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
