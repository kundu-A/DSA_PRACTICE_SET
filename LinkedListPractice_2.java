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
    public void reversePrint(){
        if(head==null){
            System.out.println("The list is empty.");
            return;
        }
        Node tempHead=head;
        Node nextPointer=null;
        Node previous=null;
        while (tempHead!=null) {
            nextPointer=tempHead.next;
            tempHead.next=previous;
            previous=tempHead;
            tempHead=nextPointer;
        }
        head=previous;
        return;
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
    public void searchElement(int data){
        Node temp=head;
        if(head==null){
            System.out.println("The list is empty.");
            return;
        }
        int count=0,flag=0;
        while (temp!=null) {
            count++;
            if(temp.data==data){
                System.out.println(data+" is found at "+count);
                flag=1;
                break;
            }
            temp=temp.next;
        }
        if(flag==0)
            System.out.println(data+" is not found.");
    }
    public void measureSize(){
        Node temp=head;
        int count=0;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        System.out.println("The size of the list is: "+count);
    }
    public void getFirstAndLastElement(){
        Node temp=head;
        if(temp==null){
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("First element of this list is: "+temp.data);
        while (temp.next!=null) {
            temp=temp.next;
        }
        System.out.println("Last element of this list is: "+temp.data);
    }
    public void middleElement(){
        if (head==null) {
            System.out.println("The list is empty.");
            return;
        }
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("The middle element is: "+slow.data);
    }
    public void clearList(){
        if(head==null){
            System.out.println("the List is empty.");
            return;
        }
        head.next=null;
        head=null;
        display();
    }
}
public class LinkedListPractice_2 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int a=0;
        do {
            System.out.println("Press '1' for adding a data\nPress '2' for removing a data\nPress '3' for display the list\nPress '4' to display in reverse\nPress '5' to search an element\nPress '6' to check the list size\nPress '7' to Get the First and Last element from the list\nPress '8' to get the Middle element from the list\nPress '9' to clear the list: ");
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

                case 4: System.out.println("The reverse list is: ");
                        linkedList.reversePrint();
                        linkedList.display();
                break;

                case 5: System.out.println("Enter an element to search: ");
                        int search=sc.nextInt();
                        linkedList.searchElement(search);
                break;
                
                case 6: linkedList.measureSize();
                break;

                case 7: linkedList.getFirstAndLastElement();
                break;

                case 8: linkedList.middleElement();
                break;

                case 9: linkedList.clearList();
                break;

                default: System.out.println("Please choose the coorect one.");
                break;
            }
            System.out.println("Press 1 to do again & Press 0 to exit from the program: ");
            a=sc.nextInt();
        } while (a==1);
        sc.close();
    }
}
