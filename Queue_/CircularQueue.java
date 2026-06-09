package Queue_;

public class CircularQueue {
    
    static class circularQueue{
        static int size,front, rear;
        static int arr[];
        circularQueue(int n){
            arr = new int[n];
            front = -1;
            rear = -1;
            size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1; 
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front==-1) {
                front++;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            // remove last element
            if (rear==front) {
                int rm = arr[front];
                front = rear = -1;
                return rm;
            }
            int rm = arr[front];
            front = (front+1)%size;
            
            return rm;
        }
    }

    public static void main(String[] args) {
        circularQueue q = new circularQueue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        // System.out.println(q.remove());
        // q.add(4);
        // System.out.println(q.remove());
        // q.add(5);

        System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());

        circularQueue q1 = new circularQueue(3);
        q1.add(50);
        q1.add(20);
        q1.add(30);
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q.remove());

    }
    
}
