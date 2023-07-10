package linkedlist.practice;

public class InsertAtFirst {
    public static Node insertAtFirst(Node head)
    {
         Node newNode= new Node(20);
         newNode.next=head;
         head=newNode;
         return head;
    }
    public static Node createLinkedList()
    {
        Node firstNode=new Node(1);
        Node secondNode=new Node(2);
        Node thirdNode=new Node(3);
        Node fourthNode=new Node(4);

        Node head=firstNode;
         firstNode.next=secondNode;
         secondNode.next=thirdNode;
         thirdNode.next=fourthNode;
         fourthNode.next=null;

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
        System.out.println("Before adding");
        printLinkedList(head);
        System.out.println("After adding");
        head= insertAtFirst(head);
         printLinkedList(head);

    }

}
