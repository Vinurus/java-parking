package javaparking;
import javaparking.Users.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Tester test = new Tester();

        String [] blacklist = {"DW1",
        "DW8",
        "DW14"};

        ParkingLot lot = new ParkingLot(blacklist);

        List<User> tt =  test.n(10);
        // tt =  test.scenarioBasic();

        for(User t : tt)
            lot.letIn(t);

        lot.daySummary();
    }
}