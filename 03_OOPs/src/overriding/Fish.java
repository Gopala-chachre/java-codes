package overriding;

public class Fish extends Animal{

    // special for fish class me output the swimming
    @Override // it is good practice to add @notation
    void move(){
        System.out.println("This animal is swimming.");
    }

}
