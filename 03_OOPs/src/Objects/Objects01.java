package Objects;

import java.util.Scanner;

public class Objects01 {
    public static void main(String[] args) {

        // Object = An entity that holds data(attributes) #eg -> name, age, height, weight
        //          and can perform actions (methods) #eg -> eat, sleep
        //          It is a reference data type

        // to understand we made class name Car to understand it
        // to understand how to use object
        Scanner input = new Scanner(System.in); // it is also an object

        Car car1 = new Car();
        System.out.println(car1.model); // " . " dot (or dot operator) is used to access the thing within the object
        System.out.println(car1.make);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1.isRunning);

//        car.isRunning = true;
//        System.out.println(car.isRunning);

        System.out.println(car1.isRunning);
        car1.start();
        System.out.println(car1.isRunning);
        car1.stop();
        System.out.println(car1.isRunning);

        car1.drive();
        car1.brake();

        // but if
        Car car2 = new Car();

        // they both have the same attributes
        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);

        // but different cars have different attributes
        // so to overcome this problem java have "CONSTRUCTORS"


    }
}
