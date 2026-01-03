package Objects;

public class Car_02 {

    String model;
    String color;

    Car_02(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("you drive the " + this.color + " " + this.model);
    }

}
