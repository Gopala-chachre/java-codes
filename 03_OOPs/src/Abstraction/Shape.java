package Abstraction;

// as it is an abstract class so we cannot make the object of it

public abstract class Shape {

    abstract double area(); // ABSTRACT

    void display(){ // CONCRETE
        System.out.println("This is a Shape.");
    }

}
