package Method;

public class Methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()
        // mainly it is a user define function.
        // D.R.Y principal = Don't repeat yourself

        System.out.printf("Square of your number is : %.2f\n", squareOf(3));
        System.out.printf("Cube of your number is : %.2f\n", cubeOf(3));
        System.out.println(fullName("God", "Usopp"));
    }

    static void birthdaySong(){
        System.out.println("Happy birthday to you today,");
        System.out.println("May smiles and joy come out to play,");
        System.out.println("May dreams shine bright in every way,");
        System.out.println("With love and laughter here to stay,");
        System.out.println("Happy birthday—have a wonderful day!");
    }

    static double squareOf(double number){
        return number * number;
    }

    static double cubeOf(double number){
        return number * number * number;
    }

    static String fullName(String first, String last){
        return first + " " + last;
    }

}
