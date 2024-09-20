public class CycleDetectionProblem_LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insert(int newData){
        Node newNode=new Node(newData);
        if(head==null){
            head=new Node(newData);
            return;
        }
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    //Floyd cycle detection algorithms
    public void detectLoop(){
        Node slow=head;
        Node fast=head;
        int flag=0;
        while (slow!=null && fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                System.out.println("Loop is detected!!!");
                break;
            }
        }
        if(flag==0)
            System.out.println("There is no Loop to detect!!");
    }
    public void displayLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        CycleDetectionProblem_LinkedList cycle = new CycleDetectionProblem_LinkedList();
        cycle.insert(1);
        cycle.insert(2);
        cycle.insert(3);
        cycle.insert(4);
        cycle.insert(5);
        cycle.displayLinkedList();
        System.out.println();
        //Creating a loop or we can say it is a circular linkedlist.
        Node temp=cycle.head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=cycle.head;
        cycle.detectLoop();
    }
}