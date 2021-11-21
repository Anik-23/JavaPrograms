package SumOfElements;
class Node
{
    int data;
    Node left,right=null;
    Node(int data)
    {
        this.data=data;
    }
}

public class SumElement
{
 
    static void preOrderTraversing(Node root)
    {
        if(root==null)return;
        
        System.out.print(root.data+" ");
        preOrderTraversing(root.left);
        preOrderTraversing(root.right);
    }
    static int postOrderTraversing(Node root)
    {
        if(root==null)return 0;
        int left=postOrderTraversing(root.left);
        int right=postOrderTraversing(root.right);
        int old=root.data;
        root.data=left+right;
        return root.data + old;
    }
    
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        
        postOrderTraversing(root);
        preOrderTraversing(root);
        
    }
}
