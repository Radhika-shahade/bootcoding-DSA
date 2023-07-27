package tree.practice;

import tree.practice.TreeNode;

public class FindMax {
    public static int findingMax(TreeNode root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        int value=(root.data);
        int lv=findingMax(root.left);
        int rv=findingMax(root.right);
        if(lv> value)
        {
            value= lv;
        }
        if(rv>value)
        {
            value=rv;
        }
        return value;

    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        System.out.println(findingMax(root));
    }


}
