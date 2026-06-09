package Queue_;

import java.util.LinkedList;
import java.util.Queue;

public class QUeueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); //ArrayDeque what's the main difference  between linkedlist and deque find it

        q.add(1);
        q.add(12);
        q.add(123);

        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
}
