package tree.binarysearchtree.practice;

public class InsertElement {
//    public static TreeNode insert( int val)
//    {
//        TreeNode root= null;
//       root= insertIntoTree(root,val);
//       return root;
//
//    }

    public static TreeNode insertIntoTree(TreeNode root, int value)
    {
        if(root==null)
        {
            root=new TreeNode(value);
            return root;
        }


        // If the tree is empty, create a new node and return it as the root
        if(root==null)
        {
            return new TreeNode(value);
        }

        // If the value is less than the root's value, go to the left subtree
        if(value< root.data)
        {
            TreeNode left =insertIntoTree(root.left,value);
        }
        else {
            TreeNode right=insertIntoTree(root.right,value);
        }
return root;
    }
public static void inorder(TreeNode root)
{
    if(root==null)
    {
        return;
    }
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);

}

    public static void main(String[] args) {
        TreeNode  root=null;
       root=insertIntoTree(root,40);
       root =insertIntoTree(root,30);
     root = insertIntoTree( root,2);
       root =insertIntoTree(root,4);
      root =insertIntoTree(root,5);
       root =insertIntoTree(root,9);

     inorder(root);

    }

}
