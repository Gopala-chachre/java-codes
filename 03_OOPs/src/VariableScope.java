public class VariableScope {

    static int x = 3; // class or Global 

    public static void main(String[] args) {

        // variable scope = where a variable can be accessed

        int x = 10; // LOCAL in main
        System.out.println(x);
        doSomething();
    }

    static void doSomething(){
        int x = 2; // Local in doSomething
        System.out.println(x);

    }

}
