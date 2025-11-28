package javaparking.Vehicles;

public class Bike extends Vehicle {

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