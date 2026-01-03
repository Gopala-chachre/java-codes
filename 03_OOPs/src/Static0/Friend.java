package Static0;

public class Friend {

    // if there is no static then every object have their own copy of this int variable
    static int numOfFriends; // by the keyword it will share the same int variable in both the objects
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " Friends"); // hear we didn't need the 'this' keyword because
                                                                     // the numOfFriends belongs to class not to any object
    }

}
