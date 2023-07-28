package tree.practice;

import java.util.ArrayList;
import java.util.List;

public class LeftNodesValue {
    public static List<Integer>leftNodeTraversal(TreeNode root)
    {
        List<Integer> value= new ArrayList<>();
        leftNodes(root,value);
        return value;

    }
    public static void leftNodes(TreeNode current, List<Integer>val)
    {
        if(current==null)
        {
            return;
        }

        leftNodes(current.left,val);
        val.add(current.data);
    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(20);
        root.left=new TreeNode(30);
        root.right=new TreeNode(22);
        System.out.println(leftNodeTraversal(root));
    }


}
