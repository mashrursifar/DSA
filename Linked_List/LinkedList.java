package Linked_List;

public class LinkedList {

    public class Node {
    
        int data;
        LinkedList next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
       

        LinkedList ll = new LinkedList();
        Node n = ll.new Node(12);
    }
}
