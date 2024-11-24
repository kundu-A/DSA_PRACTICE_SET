import java.util.*;
public class StackImplementations {
    public static void main(String[] args) {
        //Creating an object of the Stack.
        Stack<Integer> stack1=new Stack<>();

        //Push elements into the stack.------- push();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        //Print the top most elements from the stack. -------------- peek();
        System.out.println("The topmost element of this stack is: "+stack1.peek());

        //Delete an element from the stack. --------- pop();
        stack1.pop();

        System.out.println("After poping , The topmost element of this stack is: "+stack1.peek());

        //Search an element in the stack.---- search();
        /*
         * It will consider top as index 1 and then it will down that's why it print 3 for 2.
         * It will print -1 when the asked element is not found in the stack.
         */
        System.out.println("In the stack 2 is present at position: "+stack1.search(2));

        //Check the stack is empty or not.------ empty();
        System.out.println("IS our stack is empty? If yes then print 'false' else 'true' :"+stack1.empty());
    }
}
