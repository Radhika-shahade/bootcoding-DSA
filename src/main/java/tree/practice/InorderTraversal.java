package tree.practice;

import tree.practice.TreeNode;

import java.util.ArrayList;
import java.util.List;

//94. Input: root = [1,null,2,3]
//Output: [1,3,2]
public class InorderTraversal {
    public static  List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> values= new ArrayList<>();
        inOrder(root, values);
        return values;
    }
    public static void inOrder(TreeNode currentNode, List<Integer>values)
    {
        if(currentNode == null)
        {
            return;
        }
        inOrder(currentNode.left, values );
        values.add(currentNode.data);
        inOrder(currentNode.right, values);

    }

    public static void main(String[] args) {
      TreeNode root= new TreeNode(1);
      root.right= new TreeNode(2);
      root.left= new TreeNode(3);

        System.out.println(inorderTraversal(root));
    }

}
