import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementations {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println("The Deque looks like: "+deque);

        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        System.out.println("The Deque looks like: "+deque);

        System.out.println("The First element of the Deque is: "+deque.peekFirst());
        System.out.println("The :ast element of the Deque is: "+deque.peekLast());

        System.out.println("After removing the First element from the Deque : "+deque.removeFirst());
        System.out.println("After removing the Last element from the Deque : "+deque.removeLast());

    }
}
