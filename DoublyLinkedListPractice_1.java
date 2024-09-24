import java.util.*;
class Node{
    int data;
    Node next;
    Node previous;
    public Node(int data){
        this.data=data;
        next=null;
        previous=null;
    }
}
class DoublyLinkedList{
    Node head;
    Node tail;
    public DoublyLinkedList(){
        head=null;
        tail=null;
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
        }
    }
    public void remove(int data){
        if(head==null){
            System.out.println("The list is empty.");
            return;
        }
        Node temp=head;
        if (temp.data==data) {
            head=head.next;
            head.previous=null;
            return;
        }
        while (temp!=null && temp.data!=data) {
            temp=temp.next;
        }
        if (temp==null) {
            System.out.println(data+" is not exists");
            return;
        }
        if(temp.next==null){
            temp.previous.next=null;
        }
        temp.next.previous=temp.previous;
        temp.previous.next=temp.next;
    }
    public void forwardDisplay(){
        if (head==null) {
            System.out.println("The List is empty.");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class DoublyLinkedListPractice_1 {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        Scanner sc=new Scanner(System.in);
        int loop=0;
        do {
            System.out.println("Press '1' to Add Node:\nPress '2' to remove:\nPress '3' to display in a forward way:");
            int ch=sc.nextInt();
            switch (ch) {
                case 1: System.out.println("Enter a data to add: ");
                        int addData=sc.nextInt();
                        doublyLinkedList.add(addData);
                break;
            
                case 2: System.out.println("Enter a data to remove: ");
                        int removeData=sc.nextInt();
                        doublyLinkedList.remove(removeData);
                break;

                case 3: doublyLinkedList.forwardDisplay();
                break;

                default: System.out.println("Please choose the right option: ");
                    break;
            }
            System.out.println("Press '1' , if do it again otherwise press '0' : ");
            loop=sc.nextInt();
        } while (loop==1);
        sc.close();
    }
}
