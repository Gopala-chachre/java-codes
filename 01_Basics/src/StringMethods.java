// it will show the different string methods

public class StringMethods {
    public static void main (String[] args){

        String name = "   God Usopp!   ";

        int length = name.length();
        System.out.println("How many letter in the Name: " + length);

        char letter = name.charAt(4);
        System.out.println("What is the letter at index 4 : " + letter);

        int index = name.indexOf("o"); // it will give the index of the first find letter
        System.out.println("Index of a letter 'o' is: " + index);

        int lastIndex = name.lastIndexOf("o");
        System.out.println("last index of 'o' is: " + lastIndex);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = name.trim(); // remove all the white space from rear and front
        System.out.println(name);

        name = name.replace("o", "O"); // replacing the char at all place
        System.out.println(name);

        System.out.println("is name Empty: " + name.isEmpty()); // use to check that the string is empty or not

        if (name.contains("Z")){ //checks is string contain a particular char or not
            System.out.println("Name contain char 'Z' .");
        }else {
            System.out.println("Name not contain char 'Z'.");
        }

        if (name.equals("password")){  // it checks two strings & #it is case-sensitive
            // and for ignore case we use "name.equalsIgnoreCase"
            System.out.println("your name can't be password");
        }else {
            System.out.println("hello " + name);
        }

    }
}
