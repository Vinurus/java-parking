package javaparking;

import javaparking.Vehicles.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

public class Generator {
    private final Random random = new Random();

    private final List<Supplier<Vehicle>> generator = List.of(
            () -> new Car(nextPlate(), randomBrand()),
            () -> new Car(nextPlate(),randomBrand(), randomColor()),
            () -> new Car(nextPlate(), randomName(), randomBrand(), randomColor()),
            ()-> new Car(true, nextPlate(), randomName(), randomBrand(), randomColor()),
            () -> new Car(true, nextPlate(),randomName(), randomBrand()),
            () -> new Ambulance(nextPlate()),
            () -> new Bike(),
            () -> new Bike(randomName()),
            () -> new Dog(),
            () -> new Motorbike(nextPlate()),
            () -> new Motorbike(randomName(), nextPlate()),
            () -> new Pedestrian(),
            () -> new Pedestrian(randomName()),
            () -> new Scooter(),
            () -> new Scooter(randomName()),
            () -> new Tank(),
            () -> new Truck(randomCompany(), nextPlate())

    );

    private String randomCompany() {
        String [] company = {
                "Lenovo",
                "Porta Drzwi",
                "Fresenius"
        };
        return company[random.nextInt(company.length)];
    }

    private String plate = "000";

    private String randomBrand(){
        String [] brand = {
                "Audi",
                "Opel",
                "Hyuindai",
                "Kia",
                "Citroen"
        };
        return brand[random.nextInt(brand.length)];
    }
    private String randomColor(){
        String [] color = {
                "red",
                "black",
                "orange",
                "silver",
                "white",
        };
        return color[random.nextInt(color.length)];
    }
    private String nextPlate(){
        int tmp = Integer.parseInt(plate);
        tmp++;
        plate = String.valueOf(tmp);
        return "DW"+plate;
    }
    private String randomName(){
        String [] name = {
                "Rafał",
                "Paweł",
                "Karolina",
                "Magda"
        };
        String [] surname = {
                "Kuszka",
                "Kowalski",
                "Nowak",
                "Burak"
        };
        return name[random.nextInt(name.length)]+" "+
                surname[random.nextInt(surname.length)];
    }


    public Vehicle randomUser(){
        int index = random.nextInt(generator.size());
        return generator.get(index).get();
    }

    public List<Vehicle> generateScenario(Map<Class<? extends Vehicle>, Integer> scenario) {
        List<Vehicle> result = new ArrayList<>();

        for (var entry : scenario.entrySet()) {
            Class<? extends Vehicle> type = entry.getKey();
            int count = entry.getValue();

            for (int i = 0; i < count; i++) {
                result.add(randomOfType(type));
            }
        }
        return result;
    }
    private Vehicle randomOfType(Class<? extends Vehicle> type) {
        List<Supplier<Vehicle>> filtered = generator.stream()
                .filter(s -> s.get().getClass() == type)
                .toList();

        if (filtered.isEmpty())
            throw new IllegalArgumentException("No generators for type: " + type.getSimpleName());

        return filtered.get(random.nextInt(filtered.size())).get();
    }

}
