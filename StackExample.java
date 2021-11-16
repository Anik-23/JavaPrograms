import java.util.Scanner;
public class StackExample 
{   int ar[];
    int top;
    StackExample()
    {
        ar=new int[5];
        top=-1;
        
    }
    void push()//Insert
    {
        if(top==4)
        {
            System.out.println("Stack is full");
            
            
        }
        else
        {
            System.out.println("Enter Data");
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            
            top+=1;
            ar[top]=data;
            System.out.println("data inserted ......");
            
        }

    }
    void pop()//Delete
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
            
        }
        else
        {
            System.out.println("Element deleted"+"-->>"+ar[top]);
            top=top-1;
            
        }
        
    }
    void peek()//retrieve the first element of the stack
    {
        if(top==-1)
        {
            System.err.println("Stack is Empty");
        }
        else
        {
            System.out.println(ar[top]);
        }
    }
    void traverse()//View
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(ar[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        
        StackExample obj = new StackExample();
        while(true)
        {
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for traverse");
            System.out.println("press 4 for peek");
            System.out.println("Press 5 for exit\n");
            
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            
            switch(ch)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 5:
                    System.exit(0);
                    break;
                case 4:
                    obj.peek();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
        }
    }
            
}
