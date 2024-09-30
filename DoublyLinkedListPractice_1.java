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
    Scanner sc=new Scanner(System.in);
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
    public void backwardDisplay(){
        if (head==null) {
            System.out.println("The List is empty.");
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.previous;
        }
        System.out.println();
    }
    public void searchElement(){
        if (head==null) {
            System.out.println("The List is empty.");
            return;
        }
        Node temp=head;
        System.out.println("Enter a value to search in the list: ");
        int value=sc.nextInt();
        int c=0,flag=0;
        while (temp!=null) {
            c++;
            if (temp.data==value) {
                System.out.println("The value is present at "+c+" position in the list.");
                flag=1;
                break;
            }
            temp=temp.next;
        }
        if (flag==0) {
            System.out.println("The list is not present.");
        }
    }
    public void insertAtBegining(int data){
        Node newNode=new Node(data);
        Node temp=head;
        newNode.next=temp;
        head.previous=newNode;
        head=newNode;
    }
    public void positionalInsert(){
        if (head==null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Enter a data to insert into a specific position: ");
        int data=sc.nextInt();
        Node newNode = new Node(data);
        System.out.println("Enter that specific position: ");
        int pos=sc.nextInt();
        if (pos==1) {
            insertAtBegining(data);
            return;
        }
        Node temp=head;
        int lSize=0;
        while (temp!=null) {
            lSize++;
            temp=temp.next;
        }
        if (pos>lSize) {
            System.out.println("The List size is "+lSize+" but the provided position is "+pos);
            return;
        }
        temp=head;
        int count=1;
        while (temp!=null && count<pos-1) {
            count++;
            temp=temp.next;
        }
        newNode.next=temp.next;
        newNode.previous=temp;
        temp.next.previous=newNode;
        temp.next=newNode;
    }
}
public class DoublyLinkedListPractice_1 {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        Scanner sc=new Scanner(System.in);
        int loop=0;
        do {
            System.out.println("Press '1' to Add Node:\nPress '2' to remove:\nPress '3' to display in a forward way:\nPress '4' to display in backward way:\nPress '5' to search an element:\nPress '6' to insert value at begining\nPress '7' to insert any value position-wise:");
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

                case 4: doublyLinkedList.backwardDisplay();
                break;

                case 5: doublyLinkedList.searchElement();
                break;

                case 6: System.out.println("Enter a value to insert at the begining of the list: ");
                        int beginData=sc.nextInt();
                        doublyLinkedList.insertAtBegining(beginData);
                break;

                case 7: doublyLinkedList.positionalInsert();
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
