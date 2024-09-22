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
        }
        else{
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void remove(int data){
        if(head==null){
            System.out.println("The List is empty.");
            return;
        }
        if(head.data==data){
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
            System.out.println("This number is not exists in this list.");
            return;
        }
        prev.next=temp.next;
    }
    public void display(){
        if(head==null){
            System.out.println("The List is empty.");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class LinkedListPractice_1 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        //Adding part
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        //Display part
        linkedList.display();
        System.out.println();

        //Remove Part
        linkedList.remove(1);
        linkedList.display();
        System.out.println();
        linkedList.remove(5);
        linkedList.display();
        System.out.println();
        linkedList.remove(3);
        linkedList.display();
        System.out.println();
        linkedList.remove(2);
        linkedList.remove(4);
        linkedList.display();
        System.out.println();
        linkedList.remove(6);
        linkedList.display();
        System.out.println();
    }
}
