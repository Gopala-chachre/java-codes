// this will show how the printf works
// it is as same as in the C programming language

public class PrintF {
    public static void main (String[] args){

        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        String name = "God Usopp";
        char letter = 'G';
        int age = 22;
        double height = 64.56;
        boolean isStudent = true;

        System.out.printf("Hello, %s!\n", name);
        System.out.printf("Your name start with a %c.\n", letter);
        System.out.printf("you are %d year old.\n", age);
        System.out.printf("you are %.2f inch long.", height);
        System.out.printf("Student :%b\n", isStudent);

        System.out.printf("Hello, %s!. Your name start with a %c. you are %d year old.", name, letter, age);

    }
}
