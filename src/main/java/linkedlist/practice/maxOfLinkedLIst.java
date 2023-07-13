package linkedlist.practice;

public class maxOfLinkedLIst {
    public static void findingMaxElement(Node head)
    {
        Node temp=head;
        int  max=temp.data;
        while(temp!=null)
        {
            if(max<temp.data)
            {
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.println(max);
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
        findingMaxElement(head);
    }
}
