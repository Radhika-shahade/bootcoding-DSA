package linkedlist.leetcode;
//Given the head of a linked list and an integer val,
// remove all the nodes of the linked list that has Node.val == val,
// and return the new head.
//Input: head = [1,2,6,3,4,5,6], val = 6
//Output: [1,2,3,4,5]
public class RemoveLinkedList {
    public static ListNode removeElements(ListNode head, int value)
    {
        if(head==null)
        {
            return null;
        }
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode current = dummy;
        while(current.next!=null)
        {
            if(current.next.data== value)
            {
                current.next=current.next.next;
            }
            else
            {
                current =current.next;
            }
        }

        return dummy.next;
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
        ListNode head=createLinkedList();
        System.out.println("Before removing");
        printLinkedList(head);
        System.out.println("After removing");
        removeElements(head,6);
        printLinkedList(head);

    }




}
