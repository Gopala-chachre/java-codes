public class VarargsInfo {
    public static void main(String[] args) {

        // varargs = allow a method to accept a varying number of arguments
        //           makes methods more flexible, no need for overload methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)

        //System.out.println(add(1,2,4,5,6,7,8,9,10));

        System.out.printf("Average is: %.2f\n", avg(3,4,5,6,2));
    }

    static double avg(double... numbers){
        double avgr, sum = 0;

        if (numbers.length == 0){
            return 0;
        }

        for(double i : numbers){
            sum += i;
        }

        avgr = sum / numbers.length;
        return avgr;

    }

    static int add(int... numbers){
        int sum = 0;

        for (int x : numbers){
            sum += x;
        }

        return sum;
    }

}
