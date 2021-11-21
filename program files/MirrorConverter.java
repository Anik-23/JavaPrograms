
package SymmetricQuestions;

class node
{
    node left,right=null;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
public class MirrorConverter
{
    static void preOrder(node root)
    {
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        
    }
            
    static void mirrorConverter(node root)
    {
        if(root==null)return;
        
        mirrorConverter(root.left);
        mirrorConverter(root.right);
        
        swap(root);
                
    }
    static void swap(node root)
    {
        if(root==null)return;
        node temp= root.left;
        root.left=root.right;
        root.right=temp;
    }
    
    public static void main(String[] args)
    {
        
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        
    

        mirrorConverter(root); 
        preOrder(root);
    }
    
    
}
