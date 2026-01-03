package ToStringMethod;

public class ToStringMethod {
    public static void main(String[] args) {

        // .toString() = Method inherits from Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car1 = new Car("Ford", "Mustang", 1969, "Black");
        Car car2 = new Car("Mini", "cooper", 2008, "yellow");

        System.out.println(car1); // to print the attribute only with car object
//        System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);
        System.out.println(car2);

    }
}
