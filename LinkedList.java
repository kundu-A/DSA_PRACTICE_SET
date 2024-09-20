public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insertAtEnd(int newData){
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
    public void insertAtBeginning(int newdata){
        Node newNode=new Node(newdata);
        newNode.next=head;
        head=newNode;
    }
    public void insertMiddle(Node pre_node , int newData){
        if(pre_node == null){
            System.out.println("Please enter a valid node");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next=pre_node.next;
        pre_node.next=newNode;
    }
    @SuppressWarnings("null")
    public void deleteNode(int pos){
        if(head==null){
            return;
        }
        Node temp=head;
        if(pos==0){
            head=temp.next;
            return;
        }
        for(int i=0;temp!=null && i<pos-1;i++){
            temp=temp.next;
        }
        if(temp==null && temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }
    public void displayLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(6);
        System.out.println("Before inserting the last element at the end");
        linkedList.displayLinkedList();
        System.out.println();
        System.out.println("***********************************************");
        linkedList.insertAtEnd(10);
        System.out.println("After inserting the last element at the end.");
        linkedList.displayLinkedList();
        System.out.println();
        System.out.println("***********************************************");
        linkedList.insertAtBeginning(1);
        System.out.println("After adding element in the beginning");
        linkedList.displayLinkedList();
        System.out.println();
        System.out.println("*******************************************");
        linkedList.insertMiddle(linkedList.head.next, 3);
        System.out.println("After adding an element in the middle.");
        linkedList.displayLinkedList();
        System.out.println();
        System.out.println("*********************************************");
        System.out.println("After deletion of a node at first.");
        linkedList.deleteNode(0);
        linkedList.displayLinkedList();
        System.out.println();
        System.out.println("*************************************************");
        System.out.println("After deletion of a node from the middle.");
        linkedList.deleteNode(3);
        linkedList.displayLinkedList();
        System.out.println();
        System.out.println("****************************************************");
        System.out.println("After delete a node from the last.");
        linkedList.deleteNode(3);
        linkedList.displayLinkedList();
        System.out.println();
        System.out.println("****************************************************");
    }
}
