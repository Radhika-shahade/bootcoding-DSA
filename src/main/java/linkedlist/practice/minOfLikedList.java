package linkedlist.practice;

public class minOfLikedList {
    public static void findingMinOfLinkedList(Node head)
    {
        Node temp=head;
        Node min=temp;
        while(temp!=null)
        {
            if(temp.data<min.data)
            {
               min.data=temp.data;
            }
            temp=temp.next;
        }
        System.out.println(min.data);
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
        Node head= createLinkedList();
        findingMinOfLinkedList(head);
//        printLinkedList(min);
    }

}
