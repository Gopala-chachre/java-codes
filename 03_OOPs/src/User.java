public class User {

    String userName;
    String email;
    int age;

    /*
        They are like the overloaded methods
        same name but different parameters and works
     */

    User(){  // this usually work with the default values
        this.userName = "Guest";
        this.email = "guest@gmail.com";
        this.age = 18;
    }

    User(String userName){
        this.userName =userName;
        this.email = "Not provided";
        this.age = 0;
    }

    User(String userName, String email){
        this.userName = userName;
        this.email = email;
        this.age = 0;
    }

    User(String userName, String email, int age){
        this.userName = userName;
        this.email = email;
        this.age = age;
    }

}
