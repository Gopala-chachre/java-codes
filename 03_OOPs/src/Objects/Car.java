
// a traditional way to understanding the OBJECTS in JAVA
package Objects;

public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 1969;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You Start the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You Stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }

}
