package javaparking.Vehicles;

public class Tank extends Vehicle implements NotAllowed{

    private String plate;

    @Override
    protected String getIdentifier() {
        return "tank ("+plate+") ";
    }
}
