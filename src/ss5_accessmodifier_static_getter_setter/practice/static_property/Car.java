package ss5_accessmodifier_static_getter_setter.practice.static_property;

public class Car {
    private final String name;
    private final String engine;
    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    //getters and setters

}
