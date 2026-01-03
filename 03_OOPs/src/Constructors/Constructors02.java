package Constructors;

public class Constructors02 {
    public static void main(String[] args) {

        // CONSTRUCTOR = A spical method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        // to understand that me make a student class

        Student student1 = new Student("John Wick", 32, 8.9);  // the constructor is automatically called when we make that object
        Student student2 = new Student("Trump", 41, 4.6);
        Student student3 = new Student("Mike", 17, 7.7); // and we must have to pass the argument which is in the constructor

        /*
        both print same if no constructor is there
        System.out.println(student1.name);
        System.out.println(student2.name);
         */

        System.out.println(student1.name + " " + student1.age + " " + student1.gpa + " " + student1.isEnrolled);
        System.out.println(student2.name + " " + student2.age + " " + student2.gpa + " " + student2.isEnrolled);
        System.out.println(student3.name + " " + student3.age + " " + student3.gpa + " " + student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();

    }
}
