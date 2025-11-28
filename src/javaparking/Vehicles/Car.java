package javaparking.Vehicles;
public class Car extends Vehicle {
    protected String plate, brand, color;
    protected boolean worker = false;


    public Car(String plate, String brand) {
        super();
        this.plate = plate;
        this.brand = brand;
    }

    public Car(String plate, String brand, String color) {
        super();
        this.plate = plate;
        this.brand = brand;
        this.color = color;
    }


    public Car(String plate, String name, String brand, String color)
    {
        super(name);
        this.plate = plate;
        this.brand = brand;
        this.color = color;
    }

    public Car(boolean worker, String plate, String name, String brand, String color){
        super(name);
        this.worker = worker;
        this.plate = plate;
        this.brand = brand;
        this.color = color;
    }

    public Car(boolean worker, String plate, String name, String brand){
        super(name);
        this.worker = worker;
        this.plate = plate;
        this.brand = brand;
    }

    public String getIdentifier() {
        StringBuilder st = new StringBuilder();
        if(color != null)
            st.append(color).append(" ");
        if(brand != null)
            st.append(brand).append(" ");

        return this.identifier + " by car "+ st + "[" + this.plate + "]";
    }

    public String getPlate(){
        return plate;
    }

    public String getAnonymousIdentifier() {
        return "anonymous by car [" + this.plate + "]";
    }
}