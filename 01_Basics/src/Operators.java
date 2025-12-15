public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int c;

        System.out.println("Representation of Arithmetic Operators :");
        c = a + b;
        System.out.println("Sum of a+b is : " + c);

        c = a - b;
        System.out.println("difference of a-b is : " + c);

        c = a * b;
        System.out.println("multiplication of a*b is : " + c);

        c = a / b ;
        System.out.println("divide of a/b is : " + c);

        c = a % b ;
        System.out.println("remainder or mode of a/b is : " + c);
        System.out.println("-------------------------------------------------------");

        // Relational Operators (it will give the result in the form of (true or False)

        System.out.println("Representation of Relational Operators :");
        boolean d;

        d = a == b ;
        System.out.println("Is a = b : " + d);

        d = a != b;
        System.out.println("Is a != b : " + d);

        d = a > b;
        System.out.println("Is a > b : " + d);

        d = a >= b;
        System.out.println("Is a >= b : " + d);

        d = a < b;
        System.out.println("Is a < b : " + d);

        d = a <= b;
        System.out.println("Is a <= b : " + d);
        System.out.println("-------------------------------------------------------");

        // Logical Operators (AND, OR, NOT, [&&, ||, !])
        System.out.println("Representation of Logical Operators :");

        double temp = -10;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("the weather is Good.");
            System.out.println("It is Sunny outside.");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("the weather is Good.");
            System.out.println("It is Cloudy outside.");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad!");
        }

        System.out.println(!(a < b));
        System.out.println("-------------------------------------------------------");

        // Assignment Operators (=, +=, -=, *=, /=)
        System.out.println("Representation of Assignment Operators :");
        a = c;
        b += 4;
        a -= 5;
        b *= 2;
        b /= 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("-------------------------------------------------------");

        // Unary Operators (--, ++, -, !)
        System.out.println("Representation of Unary Operators :");
        a++;
        b--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("d = " + !d);
        System.out.println("-------------------------------------------------------");


        // Bitwise Operators (&, |, ^, ~, <<, >>)
        System.out.println("Representation of Bitwise Operators :");
        System.out.println(5 & 3);
        System.out.println(5 | 3);
        System.out.println(5 ^ 3);
        System.out.println(~3);
        System.out.println("-----------------------------------------------------");

        // Ternary Operator (condition ? value1 : value2)
        // it returns 1 or 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;
        System.out.println("Representation of Ternary Operators :");
        int larger = (a > b) ? a : b;
        System.out.println("larger of two is : " + larger);
        System.out.println("-----------------------------------------------------");

        // ORDER OF OPERATIONS [P-E-M-D-A-S]

        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println("The result is : " + result);
        System.out.println("-----------------------------------------------------");

    }
}
