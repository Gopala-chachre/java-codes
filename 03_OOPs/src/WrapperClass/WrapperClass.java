package WrapperClass;

public class WrapperClass {
    public static void main(String[] args) {

        // Wrapper Classes = Allows primitive values (int, char, double, boolean)
        //                   to be used as object. "Wrap them in an object"
        //                   Generally, don't warp primitive unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

        // the modern approach to do that is called "Autoboxing"
        // but for better visualize we goes like

        Integer a = new Integer(123);
        Double b = new Double(3.14);
        Character c = new Character('&');
        Boolean d = new Boolean(true);

        // And modern tech Autoboxing
        Integer w = 123;
        Double x = 3.14;
        Character y = '%';
        Boolean z = false;
        // it is similar as me assigned String
        String s = "Hello!, it's me";


        // this is unboxing
        int p = w;
        double q = x;
        char r = y;
        boolean t = z;

        // some utility classes methods

        // primitive to String
        String a1 = Integer.toString(123);
        String b1 = Double.toString(3.14);
        String c1 = Character.toString('@');
        String d1 = Boolean.toString(false);

        String abc = a1 + b1 + c1 + d1;
        System.out.println(abc);


        // string to primitive
        int num1 = Integer.parseInt("12345");
        double num2 = Double.parseDouble("3.1424");
        char ch = "Pizza".charAt(0);
        boolean bo = Boolean.parseBoolean("true");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(ch);
        System.out.println(bo);


        // to check
        char letter = 'G';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}
