package javaparking;

import javaparking.Users.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Tester {
    Generator gn = new Generator();

    public List<User> n (int n) {
        List<User> users = new ArrayList<>();
        for(int i=0; i<n; i++)
            users.add(gn.randomUser());
        return users;
    }
    public List<User> scenarioBasic() {
        return gn.generateScenario(
                Map.of(
                        Car.class, 3,
                        Pedestrian.class, 2
                )
        );
    }

    public List<User> scenarioTrafficJam() {
        return gn.generateScenario(
                Map.of(
                        Car.class, 45,
                        Bike.class, 33,
                        Pedestrian.class, 15
                )
        );
    }
}
