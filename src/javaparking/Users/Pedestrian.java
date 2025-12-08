package javaparking.Users;

public class Pedestrian extends User {

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
