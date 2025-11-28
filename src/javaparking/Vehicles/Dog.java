package javaparking.Vehicles;

public class Dog extends Vehicle implements NotAllowed{

    public Dog(){
        super.isAnonymous = false;
    }
    @Override
    protected String getIdentifier() {
        return "dog ";
    }
}
