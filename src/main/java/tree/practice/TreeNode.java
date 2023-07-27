package tree.practice;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data)
    {
        this.data=data;
    }

    public TreeNode(int data, TreeNode left, TreeNode right)
    {
        this.data=data;
        this.right=right;
        this.left=left;
    }

}
