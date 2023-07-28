package tree.practice;

import java.util.ArrayList;
import java.util.List;

public class RightNodesValue {
    public static List<Integer> postOrderTraversal(TreeNode root)
    {
        List<Integer>value= new ArrayList<>();
        rightNodes(root,value);
        return value;
    }

    public static void rightNodes(TreeNode current, List<Integer>val)
    {
        if(current==null)
        {
            return;
        }
        rightNodes(current.right,val);
        val.add(current.data);
    }

    public static void main(String[] args) {

            TreeNode root= new TreeNode(30);
            root.left= new TreeNode(20);
            root.right= new TreeNode(2);
            root.right.right= new TreeNode(4);
            System.out.println(postOrderTraversal(root));

    }

}
