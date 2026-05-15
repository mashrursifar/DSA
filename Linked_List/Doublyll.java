package Linked_List;


public class Doublyll {
    public static Node head = null;
    public static Node tail = null;
    public static int size;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;

        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        Node tmp = head;
        head = newNode;
        head.next = tmp;
        
    }

    
    public static void main(String[] args) {
        Doublyll dll = new Doublyll();

        
    }
}
