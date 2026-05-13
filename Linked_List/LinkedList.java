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

    public int helper(int key, Node head){

        if(head == null)
            return -1;

        if(head.data == key)
            return 0;
        int idx = helper(key, head.next);

        if(idx==-1)
            return -1;

        return idx+1;
    }
    public int recSearch(int key){
        return helper(key, head);
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

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void delNthFromN(int n){
        // Calculate Size
        int sz =0;
        Node prev = head;

        while (prev !=null) {
            prev = prev.next;
            sz++;
        }
        

        // Index of the node from 1st node
        int idx = sz - n; //4

        // Find and delete the node
        if(size==n){
            head = head.next; //If it is first node
            return;
        }

        int i=1;
        prev = head;
        while (i<idx) {
            prev = prev.next;
            
            i++;
        }

        prev.next = prev.next.next;
    }

    public Node findMid(){
        Node slow= head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // Find the mid
        Node midNode = findMid();

        //Second half reverse
        Node prev = null;
        Node curr = midNode;
        Node next ;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // Checking Plaindrome
        while (right.next!=null) {
            System.out.println("Left data="+left.data+"Right data="+right.data);
            if(right.data!=left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;
    }

    public void removeCycle(){
        // Checking Cycle
        Node fast = head;
        Node slow = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast) {
                cycle = true;
                break;
                
            }
            
        }
        if(!cycle){
            System.out.println("There is no cycle");
            return;
        }
        // Breakinh Cycle
        slow = head;
        Node prev = null;
        // Finding cycle point
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next; 
        
        }
        // Breaking Cycle by assigning null
        prev = fast;
        while (prev.next != slow) {
            prev = prev.next;
        }
        prev.next = null;
        
    }
    public boolean isCycleExists(){

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast) {
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
       

        // LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // // ll.addLast(4);
        // ll.addLast(3);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.print();
        // System.out.println(ll.checkPalindrome());
        // ll.print();

        // ll.add(2, 11);
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // ll.add(2, 11);
        // ll.print();
        // System.out.println(size);
        // System.out.println(ll.recSearch(11));
        // ll.reverse();
        // ll.print();
        // ll.delNthFromN(3);
        // ll.print();

        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        
        head.next.next.next.next.next = head.next.next;
        System.out.println(ll.isCycleExists());
        ll.removeCycle();
        System.out.println(ll.isCycleExists());
        ll.print();
    }
} 
