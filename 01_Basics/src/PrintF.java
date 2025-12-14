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

        System.out.printf("Hello, %s!. Your name start with a %c. you are %d year old.\n", name, letter, age);

        //[flags]
        // , = comma grouping a plus
        // ( = negative number are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = -9.999;
        double price2 = 100.1506;
        double price3 = 2678676354.65;

        System.out.printf("%(.2f\n", price1); // it will auto round off it
        System.out.printf("%+.3f\n", price2);
        System.out.printf("%.2f\n", price3);

        System.out.printf("%,.2f\n\n", price3);

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 25;
        int id3 = 567;
        int id4 = 9853;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n\n", id4);

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
}
