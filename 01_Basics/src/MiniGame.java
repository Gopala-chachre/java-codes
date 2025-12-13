import java.util.Scanner;

// MAD LIBS GAME
/*
it is type of game where a story is given with blank spaces
and the user or the one who play it fill the blanks with the random words
and make a funny & random story every time.😊
 */
public class MiniGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String adjective1, adjective2, adjective3, adjective4;
        String noun1, noun2;
        String verb1, verb2;
        String adverb1;
        String exclamation1;
        String name1, place1;

        System.out.print("Enter an adjective: ");
        adjective1 = input.nextLine();

        System.out.print("Enter an adjective: ");
        adjective2 = input.nextLine();

        System.out.print("Enter an adjective: ");
        adjective3 = input.nextLine();

        System.out.print("Enter an adjective: ");
        adjective4 = input.nextLine();

        System.out.print("Enter a Noun: ");
        noun1 = input.nextLine();

        System.out.print("Enter a Noun: ");
        noun2 = input.nextLine();

        System.out.print("Enter a verb: ");
        verb1 = input.nextLine();

        System.out.print("Enter a verb: ");
        verb2 = input.nextLine();

        System.out.print("Enter a adverb: ");
        adverb1 = input.nextLine();

        System.out.print("Enter a exclamation mark: ");
        exclamation1 = input.nextLine();

        System.out.print("Enter a name: ");
        name1 = input.nextLine();

        System.out.print("Enter a place: ");
        place1 = input.nextLine();

        System.out.println("One day, I woke up feeling very " + adjective1 );
        System.out.println("I grabbed my " + noun1 + " and ran outside to see a " + adjective2 + " (animal).");
        System.out.println("Suddenly, it started to " + verb1 + " very " + adverb1 + " .");
        System.out.println("I shouted " + exclamation1 + " and dropped my " + noun2 + " .");
        System.out.println("My best friend " + name1 +" laughed and began to " + verb2 + " with me.");
        System.out.println("We went to the " + place1 + " to eat some " + adjective3 + " (food).");
        System.out.println("It was the most " + adjective4 + " day of my life!");

        input.close();
    }

}
