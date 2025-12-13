import java.util.Random;

public class RandomLib {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        number = random.nextInt(1, 7); // like a die
        System.out.println(number);

        double number1;
        number1 = random.nextDouble(0,1);
        System.out.println(number1);

        boolean isHeads;
        isHeads = random.nextBoolean();
        if (isHeads) {
            System.out.println("Heads");
        }else  {
            System.out.println("Tails");
        }

    }
}
