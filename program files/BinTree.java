// Tree program - Binary tree
import java.util.Scanner;
public class BinTree 
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
        
    
    public Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
    }
    
    
    static Node createBinTree()
    {
       Node root=null;
       System.out.println("Enter data: ");
       Scanner sc=new Scanner(System.in);
       int data=sc.nextInt();
       
       if(data==-1) return null;
       
       root=new Node(data);
       
       System.out.println("Enter left node for: "+data);
       root.left=createBinTree();
       
       System.out.println("Enter right node for: "+data);
       root.right=createBinTree();
               
       return root;
    }
    static void inOrder(Node root)
    {
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root)
    {
        if(root==null) return;
        postOrder(root.left); 
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) 
    {
        Node root=createBinTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        
    }
    
}