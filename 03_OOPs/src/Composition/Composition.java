package Composition;

public class Composition {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        //               For example, an Engine is "part of" car.
        //               Allows complex object to be constructed from smaller objects.

        Car car = new Car("Mustang", 1969, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine); // Composition
        // so we go with ->
        System.out.println(car.engine.type); // the '.' is an access modifier

        System.out.println();
        car.start();

        // if we delete the car object that should also delete our engine object because it is a part of it.
        // and we no longer have the access to the engine.

    }
}
