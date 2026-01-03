package Constructors;

public class OverLoadedConstructors03 {
    public static void main(String[] args) {

        // overloaded constructors = Allows a class to have multiple constructors
        //                           with different parameters lists.
        //                           Enables objects to be initialized in various ways.

        // this wood be great where some fields are optional while creating the objects

        // to understand that me make a User class

        User user1 = new User("John wick");
        System.out.println(user1.userName + " " + user1.email + " " + user1.age);

        User user2 = new User("Mike Wheeler", "mikewheeler11@gmail.com");
        System.out.println(user2.userName + " " + user2.email + " " + user2.age);

        User user3 = new User("Will", "willthesorsorer@gmail.com", 17);
        System.out.println(user3.userName + " " + user3.email + " " + user3.age);

        User user4 = new User();
        System.out.println(user4.userName + " " + user4.email + " " + user4.age);

    }
}
