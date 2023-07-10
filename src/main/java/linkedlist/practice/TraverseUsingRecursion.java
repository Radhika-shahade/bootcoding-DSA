package linkedlist.practice;

public class TraverseUsingRecursion {
    public  static Node traversing(Node head)
    {
       Node temp=head;
        if(temp==null)
        {
            return head;
        }

        System.out.println(temp.data);
        return traversing(temp.next);

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
    public static void main(String[] args) {
     Node head=createLinkedList();
     traversing(head)   ;

    }
}
