public class ArrayOfObjects {
    public static void main(String[] args) {

        // for this we begin with the new class Car_02

        Car_02 car1 = new Car_02("Mustang", "black");
        Car_02 car2 = new Car_02("Ferrari", "Red");
        Car_02 car3 = new Car_02("Mini-cooper", "yellow-white");

        // Car_02[] cars = new Car[3];
        Car_02[] cars = {car1, car2, car3};

        for (Car_02 car : cars) {
            car.drive();
        }

    }
}
