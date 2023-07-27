package tree.practice;

import tree.practice.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {
    public static List<Integer>postOrderTraversal(TreeNode root)
    {
        List<Integer>val= new ArrayList<>();
        postOrder(root,val);
        return val;

    }

    public static void postOrder(TreeNode currentNode, List<Integer> value)
    {
        if(currentNode==null)
        {
            return;
        }
        postOrder(currentNode.left,value);
        postOrder(currentNode.right,value);
        value.add(currentNode.data);
    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(5);
        root.left= new TreeNode(6);
        root.right= new TreeNode(7);
        System.out.println(postOrderTraversal(root));


    }

}
