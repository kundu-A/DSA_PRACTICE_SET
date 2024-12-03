//Space complexity is O(n+n) = O(2n) = O(n)

import java.util.*;

public class QueueImplementedByStack {
    static Stack<Integer> stack1=new Stack<>();
    static Stack<Integer> stack2=new Stack<>();

    //Pushing data.
    //Time complexity of enQueue is O(1)
    public static void enQueue(int data){
        stack1.push(data);
    }

    //Poping data.
    //Time complexity of deQueue is O(n)
    public static int deQueue(){
        if(stack1.empty() && stack2.empty()){
            System.out.println("The Queue is empty.");
            System.exit(0);
        }

        if(stack2.empty()){
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public static void main(String[] args) {
        enQueue(1);
        enQueue(2);
        enQueue(3);
        enQueue(4);

        System.out.println("1st deleted element: "+deQueue());
        System.out.println("2nd deleted element: "+deQueue());

        enQueue(5);
        enQueue(6);

        System.out.println("3rd deleted element: "+deQueue());
        System.out.println("4th deleted element: "+deQueue());
        System.out.println("5th deleted element: "+deQueue());
        System.out.println("6th deleted element: "+deQueue());
        System.out.println("7th deleted element: "+deQueue());
    }
}
