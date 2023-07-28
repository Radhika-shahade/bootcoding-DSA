package tree.practice;

import tree.practice.TreeNode;

public class SearchingParticularElement {

    public static boolean search(TreeNode root, int target)
    {
        if(root==null)
        {
            return false;
        }
        if(target==root.data)
        {
            return true;
        }
        boolean res= search(root.left,target);
        if(res)
        {
            return true;
        }
       return search(root.right,target);


    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(20);
        root.left=new TreeNode(30);
        root.right=new TreeNode(60);
        root.right.right=new TreeNode(70);
        root.left.right=new TreeNode(25);
        System.out.println(search(root,25));

    }

}
