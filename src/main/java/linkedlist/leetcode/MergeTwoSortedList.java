package linkedlist.leetcode;

//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]
public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode head1 = createLinkedList();
        ListNode head2 = createListNode2();
        ListNode s = mergingTwoList(head1, head2);
        printLinkedList(s);
    }

    public static ListNode mergingTwoList(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if (head1 != null) {
            temp.next = head1;
        }
        if (head2 != null) {
            temp.next = head2;
        }
        return dummy.next;
    }

    public static ListNode createLinkedList() {
        ListNode firstNode = new ListNode(6);
        ListNode secondNode = new ListNode(7);
        ListNode thirdNode = new ListNode(15);
        ListNode fourthNode = new ListNode(16);

        ListNode head1 = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;
        return head1;
    }

    public static ListNode createListNode2() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(4);
        ListNode fourthNode = new ListNode(6);

        ListNode head2 = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;
        return head2;

    }

    public static void printLinkedList(ListNode head1) {
        ListNode temp1 = head1;
        ;
        while (temp1 != null) {
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }

    }


}
