package SymmetricQuestions;

class Nodee
{
    Nodee left,right;
    int data;
    Nodee(int data)
    {
        this.data=data;
    }
}
public class CanConverted 
{
    static boolean isConvwerted(Nodee X,Nodee Y)
    {
        if(X==Y)return true;
        return (X!=null&&Y!=null)&&(X.data==Y.data)&&
                ((isConvwerted(X.left, Y.left)&&
                isConvwerted(X.right, Y.right))||(isConvwerted(X.left, Y.right)&&isConvwerted(X.right, Y.left)));
    }
    
    public static void main(String[] args)
    {
        Nodee X = new Nodee(6);
        X.left = new Nodee(3);
        X.right = new Nodee(8);
        X.left.left = new Nodee(1);
        X.left.right = new Nodee(7);
        X.right.left = new Nodee(4);
        X.right.right = new Nodee(2);
        X.right.left.left = new Nodee(1);
        X.right.left.right = new Nodee(7);
        X.right.right.right = new Nodee(3);
 
        // construct the second tree
        Nodee Y = new Nodee(6);
        Y.left = new Nodee(8);
        Y.right = new Nodee(3);
        Y.left.left = new Nodee(2);
        Y.left.right = new Nodee(4);
        Y.right.left = new Nodee(7);
        Y.right.right = new Nodee(1);
        Y.left.left.left = new Nodee(3);
        Y.left.right.left = new Nodee(1);
        Y.left.right.right = new Nodee(7);
        
        if(isConvwerted(X, Y))
        {
            System.out.println("Can be converted");
        }
        else
        {
        
            System.out.println("Cannot be converted");
        }
        
    }
}
