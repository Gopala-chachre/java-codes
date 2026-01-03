package Inheritance;

public class Cat extends Animal{
    // even after tha class does not have anything in them,
    // they will have the inherits the Animal class

    //the child have their own attributes and methods
    int lives = 9;

    void speak(){
        System.out.println("The cat goes | meow |");
    }
}
