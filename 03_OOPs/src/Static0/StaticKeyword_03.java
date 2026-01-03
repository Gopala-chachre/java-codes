public class StaticKeyword_03 {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources

        // to understand we made class name 'Friend' to understand it

        Friend friend1 = new Friend("John wick");
        System.out.println(friend1.numOfFriends); // it is also ok but

        Friend friend2 = new Friend("Mike");
        System.out.println(Friend.numOfFriends); // to use the static attribute or
                                                 // method we prefer to use the class name instead of the object name

        Friend friend3 = new Friend("Will");
        Friend friend4 = new Friend("Max");

        Friend.showFriends();

        //Math.round(3.99); it is a utility class and round is a static method so by that we can assess it by only class name

    }
}
