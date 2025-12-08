package javaparking.Users;

public class Bike extends User {

    public Bike() {
        super();
    }

    public Bike(String name){
        super(name);
    }

    public String getIdentifier() {
        return this.identifier + " by bike";
    }
}