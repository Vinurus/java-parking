package javaparking;
import javaparking.Vehicles.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Tester test = new Tester();

        String [] blacklist = {"DW1",
        "DW8",
        "DW14"};

        ParkingLot lot = new ParkingLot(blacklist);

        List<Vehicle> tt =  test.n(10);
        // tt =  test.scenarioBasic();

        for(Vehicle t : tt)
            lot.letIn(t);

        lot.daySummary();
    }
}