package linkedlist.practice;
//
public class Reversing {
    public static void main(String[] args) {
       Node head= createList();
       Node s =reverse(head);
       print(s);
    }
    public static Node reverse(Node head)
    {
        Node previous=null;
        Node current=head;

        while(current!=null)
        {
            Node temp=current.next;
            current.next=previous;
            previous= current;
            current=temp;

        }
        return previous;
    }
    public static Node createList()
    {
        Node firstNode =new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode=new Node(30);
        Node fourthNode= new Node(40);
        Node fifthNode= new Node(70);

        Node head=firstNode;
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        fourthNode.next=fifthNode;
        fifthNode.next=null;
        return head;
    }
    public static void print(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }





}
