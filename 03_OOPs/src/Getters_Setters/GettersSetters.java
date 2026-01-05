package Getters_Setters;

public class GettersSetters {
    public static void main(String[] args) {

        // They help protect object data and rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("mini-cooper", "yello", 49000);
//        System.out.println(car.color + " " + car.model + " for " + car.price);

        /*
        car.model = "mustang"; // we can change the attributes easily
        System.out.println(car.color + " " + car.model + " for " + car.price);
         */

        car.setColor("Blue");
        car.setPrice(43000);

        System.out.println(car.getColor() + " " + car.getModel() + " for " + car.getPrice());

        car.setColor("Black");
        car.setPrice(-4300);
        System.out.println(car.getColor() + " " + car.getModel() + " for " + car.getPrice());

    }
}
