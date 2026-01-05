package Getters_Setters;

public class Car {

    private String model; // readable
    private String color; // rightable
    private int price; // rightable

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // getter methods
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price;
    }

    // setter methods
    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        if (price < 0){
            System.out.println("Price can't be less then Zero");
        } else {
            this.price = price;
        }
    }

}
