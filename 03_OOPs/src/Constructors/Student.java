package Constructors;

public class Student {
    
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // automatically called when we create object
    Student(String a, int age, double gpa){

        this.name = a;  // this refers the object we're working on at that time
        this.age = age;    // if we use student1.name the compiler got confuse
        this.gpa = gpa;    // so we use the 'this' keyword to refers the current object
        // and it is not compulsory to have the same name as at assigning

        this.isEnrolled = true;

    }

    void study(){
        System.out.println(this.name + " is studying.");
    }
    
}
