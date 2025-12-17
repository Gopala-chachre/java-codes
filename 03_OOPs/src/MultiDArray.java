public class MultiDArray {
    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

        String[] fruits = {"apple", "banana", "orange"};
        String[] vegetable = {"potato", "onion", "carrot"};
        String[] grain = {"rice", "gram", "corn"};

        String [][] foods = {fruits, vegetable, grain}; // both foods and foods are same
        String [][] foods1 = {{"apple", "banana", "orange"},
                                {"potato", "onion", "carrot"},
                                {"rice", "gram", "corn"}};

        foods[0][0] = "pineapple";

        for (String[] x : foods){
            for (String y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
