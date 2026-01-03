package Method;

public class OverLoadingMethods {
    public static void main(String[] args) {

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        System.out.printf("a + b = %.2f\n", add(3,7));
        System.out.printf("a + b + c = %.2f\n", add(3,7, 5));
        System.out.printf("a + b + c + d = %.2f\n", add(3,7, 5, 9));

    }

    static double add(double a, double b){
        return a + b;
    }

    static  double add(double a, double b, double c){
        return a + b + c;
    }

    static  double add(double a, double b, double c, double d){
        return a + b + c + d;
    }

}
