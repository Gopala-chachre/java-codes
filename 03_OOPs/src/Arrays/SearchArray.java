import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] number = {1,9,2,8,3,7};
        String[] fruits = {"apple", "orange", "banana"};
        int target1;
        String target2 ;
        boolean isFound1 = false, isFound2 = false;

        System.out.print("Enter the fruit name: ");
        target2 = input.nextLine();

        System.out.print("Enter the number you found: ");
        target1 = input.nextInt();

        for (int x : number) {
            if (x == target1){
                System.out.println("Number found!!!");
                isFound1 = true;
                break;
            }
        }

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target2)){
                System.out.println("Fruit found at index: " + i);
                isFound2 = true;
                break;
            }
        }

        if (!isFound1){
            System.out.println("Element not found in number array!!!");
        }
        if (!isFound2){
            System.out.println("Element not found in fruit array!!!");
        }

        input.close();
    }
}
