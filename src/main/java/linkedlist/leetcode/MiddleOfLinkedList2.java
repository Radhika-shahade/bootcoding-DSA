package linkedlist.leetcode;

//using fast nd slow pointer
public class MiddleOfLinkedList2 {

    public static ListNode middleNode(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;
        while (fp != null && fp.next != null) {
            fp = fp.next.next;
            sp = sp.next;
        }
        return sp;
    }

    public static ListNode createLinkedList() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode fourthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);
        ListNode sixthNode = new ListNode(6);
        ListNode seventhNode = new ListNode(7);


        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        sixthNode.next = seventhNode;
        seventhNode = null;
        return head;

    }

    public static void printLinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = createLinkedList();
        printLinkedList(middleNode(head));
    }
}
