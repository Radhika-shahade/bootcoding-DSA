package linkedlist.leetcode;
//2095. You are given the head of a linked list.
// Delete the middle node, and return the head of the modified linked list.
//que[1,3,4,7,1,2,6] ,ans =[1,3,4,1,2,6]
public class DeleteMidNode {
    public static ListNode removeElements(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count / 2;
        temp = head;

        for (int i = 0; i < mid; i++) {
            if (i == mid - 1) {
                ListNode t = temp.next.next;
                temp.next = t;
            }

            temp = temp.next;

        }

        return head;
    }

    private static ListNode createLinkedList() {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(3);
        ListNode thirdNode = new ListNode(4);
        ListNode fourthNode = new ListNode(7);
        ListNode fifthNode = new ListNode(1);
        ListNode sixthNode = new ListNode(2);
        ListNode seventh = new ListNode(6);



        ListNode head = firstNode;
        head.next = secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        fourthNode.next=fifthNode;
        fifthNode.next=sixthNode;
        sixthNode.next=seventh;
        seventh.next=null;




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
        ListNode head= createLinkedList();
        System.out.println("Before delete");
        printLinkedList(head);
        System.out.println("After delete");
        removeElements(head);
        printLinkedList(head);

    }
    }










