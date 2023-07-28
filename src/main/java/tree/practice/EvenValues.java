package tree.practice;

import java.util.ArrayList;
import java.util.List;

public class EvenValues {
    public static List<Integer> printEvenNodes( TreeNode root)
    {
      List<Integer>values=new ArrayList<>();
      findingEvenNodes(root,values);
      return values;
    }

    public static void findingEvenNodes(TreeNode current, List<Integer>value)
    {

        if(current== null)
        {
            return ;
        }
        if(current.data%2==0)
        {
            value.add(current.data);
        }
        findingEvenNodes(current.left,value);
        findingEvenNodes(current.right, value);

    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(30);
        root.left= new TreeNode(20);
        root.right= new TreeNode(2);
        root.right.right= new TreeNode(4);
        System.out.println(printEvenNodes(root));
    }


}
