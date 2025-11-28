package javaparking.Vehicles;

public class Pedestrian extends Vehicle{

    public Pedestrian(String name){
        super(name);
    }

    public Pedestrian(){
        super();
    }

    @Override
    protected String getAnonymousIdentifier() {
        return "anonymous pedestrian ";
    }

    @Override
    protected String getIdentifier() {
        return
                this.getClass().getSimpleName().toLowerCase()+ " " + identifier;

    }
}
