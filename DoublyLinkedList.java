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
    }
}
