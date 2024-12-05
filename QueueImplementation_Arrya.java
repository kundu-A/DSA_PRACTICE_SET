//import java.util.*;
class QueueImplementation{
    private int ar[];
    private int front,rear,size,capacity;
    public QueueImplementation(int capacity){
        this.capacity=capacity;
        this.front=0;
        this.rear=-1;
        this.size=0;
        this.ar=new int[capacity];
    }
    //ENQUEUE - path to enter values into the queue.
    public void enQueue(int data){
        if(size==capacity){
            System.out.println("The Queue is Full , OverFlow Condition!!");
            return;
        }
        rear=(rear+1)%capacity;
        ar[rear]=data;
        size++;
    }
    //DEQUEUE - path to delete values from the queue.
    public void deQueue(){
        if(size==0){
            System.out.println("The Queue is empty , UnderFlow Condition!!");
            return;
        }
        System.out.println("The DeQueued element is: "+ar[front]);
        front=(front+1)%capacity;
        size--;
    }
    //PEEKVALUE - path to check the peek value from the queue.
    public int peekValue(){
        if(size==0){
            System.out.println("The Queue is empty.");
            return -1;
        }
        return ar[front];
    }
    //DISPLAYQUEUE - path to display values from the queue.
    public void displayQueue(){
        if(size==0){
            System.out.println("The Queue is empty!!");
            return;
        }
        System.out.println("Elements of Queue are: ");
        for(int i=front;i<=rear;i++)
            System.out.println(ar[i]);
    }
}

public class QueueImplementation_Arrya {
    public static void main(String[] args) {
        QueueImplementation queue=new QueueImplementation(5);
        //Entering Values into the QUeue.
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        //Displaying Values from the Queue.
        queue.displayQueue();

        //Overflow Condition checking.
        queue.enQueue(6);

        //Deleting elements from the queue.
        queue.deQueue();
        queue.displayQueue();

        //Showing peek value from the Queue.
        System.out.println("The Peek Value of the Queue is: "+queue.peekValue());
    }
}
