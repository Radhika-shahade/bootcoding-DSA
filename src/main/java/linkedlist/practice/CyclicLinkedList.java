package linkedlist.practice;

public class CyclicLinkedList {
    public static Node createLinkedList() {
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthnode = new Node(50);
        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthnode;
        fourthnode.next = null;
        return head;

    }

    public static void cyclicNodes(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null)
        {
            slow=head.next;
            fast=head.next.next;
            if(slow==fast)
            {
                System.out.println("its cyclic");
            }
        }
    }

    public static void main(String[] args) {
        Node head=createLinkedList();
        cyclicNodes(head);

    }


}
