package Super0;

public class Student extends Person{

    double gpa;

    Student (String firstName, String lastName, double gpa){
        super(firstName, lastName); // super refers to the percent class hear the person class
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.firstName + "'s gpa is " + this.gpa);
    }

}
