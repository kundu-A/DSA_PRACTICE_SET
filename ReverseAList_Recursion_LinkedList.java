public class ReverseAList_Recursion_LinkedList {
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
    public void displayLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void ReverseList(Node current , Node previous){
        if(current.next==null){
            head=current;
            current.next=previous;
            return;
        }
        Node nextPtr = current.next;
        current.next=previous;
        ReverseList(nextPtr, current);
    }
    public static void main(String[] args) {
        ReverseAList_Recursion_LinkedList reverse = new ReverseAList_Recursion_LinkedList();
        reverse.insert(1);
        reverse.insert(2);
        reverse.insert(3);
        reverse.insert(4);
        reverse.insert(5);
        reverse.displayLinkedList();
        System.out.println();
        System.out.println("After reversing the list");
        reverse.ReverseList(reverse.head,null);
        reverse.displayLinkedList();
    }
}
