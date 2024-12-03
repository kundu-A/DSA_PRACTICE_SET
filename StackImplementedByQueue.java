//Space Complexity = O(n+n)= O(2n)=O(n)
import java.util.*;
import java.util.LinkedList;
public class StackImplementedByQueue {
    static Queue<Integer> queue1=new LinkedList<>();
    static Queue<Integer> queue2=new LinkedList<>();

    //Time Complexity of add is O(n)
    public static void add(int data){
        //Copy all the data of Queue1 to Queue2.
        while (!queue1.isEmpty()) {
            queue2.add(queue1.peek());
            queue1.poll();//To remove elements from the queue and if the element is not found in the  queue then it will return null not throwing exception like remove method.
        }
        //Add new element in Queue1.
        queue1.add(data);
        //Copy all the data of Queue2 to Queue1.
        while (!queue2.isEmpty()) {
            queue1.add(queue2.peek());
            queue2.poll();
        }
    }

    //Time Complexity of remove is O(1)
    public static int remove(){
        if(queue1.isEmpty()){
            System.out.println("The Stack is empty.");
            System.exit(0);
        }
        return queue1.poll();
    }
    public static void main(String[] args) {

        // pushing elements into Stack.
        add(1);
        add(2);
        add(3);
        add(4);

        //Poping elements from the stack.
        System.out.println(remove());
        System.out.println(remove());

        //Pushing elememts into the Stack.
        add(5);
        add(6);
         
        //Poping elements from the Stack.
        System.out.println(remove());
        System.err.println(remove());
        System.out.println(remove());
        System.out.println(remove());
        System.out.println(remove());
    }
}
