package javaparking;

import javaparking.Users.*;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.*;

public class ParkingLot {


    protected final int MAX_AVAILABLE_CAR_SPACES = 40;
    protected final int MAX_AVAILABLE_BIKE_SPACES = 80;
    protected final int MAX_AVAILABLE_MOTORBIKE_SPACES = 20;
    protected int carCount = 0,
            bikeCount = 0,
            motorbikeCount = 0;

    protected int entrancesCount = 0;
    protected int returnedCount = 0;
    protected int totalAmount =0;

    private Map<String, Integer> prices = Map.of(
            "car", 5,
            "motorbike", 2
    );


    private String [] blackList;
    private ArrayList<User> lot = new ArrayList<>();

    public ParkingLot(String [] blackList){
        this.blackList = blackList;
    }

    public void letIn(User user) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String name = user.identify();
        String now = formatter.format(LocalDateTime.now());


        //EMERGENCY ENTRY
        if(user instanceof EmergencyVehicle){
            System.out.println(name +" is entering at "+now+" EMERGENCY ENTRY!!!");
            lot.add(user);
            entrancesCount++;
            return;
        }
        //Forbidden Vehicle
        if(user instanceof NotAllowed){
            System.out.println(name + " is returned at "+now);
            returnedCount++;
            return;
        }
        //Forbidden Plate
        if(isBlackListed(user)){
            System.out.println("blacklisted "+name + " is returned at "+now);
            returnedCount++;
            return;
        }

        //occupancy
        //pomyśleć o optymalizacji tej częsci??
        //
        if(user instanceof Car || user instanceof Bike || user instanceof Motorbike){
        switch (user) {
            case Car car when carCount < MAX_AVAILABLE_CAR_SPACES -> {
                System.out.println(name + " is entering at " + now);
                lot.add(user);
                carCount++;
                return;
            }
            case Bike bike when bikeCount < MAX_AVAILABLE_BIKE_SPACES -> {
                System.out.println(name + " is entering at " + now);
                lot.add(user);
                bikeCount++;
                return;
            }
            case Motorbike motorbike when motorbikeCount < MAX_AVAILABLE_MOTORBIKE_SPACES -> {
                System.out.println(name + " is entering at " + now);
                lot.add(user);
                motorbikeCount++;
                return;
            }
            default -> {
                System.out.println("No available spaces. " + name + " is returned at " + now);
                returnedCount++;
                return;
            }
        }
        }

            System.out.println(name + " is entering at " + now);
            lot.add(user);

            String type = user.getClass().getSimpleName().toLowerCase();
            totalAmount += prices.getOrDefault(type, 0);
            entrancesCount++;

    }

    private boolean isBlackListed(User user){
        if(user instanceof Car){
            for(String banned : blackList)
                if(banned.equals(((Car) user).getPlate())) return true;
        }
        return false;
    }

    public void daySummary(){
        System.out.println("money collected: "+totalAmount +" zł");
        System.out.println("entrances count: "+entrancesCount);
        System.out.println();

        System.out.printf("car spaces occupied: %d/%d (%.1f%%)%n",
                carCount, MAX_AVAILABLE_CAR_SPACES, 100.0 * carCount / MAX_AVAILABLE_CAR_SPACES);

        System.out.printf("motorcycle spaces occupied: %d/%d (%.1f%%)%n",
                motorbikeCount, MAX_AVAILABLE_MOTORBIKE_SPACES, 100.0 * motorbikeCount / MAX_AVAILABLE_MOTORBIKE_SPACES);

        System.out.printf("bicycle spaces occupied: %d/%d (%.1f%%)%n",
                bikeCount, MAX_AVAILABLE_BIKE_SPACES, 100.0 * bikeCount / MAX_AVAILABLE_BIKE_SPACES);

        System.out.println("Users returned: "+ returnedCount);
    }

}