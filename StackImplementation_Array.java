import java.util.*;
class StackImplementation{

    private int[] stack;
    private int top;
    private int capacity;
    public StackImplementation(int size){
        stack=new int[size];
        capacity=size;
        top=-1;
    }
    //PUSH OPERATION
    public void push(int num){
        if(top==capacity-1){
            System.out.println("The Stack is full , Overflow Conditions..");
            return;
        }
        else
            stack[++top]=num;
    }
    //POP OPERATION
    public void pop(){
        if(top==-1){
            System.out.println("The Stack is Empty , Underflow Condition..");
            return;
        }
        else
            top--;
    }
    //PEEK OPERATION
    public void peek(){
        if(top==-1){
            System.out.println("The stack is empty..");
            return;
        }
        else
            System.out.println("The Topmost element of this stack is: "+stack[top]);
    }
    //DISPLAY OPERATION
    public void display(){
        if(top==-1){
            System.out.println("The Stack is empty.");
            return;
        }
        else
        {
            System.out.println("The Stack elements are: ");
            for(int i=0;i<=top;i++)
                System.out.println("At "+i+" position : "+stack[i]+" is present.");
        }
    }
    public void search(int num){
        if(top==-1){
            System.out.println("The Stack is empty.");
            return;
        }
        else
        {
            int flag=0;
            for(int i=0;i<=top;i++){
                if(num==stack[i]){
                    System.out.println(num+" is present at "+i);
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println(num+" is not present in the stack.");
        }
    }
}
public class StackImplementation_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The the size of the array: ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        StackImplementation stack=new StackImplementation(ar.length);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.display();

        stack.peek();

        stack.pop();

        stack.peek();

        stack.display();

        stack.search(1);
        stack.search(7);

        sc.close();
    }
}
