public class ArrayOfObjects {
    public static void main(String[] args) {

        // for this we begin with the new class Car_02

        Car_02 car1 = new Car_02("Mustang", "black");
        Car_02 car2 = new Car_02("Ferrari", "Red");
        Car_02 car3 = new Car_02("Mini-cooper", "yellow-white");

        // Car_02[] cars = new Car[3];
        Car_02[] cars1 = {car1, car2, car3};

        for (Car_02 car : cars1) {
            car.drive();
        }

        // or we can do this
        // it is known as anonymous objects
        Car_02[] cars2 = {new Car_02("Mustang", "black"),
                          new Car_02("Ferrari", "Red"),
                          new Car_02("Mini-cooper", "yellow-white")};

        System.out.println();
        for (Car_02 car : cars2) {
            car.drive();
        }

        for (Car_02 car : cars2){
            car.color = "black";
        }

        System.out.println();
        for (Car_02 car : cars2) {
            car.drive();
        }


    }
}
