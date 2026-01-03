package Inheritance;

public class Inheritance_04 {
    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent
        //               Child <- Parent <- Grandparent (multiple inheritance[Organism])

        // to understand we made class name Animal(under that a Dog and Cat classes) to understand it

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive + "\n");

        dog.eat();
        cat.eat();

        System.out.println("\nhow many lives dog have? : " + dog.lives);
        System.out.println("how many lives cat have? : " + cat.lives + "\n");

        dog.speak();
        cat.speak();

    }
}
