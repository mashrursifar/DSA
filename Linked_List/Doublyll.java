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
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;


    }

    public void addLast(int data){
        if (head==null) {
            addFirst(data);
        }

        Node newNode = new Node(data);
        size++;

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        
    }

    public void removeLast(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
    }else if(head.next == null){
        head = tail = null;
        size--;
        return;
    }

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void reverse(){
        if (head == null || head.next == null) {
            return;
        }

        Node tmp = tail = head ;
        Node prev = tmp.prev;
        Node next;

        while (tmp != null) {
            next = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = next;
        }
        head = prev;
    }
    public void print(){
        Node tmp = head;

        while (tmp !=null) {
            System.out.print(tmp.data+"<->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        Doublyll dll = new Doublyll();

        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(size);

        dll.addLast(5);
        dll.addLast(6);
        // dll.removeFirst();
        // dll.removeFirst();
        // dll.removeFirst();
        // dll.removeFirst();
        dll.print();

        // dll.removeLast();
        // System.out.println(size);
        dll.reverse();
        dll.print();
        
    }
}
