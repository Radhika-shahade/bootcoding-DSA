package linkedlist.practice;

public class OddElementOfLinkedList {
    public static void printOdd(Node head)
    {
      Node temp=head;
      while(temp!=null)
      {
          if(temp.data%2==1)
          {
              System.out.println(temp.data);

          }
          temp=temp.next;

      }
    }

    public static void main(String[] args) {
        Node firstnode = new Node(1);
        Node secondnode = new Node(2);
        Node thirdnode = new Node(3);
        Node forthnode = new Node(4);
        Node fifthnode = new Node(5);

        Node head = firstnode;
        firstnode.next = secondnode;
        secondnode.next = thirdnode;
        thirdnode.next = forthnode;
        forthnode.next = fifthnode;
        fifthnode = null;

        printOdd(head);
    }

}
