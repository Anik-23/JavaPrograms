
package SymmetricQuestions;

class Node
{
    Node left,right=null;
    int data;
    Node(int data)
    {
        this.data=data;
    }
    
}
public class Symmetric
{
    public static boolean isSymmetric(Node x,Node y)
    {
        if(x==null && y==null)return true;
        
        return (x!=null && y!=null) && isSymmetric(x.left, y.right) &&
                isSymmetric(x.right, y.left);
    }
    public static boolean isSymmetric(Node x)
    {
        return isSymmetric(x.left,x.right);
    }
    
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        
        if(isSymmetric(root))
        {
            System.out.println("Symmetric");
        }
        else
        {
            System.out.println("Not Symmetric");
        }
    }   
}
