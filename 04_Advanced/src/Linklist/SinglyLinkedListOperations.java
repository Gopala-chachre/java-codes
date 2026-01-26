package Linklist;

class Node {
    int data;
    Node next;

}

public class SinglyLinkedListOperations {
    Node head;

    public void insertAtEnd(int data){
        Node node = new Node();

        node.data = data;

        if (head == null){
            head = node;
        } else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;

        if (head == null){
            head = node;
        }else{
            Node temp = head;
            head = node;
            node.next = temp;
        }
    }

    public void show(){
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
