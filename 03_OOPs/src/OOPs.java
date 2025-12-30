import java.util.Random;
import java.util.Scanner;

public class OOPs { // class severs as the blueprints to creates objects
    public static void main(String[] args) {

        // Object = An entity that holds data(attributes) #eg -> name, age, height, weight
        //          and can perform actions (methods) #eg -> eat, sleep
        //          It is a reference data type

        // to understand we made class name Car to understand it
        // to understand how to use object
        Scanner input = new Scanner(System.in); // it is also an object

        Car car = new Car();
        System.out.println(car.model); // " . " dot (or dot operator) is used to access the thing within the object
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.isRunning = true;
        System.out.println(car.isRunning);


        input.close();
    }
}
