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
    public void removeFromBegining(){
        if (head==null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp=head;
        int c=0;
        while (temp!=null) {
            c++;
            temp=temp.next;
        }
        if(c==1){
            head=null;
            return;
        }
        temp=head;
        temp.next.previous=null;
        head=temp.next;
    }
    public void postionalRemove(){
        if (head==null) {
            System.out.println("The List is empty.");
            return;
        }
        System.out.println("Enter any valid position to remove that data: ");
        int pos=sc.nextInt();
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
        if (pos==1) {
            removeFromBegining();
            return;
        }
        temp=head;
        int c=1;
        while (temp!=null && c<pos-1) {
            c++;
            temp=temp.next;
        }
        if (temp.next.next==null) {
            temp.next=null;
            return;
        }
        temp.next=temp.next.next;
        temp.next.previous=temp;
    }
    public void updateValue(){
        if (head==null) {
            System.out.println("The List is empty.");
            return;
        }
        System.out.println("Enter that value which you want to update: ");
        int existVaue=sc.nextInt();
        System.out.println("Enter the updated value: ");
        int updatedValue=sc.nextInt();
        Node temp=head;
        while (temp!=null && temp.data!=existVaue) {
            temp=temp.next;
        }
        if (temp==null) {
            System.out.println(existVaue+" is not found.");
            return;
        }
        temp.data=updatedValue;
    }
    public void ascendingOrderSorting(){

    }
    public void decendingOrderSorting(){

    }
    public void isEmpty(){
        if (head==null) {
            System.out.println("The List is empty.");
            return;
        }
        System.out.println("The list is not empty.");
        getSize();
    }
    public void getSize(){
        if (head==null) {
            System.out.println("The List is empty.");
            return;
        }
        Node temp=head;
        int count=0;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        System.out.println("The size of the list is: "+count);
    }
    public void getMiddleValue(){
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
    public void getFirstAndLastValue(){
        if (head==null) {
            System.out.println("The List is empty.");
            return;
        }
        Node temp=head;
        System.out.println("This is First data from the list: "+temp.data);
        while (temp.next!=null) {
            temp=temp.next;
        }
        System.out.println("This is the Last data fro  the list: "+temp.data);
    }
    public void positionalData() {
       if (head==null) {
            System.out.println("The list is empty.");
            return;
       }
       System.out.println("Enter the Specific position to retrive the data: ");
       int pos=sc.nextInt();
       Node temp=head;
       int lSize=0;
       while (temp!=null){
            lSize++;
            temp=temp.next;
       }
       if (pos>lSize) {
            System.out.println("The lize of the list is "+lSize+" but the provided position is "+pos);
            return;
       }
       temp=head;
       int c=1;
       while (temp!=null && c<pos) {
            c++;
            temp=temp.next;
       }
       System.out.println("At "+pos+" position "+temp.data+" is present.");
    }
}
public class DoublyLinkedListPractice_1 {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        Scanner sc=new Scanner(System.in);
        int loop=0;
        do {
            System.out.println("Press '1' to Add Node:\nPress '2' to remove:\nPress '3' to display in a forward way:\nPress '4' to display in backward way:\nPress '5' to search an element:\nPress '6' to insert value at begining:\nPress '7' to insert any value position-wise:\nPress '8' to remove from begining:\nPress '9' remove from a specific position:\nPress '10' to update the value of any node:\nPress '11' to sort the list in ascending order:\nPress '12' to sort the list from decending order\nPress '13' to check the list is empty or not\nPress '14' to get the size of the list\nPress '15' to retrive the middle value from the list\nPress '16' to retrive the first and last value from the list:\nPress '17' to retrive data from a specific position:");
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

                case 8: doublyLinkedList.removeFromBegining();
                break;

                case 9: doublyLinkedList.postionalRemove();
                break;
                
                case 10: doublyLinkedList.updateValue();
                break;

                case 11: doublyLinkedList.ascendingOrderSorting();
                break;

                case 12: doublyLinkedList.decendingOrderSorting();
                break; 

                case 13: doublyLinkedList.isEmpty();
                break; 

                case 14: doublyLinkedList.getSize();
                break;

                case 15: doublyLinkedList.getMiddleValue();
                break;

                case 16: doublyLinkedList.getFirstAndLastValue();
                break;

                case 17: doublyLinkedList.positionalData();
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
