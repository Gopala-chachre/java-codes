package Super0;

public class SuperKeyword {
    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overloading
        //         calls the parent constructor to initialize attributes

        // to understand we made few different class (Person)

        Person person1 = new Person("John", "Wick");

        person1.showName();

        Student student = new Student("Mike", "Wheeler", 7.7);
        student.showName();

        System.out.println(student.gpa);
        student.showGPA();

        Employee employee = new Employee("Dustin", "Wardrobe", 50000);
        employee.showSalary();

    }
}
