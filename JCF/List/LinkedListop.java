package JCF.List;
import java.util.Queue;
import java.util.LinkedList;

public class LinkedListop {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Add elements
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Queue: " + q);

        // View the front element
        System.out.println("Front: " + q.peek());

        // Remove the peek element
        System.out.println("Removed: " + q.poll());

        System.out.println("Queue after removal: " + q);
    }
}
