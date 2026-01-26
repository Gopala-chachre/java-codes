package Linklist;

public class LinkListIntro {
    public static void main(String[] args) {
        SinglyLinkedListOperations list = new SinglyLinkedListOperations();
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(18);
        list.show();
        System.out.println();

        list.insertAtStart(4);
        list.show();
    }
}
