package javaparking;

import javaparking.Vehicles.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Tester {
    Generator gn = new Generator();

    public List<Vehicle> n (int n) {
        List<Vehicle> users = new ArrayList<>();
        for(int i=0; i<n; i++)
            users.add(gn.randomUser());
        return users;
    }
    public List<Vehicle> scenarioBasic() {
        return gn.generateScenario(
                Map.of(
                        Car.class, 3,
                        Pedestrian.class, 2
                )
        );
    }

    public List<Vehicle> scenarioTrafficJam() {
        return gn.generateScenario(
                Map.of(
                        Car.class, 45,
                        Bike.class, 33,
                        Pedestrian.class, 15
                )
        );
    }
}
