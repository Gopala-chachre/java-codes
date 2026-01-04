package Abstraction;

public class Abstraction {
    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features.
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

        // For Example = When we go for learning a CAR we just go for the ACCELERATOR ,BRAKE & GEARS
        //               not for how Engine works.

        // Shape shape = new Shape(); we cannot make that object because it is an abstract class

        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(3,5);
        Rectangle rectangle = new Rectangle(5,7);

        circle.display();
        triangle.display();
        rectangle.display();
        System.out.println();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());


    }
}
