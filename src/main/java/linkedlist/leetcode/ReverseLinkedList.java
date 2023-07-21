package linkedlist.leetcode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode previous= null;

        while(current!=null)
        {
            ListNode next=current.next;
            current.next= previous;
            previous= current;
            current=next;
        }
        return previous;

    }
    public static ListNode createLinkedList()
    {
        ListNode firstNode= new ListNode(1);
        ListNode secondNode= new ListNode(2);
        ListNode thirdNode= new ListNode(6);
        ListNode fourthNode= new ListNode(3);
        ListNode fifthNode = new ListNode(4);
        ListNode sixthNode= new ListNode(5);
        ListNode seventhNode= new ListNode(6);

        ListNode head= firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        fourthNode.next=fifthNode;
        fifthNode.next=sixthNode;
        sixthNode.next=seventhNode;
        seventhNode.next=null;
        return head;

    }
    public static void printLinkedList(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head= createLinkedList();
        ListNode ee =reverseList(head);
        printLinkedList(ee);
    }
}
