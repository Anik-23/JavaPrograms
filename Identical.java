    class Node
    {
        int key;
        Node left;
        Node right;
        
        Node(int key)
        {
            this.key=key;
            this.left=null;
            this.right=null;
        }
    }
    class Identical
    {
    public static boolean isIdentical(Node x,Node y)
    {
        if(x==null && y==null)
        {   return true;}
        
        return((x!=null&&y!=null)&&(x.key==y.key)&&(isIdentical(x.left, y.left))&&(isIdentical(
                x.right,y.right)));
    
    }
    public static void main(String[] args)
    {
        Node x =new Node(15);
        x.left= new Node(10);
        x.left.left=new Node(8);
        x.left.right=new Node(12);
        x.right=new Node(20);
        x.right.left=new Node(16);
        x.right.right=new Node(25);
        
        Node y=new Node(15);
        y.left=new Node(10);
        y.left.left=new Node(8);
        y.left.right=new Node(12);
        y.right=new Node(20);
        y.right.left=new Node(22);
        y.right.right=new Node(25);
        
        if(isIdentical(x, y))
        {
            System.out.println("They are identical");
        }
        else
        {
            System.out.println("Not identical");
        }
    }
    }
    
    

