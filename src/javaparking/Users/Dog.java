package javaparking.Users;

public class Dog extends User implements NotAllowed{

    public Dog(){
        super.isAnonymous = false;
    }
    @Override
    protected String getIdentifier() {
        return "dog ";
    }
}
