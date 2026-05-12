package Linked_List;

public class LinkedList {

    public static Node head;
    public static Node tail;
    public static int size;

    public  class Node {
        
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
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

        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }    

        Node newNode = new Node(data);
        size++;
        Node tmp = head;
        int i =0;

        while (i<idx-1) {
            tmp = tmp.next;
            i++;
        }

        newNode.next = tmp.next;
        tmp.next = newNode;



    }

    public void removeFirst(){
        if(size==0){
            System.out.println("Linked List is empty");
            return;
        }else if(size ==1){
            size--;
            head=tail=null;
            return;
        }

        head = head.next;
        size--;
    }

    public void removeLast(){
        if(size==0){
            System.out.println("Linked List is empty");
            return;
        }else if(size ==1){
            size--;
            head=tail=null;
            return;
        }

        int i=0;
        Node tmp = head;
        while (i<size-2) {
            tmp = tmp.next;
            i++;
        }
        tmp.next = null;
        tail = tmp;
        size--;
    }

    public int search(int key){
        Node tmp = head;
        int i =0;
        while (tmp!=null) {
            if(tmp.data==key){
                return i;
            }
            tmp = tmp.next;
            i++;    
            
        }
        return -1;
    }

    public void print(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node tmp = head;

        while (tmp != null) {
            System.out.print(tmp.data+" ");
            tmp = tmp.next;
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
       

        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();

        ll.add(2, 11);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        ll.add(2, 11);
        ll.print();
        System.out.println(size);
        System.out.println(ll.search(11));
       
    }
}
