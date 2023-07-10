package linkedlist.practice;
//using recursion
public class ReverseTraversing {
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
    public void reverseTraverse(Node head)
        {
          Node temp  = head;
          if(temp==null)
          {
              return ;
          }
             reverseTraverse(temp.next);
            System.out.println(temp.data);
        }

    public static void main(String[] args) {
        ReverseTraversing obj=new ReverseTraversing();
        Node head=createLinkedList();
        obj.reverseTraverse(head);
    }

}
