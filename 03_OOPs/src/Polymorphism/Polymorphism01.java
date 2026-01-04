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

    }
}
