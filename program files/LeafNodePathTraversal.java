package SymmetricQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

class Noode
{
Noode left,right=null;
int data;

Noode(int data)
{
    this.data=data;
}

}

public class LeafNodePathTraversal
{
    static boolean isLeafNode(Noode node)
    {
        return node.left==null&&node.right==null;       
    }
    static void printRootTOLeaf(Noode node,Deque<Integer> path)
    {
        if(node==null)return;
        
        path.addLast(node.data);
        if(isLeafNode(node))
        {
            System.out.println(path);
        }
        printRootTOLeaf(node.left,path);
        printRootTOLeaf(node.right, path);
        path.removeLast();
        
    }
    static void printRootTOLeaf(Noode node)
    {
        Deque<Integer> path=new ArrayDeque<>();
        printRootTOLeaf(node,path);
    }
    
    public static void main(String[] args)
    {
        
        Noode root = new Noode(1);
        root.left = new Noode(2);
        root.right = new Noode(3);
        root.left.left = new Noode(4);
        root.left.right = new Noode(5);
        root.right.left = new Noode(6);
        root.right.right = new Noode(7);
        root.right.left.left = new Noode(8);
        root.right.right.right = new Noode(9);
        
        printRootTOLeaf(root);
    }
    
}
