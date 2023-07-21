package linkedlist.leetcode;

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count / 2 + 1;
        temp=head;
        for(int i=1;i<mid;i++)
        {
            temp=temp.next;
        }
        return temp;

    }


    public static ListNode createLinkedList() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode fourthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);

        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next=null;
        return head;

    }

    public static void printLinkedList(ListNode head1) {
        ListNode temp1 = head1;
        ;
        while (temp1 != null) {
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
    }

    public static void main(String[] args) {
        ListNode head= createLinkedList();
       ListNode ec = middleNode(head);
        printLinkedList(ec);
    }
}
