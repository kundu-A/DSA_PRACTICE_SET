import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public LinkedList(){
        head=null;
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            System.out.println("One node is added successfully.");
        }else{
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
            System.out.println("One node is added successfully.");
        }
    }
    public void remove(int data){
        if (head==null) {
            System.out.println("The List is empty.");
            return;
        }
        if(head.data==data){
            System.out.println("One node is removed successfully.");
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;
        while (temp!=null && temp.data!=data) {
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println(data+" is not exists in that list.");
            return;
        }
        prev.next=temp.next;
        System.out.println("One node is removed successfully.");
    }
    public void display(){
        if(head==null){
            System.out.println("The list is empty.");
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
public class LinkedListPractice_2 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int a=0;
        do {
            System.out.println("Press '1' for adding a data\tPress '2' for removing a data\tPress '3' for display the list: ");
            int ch=sc.nextInt();
            switch (ch) {
                case 1: System.out.println("Enter a data to add to the list: ");
                        int add=sc.nextInt();
                        linkedList.add(add);
                break;
                
                case 2: System.out.println("Enter a data to remove from the list: ");
                        int rev=sc.nextInt();
                        linkedList.remove(rev);
                break;

                case 3: System.out.println("The list is : ");
                        linkedList.display();
                break;
                
                default: System.out.println("Please choose the coorect one.");
                break;
            }
            System.out.println("Press 1 to do again: ");
            a=sc.nextInt();
        } while (a==1);
        sc.close();
    }
}
