package javaparking.Users;

public class Tank extends User implements NotAllowed{

    private String plate;

    @Override
    protected String getIdentifier() {
        return "tank ("+plate+") ";
    }
}
