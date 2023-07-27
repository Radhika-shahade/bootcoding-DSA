package tree.practice;

import tree.practice.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {

    public static List<Integer> preOrderTraverse(TreeNode root)
    {
        List<Integer> values= new  ArrayList<>();
        preorder(root, values);
        return values;

    }

    public static void preorder(TreeNode currentNode, List<Integer>value)
    {
        if(currentNode==null)
        {
            return;
        }
       value.add(currentNode.data);
       preorder(currentNode.left,value);
       preorder(currentNode.right,value);
    }
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.right= new TreeNode(2);
        root.left= new TreeNode(3);

        System.out.println(preOrderTraverse(root));
    }


}
