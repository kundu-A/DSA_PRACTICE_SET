public class MiddleOfList_LinkedList {
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
    public void middleNode(){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    public void displayLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        MiddleOfList_LinkedList middle=new MiddleOfList_LinkedList();
        middle.insert(1);
        middle.insert(2);
        middle.insert(3);
        middle.insert(4);
        //middle.insert(5);
        middle.displayLinkedList();
        System.out.println();
        System.out.println("Middle of the list is: ");
        middle.middleNode();
    }
}
