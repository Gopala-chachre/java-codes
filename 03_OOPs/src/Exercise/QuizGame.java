// a small quiz game
package Exercise;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] questions = {"1. What is the correct signature of the main method in Java?",
                              "2. What is the default value of an int variable in Java?",
                              "3. Which keyword is used for inheritance in Java?",
                              "4. How is multiple inheritance achieved in Java?",
                              "5. What is the purpose of the final keyword?",
                              "6. What is the name of a constructor in Java?",
                              "7. Where are objects stored in memory?",
                              "8. Which is a checked exception?",
                              "9. Who performs garbage collection in Java?",
                              "10.What is the difference between == and .equals() in Java?"
                            };

        String[][] options = {{"A. public static void main(String args)","B. public void main(String[] args)","C. public static void main(String[] args)","D. static public int main(String[] args)"},
                              {"A. 1", "B. -1", "C. 0", "D. Garbage"},
                              {"A. this", "B. super", "C. extends", "D. implements"},
                              {"A. Using classes", "B. Using abstract classes", "C. Using interfaces", "D. Using objects"},
                              {"A. Prevent inheritance", "B. Prevent method overriding", "C. Prevent variable modification", "D. All of the above"},
                              {"A. Same as class name", "B. Variable name", "C. Method name", "D. Object name"},
                              {"A. Stack", "B. Heap", "C. Register", "D. ROM"},
                              {"A. NullPointerException", "B. ArithmeticException", "C. IOException", "D. ArrayIndexOutOfBoundsException"},
                              {"A. Programmer", "B. Compiler", "C. JVM", "D. Operating System"},
                              {"A. No difference", "B. == compares content", "C. .equals() compares reference", "D. == compares reference, .equals() compares content"}
                            };

        String[] answer = {"C", "C", "C", "C", "D", "A", "B", "C", "C", "D"};
        int score = 0;
        String guess;

        System.out.println("+----------------------------------+");
        System.out.println("| Welcome to the java Quiz Game!!! |");
        System.out.println("+----------------------------------+");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.println();
            System.out.print("Enter your answer: ");
            guess = input.next().toUpperCase();

            if(guess.equals(answer[i])){
                System.out.println("+---------+");
                System.out.println("| CORRECT |");
                System.out.println("+---------+\n");
                score++;
            }else {
                System.out.println("+--------+");
                System.out.println("| WRONG! |");
                System.out.println("+--------+\n");
            }
        }

        System.out.println("+-------------------------------+");
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        System.out.println("+-------------------------------+");

        input.close();
    }
}