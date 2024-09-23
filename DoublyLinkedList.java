class Node{
    int data;
    Node next;
    Node previous;
    public Node(int data){
        this.data=data;
        this.next=null;
        this.previous=null;
    }
}
class DoublyList{
    Node head;
    Node tail;
    public DoublyList(){
        head=null;
        tail=null;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
        }
    }
    public void remove(int data){
        Node tempHead=head;
        if(tempHead==null){
            System.out.println("The list is empty");
            return;
        }
        if(tempHead.data==data)
        {
            head=head.next;
            head.previous=null;
            return;
        }
        while (tempHead!=null && tempHead.data!=data) {
            tempHead=tempHead.next;
        }
        if(tempHead==null){
            System.out.println(data+" is not exists");
            return;
        }
        if(tempHead.next==null){
            tempHead.previous.next=null;
            return;
        }
        tempHead.next.previous=tempHead.previous;
        tempHead.previous.next=tempHead.next;
    }
    public void displayForward(){
        Node temp=head;
        if (head==null) {
            System.out.println("The list is empty.");
        }
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void displaybackward(){
        Node temp=head;
        if(temp==null){
            System.out.println("The list is empty.");
        }
        while (temp.next!=null) {
            temp=temp.next;
        }
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.previous;
        }
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyList doublyList = new DoublyList();
        doublyList.add(1);
        doublyList.add(2);
        doublyList.add(3);
        doublyList.add(4);
        doublyList.add(5);

        doublyList.displayForward();
        System.out.println();
        doublyList.displaybackward();
        System.out.println();
        doublyList.remove(1);
        doublyList.displayForward();
        System.out.println();
        doublyList.remove(3);
        doublyList.displayForward();
        System.out.println();
        doublyList.remove(5);
        doublyList.displayForward();
        System.out.println();
        doublyList.remove(6);
        System.out.println();
    }
}
