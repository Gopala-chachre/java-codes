package Aggregation;

public class Aggregation {
    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contained another object as part of its structure,
        //               but contained object/s can exist independently.

        Book book1 = new Book("Godaan", 344);
        Book book2 = new Book("Gaban", 248);
        Book book3 = new Book("Seva Sadan", 280);

        Book[] books = {book1, book2, book3};

        System.out.println(book1.displayInfo());
        System.out.println(book2.displayInfo());
        System.out.println(book3.displayInfo());

        // or by loop
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
        System.out.println();

        Library library = new Library("Public Library", 1999, books); // this is Aggregation

        library.displayInfo();


    }
}
