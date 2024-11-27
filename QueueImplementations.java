import java.util.*;
import java.util.LinkedList;
public class QueueImplementations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Queue will be implemented by using LinkedList data Structure.
        Queue<Integer> queue=new LinkedList<>();
        //Inserting values in the Queue - Enqueue. By using add() method (Rear will be increased)
        System.out.println("Please enter 5 values in the Queue: ");
        for(int i=1;i<=5;i++){
            int x=sc.nextInt();
            queue.add(x);
        }
        System.out.println("The Queue looks like: "+queue);
        //Checking the Top most element - peek() method. 
        System.out.println("Before Deletion the peek element is: "+queue.peek());
        //Deleting values from the Queue - Dequeue. By using remove() method (Front will be increased)
        queue.remove();
        System.out.println("After Deletion the peek element is: "+queue.peek());
        //To get the Size of the Queue - size() method.
        System.out.println("The size of the queue is: "+queue.size());
        sc.close();
    }
}
