//package linkedlist.practice;
//
//public class Reversing {
//    public static Node reversing(Node head)
//    {
//        Node temp=head;
//        Node previous=head;
//        temp=temp.next;
//        previous=temp;
//
//        temp.;
//        return head;
//    }
//    public static Node createLinkedList()
//    {
//        Node firstNode=new Node(1);
//        Node secondNode=new Node(2);
//        Node thirdNode=new Node(3);
//        Node fourthNode=new Node(4);
//
//        Node head=firstNode;
//        firstNode.next=secondNode;
//        secondNode.next=thirdNode;
//        thirdNode.next=fourthNode;
//        fourthNode.next=null;
//
//        return head;
//    }
//    public static void printLinkedList(Node head)
//    {
//        Node temp=head;
//        while(temp!=null)
//        {
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//
//    }
//    public static void main(String[] args) {
//        Node head= createLinkedList();
//       head= reversing(head);
//       printLinkedList(head);
//
//    }
//
//}
