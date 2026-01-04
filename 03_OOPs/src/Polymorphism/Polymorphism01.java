package Polymorphism;

public class Polymorphism01 {
    public static void main(String[] args) {

        // Polymorphism = "POLY" = "Many"
        //                "MORPH" = "Shape" or name
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclasses.
        // For Example = Dog -> animal, organism, object

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        car.go();
        bike.go();
        boat.go();

        // Car[] cars = {car, bike, boat} but it gives error because bike and boat is not identifies as car
        // Bike[] bikes = {car, bike, boat} same for bike
        // Boat[] boats = {car, bike, boat} and for boat

        // instead me make array of vehicle class because car, boat, & bike are identifies as a vehicle
        Vehicle[] vehicles = {car, bike, boat};  // because they all extends Vehicle class

        System.out.println();
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }


        /*
            Polymorphism can also be achieved by interface.
         */

    }
}
