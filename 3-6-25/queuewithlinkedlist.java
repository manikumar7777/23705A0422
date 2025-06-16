import java.util.LinkedList;
import java.util.Queue;

public class ArrayQueueExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Queue<Integer> queue = new LinkedList<>();
        for (int num : arr) {
            queue.offer(num); 
        }
        System.out.println("Queue elements: " + queue);
        while (!queue.isEmpty()) {
            System.out.println("Removed from queue: " + queue.poll());
        }
    }
}
