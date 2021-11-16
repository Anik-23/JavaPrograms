import java.util.Scanner;
public class PossibleBST
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node root;
    
    public Node(int data)
    {
        this.data=data;
        this.root=null;-""
        this.right=null;
        this.left=null;
    }
    }
    int constructTrees(int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            left=constructTrees(start,i-1);
            
        }
    }
}
