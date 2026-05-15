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

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
       
    }

    public void removeFirst(){
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }else if(head.next == null){
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;


    }

    public void print(){
        Node tmp = head;

        while (tmp !=null) {
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        Doublyll dll = new Doublyll();

        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(size);

        dll.removeFirst();
        dll.removeFirst();
        dll.removeFirst();
        dll.removeFirst();
        dll.print();
        
    }
}
