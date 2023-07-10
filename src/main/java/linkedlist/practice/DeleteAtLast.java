package linkedlist.practice;

public class DeleteAtLast {
    public static Node deleteAtLast(Node head)
    {
        Node current=head;
        Node previous=current;
        while(current.next!=null)
        {
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return head;


    }
    public static Node createLinkedList()
    {
        Node firstNode= new Node(10);
        Node secondNode= new Node(20);
        Node thirdNode = new Node(30);
        Node fourthnode= new Node(50);
        Node head=firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthnode;
        fourthnode.next=null;
        return head;

    }
    public static void printLinkedList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node head=createLinkedList();
        System.out.println("Before Deleting");
        printLinkedList(head);
        System.out.println("After deleting ");
        head=deleteAtLast(head);
        printLinkedList(head);


    }



}
