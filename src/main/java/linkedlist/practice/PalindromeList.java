package linkedlist.practice;

public class PalindromeList {
    public Node addNode(){
        Node firstNode=new Node(1);
        Node secondNode=new Node(2);
        Node thirdNode=new Node(2);
        Node forthNode=new Node(1);
        Node head=firstNode;
        firstNode.next= secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        forthNode.next=null;
        return head;
    }
    public boolean isPalindrome(Node head) {
        Node temp=head;
        Node prev=null;
        Node current=head;
        while (current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        if(temp==current){
            return true;
        }
        return false;
    }
//    public void print(Node head){
//        Node temp=head;
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }

    public static void main(String[] args) {
        PalindromeList palindromeList=new PalindromeList();
        Node head=palindromeList.addNode();
       boolean t = palindromeList.isPalindrome(head);
        System.out.println(t);
    }
}

